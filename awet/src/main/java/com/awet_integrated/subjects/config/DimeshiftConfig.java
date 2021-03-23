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

public class DimeshiftConfig extends Config {

    private static final String url = "http://localhost:3000";
    private static final int waitTimeAfterReload = 2500;
    private static final IDService idService = new IDService();
    private static final ClickListService clickListService = new ClickListService();




    public DimeshiftConfig() {
        super(ApplicationNames.Name.DIMESHIFT.getName());
    }

    @Override
    public CrawljaxConfiguration.CrawljaxConfigurationBuilder getCrawljaxConfig() {

        CrawljaxConfiguration.CrawljaxConfigurationBuilder builder = this.crawljaxCommonConfig(url,
                Properties.MAX_RUNTIME, 1500, waitTimeAfterReload);

        builder.setConsiderCandidateElementsOnce(CrawljaxConfiguration.CandidateElementsMode.fired);

        //builder.setStateVertexFactory(new DHashStateVertexFactory());
        builder.setStateVertexFactory(new PerceptualImageHashStateVertexFactory());

        InputSpecification inputSpecification = new InputSpecification();
        builder.crawlRules().click("BUTTON");
        builder.crawlRules().click("A");

        Map<String, Collection<List<ID>>> uniqueList = idService.getIdWithHaspMap(1, ApplicationNames.Name.DIMESHIFT.getName());

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

        List<ClickList> listOfClick = clickListService.getNameWithGroup(1, ApplicationNames.Name.DIMESHIFT.getName());
        for (ClickList click : listOfClick) {
            if (click.getHow_xpath_id().equals("By.xpath")) {
                builder.crawlRules().click(click.getTagname()).underXPath(click.getClickxpath());

            } else if (click.getHow_xpath_id().equals("By.id")) {
                builder.crawlRules().click("button").withText(click.getClickxpath());
            }

        }
        /*
        builder.crawlRules().click("a").underXPath("/html/body/div[1]/div[1]/div/div[2]/ul/li[1]/a");
        builder.crawlRules().click("a").underXPath("/html/body/div[1]/div[1]/div/div[2]/ul/li[7]/a");
        builder.crawlRules().click("a").underXPath("/html/body/div[1]/div[1]/div/div[2]/ul/li[7]/a".toUpperCase());
        builder.crawlRules().click("button").underXPath("/html/body/div[1]/div[1]/div/div[2]/ul/li[7]/a");
        builder.crawlRules().click("button").underXPath("/html/body/div[1]/div[1]/div/div[2]/ul/li[7]/a".toUpperCase());*/

        //builder.crawlRules().click("a").underXPath("//li[7]/a");
        //builder.crawlRules().click("a").underXPath("//li[7]/a".toUpperCase());

        builder.crawlRules().setInputSpec(inputSpecification);

        builder.crawlRules().setDisableIdAndNameIdentification(true);
        builder.setHandleSameFormInputsOncePerState(true);
        builder.crawlRules().clickOnce(true);

        return builder;

    }

    @Override
    public SuiteGeneratorConfig getSuiteGeneratorConfig() {

        SuiteGeneratorConfig suiteGeneratorConfig = this.testSuiteGeneratorCommonConfig(url, waitTimeAfterReload);
        List<String> scriptNamesToExclude = new ArrayList<>();
        scriptNamesToExclude.add("jsmart");
        scriptNamesToExclude.add("backbone");
        scriptNamesToExclude.add("js");
        scriptNamesToExclude.add("bootstrap.clickonmouseover");
        scriptNamesToExclude.add("i18n");
        scriptNamesToExclude.add("underscore-min");
        scriptNamesToExclude.add("bootstrap-tour");
        scriptNamesToExclude.add("button");
        scriptNamesToExclude.add("collapse");
        scriptNamesToExclude.add("dropdown");
        scriptNamesToExclude.add("modal");
        scriptNamesToExclude.add("popover");
        scriptNamesToExclude.add("tooltip");
        scriptNamesToExclude.add("analytics");
        suiteGeneratorConfig.setScriptNamesToExclude(scriptNamesToExclude);
        suiteGeneratorConfig.setFiredElementStrategy(true);

        return suiteGeneratorConfig;
    }

    @Override
    public DependencyGraphExtractionConfig getDependencyGraphExtractionConfig() {
        String dependencyGraphOptimized = "0 00 000 0000 01000 010010 0001000 10000001 101000011 1001001000 00010000000 010010010000 1110000100000 00110000000100 010010000001000 0001000010010000 01010001000000000 000000110000000000 0000110000000000000 01000000000100000000 010000010000010000000 1001000010000000000000 00000000000000000000000 000000010000100101000000 0000010100000000000100000 10000000000011000100000000 000000010000000000000000000 1011100100000001000000000000 00110000010100000000101000000 110100000001000000000001000100 1000001100100001010100000000000 00011010000000000000010000010000 001010010000010001000000000000000 0011110001010110010101010000000110 00001010110100000000010000010000000 000010000000100000000000000010001000 1001011000010001000000000001000000000 01000101010010010100000001000000000000 000110000100100000011000000100000000010 1101010001110011000011000000000001000000 00000010100000001000000010101010000000000 110100101000001010010100000110000101000000 0000000101001010100010000000000000000101000 00101000000001110000100010000000100000000000 011100000000000110010010000000000000001000000 0100010101111000000100000000001000010011000000 00000000001001000110000000000100000000000000000 100000110010010101000101000010100000100000000000 0101101010001001000011010000010101000001000000000 10000000010000000000000000010000000100000000000000 110110010000100000100000000001000000000000000000000 0101000000011000000001000011100000000000000000000010 10100011110000010000000101000000000001000000000000000 001100001001000010111001000001000000000000000000000000 0000000011001000000100101000000000010000000000000000000";

        DependencyGraphExtractionConfig dependencyGraphExtractionConfig = new DependencyGraphExtractionConfig();
        dependencyGraphExtractionConfig.setParetoFrontSolution(dependencyGraphOptimized);
        // window strategy
//        dependencyGraphExtractionConfig.setFixedMinimizedTestSuite("10100011111111011000000000000000000000000000000000000000");
        // one by one strategy
        dependencyGraphExtractionConfig.setFixedSelectedTestSuite("11111111111111011000000000000000000000000000000000000000");

        return dependencyGraphExtractionConfig;
    }
}
