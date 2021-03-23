package com.awet_integrated.subjects.config;

import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.core.configuration.Form;
import com.crawljax.core.configuration.InputSpecification;
import com.crawljax.core.state.Eventable;
import com.crawljax.core.state.Identification;
import com.crawljax.core.state.StateVertex;
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

// FIXME
// does not work
public class PagekitConfig extends Config {

    private static final String url = "http://localhost:3000/pagekit/index.php/admin/login";
    private static final int waitTimeAfterReload = 3000;

    private static final IDService idService = new IDService();
    private static final ClickListService clickListService = new ClickListService();






    public PagekitConfig() {
        super(ApplicationNames.Name.PAGEKIT.getName());
    }

    @Override
    public CrawljaxConfiguration.CrawljaxConfigurationBuilder getCrawljaxConfig() {

        CrawljaxConfiguration.CrawljaxConfigurationBuilder builder = this.crawljaxCommonConfig(url,
                Properties.MAX_RUNTIME, 2000, waitTimeAfterReload);

//        builder.setStateVertexFactory(new PerceptualImageHashStateVertexFactory());

        builder.crawlRules().click("button", "a");

        // input type submit
        builder.crawlRules().click("input")
                .withAttribute("type", "submit");
        // input type button
        builder.crawlRules().click("input")
                .withAttribute("type", "button");
        // menu
        builder.crawlRules().click("i")
                .withAttribute("class", "tm-icon-menu");


        // request password link
        builder.crawlRules().dontClick("a")
                .underXPath("/html[1]/body[1]/div[1]/div[1]/form[1]/ul[1]/li[2]/a[1]");
        // remember me checkbox
        builder.crawlRules().dontClick("input")
                .withAttribute("name", "remember_me");
        // update now
        builder.crawlRules().dontClick("a")
                .withText("Update now!");
        // help
        builder.crawlRules().dontClick("a")
                .withAttribute("href", "https://gitter.im/pagekit/pagekit");
        // logout
        builder.crawlRules().dontClick("a")
                .withAttribute("title", "Logout");
        // house link
        builder.crawlRules().dontClick("a")
                .withAttribute("href", "/pagekit/index.php/");
        // system link in menu
        builder.crawlRules().dontClick("a")
                .withAttribute("href", "/pagekit/index.php/admin/system/settings");
        // marketplace link in menu
        builder.crawlRules().dontClick("a")
                .withAttribute("href", "/pagekit/index.php/admin/system/marketplace/extensions");
        // drag handle
        builder.crawlRules().dontClick("a")
                .withAttribute("class", "pk-icon-handle pk-icon-hover uk-sortable-handle");
        // change password
        builder.crawlRules().dontClick("a")
                .withText("Change password");
        // email 1
        builder.crawlRules().dontClick("a")
                .withAttribute("href", "mailto:asd@asd.com");
        // email 2
        builder.crawlRules().dontClick("a")
                .withAttribute("href", "mailto:foo@bar.com");
        // email 3
        builder.crawlRules().dontClick("a")
                .withAttribute("href", "mailto:admin@admin.com");
        // roles links
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "system: manage packages");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "system: software updates");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "system: manage widgets");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "system: manage storage");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "system: manage storage read only");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "system: access settings");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "site: manage site");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "site: maintenance access");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "user: manage users");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "user: manage user permissions");
        builder.crawlRules().dontClick("input")
                .withAttribute("value", "system: access admin area");
        // upload
        builder.crawlRules().dontClick("button")
                .withText("Upload");
        // url links
        builder.crawlRules().dontClick("a")
                .withAttribute("target", "_blank");
        // settings in site
        builder.crawlRules().dontClick("a")
                .withAttribute("href", "/pagekit/index.php/admin/site/settings");


        InputSpecification inputSpecification = new InputSpecification();

        Map<String, Collection<List<ID>>> uniqueList = idService.getIdWithHaspMap(1, ApplicationNames.Name.PAGEKIT.getName());

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

        List<ClickList> listOfClick = clickListService.getNameWithGroup(1, ApplicationNames.Name.PAGEKIT.getName());
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
        Form folderNameModalForm = new Form();
        FormInput folderNameModalInput = folderNameModalForm.inputField(FormInput.InputType.TEXT,
                new Identification(Identification.How.xpath,
                        "/html[1]/body[1]/div[10]/div[1]/div[1]/div[2]/p[1]/input[1]".toUpperCase()));
        folderNameModalInput.inputValues("folder modal", "new folder modal");
        inputSpecification.setValuesInForm(folderNameModalForm).beforeClickElement("button").withText("Ok");

        builder.crawlRules().setInputSpec(inputSpecification);
        builder.crawlRules().setDisableIdAndNameIdentification(true);
        builder.setHandleSameFormInputsOncePerState(true);

        return builder;

    }

    @Override
    public SuiteGeneratorConfig getSuiteGeneratorConfig() {

        // TODO

        return this.testSuiteGeneratorCommonConfig(url, waitTimeAfterReload);
    }

    @Override
    public DependencyGraphExtractionConfig getDependencyGraphExtractionConfig() {
        throw new UnsupportedOperationException("Not supported yet");
    }
}
