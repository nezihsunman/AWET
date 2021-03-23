package com.awet_integrated.subjects.config;

import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.core.configuration.Form;
import com.crawljax.core.configuration.InputSpecification;
import com.crawljax.core.state.Identification;
import com.crawljax.forms.FormInput;
import com.crawljax.forms.InputValue;
import com.awet_integrated.subjects.ApplicationNames;
import com.awet_integrated.AWET.ClickList;
import com.awet_integrated.AWET.ClickListService;
import com.awet_integrated.AWET.ID;
import com.awet_integrated.AWET.IDService;
import com.awet_integrated.subjects.Config;
import com.awet_integrated.suitegenerator.SuiteGeneratorConfig;
import com.awet_integrated.tedd.extraction.DependencyGraphExtractionConfig;
import com.awet_integrated.utils.Properties;

import java.util.*;

public class PetclinicConfig extends Config {

    private static final String url = "http://localhost:3000";
    private static final int waitTimeAfterReload = 3000;

    private static final IDService idService = new IDService();
    private static final ClickListService clickListService = new ClickListService();


    public PetclinicConfig() {
        super(ApplicationNames.Name.PETCLINIC.getName());
    }

    @Override
    public CrawljaxConfiguration.CrawljaxConfigurationBuilder getCrawljaxConfig() {

        CrawljaxConfiguration.CrawljaxConfigurationBuilder builder = this.crawljaxCommonConfig(url,
                Properties.MAX_RUNTIME, 250, waitTimeAfterReload);

        builder.setConsiderCandidateElementsOnce(CrawljaxConfiguration.CandidateElementsMode.fired);

        builder.crawlRules().click("BUTTON");
        builder.crawlRules().click("A");

        // calendar button
        //builder.crawlRules().dontClick("button").withAttribute("class", "mat-icon-button");
        //builder.crawlRules().dontClick("BUTTON").underXPath("/html[1]/body[1]/app-root[1]/app-visit-add[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/mat-datepicker-toggle[1]/button[1]");
        // home button that slows down the execution
        //builder.crawlRules().dontClick("A").underXPath("/html[1]/body[1]/app-root[1]/div[1]/nav[1]/div[1]/div[1]/a[1]");

        InputSpecification inputSpecification = new InputSpecification();

        Map<String, Collection<List<ID>>> uniqueList = idService.getIdWithHaspMap(1, ApplicationNames.Name.PETCLINIC.getName());

        for (Map.Entry<String, Collection<List<ID>>> entry : uniqueList.entrySet()) {
            Form contactForm = new Form();
            String xpath = entry.getKey();
            String beforeClickType = "";
            String infoBeforeClickType = "";

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
                    contactForm.inputField(FormInput.InputType.TEXT, new Identification(Identification.How.id, getKeyofValueForIdentificationId)).inputValues(listArray);
                }
                if (getKeyofValueForIdentificationXPATH.size() > 0) {
                    String[] listArray = new String[getKeyofValueForIdentificationXPATH.size()];
                    Set<InputValue> inputValueList = new HashSet<>();
                    for (int i = 0; i < getKeyofValueForIdentificationXPATH.size(); i++) {
                        listArray[i] = getKeyofValueForIdentificationXPATH.get(i);
                        inputValueList.add(new InputValue(getKeyofValueForIdentificationXPATH.get(i)));
                    }
                    contactForm.inputField(FormInput.InputType.TEXT, new Identification(Identification.How.xpath, getKeyofValueForIdentificationXpath)).inputValues(listArray);
                }

            }
            if (!xpath.equals("") && beforeClickType.equals("withText")) {
                inputSpecification.setValuesInForm(contactForm).beforeClickElement("button").withText(infoBeforeClickType);
            } else if (!xpath.equals("") && beforeClickType.equals("underxpath")) {
                inputSpecification.setValuesInForm(contactForm).beforeClickElement("button").underXPath(xpath);
            }

        }

        List<ClickList> listOfClick = clickListService.getNameWithGroup(1, ApplicationNames.Name.PETCLINIC.getName());
        for (ClickList click : listOfClick) {
            if (click.getHow_xpath_id().equals("By.xpath")) {
                builder.crawlRules().click("button").underXPath(click.getClickxpath());
                builder.crawlRules().click("button").underXPath(click.getClickxpath().toUpperCase());
                builder.crawlRules().click("a").underXPath(click.getClickxpath());
                builder.crawlRules().click(click.getTagname()).underXPath(click.getClickxpath());

            } else if (click.getHow_xpath_id().equals("By.id")) {
                builder.crawlRules().click("button").withText(click.getClickxpath());
                builder.crawlRules().click("a").withText(click.getClickxpath());
            }

        }
        builder.crawlRules().setInputSpec(inputSpecification);
        builder.crawlRules().setDisableIdAndNameIdentification(true);
        builder.setHandleSameFormInputsOncePerState(true);
        return builder;

    }

    @Override
    public SuiteGeneratorConfig getSuiteGeneratorConfig() {

        SuiteGeneratorConfig suiteGeneratorConfig = this.testSuiteGeneratorCommonConfig(url, waitTimeAfterReload);

        suiteGeneratorConfig.setSourcemapURL("http://localhost:3000/main.js.map");
        suiteGeneratorConfig.setSrcCodeFolder("src");
        suiteGeneratorConfig.setScriptNameToInclude("main");
        suiteGeneratorConfig.setFiredElementStrategy(true);

        return suiteGeneratorConfig;
    }

    @Override
    public DependencyGraphExtractionConfig getDependencyGraphExtractionConfig() {
        String dependencyGraphOptimized = "1 00 110 0100 10000 000001 0001000 11010000 100101000 0011000000 00000000000 010001000010 0000000000000 00000100000000 101000011010010 0100011001000000 00110000000000000 110001101000110000 0110010001100000000 10010000110000001000 001001000110000000000 0001100000000110000000 00000000011000000000000 101010001001000000000000 1100101011000000000000000 00101110000000100001000000 100100011111000000000000000 0101101100000100000000000000 00000111101011010000000000000 101000000010110000000001000000 0000000001011100000000010000000 01000011000101000000000100000000 000000000011000000000000000000000 1100110110100000110000000000000000 01101010000100100000000000000010000 100010001011000001000001100000001000 0100000010000010010000000000000000000 00000010000101000001100000000000000000 111101100110001000100010110000000000000 0111101001000100011000000000001000000000 10001000010100101000010000000000000000000 001000000000001100001001000000000000000000 0100011010011000010001001000000100000000000 00011000101100010000001010101100000000000000 110010000010111101000000000000010000000000000 1110110010001001000100001100000001000100010000 00001001111011001000110001000010010000100101000 000011100001100000000000000000000000000000000000 0010100101001010000000010000101000000000000000000 11001100000000001000001011110010100000010000000011 011000001000100010000000000100010000000000000000000 1110000001000000001000010001000001000000000000000000 10000000001100000100010000000000000000010000000001000 001001000010011011110100001100010000000000100000000001 0000011010001100001000010010010000001000000000001100010 01101000000000010100000100010000000001000001000001000000 001101100000011010010000010000011110100000010000000000000 1010010000110111000010000000010000000000100000000000000000 10100100110010111101000100101110000100100000000000000000000 011000110000101110000000001010101001001000100010000000000001 0110100000000010010000000100011001000000000001100001000000000 00000110010100000011000011111100000000000010000000010000000000 000000000100101000010000011000000000000000000000000000000000000 0110011110000011000010001000101010101000000001101000000001000000";

        DependencyGraphExtractionConfig dependencyGraphExtractionConfig = new DependencyGraphExtractionConfig();
        dependencyGraphExtractionConfig.setParetoFrontSolution(dependencyGraphOptimized);
        // window strategy
//        dependencyGraphExtractionConfig.setFixedMinimizedTestSuite("00100001100000000000000100000000001110001010100000001000000000000");
        // one by one strategy
        dependencyGraphExtractionConfig.setFixedSelectedTestSuite("11111111111111111111111111111111111110001010100000001000000000000");

        return dependencyGraphExtractionConfig;
    }
}
