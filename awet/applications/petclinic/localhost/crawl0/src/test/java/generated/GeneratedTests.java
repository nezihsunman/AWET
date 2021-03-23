package generated;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.crawljax.browser.EmbeddedBrowser.BrowserType;
import com.crawljax.core.configuration.BrowserConfiguration;
import com.crawljax.core.configuration.BrowserOptions;
import com.crawljax.core.configuration.CrawljaxConfiguration;
import com.crawljax.core.configuration.CrawljaxConfiguration.CrawljaxConfigurationBuilder;
import com.crawljax.core.state.Identification;
import com.crawljax.core.state.Identification.How;
import com.crawljax.forms.FormInput;
import com.crawljax.plugins.testcasegenerator.TestConfiguration.StateEquivalenceAssertionMode;
import com.crawljax.plugins.testcasegenerator.TestSuiteHelper;

/*
 * Generated @ Wed Dec 02 01:10:02 TRT 2020
 */

public class GeneratedTests {

    private final String URL = "http://localhost:3000";
	private TestSuiteHelper testSuiteHelper;
	
	private final String TEST_SUITE_PATH = "/home/nezihsunman/workspace/AWET/awet/applications/petclinic/localhost/crawl0/src/test/java/generated";

	private StateEquivalenceAssertionMode assertionMode = StateEquivalenceAssertionMode.ALL;
	
