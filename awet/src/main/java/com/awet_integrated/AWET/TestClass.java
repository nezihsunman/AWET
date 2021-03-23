package com.awet_integrated.AWET;

import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.core.configuration.Form;
import com.crawljax.core.configuration.InputSpecification;
import com.crawljax.core.state.Identification;
import com.crawljax.forms.FormInput;
import com.crawljax.forms.InputValue;

import java.util.*;

public class TestClass {
    public static void main(String[] args) {

        CrawljaxConfiguration.CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor("url");

        IDService idService = new IDService();
        List<ID> listOfId = idService.getNameWithGroup(1, "phoenix");
        InputSpecification inputSpecification = new InputSpecification();
        Map<String, Collection<List<ID>>> uniqueList = idService.getIdWithHaspMap(1, "phoenix");

        for (Map.Entry<String, Collection<List<ID>>> entry : uniqueList.entrySet()) {
            Form contactForm = new Form();
            String xpath = entry.getKey();
            String beforeClickType = "";
            String infoBeforeClickType = "";
            String tagName = "";

            for (List<ID> idList : entry.getValue()) {

                String getKeyofValueForIdentificationXpath = "";
                String getKeyofValueForIdentificationId = "";
                List<String> getKeyofValueForIdentificationXPATH = new ArrayList<>();
                List<String> getValueListId = new ArrayList<String>();

                for (ID id : idList) {
                    if (id.getBeforeClickType().equals("withText")) {
                        beforeClickType = "withText";
                        infoBeforeClickType = id.getInfoBeforeClickType();
                    } else if (id.getBeforeClickType().equals("underxpath")) {
                        beforeClickType = "underxpath";
                    }
                    if (id.getHow().equals("By.id")) {
                        getKeyofValueForIdentificationId = id.getKeyOfValue();
                        getValueListId.add(id.getValue());
                    } else if (id.getHow().equals("By.xpath")) {
                        getKeyofValueForIdentificationXpath = id.getKeyOfValue();
                        getKeyofValueForIdentificationXPATH.add(id.getValue());
                    }
                }

                if (getValueListId.size() > 0) {
                    String[] listArray = new String[getValueListId.size()];
                    Set<InputValue> inputValueList = new HashSet<>();
                    for (int i = 0; i < getValueListId.size(); i++) {
                        listArray[i] = getValueListId.get(i);
                        inputValueList.add(new InputValue(getValueListId.get(i)));
                    }
                    contactForm.inputField(FormInput.InputType.INPUT, new Identification(Identification.How.id, getKeyofValueForIdentificationId)).inputValues(listArray);
                }
                if (getKeyofValueForIdentificationXPATH.size() > 0) {
                    String[] listArray = new String[getKeyofValueForIdentificationXPATH.size()];
                    Set<InputValue> inputValueList = new HashSet<>();
                    for (int i = 0; i < getKeyofValueForIdentificationXPATH.size(); i++) {
                        listArray[i] = getKeyofValueForIdentificationXPATH.get(i);
                        inputValueList.add(new InputValue(getKeyofValueForIdentificationXPATH.get(i)));
                    }
                    contactForm.inputField(FormInput.InputType.INPUT, new Identification(Identification.How.xpath, getKeyofValueForIdentificationXpath)).inputValues(listArray);
                }

            }
            if (!xpath.equals("") && beforeClickType.equals("withText")) {
                inputSpecification.setValuesInForm(contactForm).beforeClickElement("button").withText(infoBeforeClickType);
            } else if (!xpath.equals("") && beforeClickType.equals("underxpath")) {
                inputSpecification.setValuesInForm(contactForm).beforeClickElement("button").underXPath(xpath);
            }
            Form listForm = new Form();
            FormInput listNameInput = listForm.inputField(FormInput.InputType.TEXT,
                    new Identification(Identification.How.id, "list_name"));
            listNameInput.inputValues("list","new list","just a list","list name","standard tuning");
            inputSpecification.setValuesInForm(listForm)
                    .beforeClickElement("button").withText("Save list");



        }
        builder.crawlRules().setInputSpec(inputSpecification);
    }

}
