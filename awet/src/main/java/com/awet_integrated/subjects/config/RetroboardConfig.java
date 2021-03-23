package com.awet_integrated.subjects.config;

import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.core.configuration.Form;
import com.crawljax.core.configuration.InputSpecification;
import com.crawljax.core.state.Eventable;
import com.crawljax.core.state.Identification;
import com.crawljax.core.state.StateVertex;
import com.crawljax.forms.FormInput;
import com.crawljax.forms.InputValue;
import com.crawljax.stateabstractions.visual.imagehashes.PerceptualImageHashStateVertexFactory;
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

public class RetroboardConfig extends Config {

    private static final String url = "http://localhost:4000";
    private static final int waitTimeAfterReload = 1000;

    private static final IDService idService = new IDService();
    private static final ClickListService clickListService = new ClickListService();





    private static final String USER_1 = "admin";
    private static final String USER_2 = "user";

    public static final List<String> users = Arrays.asList(USER_1, USER_2);
    public static final String usersXPath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]".toUpperCase();

    /**
     * @implNote this crawling configuration works (exploration does not stop for 30 minutes) only if in the class com.crawljax.forms.FormHandler of
     * crawljax core module in the method handleText we substitute || with && at line 174.
     */
    public RetroboardConfig() {
        super(ApplicationNames.Name.RETROBOARD.getName());
    }

    @Override
    public CrawljaxConfiguration.CrawljaxConfigurationBuilder getCrawljaxConfig() {

        CrawljaxConfiguration.CrawljaxConfigurationBuilder builder = this.crawljaxCommonConfig(url,
                Properties.MAX_RUNTIME, 1000, waitTimeAfterReload);

        builder.setStateVertexFactory(new PerceptualImageHashStateVertexFactory());
        builder.setConsiderCandidateElementsOnce(CrawljaxConfiguration.CandidateElementsMode.fired);

        builder.crawlRules().click("a", "button");
        builder.crawlRules().click("BUTTON");
        builder.crawlRules().click("A");

        // github link
        builder.crawlRules().dontClick("a")
                .withAttribute("href", "https://github.com/antoinejaussoin/retro-board");
//        builder.crawlRules().dontClick("a")
//                .underXPath("//DIV[@id = 'content']/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/DIV[1]/A[1]");
        // invite button opens modal
//        builder.crawlRules().dontClick("button")
//                .withAttribute("title", "Invite");
        // menu button opens modal
//        builder.crawlRules().dontClick("button")
//                .withAttribute("id", "crawljax-menu");


        InputSpecification inputSpecification = new InputSpecification();

        Identification wellIdentification = new Identification(Identification.How.xpath,
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]".toUpperCase());
        inputSpecification.inputField(FormInput.InputType.INPUT, wellIdentification).inputValues("Work", "All the rest");
//        FormInput well = retro.inputField(FormInput.InputType.INPUT, wellIdentification);
//        well.inputValues("Work","All the rest");

        Identification improvedIdentification = new Identification(Identification.How.xpath,
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]".toUpperCase());
        inputSpecification.inputField(FormInput.InputType.INPUT, improvedIdentification).inputValues("Social life", "Time off");
//        FormInput improved = retro.inputField(FormInput.InputType.INPUT, improvedIdentification);
//        improved.inputValues("Social life", "Time off");

        Identification ideaIdentification = new Identification(Identification.How.xpath,
                "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/input[1]".toUpperCase());
        inputSpecification.inputField(FormInput.InputType.INPUT, ideaIdentification).inputValues("Brilliant idea", "Work remotely");
//        FormInput idea = retro.inputField(FormInput.InputType.INPUT, ideaIdentification);
//        idea.inputValues("Brilliant idea", "Work remotely");

//        // fake element (retro grid) to make the form work
//        inputSpecification.setValuesInForm(retro).beforeClickElement("div")
//                .withAttribute("class", "PostBoard__board___1QU4l grid");
        Form login = new Form();
        FormInput inputLogin = login.inputField(FormInput.InputType.INPUT, new Identification(Identification.How.xpath, usersXPath));
        inputLogin.inputValues(USER_1, USER_2);
        //inputSpecification.setValuesInForm(login).beforeClickElement("button").withText("\"Let's start\"");
        //Altltaki for çalışıyor kesin doğru test edildi
        inputSpecification.setValuesInForm(login).beforeClickElement("button").underXPath("//button[@type='button']");
        Map<String, Collection<List<ID>>> uniqueList = idService.getIdWithHaspMap(1, ApplicationNames.Name.RETROBOARD.getName());

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
        List<ClickList> listOfClick = clickListService.getNameWithGroup(1, ApplicationNames.Name.RETROBOARD.getName());
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

        Set<Identification> inputFieldIdsWithEnterClick = new HashSet<>();
        inputFieldIdsWithEnterClick.add(wellIdentification);
        inputFieldIdsWithEnterClick.add(improvedIdentification);
        inputFieldIdsWithEnterClick.add(ideaIdentification);
        builder.crawlRules().setInputFieldIdsWithEnterClick(inputFieldIdsWithEnterClick);
        builder.setHandleSameFormInputsOncePerState(true);

        return builder;

    }

    @Override
    public SuiteGeneratorConfig getSuiteGeneratorConfig() {

        SuiteGeneratorConfig suiteGeneratorConfig = this.testSuiteGeneratorCommonConfig(url, waitTimeAfterReload);
        suiteGeneratorConfig.setScriptNameToInclude("app.0.10.0");
        suiteGeneratorConfig.setSourcemapURL("http://localhost:4000/assets/app.0.10.0.js.map");
        suiteGeneratorConfig.setSrcCodeFolder("app");
        suiteGeneratorConfig.setSrcCodeFilesToExclude(Arrays.asList("i18n", "__tests__"));
        suiteGeneratorConfig.setFiredElementStrategy(true);

        return suiteGeneratorConfig;
    }

    @Override
    public DependencyGraphExtractionConfig getDependencyGraphExtractionConfig() {
        String dependencyGraphOptimized = "0 01 000 0001 10010 101000 0000000 10011010 100000000 0011000000 00000000000 000010100100 0000000001000 00000100101000 011000100101000 1000000000100000 11101010001000000 100000000000000000 0000011111100000000 00000000000000000010 001100100000000010000 0101000000000010000000 10100010000010000000000 010100000010100000000100 0100101000100000001000000 10101100010100000000000000 111001100100000010000000000 1010000101001000101000000000 00111011000000000000000100000 000101101010000001100000000000 1000010110000001001100010000000 10000101100001010101100000000000 100000000011100000000000100000000 0100011100000000101100010000100100 01000000101111011000011000011001000 111100001001000101001000000000100000 0110100000110110101100100010100010000 00000011000000010101000001010000000000 010000010000010011000101010000100000000 0100110011000100001100001000100100000000 11000000000100111001011000000000100000000 000000000011000110010110001010010010000000 0000000101101010010011101100101000000000000 01000000000000100000000000000000000000000000 111000001010000101101010101000110010100010101 0010001111000100000000100001001000000000000010 10001001001000011001010100000000000000001000000 010010000010000000001010010110000000101001001000 0101100100011000001100101000110100000010000010000 01111010110001111011100000000001101000000000000000 100000101110010010100111010011110000001000010000000 1000101000000111101010001101010000000010001010100000 10000110001110011000101010110000000010000000000000000 000001100000110000000011101000000000000000100000000000 1011101100000100001110000010001010100000100000000000000 00000101110000000111001100010100100001001000000000000000 011101010100001000000010010011100000100000000000000000000 0001001000010010010111001000000000010000000000000000000000 10000010001000010010000001001100000000000000000000000000000 010110011011000001111001000000000000001000100010010000100000 1101010001000100000100000000011010000000111010100000000000010 00010001000100100001000101001001010000000100001000000011000000 001111011000001110000100100000010110000001001000100000010000101 0101110001101100101110011110000100100100000100010111001001000000 00001011100010011110000001000001000010000101100000000001000000000 010001011100010010001000010001110110101010000100011000100001000000 0101001001010100000100100000001010110000010000110000001010011000000 11110011000100001110000010110000101000000000100100100101100000100000 110101100000100011001010110010100010000000010100100001100110000000000 0000001011011011010000000011000111101110000000011000000000000000000000 01011100101000001000100001010101000100100100111010011010000100000100000 100010000000110010101010001001011100000000100001001000000010000000000000 0011001011010111110100110000001110111000000011000000010000000000000000000 00010100100000101000000010111000011000000010011011101101000000100000010100 101001000111111010100001011001010110000011001001001000000001010001000000000 1010001111100100001001100001001001000110010010000100101111010000011100000000 11001000100010000001000101010011011100011010100000000011011100000000000000000 101100100010100000101011010011011010110100000010010000101000000000000000000000 1000001000000101000010010101011010000100000000001001100001000000000000000000000 00000110010000000000000100010010001111000010000001110001100010000000000000100000 100010111010011011000100100110001000010000010100101001000000100000000000000000000 1100100001001111000000100111100010000001001000101000010000010000011101000000010101 11000001110000011001110000100100110100101000000000111000011001011000010000000000000 011000010010100010010011000001100000011001110000010001000101000000001010000000000000 1000000000100101000100100101100000001010010000100010100000000100111000000001000000000 01010000001110110100000100010011100001000001110011100100001000001000010000000000000000 010010000101000100001010110000100000010000010101001100111101010010000000000010000000110 0000001010101000011000010011000100100110000010111100010101110100010000110100100010011000 01100010001001011111111010010010101000000110001001010110010000000100000000000000011011000 110010000010000011101000100000100001001010000111000001101100000001101000001000000100000000 0110011101011001100011000011001011011010001001010010100100000100000111010100000000010000000 10000111010010010000110000010001001100110101000100000000101001100111001001110011000000000000 010010100000000000100010001000011100000001000110001100001000110100010011000111010101001001010 0001000100001110010101000110000000001000011001100101011000100001000101110000100000000001001000 11101001010000000010001000010100100000011010101010101001000101011001010100000100000100000000100 000100000100000000100001000101010001001100110000101000110110100001000000000000100011001000010001 1011111010010100000000101000000000101000000000010010000100011010000000000010110000000011000000010 10000000010010011011011001011010001110100000100100000101000101101000001010000100010000000000000000 000101000000000001010010101000100000000100001000000011010000100000100001100000000000000010000000001";

        DependencyGraphExtractionConfig dependencyGraphExtractionConfig = new DependencyGraphExtractionConfig();
        dependencyGraphExtractionConfig.setParetoFrontSolution(dependencyGraphOptimized);
        // window strategy and one by one strategy produce the same result
        dependencyGraphExtractionConfig.setFixedSelectedTestSuite("1100000000000000000000000000000000011000000000000000000000001000000000000000000000000000000000000000");

        return dependencyGraphExtractionConfig;
    }
}
