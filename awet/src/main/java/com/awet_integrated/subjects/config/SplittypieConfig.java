package com.awet_integrated.subjects.config;

import com.awet_integrated.AWET.ClickList;
import com.awet_integrated.AWET.ClickListService;
import com.awet_integrated.AWET.ID;
import com.awet_integrated.AWET.IDService;
import com.awet_integrated.subjects.ApplicationNames;
import com.awet_integrated.subjects.Config;
import com.awet_integrated.suitegenerator.SuiteGeneratorConfig;
import com.awet_integrated.tedd.extraction.DependencyGraphExtractionConfig;
import com.awet_integrated.utils.Properties;
import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.core.configuration.Form;
import com.crawljax.core.configuration.InputSpecification;
import com.crawljax.core.state.Identification;
import com.crawljax.forms.FormInput;
import com.crawljax.forms.InputValue;
import com.crawljax.stateabstractions.visual.imagehashes.PerceptualImageHashStateVertexFactory;

import java.util.*;

public class SplittypieConfig extends Config {

    private static final String url = "http://localhost:4200";
    private static final int waitTimeAfterReload = 2000;
    private static final IDService idService = new IDService();
    private static final ClickListService clickListService = new ClickListService();





    private static final String USER_1 = "admin";
    private static final String USER_2 = "user";

    public static final List<String> users = Arrays.asList(USER_1, USER_2);
    public static final String usersXPath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]".toUpperCase();

    // TO RUN OFFLINE
    public SplittypieConfig() {
        super(ApplicationNames.Name.SPLITTYPIE.getName());
    }

    @Override
    public CrawljaxConfiguration.CrawljaxConfigurationBuilder getCrawljaxConfig() {

        CrawljaxConfiguration.CrawljaxConfigurationBuilder builder = this.crawljaxCommonConfig(url,
                Properties.MAX_RUNTIME, 1000, waitTimeAfterReload);

        builder.setConsiderCandidateElementsOnce(CrawljaxConfiguration.CandidateElementsMode.fired);

        builder.setStateVertexFactory(new PerceptualImageHashStateVertexFactory()); // this factory is able to handle modals

        builder.crawlRules().click("button");
        builder.crawlRules().click("a");

        builder.crawlRules().click("input").withAttribute("type", "submit");
        builder.crawlRules().click("input").withAttribute("type", "button");

        // transaction div
        builder.crawlRules().click("div")
                .withAttribute("class", "list-group-item btn btn-default transaction-list-item ember-view");
//                .underXPath("/html[1]/body[1]/div[1]/div[3]/main[1]/div[1]/div[3]/div[1]/div[1]/div[3]".toUpperCase());

        InputSpecification inputSpecification = new InputSpecification();
        Map<String, Collection<List<ID>>> uniqueList = idService.getIdWithHaspMap(1, ApplicationNames.Name.SPLITTYPIE.getName());

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
        List<ClickList> listOfClick = clickListService.getNameWithGroup(1, ApplicationNames.Name.SPLITTYPIE.getName());
        for (ClickList click : listOfClick) {
            if (click.getHow_xpath_id().equals("By.xpath")) {
                builder.crawlRules().click(click.getTagname()).underXPath(click.getClickxpath());
            } else if (click.getHow_xpath_id().equals("By.id")) {
                builder.crawlRules().click("button").withText(click.getClickxpath());
                //builder.crawlRules().click("a").withText(click.getClickxpath());
            } else if (click.getHow_xpath_id().equals("By.tagname")) {
                builder.crawlRules().click(click.getTagname()).underXPath(click.getClickxpath());
            } else if (click.getHow_xpath_id().equals("withText")) {
                builder.crawlRules().click(click.getTagname()).withText(click.getInfoBeforeClickType());
            }

        }
        builder.crawlRules().setInputSpec(inputSpecification);

        builder.crawlRules().setDisableIdAndNameIdentification(true);

        return builder;

    }

    @Override
    public SuiteGeneratorConfig getSuiteGeneratorConfig() {

        SuiteGeneratorConfig suiteGeneratorConfig = this.testSuiteGeneratorCommonConfig(url, waitTimeAfterReload);
        suiteGeneratorConfig.setScriptNameToInclude("splittypie");
        suiteGeneratorConfig.setSourcemapURL("http://localhost:4200/assets/splittypie.map");
        suiteGeneratorConfig.setSrcCodeFolder("splittypie");

        return suiteGeneratorConfig;
    }

    @Override
    public DependencyGraphExtractionConfig getDependencyGraphExtractionConfig() {
        String dependencyGraphOptimized = "0 00 000 0000 00000 100000 0001000 01011000 001000000 0001000001 11000000000 010100000000 0010000000011 10110000000000 001000000000000 0100000000000001 00000001111000110 000000010000000000 0110001100001001000 00000001000110000000 100000000000000000000 0000000000000010000000 00000000100100000000100 010001000000000000000000 1010100100100010000000001 00000011100010001011110010 101000000100000100000000100 0000000001001011000000000000 00001110100110100010000010000 000101000100100110000000100000 1000010000000000100000000000000 00111101001000000000000000000000 000010101100000000000010100000000 0011101001001000001110000000000000 10001011000000000010100000000000001 010001100101100110001110110000000000 1100101001000101010100100000000100000 00000000000000010000000000000000000000 011000101000111100100000000000000100000 0000000100000001110000000000000001000000 10001001100110011000100010000001000000000 100000000110100100100000000000000000000000 0110000011100000111000000010000001000000000 10010000000001010000010010011000000000000000 000001001000000000000000000010000000010000001 0011011000001001000101010100000000000000000100 00000101011111000000100000000001000100000000000 000000001100000100000100100000011101010010000000 0100001000101000000001010010100100000000000010000 01100100000000101001100000000000000101000010000001 010000000011000100100011100011000010000010101000000 1110100110000100001100101001100001000000011000000000 01001100000001000000000010010000100000000000000110000 100000100100100010100000000000000000000000000000000000 0100001010100000110000011000000100000000000110011000000 01010001000000001000001000000000000000000000000000000000 000010001100010000010000000101000000000100000000000000000 0000001000010100011111110001110100000001010001100000010000 00010001100100110000101001000001010000101001100000010000000 001010000100000100001000001100001000000000000000000000000000 0110000010000011001000100001101000000011000000100000000000001 01100100110001001101000111001000010100000001100000000000000000 000010001010100100101000010010000101000000010000001000000000000 1001111001000101111011000100101100000000100010000000000000001000 01000000101000010110111100000000110010000110000010000000000000000 110110100110100010010100010000000110001000000000000001000000000000 0000011011110001001010011000010001101000100000001000000000000000000 00010000001000110110011000001001001000000000000000001011000000000001";

        DependencyGraphExtractionConfig dependencyGraphExtractionConfig = new DependencyGraphExtractionConfig();
        dependencyGraphExtractionConfig.setParetoFrontSolution(dependencyGraphOptimized);
        // window strategy
//        dependencyGraphExtractionConfig.setFixedMinimizedTestSuite("010110000110000000000010000100000011000010000000000000000000000000000");
        // one by one strategy
        dependencyGraphExtractionConfig.setFixedSelectedTestSuite("111111111111111111111111111100000000000010000000000000000000000000000");

        return dependencyGraphExtractionConfig;
    }
}