	private CrawljaxConfiguration getTestConfiguration() {
		CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);
		builder.crawlRules().waitAfterEvent(3000, TimeUnit.MILLISECONDS);
		builder.crawlRules().waitAfterReloadUrl(250, TimeUnit.MILLISECONDS);
		builder.setBrowserConfig(new BrowserConfiguration(BrowserType.CHROME_HEADLESS, 1, new BrowserOptions(false, 2)));
		return builder.build();
	}	
	
	@BeforeClass
	public void oneTimeSetUp(){
		try {
			//load needed data from json files
			testSuiteHelper = new TestSuiteHelper(
					getTestConfiguration(),
					"/home/nezihsunman/workspace/AWET/awet/applications/petclinic/localhost/crawl0/src/test/java/generated/states.json",
					"/home/nezihsunman/workspace/AWET/awet/applications/petclinic/localhost/crawl0/src/test/java/generated/eventables.json",
					"/home/nezihsunman/workspace/AWET/awet/applications/petclinic/localhost/crawl0/screenshots",
					"/home/nezihsunman/workspace/AWET/awet/applications/petclinic/localhost/crawl0/test-results",
					URL, TEST_SUITE_PATH);
		}
		catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
	
	@AfterClass
	public void oneTimeTearDown(){
		try {
			testSuiteHelper.tearDown();
		}catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@BeforeMethod
	public void setUp(){
		try {
			testSuiteHelper.goToInitialUrl();		
		}catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}	
	
	@AfterMethod
	public void getStatusAndDuration(ITestResult tr) {
		long duration = tr.getEndMillis() - tr.getStartMillis();
		long nanos = TimeUnit.MILLISECONDS.toNanos(duration);
		String message = "none";
		if (tr.getThrowable() != null) {
			message = tr.getThrowable().getMessage();
		}

		switch (tr.getStatus()) {
			case ITestResult.SUCCESS:
				testSuiteHelper.markLastMethodAsSucceeded(nanos);
				break;
			case ITestResult.FAILURE:
				testSuiteHelper.markLastMethodAsFailed(message, nanos);
				break;
			case ITestResult.SKIP:
				testSuiteHelper.markLastMethodAsSkipped(nanos);
				break;
		}
	}
	
	/*
	 * Test Cases
	 */
	 
	@Test(priority=1)
	public void method_0(){
		testSuiteHelper.newCurrentTestMethod("method_0");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		try {
			//initial state
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=2)
	public void method_1_2_3_4_5_6_7_8_9(){
		testSuiteHelper.newCurrentTestMethod("method_1_2_3_4_5_6_7_8_9");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
			testSuiteHelper.runInCrawlingPlugins(4);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 4");

			testSuiteHelper.addStateToReportBuilder(4);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(4)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(4)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=true, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(2), "Event fired: Owners");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=true, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: Veterinarians");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=10, name=state10}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, class=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=11, name=state11}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "mouse"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(11);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 11");

			testSuiteHelper.addStateToReportBuilder(11);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(11)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(11)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, class=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=10, name=state10}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=14, name=state14}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Home");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=3)
	public void method_10_11(){
		testSuiteHelper.newCurrentTestMethod("method_10_11");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Home");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=4)
	public void method_1_12_13_14(){
		testSuiteHelper.newCurrentTestMethod("method_1_12_13_14");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
			testSuiteHelper.runInCrawlingPlugins(4);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 4");

			testSuiteHelper.addStateToReportBuilder(4);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(4)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(4)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-c0=, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=19, name=state19}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: All");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=19, name=state19}, target=StateVertexImpl{id=20, name=state20}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(13), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(20);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 20");

			testSuiteHelper.addStateToReportBuilder(20);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(20)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(20)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c3=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=20, name=state20}, target=StateVertexImpl{id=19, name=state19}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/INPUT[1]"), ""));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: Back");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=5)
	public void method_3_15_16(){
		testSuiteHelper.newCurrentTestMethod("method_3_15_16");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-c0=, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=23, name=state23}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: All");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=23, name=state23}, target=StateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Home");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=6)
	public void method_5_17(){
		testSuiteHelper.newCurrentTestMethod("method_5_17");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=26, name=state26}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(17), "Event fired: Home");
			testSuiteHelper.runInCrawlingPlugins(26);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 26");

			testSuiteHelper.addStateToReportBuilder(26);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(26)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(26)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=7)
	public void method_5_6_18_19_20_21_22(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_18_19_20_21_22");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=10, name=state10}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=28, name=state28}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(18), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(28);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 28");

			testSuiteHelper.addStateToReportBuilder(28);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(28)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(28)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c5=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=28, name=state28}, target=StateVertexImpl{id=29, name=state29}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/INPUT[1]"), ""));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(19), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(29);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 29");

			testSuiteHelper.addStateToReportBuilder(29);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(29)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(29)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=29, name=state29}, target=StateVertexImpl{id=30, name=state30}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "mouse"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(30);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 30");

			testSuiteHelper.addStateToReportBuilder(30);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Update, attributes={_ngcontent-c6=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=30, name=state30}, target=StateVertexImpl{id=31, name=state31}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(21), "Event fired: Update");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=31, name=state31}, target=StateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "mouse"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Delete");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=8)
	public void method_5_6_7_23(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_7_23");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=10, name=state10}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, class=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=11, name=state11}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "mouse"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(11);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 11");

			testSuiteHelper.addStateToReportBuilder(11);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(11)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(11)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=14, name=state14}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Home");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=9)
	public void method_10_24_25_26_27(){
		testSuiteHelper.newCurrentTestMethod("method_10_24_25_26_27");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=36, name=state36}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "mouse"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(36);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 36");

			testSuiteHelper.addStateToReportBuilder(36);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(36)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(36)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=36, name=state36}, target=StateVertexImpl{id=37, name=state37}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/INPUT[1]"), ""));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "mouse"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=38, name=state38}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "mouse"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Update, attributes={_ngcontent-c4=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=39, name=state39}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(27), "Event fired: Update");
			testSuiteHelper.runInCrawlingPlugins(39);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 39");

			testSuiteHelper.addStateToReportBuilder(39);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(39)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(39)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=10)
	public void method_1_28_29_30_31_32_33(){
		testSuiteHelper.newCurrentTestMethod("method_1_28_29_30_31_32_33");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
			testSuiteHelper.runInCrawlingPlugins(4);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 4");

			testSuiteHelper.addStateToReportBuilder(4);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(4)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(4)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/owners/add, ng-reflect-router-link=/owners/add, routerlink=/owners/add}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=42, name=state42}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: Add New");
			testSuiteHelper.runInCrawlingPlugins(42);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 42");

			testSuiteHelper.addStateToReportBuilder(42);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(42)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(42)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=42, name=state42}, target=StateVertexImpl{id=43, name=state43}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/INPUT[1]"), ""));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: Back");
			testSuiteHelper.runInCrawlingPlugins(43);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 43");

			testSuiteHelper.addStateToReportBuilder(43);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(43)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(43)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=43, name=state43}, target=StateVertexImpl{id=42, name=state42}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(30), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(42);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 42");

			testSuiteHelper.addStateToReportBuilder(42);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(42)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(42)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c2=, class=btn btn-default, disabled=, type=submit}}, source=StateVertexImpl{id=42, name=state42}, target=StateVertexImpl{id=45, name=state45}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/INPUT[1]"), ""));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(45);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 45");

			testSuiteHelper.addStateToReportBuilder(45);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(45)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(45)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1], element=Element{node=[A: null], tag=A, text=yihit sunman, attributes={_ngcontent-c3=, href=/petclinic/owners/1, ng-reflect-router-link=/owners/1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=45, name=state45}, target=StateVertexImpl{id=46, name=state46}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: yihit sunman");
			testSuiteHelper.runInCrawlingPlugins(46);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 46");

			testSuiteHelper.addStateToReportBuilder(46);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=45, name=state45}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: < Back");
			testSuiteHelper.runInCrawlingPlugins(45);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 45");

			testSuiteHelper.addStateToReportBuilder(45);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(45)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(45)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=11)
	public void method_1_12_13_34(){
		testSuiteHelper.newCurrentTestMethod("method_1_12_13_34");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Owners, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Owners");
			testSuiteHelper.runInCrawlingPlugins(4);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 4");

			testSuiteHelper.addStateToReportBuilder(4);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(4)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(4)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-c0=, href=/petclinic/owners, ng-reflect-router-link=/owners, routerlink=/owners}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=19, name=state19}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: All");
			testSuiteHelper.runInCrawlingPlugins(19);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 19");

			testSuiteHelper.addStateToReportBuilder(19);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(19)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(19)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-LIST[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=19, name=state19}, target=StateVertexImpl{id=20, name=state20}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(13), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(20);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 20");

			testSuiteHelper.addStateToReportBuilder(20);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(20)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(20)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Owner, attributes={_ngcontent-c3=, class=btn btn-default, disabled=, type=submit}}, source=StateVertexImpl{id=20, name=state20}, target=StateVertexImpl{id=49, name=state49}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/INPUT[1]"), ""));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(34), "Event fired: Add Owner");
			testSuiteHelper.runInCrawlingPlugins(49);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 49");

			testSuiteHelper.addStateToReportBuilder(49);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=12)
	public void method_3_35_36_37(){
		testSuiteHelper.newCurrentTestMethod("method_3_35_36_37");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Add New, attributes={_ngcontent-c0=, href=/petclinic/vets/add, ng-reflect-router-link=/vets/add, routerlink=/vets/add}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=51, name=state51}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: Add New");
			testSuiteHelper.runInCrawlingPlugins(51);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 51");

			testSuiteHelper.addStateToReportBuilder(51);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(51)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(51)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c2=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=51, name=state51}, target=StateVertexImpl{id=52, name=state52}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/INPUT[1]"), ""));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"), ""));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: < Back");
			testSuiteHelper.runInCrawlingPlugins(52);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 52");

			testSuiteHelper.addStateToReportBuilder(52);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(52)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(52)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=52, name=state52}, target=StateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Home");
			testSuiteHelper.runInCrawlingPlugins(0);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 0");

			testSuiteHelper.addStateToReportBuilder(0);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=13)
	public void method_3_15_38_39(){
		testSuiteHelper.newCurrentTestMethod("method_3_15_38_39");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Veterinarians");
			testSuiteHelper.runInCrawlingPlugins(6);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 6");

			testSuiteHelper.addStateToReportBuilder(6);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(6)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(6)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=All, attributes={_ngcontent-c0=, href=/petclinic/vets, ng-reflect-router-link=/vets, routerlink=/vets}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=23, name=state23}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: All");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Vet, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=23, name=state23}, target=StateVertexImpl{id=55, name=state55}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Add Vet");
			testSuiteHelper.runInCrawlingPlugins(55);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 55");

			testSuiteHelper.addStateToReportBuilder(55);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(55)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(55)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c3=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=55, name=state55}, target=StateVertexImpl{id=23, name=state23}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/INPUT[1]"), ""));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.SELECT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/DIV[1]/DIV[1]/SELECT[1]"), ""));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: < Back");
			testSuiteHelper.runInCrawlingPlugins(23);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 23");

			testSuiteHelper.addStateToReportBuilder(23);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(23)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(23)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=14)
	public void method_5_40_41_42_43_44(){
		testSuiteHelper.newCurrentTestMethod("method_5_40_41_42_43_44");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=58, name=state58}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(40), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(58);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 58");

			testSuiteHelper.addStateToReportBuilder(58);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(58)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(58)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-PETTYPE-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=58, name=state58}, target=StateVertexImpl{id=59, name=state59}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(59);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 59");

			testSuiteHelper.addStateToReportBuilder(59);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(59)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(59)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=59, name=state59}, target=StateVertexImpl{id=60, name=state60}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(60);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 60");

			testSuiteHelper.addStateToReportBuilder(60);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(60)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(60)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Update, attributes={_ngcontent-c4=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=60, name=state60}, target=StateVertexImpl{id=61, name=state61}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Update");
			testSuiteHelper.runInCrawlingPlugins(61);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 61");

			testSuiteHelper.addStateToReportBuilder(61);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(61)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(61)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=61, name=state61}, target=StateVertexImpl{id=8, name=state8}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: Delete");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=15)
	public void method_5_6_18_45(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_18_45");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=10, name=state10}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=28, name=state28}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(18), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(28);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 28");

			testSuiteHelper.addStateToReportBuilder(28);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(28)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(28)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=28, name=state28}, target=StateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/INPUT[1]"), ""));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: Home");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=16)
	public void method_5_6_18_19_46(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_18_19_46");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=10, name=state10}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=28, name=state28}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(18), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(28);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 28");

			testSuiteHelper.addStateToReportBuilder(28);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(28)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(28)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c5=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=28, name=state28}, target=StateVertexImpl{id=29, name=state29}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/INPUT[1]"), ""));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(19), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(29);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 29");

			testSuiteHelper.addStateToReportBuilder(29);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(29)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(29)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=29, name=state29}, target=StateVertexImpl{id=10, name=state10}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "mouse"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(46), "Event fired: Delete");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=17)
	public void method_5_6_18_19_20_47(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_18_19_20_47");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=10, name=state10}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=28, name=state28}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(18), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(28);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 28");

			testSuiteHelper.addStateToReportBuilder(28);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(28)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(28)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c5=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=28, name=state28}, target=StateVertexImpl{id=29, name=state29}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/INPUT[1]"), ""));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(19), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(29);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 29");

			testSuiteHelper.addStateToReportBuilder(29);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(29)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(29)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=29, name=state29}, target=StateVertexImpl{id=30, name=state30}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "mouse"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(30);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 30");

			testSuiteHelper.addStateToReportBuilder(30);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(30)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(30)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Cancel, attributes={_ngcontent-c6=, class=btn btn-default}}, source=StateVertexImpl{id=30, name=state30}, target=StateVertexImpl{id=31, name=state31}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(47), "Event fired: Cancel");
			testSuiteHelper.runInCrawlingPlugins(31);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 31");

			testSuiteHelper.addStateToReportBuilder(31);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(31)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(31)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=18)
	public void method_5_6_7_48_49(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_7_48_49");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(8);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 8");

			testSuiteHelper.addStateToReportBuilder(8);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(8)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(8)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=8, name=state8}, target=StateVertexImpl{id=10, name=state10}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(10);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 10");

			testSuiteHelper.addStateToReportBuilder(10);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(10)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(10)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, class=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=10, name=state10}, target=StateVertexImpl{id=11, name=state11}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "mouse"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Pet Types");
			testSuiteHelper.runInCrawlingPlugins(11);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 11");

			testSuiteHelper.addStateToReportBuilder(11);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(11)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(11)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=70, name=state70}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(70);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 70");

			testSuiteHelper.addStateToReportBuilder(70);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(70)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(70)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=70, name=state70}, target=StateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Home");
			testSuiteHelper.runInCrawlingPlugins(14);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 14");

			testSuiteHelper.addStateToReportBuilder(14);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(14)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(14)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=19)
	public void method_10_24_50(){
		testSuiteHelper.newCurrentTestMethod("method_10_24_50");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=36, name=state36}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "mouse"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(36);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 36");

			testSuiteHelper.addStateToReportBuilder(36);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(36)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(36)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=36, name=state36}, target=StateVertexImpl{id=17, name=state17}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "mouse"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/INPUT[1]"), ""));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Home");
			testSuiteHelper.runInCrawlingPlugins(17);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 17");

			testSuiteHelper.addStateToReportBuilder(17);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(17)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(17)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=20)
	public void method_10_24_25_51(){
		testSuiteHelper.newCurrentTestMethod("method_10_24_25_51");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=36, name=state36}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "mouse"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(36);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 36");

			testSuiteHelper.addStateToReportBuilder(36);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(36)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(36)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=36, name=state36}, target=StateVertexImpl{id=37, name=state37}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/INPUT[1]"), ""));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "mouse"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=39, name=state39}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "mouse"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: Delete");
			testSuiteHelper.runInCrawlingPlugins(39);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 39");

			testSuiteHelper.addStateToReportBuilder(39);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(39)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(39)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=21)
	public void method_10_24_25_26_52_53(){
		testSuiteHelper.newCurrentTestMethod("method_10_24_25_26_52_53");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(0);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(0)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(0)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Specialties");
			testSuiteHelper.runInCrawlingPlugins(16);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 16");

			testSuiteHelper.addStateToReportBuilder(16);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(16)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(16)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=36, name=state36}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "mouse"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(36);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 36");

			testSuiteHelper.addStateToReportBuilder(36);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(36)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(36)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=36, name=state36}, target=StateVertexImpl{id=37, name=state37}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[1]/APP-SPECIALTY-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/INPUT[1]"), ""));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "mouse"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Save");
			testSuiteHelper.runInCrawlingPlugins(37);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 37");

			testSuiteHelper.addStateToReportBuilder(37);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(37)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(37)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=37, name=state37}, target=StateVertexImpl{id=38, name=state38}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "mouse"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(38);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 38");

			testSuiteHelper.addStateToReportBuilder(38);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Cancel, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=77, name=state77}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(52), "Event fired: Cancel");
			testSuiteHelper.runInCrawlingPlugins(77);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 77");

			testSuiteHelper.addStateToReportBuilder(77);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(77)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(77)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=77, name=state77}, target=StateVertexImpl{id=78, name=state78}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.xpath, "/HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[1]/INPUT[1]"), "mouse"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(53), "Event fired: Edit");
			testSuiteHelper.runInCrawlingPlugins(78);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 78");

			testSuiteHelper.addStateToReportBuilder(78);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(78)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(78)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}


}	 
