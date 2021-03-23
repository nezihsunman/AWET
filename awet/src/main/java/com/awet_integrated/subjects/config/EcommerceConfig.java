package com.awet_integrated.subjects.config;

import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.core.configuration.Form;
import com.crawljax.core.configuration.InputSpecification;
import com.crawljax.core.state.Eventable;
import com.crawljax.core.state.Identification;
import com.crawljax.core.state.StateVertex;
import com.crawljax.forms.FormInput;
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

public class EcommerceConfig extends Config {

    private static final String url = "http://localhost:3000";
    private static final int waitTimeAfterReload = 250;

    private static final IDService idService = new IDService();
    private static final ClickListService clickListService = new ClickListService();





    public EcommerceConfig() {
        super(ApplicationNames.Name.ECOMMERCE.getName());
    }

    @Override
    public CrawljaxConfiguration.CrawljaxConfigurationBuilder getCrawljaxConfig() {

        CrawljaxConfiguration.CrawljaxConfigurationBuilder builder = this.crawljaxCommonConfig(url,
                Properties.MAX_RUNTIME, 200, waitTimeAfterReload);

        InputSpecification inputSpecification = new InputSpecification();
        Map<String, Collection<List<ID>>> uniqueList = idService.getIdWithHaspMap(1, ApplicationNames.Name.ECOMMERCE.getName());

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
                    contactForm.inputField(FormInput.InputType.TEXT, new Identification(Identification.How.id, getKeyofValueForIdentificationId))
                            .inputValues(String.join(",", getValueListId));
                }
                if (getKeyofValueForIdentificationXPATH.size() > 0) {
                    contactForm.inputField(FormInput.InputType.TEXT, new Identification(Identification.How.xpath, getKeyofValueForIdentificationXpath))
                            .inputValues(String.join(",", getKeyofValueForIdentificationXPATH));
                }

            }
            if (!xpath.equals("") && beforeClickType.equals("withText")) {
                inputSpecification.setValuesInForm(contactForm).beforeClickElement("button").withText(infoBeforeClickType);
            } else if (!xpath.equals("") && beforeClickType.equals("underxpath")) {
                inputSpecification.setValuesInForm(contactForm).beforeClickElement("button").underXPath(xpath);
            }

        }

        List<ClickList> listOfClick = clickListService.getNameWithGroup(1, ApplicationNames.Name.ECOMMERCE.getName());
        for (ClickList click : listOfClick) {
            if (click.getHow_xpath_id().equals("By.xpath")) {
                builder.crawlRules().click(click.getTagname()).underXPath(click.getClickxpath());
            } else if (click.getHow_xpath_id().equals("By.id")) {
                builder.crawlRules().click(click.getTagname()).withText(click.getClickxpath());
            }


        }
        //builder.crawlRules().click("a");
        //builder.crawlRules().click("button");

        builder.setHandleSameFormInputsOncePerState(true);

        return builder;

    }

    @Override
    public SuiteGeneratorConfig getSuiteGeneratorConfig() {

        SuiteGeneratorConfig suiteGeneratorConfig = this.testSuiteGeneratorCommonConfig(url, waitTimeAfterReload);

        List<List<Integer>> lineRanges = new ArrayList<>();
        lineRanges.add(Arrays.asList(1, 942));
        suiteGeneratorConfig.setScriptNamesToExclude(new ArrayList<>());
        suiteGeneratorConfig.setScriptNameToInclude("bundle-0fda149fe4");
        suiteGeneratorConfig.setLineRanges(lineRanges);
        suiteGeneratorConfig.setFiredElementStrategy(true);

        return suiteGeneratorConfig;
    }

    @Override
    public DependencyGraphExtractionConfig getDependencyGraphExtractionConfig() {
        DependencyGraphExtractionConfig dependencyGraphExtractionConfig = new DependencyGraphExtractionConfig();
        dependencyGraphExtractionConfig.setParetoFrontSolution(Properties.BIOBJECTIVE_DEPENDENCY_GRAPH_BYTE_STRING);
        dependencyGraphExtractionConfig.setFixedSelectedTestSuite(Properties.COVERAGE_DRIVEN_TEST_SELECTION_BYTE_STRING);

        return dependencyGraphExtractionConfig;
    }

}
