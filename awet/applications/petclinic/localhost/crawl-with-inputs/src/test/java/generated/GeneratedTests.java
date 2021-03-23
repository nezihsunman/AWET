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
 * Generated @ Wed Dec 02 01:05:16 TRT 2020
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
	public void method_10_24_25_26_27_28(){
		testSuiteHelper.newCurrentTestMethod("method_10_24_25_26_27_28");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=39, name=state39}, target=StateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: Delete");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=10)
	public void method_1_29_30_31_32_33_34(){
		testSuiteHelper.newCurrentTestMethod("method_1_29_30_31_32_33_34");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: Add New");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(30), "Event fired: Back");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: Add Owner");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Add Owner");
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
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: yihit sunman");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(34), "Event fired: < Back");
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
	public void method_1_12_13_35(){
		testSuiteHelper.newCurrentTestMethod("method_1_12_13_35");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: Add Owner");
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
	public void method_3_36_37_38(){
		testSuiteHelper.newCurrentTestMethod("method_3_36_37_38");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: < Back");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Home");
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
	public void method_3_15_39_40(){
		testSuiteHelper.newCurrentTestMethod("method_3_15_39_40");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: Add Vet");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(40), "Event fired: < Back");
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
	public void method_5_41_42_43_44(){
		testSuiteHelper.newCurrentTestMethod("method_5_41_42_43_44");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Add");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: Save");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Edit");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Update, attributes={_ngcontent-c4=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=60, name=state60}, target=StateVertexImpl{id=8, name=state8}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: Update");
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
	public void method_5_6_7_48_49_50(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_7_48_49_50");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=69, name=state69}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(69);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 69");

			testSuiteHelper.addStateToReportBuilder(69);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(69)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(69)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=69, name=state69}, target=StateVertexImpl{id=70, name=state70}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Delete");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Home");
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
	public void method_10_24_51(){
		testSuiteHelper.newCurrentTestMethod("method_10_24_51");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: Home");
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
	public void method_10_24_25_52(){
		testSuiteHelper.newCurrentTestMethod("method_10_24_25_52");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(52), "Event fired: Delete");
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
	public void method_10_24_25_26_53_54(){
		testSuiteHelper.newCurrentTestMethod("method_10_24_25_26_53_54");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
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
			Assert.assertTrue(testSuiteHelper.fireEvent(53), "Event fired: Cancel");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(54), "Event fired: Edit");
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

	@Test(priority=22)
	public void method_1_55_56(){
		testSuiteHelper.newCurrentTestMethod("method_1_55_56");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Veterinarians, attributes={_ngcontent-c0=, aria-expanded=false, aria-haspopup=true, class=dropdown-toggle, data-toggle=dropdown, role=button}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=6, name=state6}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(55), "Event fired: Veterinarians");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Pet Types");
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

	@Test(priority=23)
	public void method_1_29_32_33_57_58_59_60_61_62_63_64_65_66(){
		testSuiteHelper.newCurrentTestMethod("method_1_29_32_33_57_58_59_60_61_62_63_64_65_66");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: Add New");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Add Owner");
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
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: yihit sunman");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Owner, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=83, name=state83}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(57), "Event fired: Edit Owner");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(83)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(83)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={_ngcontent-c6=, class=btn btn-default}}, source=StateVertexImpl{id=83, name=state83}, target=StateVertexImpl{id=46, name=state46}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(58), "Event fired: Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=85, name=state85}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Add New Pet");
			testSuiteHelper.runInCrawlingPlugins(85);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 85");

			testSuiteHelper.addStateToReportBuilder(85);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(85)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(85)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/MAT-DATEPICKER-TOGGLE[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-haspopup=true, aria-label=Open calendar, class=mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, tabindex=0, type=button}}, source=StateVertexImpl{id=85, name=state85}, target=StateVertexImpl{id=86, name=state86}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(86);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 86");

			testSuiteHelper.addStateToReportBuilder(86);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=12 2020, attributes={aria-label=Choose month and year, cdkarialive=polite, class=mat-calendar-period-button mat-button, mat-button=, ng-reflect-politeness=polite, type=button}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=87, name=state87}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: 12 2020");
			testSuiteHelper.runInCrawlingPlugins(87);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 87");

			testSuiteHelper.addStateToReportBuilder(87);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(87)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(87)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=2016 – 2039, attributes={aria-label=Choose date, cdkarialive=polite, class=mat-calendar-period-button mat-button, mat-button=, ng-reflect-politeness=polite, type=button}}, source=StateVertexImpl{id=87, name=state87}, target=StateVertexImpl{id=88, name=state88}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(62), "Event fired: 2016 – 2039");
			testSuiteHelper.runInCrawlingPlugins(88);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 88");

			testSuiteHelper.addStateToReportBuilder(88);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(88)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(88)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-label=Previous month, class=mat-calendar-previous-button mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, type=button}}, source=StateVertexImpl{id=88, name=state88}, target=StateVertexImpl{id=89, name=state89}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(63), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(89);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 89");

			testSuiteHelper.addStateToReportBuilder(89);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(89)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(89)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-label=Previous month, class=mat-calendar-previous-button mat-icon-button cdk-focused cdk-mouse-focused, mat-icon-button=, ng-reflect-disabled=false, type=button}}, source=StateVertexImpl{id=89, name=state89}, target=StateVertexImpl{id=90, name=state90}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(90);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 90");

			testSuiteHelper.addStateToReportBuilder(90);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(90)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(90)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-label=Next month, class=mat-calendar-next-button mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, type=button}}, source=StateVertexImpl{id=90, name=state90}, target=StateVertexImpl{id=91, name=state91}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(65), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(91);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 91");

			testSuiteHelper.addStateToReportBuilder(91);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(91)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(91)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-label=Next month, class=mat-calendar-next-button mat-icon-button cdk-focused cdk-mouse-focused, mat-icon-button=, ng-reflect-disabled=false, type=button}}, source=StateVertexImpl{id=91, name=state91}, target=StateVertexImpl{id=92, name=state92}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(92);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 92");

			testSuiteHelper.addStateToReportBuilder(92);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(92)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(92)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=24)
	public void method_3_67_68(){
		testSuiteHelper.newCurrentTestMethod("method_3_67_68");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=6, name=state6}, target=StateVertexImpl{id=77, name=state77}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(67), "Event fired: Specialties");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[2]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=77, name=state77}, target=StateVertexImpl{id=39, name=state39}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(68), "Event fired: Delete");
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

	@Test(priority=25)
	public void method_3_36_69_70_71_72_73(){
		testSuiteHelper.newCurrentTestMethod("method_3_36_69_70_71_72_73");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Vet, attributes={_ngcontent-c2=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=51, name=state51}, target=StateVertexImpl{id=97, name=state97}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(69), "Event fired: Save Vet");
			testSuiteHelper.runInCrawlingPlugins(97);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 97");

			testSuiteHelper.addStateToReportBuilder(97);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(97)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(97)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=97, name=state97}, target=StateVertexImpl{id=98, name=state98}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Edit Vet");
			testSuiteHelper.runInCrawlingPlugins(98);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 98");

			testSuiteHelper.addStateToReportBuilder(98);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(98)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(98)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c4=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=98, name=state98}, target=StateVertexImpl{id=99, name=state99}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(71), "Event fired: < Back");
			testSuiteHelper.runInCrawlingPlugins(99);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 99");

			testSuiteHelper.addStateToReportBuilder(99);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(99)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(99)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=99, name=state99}, target=StateVertexImpl{id=100, name=state100}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(72), "Event fired: Delete Vet");
			testSuiteHelper.runInCrawlingPlugins(100);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 100");

			testSuiteHelper.addStateToReportBuilder(100);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(100)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(100)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=100, name=state100}, target=StateVertexImpl{id=101, name=state101}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(73), "Event fired: Add Vet");
			testSuiteHelper.runInCrawlingPlugins(101);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 101");

			testSuiteHelper.addStateToReportBuilder(101);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(101)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(101)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=26)
	public void method_3_36_37_74(){
		testSuiteHelper.newCurrentTestMethod("method_3_36_37_74");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: < Back");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=52, name=state52}, target=StateVertexImpl{id=103, name=state103}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(74), "Event fired: Add Vet");
			testSuiteHelper.runInCrawlingPlugins(103);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 103");

			testSuiteHelper.addStateToReportBuilder(103);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(103)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(103)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=27)
	public void method_3_15_39_75_76_77_78(){
		testSuiteHelper.newCurrentTestMethod("method_3_15_39_75_76_77_78");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: Add Vet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Vet, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=55, name=state55}, target=StateVertexImpl{id=105, name=state105}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: Save Vet");
			testSuiteHelper.runInCrawlingPlugins(105);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 105");

			testSuiteHelper.addStateToReportBuilder(105);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(105)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(105)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Vet, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=105, name=state105}, target=StateVertexImpl{id=98, name=state98}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(76), "Event fired: Edit Vet");
			testSuiteHelper.runInCrawlingPlugins(98);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 98");

			testSuiteHelper.addStateToReportBuilder(98);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(98)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(98)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Vet, attributes={_ngcontent-c4=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=98, name=state98}, target=StateVertexImpl{id=107, name=state107}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(77), "Event fired: Save Vet");
			testSuiteHelper.runInCrawlingPlugins(107);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 107");

			testSuiteHelper.addStateToReportBuilder(107);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(107)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(107)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete Vet, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=107, name=state107}, target=StateVertexImpl{id=108, name=state108}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(78), "Event fired: Delete Vet");
			testSuiteHelper.runInCrawlingPlugins(108);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 108");

			testSuiteHelper.addStateToReportBuilder(108);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(108)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(108)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=28)
	public void method_5_41_79(){
		testSuiteHelper.newCurrentTestMethod("method_5_41_79");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=58, name=state58}, target=StateVertexImpl{id=26, name=state26}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(79), "Event fired: Home");
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

	@Test(priority=29)
	public void method_5_41_42_80(){
		testSuiteHelper.newCurrentTestMethod("method_5_41_42_80");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Add");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: Save");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=59, name=state59}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(80), "Event fired: Delete");
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

	@Test(priority=30)
	public void method_5_41_42_43_81(){
		testSuiteHelper.newCurrentTestMethod("method_5_41_42_43_81");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Add");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: Save");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Edit");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Cancel, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=60, name=state60}, target=StateVertexImpl{id=114, name=state114}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(81), "Event fired: Cancel");
			testSuiteHelper.runInCrawlingPlugins(114);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 114");

			testSuiteHelper.addStateToReportBuilder(114);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(114)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(114)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=31)
	public void method_5_6_18_82(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_18_82");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=28, name=state28}, target=StateVertexImpl{id=31, name=state31}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(82), "Event fired: Add");
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

	@Test(priority=32)
	public void method_5_6_7_48_83(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_7_48_83");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=69, name=state69}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(69);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 69");

			testSuiteHelper.addStateToReportBuilder(69);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(69)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(69)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Home, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=69, name=state69}, target=StateVertexImpl{id=14, name=state14}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(83), "Event fired: Home");
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

	@Test(priority=33)
	public void method_5_6_7_48_49_84(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_7_48_49_84");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=69, name=state69}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(69);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 69");

			testSuiteHelper.addStateToReportBuilder(69);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(69)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(69)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=69, name=state69}, target=StateVertexImpl{id=70, name=state70}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Delete");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=70, name=state70}, target=StateVertexImpl{id=11, name=state11}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(84), "Event fired: Add");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=34)
	public void method_10_24_85(){
		testSuiteHelper.newCurrentTestMethod("method_10_24_85");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-SPECIALTY-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=36, name=state36}, target=StateVertexImpl{id=39, name=state39}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Add");
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

	@Test(priority=35)
	public void method_1_86(){
		testSuiteHelper.newCurrentTestMethod("method_1_86");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[4]/A[1], element=Element{node=[A: null], tag=A, text=Pet Types, attributes={_ngcontent-c0=, href=/petclinic/pettypes, ng-reflect-router-link=/pettypes, ng-reflect-router-link-active=active, routerlink=/pettypes, routerlinkactive=active, title=pettypes}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=8, name=state8}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(86), "Event fired: Pet Types");
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

	@Test(priority=36)
	public void method_1_29_32_33_57_87(){
		testSuiteHelper.newCurrentTestMethod("method_1_29_32_33_57_87");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: Add New");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Add Owner");
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
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: yihit sunman");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Owner, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=83, name=state83}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(57), "Event fired: Edit Owner");
			testSuiteHelper.runInCrawlingPlugins(83);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 83");

			testSuiteHelper.addStateToReportBuilder(83);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(83)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(83)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[7]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Update Owner, attributes={_ngcontent-c6=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=83, name=state83}, target=StateVertexImpl{id=46, name=state46}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(87), "Event fired: Update Owner");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=37)
	public void method_1_29_32_33_59_88(){
		testSuiteHelper.newCurrentTestMethod("method_1_29_32_33_59_88");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: Add New");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Add Owner");
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
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: yihit sunman");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=85, name=state85}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Add New Pet");
			testSuiteHelper.runInCrawlingPlugins(85);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 85");

			testSuiteHelper.addStateToReportBuilder(85);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(85)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(85)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c7=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=85, name=state85}, target=StateVertexImpl{id=128, name=state128}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(88), "Event fired: < Back");
			testSuiteHelper.runInCrawlingPlugins(128);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 128");

			testSuiteHelper.addStateToReportBuilder(128);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(128)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(128)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=38)
	public void method_1_29_32_33_59_60_89(){
		testSuiteHelper.newCurrentTestMethod("method_1_29_32_33_59_60_89");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: Add New");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Add Owner");
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
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: yihit sunman");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=85, name=state85}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Add New Pet");
			testSuiteHelper.runInCrawlingPlugins(85);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 85");

			testSuiteHelper.addStateToReportBuilder(85);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(85)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(85)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/MAT-DATEPICKER-TOGGLE[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-haspopup=true, aria-label=Open calendar, class=mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, tabindex=0, type=button}}, source=StateVertexImpl{id=85, name=state85}, target=StateVertexImpl{id=86, name=state86}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(86);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 86");

			testSuiteHelper.addStateToReportBuilder(86);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-label=Previous month, class=mat-calendar-previous-button mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, type=button}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=130, name=state130}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(89), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(130);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 130");

			testSuiteHelper.addStateToReportBuilder(130);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(130)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(130)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=39)
	public void method_1_29_32_33_59_60_61_90_91_92_93(){
		testSuiteHelper.newCurrentTestMethod("method_1_29_32_33_59_60_61_90_91_92_93");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: Add New");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Add Owner");
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
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: yihit sunman");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=85, name=state85}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Add New Pet");
			testSuiteHelper.runInCrawlingPlugins(85);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 85");

			testSuiteHelper.addStateToReportBuilder(85);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(85)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(85)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/MAT-DATEPICKER-TOGGLE[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-haspopup=true, aria-label=Open calendar, class=mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, tabindex=0, type=button}}, source=StateVertexImpl{id=85, name=state85}, target=StateVertexImpl{id=86, name=state86}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(86);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 86");

			testSuiteHelper.addStateToReportBuilder(86);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=12 2020, attributes={aria-label=Choose month and year, cdkarialive=polite, class=mat-calendar-period-button mat-button, mat-button=, ng-reflect-politeness=polite, type=button}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=87, name=state87}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: 12 2020");
			testSuiteHelper.runInCrawlingPlugins(87);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 87");

			testSuiteHelper.addStateToReportBuilder(87);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(87)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(87)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-label=Previous 20 years, class=mat-calendar-previous-button mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, type=button}}, source=StateVertexImpl{id=87, name=state87}, target=StateVertexImpl{id=132, name=state132}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(90), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(132);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 132");

			testSuiteHelper.addStateToReportBuilder(132);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(132)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(132)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-label=Previous 20 years, class=mat-calendar-previous-button mat-icon-button cdk-focused cdk-mouse-focused, mat-icon-button=, ng-reflect-disabled=false, type=button}}, source=StateVertexImpl{id=132, name=state132}, target=StateVertexImpl{id=133, name=state133}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(91), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(133);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 133");

			testSuiteHelper.addStateToReportBuilder(133);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(133)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(133)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-label=Next 20 years, class=mat-calendar-next-button mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, type=button}}, source=StateVertexImpl{id=133, name=state133}, target=StateVertexImpl{id=134, name=state134}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(92), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(134);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 134");

			testSuiteHelper.addStateToReportBuilder(134);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(134)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(134)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-label=Next 20 years, class=mat-calendar-next-button mat-icon-button cdk-focused cdk-mouse-focused, mat-icon-button=, ng-reflect-disabled=false, type=button}}, source=StateVertexImpl{id=134, name=state134}, target=StateVertexImpl{id=135, name=state135}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(135);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 135");

			testSuiteHelper.addStateToReportBuilder(135);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(135)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(135)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=40)
	public void method_1_29_32_33_59_60_61_62_94(){
		testSuiteHelper.newCurrentTestMethod("method_1_29_32_33_59_60_61_62_94");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: Add New");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Add Owner");
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
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: yihit sunman");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=85, name=state85}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Add New Pet");
			testSuiteHelper.runInCrawlingPlugins(85);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 85");

			testSuiteHelper.addStateToReportBuilder(85);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(85)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(85)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/MAT-DATEPICKER-TOGGLE[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-haspopup=true, aria-label=Open calendar, class=mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, tabindex=0, type=button}}, source=StateVertexImpl{id=85, name=state85}, target=StateVertexImpl{id=86, name=state86}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(86);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 86");

			testSuiteHelper.addStateToReportBuilder(86);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=12 2020, attributes={aria-label=Choose month and year, cdkarialive=polite, class=mat-calendar-period-button mat-button, mat-button=, ng-reflect-politeness=polite, type=button}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=87, name=state87}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: 12 2020");
			testSuiteHelper.runInCrawlingPlugins(87);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 87");

			testSuiteHelper.addStateToReportBuilder(87);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(87)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(87)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=2016 – 2039, attributes={aria-label=Choose date, cdkarialive=polite, class=mat-calendar-period-button mat-button, mat-button=, ng-reflect-politeness=polite, type=button}}, source=StateVertexImpl{id=87, name=state87}, target=StateVertexImpl{id=88, name=state88}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(62), "Event fired: 2016 – 2039");
			testSuiteHelper.runInCrawlingPlugins(88);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 88");

			testSuiteHelper.addStateToReportBuilder(88);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(88)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(88)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-label=Next month, class=mat-calendar-next-button mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, type=button}}, source=StateVertexImpl{id=88, name=state88}, target=StateVertexImpl{id=137, name=state137}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(94), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(137);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 137");

			testSuiteHelper.addStateToReportBuilder(137);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(137)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(137)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=41)
	public void method_1_29_32_33_59_60_61_62_63_95(){
		testSuiteHelper.newCurrentTestMethod("method_1_29_32_33_59_60_61_62_63_95");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: Add New");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Add Owner");
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
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: yihit sunman");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=85, name=state85}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Add New Pet");
			testSuiteHelper.runInCrawlingPlugins(85);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 85");

			testSuiteHelper.addStateToReportBuilder(85);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(85)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(85)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/MAT-DATEPICKER-TOGGLE[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-haspopup=true, aria-label=Open calendar, class=mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, tabindex=0, type=button}}, source=StateVertexImpl{id=85, name=state85}, target=StateVertexImpl{id=86, name=state86}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(86);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 86");

			testSuiteHelper.addStateToReportBuilder(86);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=12 2020, attributes={aria-label=Choose month and year, cdkarialive=polite, class=mat-calendar-period-button mat-button, mat-button=, ng-reflect-politeness=polite, type=button}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=87, name=state87}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: 12 2020");
			testSuiteHelper.runInCrawlingPlugins(87);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 87");

			testSuiteHelper.addStateToReportBuilder(87);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(87)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(87)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=2016 – 2039, attributes={aria-label=Choose date, cdkarialive=polite, class=mat-calendar-period-button mat-button, mat-button=, ng-reflect-politeness=polite, type=button}}, source=StateVertexImpl{id=87, name=state87}, target=StateVertexImpl{id=88, name=state88}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(62), "Event fired: 2016 – 2039");
			testSuiteHelper.runInCrawlingPlugins(88);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 88");

			testSuiteHelper.addStateToReportBuilder(88);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(88)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(88)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-label=Previous month, class=mat-calendar-previous-button mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, type=button}}, source=StateVertexImpl{id=88, name=state88}, target=StateVertexImpl{id=89, name=state89}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(63), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(89);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 89");

			testSuiteHelper.addStateToReportBuilder(89);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(89)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(89)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-label=Next month, class=mat-calendar-next-button mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, type=button}}, source=StateVertexImpl{id=89, name=state89}, target=StateVertexImpl{id=139, name=state139}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(95), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(139);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 139");

			testSuiteHelper.addStateToReportBuilder(139);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(139)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(139)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=42)
	public void method_3_36_69_96(){
		testSuiteHelper.newCurrentTestMethod("method_3_36_69_96");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Vet, attributes={_ngcontent-c2=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=51, name=state51}, target=StateVertexImpl{id=97, name=state97}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(69), "Event fired: Save Vet");
			testSuiteHelper.runInCrawlingPlugins(97);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 97");

			testSuiteHelper.addStateToReportBuilder(97);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(97)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(97)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=97, name=state97}, target=StateVertexImpl{id=52, name=state52}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(96), "Event fired: Delete Vet");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=43)
	public void method_3_36_69_70_71_97(){
		testSuiteHelper.newCurrentTestMethod("method_3_36_69_70_71_97");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Vet, attributes={_ngcontent-c2=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=51, name=state51}, target=StateVertexImpl{id=97, name=state97}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(69), "Event fired: Save Vet");
			testSuiteHelper.runInCrawlingPlugins(97);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 97");

			testSuiteHelper.addStateToReportBuilder(97);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(97)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(97)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Edit Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=97, name=state97}, target=StateVertexImpl{id=98, name=state98}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Edit Vet");
			testSuiteHelper.runInCrawlingPlugins(98);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 98");

			testSuiteHelper.addStateToReportBuilder(98);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(98)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(98)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-EDIT[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c4=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=98, name=state98}, target=StateVertexImpl{id=99, name=state99}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(71), "Event fired: < Back");
			testSuiteHelper.runInCrawlingPlugins(99);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 99");

			testSuiteHelper.addStateToReportBuilder(99);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(99)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(99)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=99, name=state99}, target=StateVertexImpl{id=101, name=state101}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: Add Vet");
			testSuiteHelper.runInCrawlingPlugins(101);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 101");

			testSuiteHelper.addStateToReportBuilder(101);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(101)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(101)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=44)
	public void method_3_15_39_75_98(){
		testSuiteHelper.newCurrentTestMethod("method_3_15_39_75_98");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: Add Vet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Vet, attributes={_ngcontent-c3=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=55, name=state55}, target=StateVertexImpl{id=105, name=state105}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: Save Vet");
			testSuiteHelper.runInCrawlingPlugins(105);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 105");

			testSuiteHelper.addStateToReportBuilder(105);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(105)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(105)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Delete Vet, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=105, name=state105}, target=StateVertexImpl{id=145, name=state145}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(98), "Event fired: Delete Vet");
			testSuiteHelper.runInCrawlingPlugins(145);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 145");

			testSuiteHelper.addStateToReportBuilder(145);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(145)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(145)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=45)
	public void method_5_41_99(){
		testSuiteHelper.newCurrentTestMethod("method_5_41_99");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Add");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=58, name=state58}, target=StateVertexImpl{id=8, name=state8}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(99), "Event fired: Add");
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

	@Test(priority=46)
	public void method_5_6_7_48_100(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_7_48_100");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=69, name=state69}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: Add");
			testSuiteHelper.runInCrawlingPlugins(69);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 69");

			testSuiteHelper.addStateToReportBuilder(69);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(69)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(69)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PETTYPE-LIST[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add, attributes={_ngcontent-c2=, class=btn btn-default}}, source=StateVertexImpl{id=69, name=state69}, target=StateVertexImpl{id=11, name=state11}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(100), "Event fired: Add");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=47)
	public void method_1_101(){
		testSuiteHelper.newCurrentTestMethod("method_1_101");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[5]/A[1], element=Element{node=[A: null], tag=A, text=Specialties, attributes={_ngcontent-c0=, href=/petclinic/specialties, ng-reflect-router-link=/specialties, ng-reflect-router-link-active=active, routerlink=/specialties, routerlinkactive=active, title=specialties}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=39, name=state39}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(101), "Event fired: Specialties");
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

	@Test(priority=48)
	public void method_1_29_32_33_59_102_103(){
		testSuiteHelper.newCurrentTestMethod("method_1_29_32_33_59_102_103");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: Add New");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Add Owner");
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
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: yihit sunman");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=85, name=state85}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Add New Pet");
			testSuiteHelper.runInCrawlingPlugins(85);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 85");

			testSuiteHelper.addStateToReportBuilder(85);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(85)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(85)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Pet, attributes={_ngcontent-c7=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=85, name=state85}, target=StateVertexImpl{id=153, name=state153}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(102), "Event fired: Save Pet");
			testSuiteHelper.runInCrawlingPlugins(153);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 153");

			testSuiteHelper.addStateToReportBuilder(153);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(153)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(153)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[6]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=< Back, attributes={_ngcontent-c6=, class=btn btn-default, type=button}}, source=StateVertexImpl{id=153, name=state153}, target=StateVertexImpl{id=128, name=state128}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(103), "Event fired: < Back");
			testSuiteHelper.runInCrawlingPlugins(128);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 128");

			testSuiteHelper.addStateToReportBuilder(128);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(128)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(128)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=49)
	public void method_1_29_32_33_59_60_104(){
		testSuiteHelper.newCurrentTestMethod("method_1_29_32_33_59_60_104");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: Add New");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Add Owner");
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
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: yihit sunman");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=85, name=state85}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Add New Pet");
			testSuiteHelper.runInCrawlingPlugins(85);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 85");

			testSuiteHelper.addStateToReportBuilder(85);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(85)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(85)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/MAT-DATEPICKER-TOGGLE[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-haspopup=true, aria-label=Open calendar, class=mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, tabindex=0, type=button}}, source=StateVertexImpl{id=85, name=state85}, target=StateVertexImpl{id=86, name=state86}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(86);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 86");

			testSuiteHelper.addStateToReportBuilder(86);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-label=Next month, class=mat-calendar-next-button mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, type=button}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=156, name=state156}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(104), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(156);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 156");

			testSuiteHelper.addStateToReportBuilder(156);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(156)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(156)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=50)
	public void method_1_29_32_33_59_60_61_105(){
		testSuiteHelper.newCurrentTestMethod("method_1_29_32_33_59_60_61_105");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: Add New");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Add Owner");
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
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: yihit sunman");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=85, name=state85}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Add New Pet");
			testSuiteHelper.runInCrawlingPlugins(85);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 85");

			testSuiteHelper.addStateToReportBuilder(85);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(85)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(85)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/MAT-DATEPICKER-TOGGLE[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-haspopup=true, aria-label=Open calendar, class=mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, tabindex=0, type=button}}, source=StateVertexImpl{id=85, name=state85}, target=StateVertexImpl{id=86, name=state86}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(86);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 86");

			testSuiteHelper.addStateToReportBuilder(86);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=12 2020, attributes={aria-label=Choose month and year, cdkarialive=polite, class=mat-calendar-period-button mat-button, mat-button=, ng-reflect-politeness=polite, type=button}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=87, name=state87}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: 12 2020");
			testSuiteHelper.runInCrawlingPlugins(87);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 87");

			testSuiteHelper.addStateToReportBuilder(87);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(87)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(87)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-label=Next 20 years, class=mat-calendar-next-button mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, type=button}}, source=StateVertexImpl{id=87, name=state87}, target=StateVertexImpl{id=158, name=state158}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(105), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(158);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 158");

			testSuiteHelper.addStateToReportBuilder(158);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(158)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(158)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=51)
	public void method_1_29_32_33_59_60_61_90_106(){
		testSuiteHelper.newCurrentTestMethod("method_1_29_32_33_59_60_61_90_106");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: Add New");
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Add Owner");
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
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "address"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "city"), "barcelona"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "telephone"), "1234567898"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: yihit sunman");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-OWNER-DETAIL[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add New Pet, attributes={_ngcontent-c4=, class=btn btn-default}}, source=StateVertexImpl{id=46, name=state46}, target=StateVertexImpl{id=85, name=state85}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Add New Pet");
			testSuiteHelper.runInCrawlingPlugins(85);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 85");

			testSuiteHelper.addStateToReportBuilder(85);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(85)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(85)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-PET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[4]/MAT-DATEPICKER-TOGGLE[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-haspopup=true, aria-label=Open calendar, class=mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, tabindex=0, type=button}}, source=StateVertexImpl{id=85, name=state85}, target=StateVertexImpl{id=86, name=state86}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(86);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 86");

			testSuiteHelper.addStateToReportBuilder(86);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=12 2020, attributes={aria-label=Choose month and year, cdkarialive=polite, class=mat-calendar-period-button mat-button, mat-button=, ng-reflect-politeness=polite, type=button}}, source=StateVertexImpl{id=86, name=state86}, target=StateVertexImpl{id=87, name=state87}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: 12 2020");
			testSuiteHelper.runInCrawlingPlugins(87);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 87");

			testSuiteHelper.addStateToReportBuilder(87);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(87)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(87)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-label=Previous 20 years, class=mat-calendar-previous-button mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, type=button}}, source=StateVertexImpl{id=87, name=state87}, target=StateVertexImpl{id=132, name=state132}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(90), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(132);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 132");

			testSuiteHelper.addStateToReportBuilder(132);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(132)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(132)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/MAT-DATEPICKER-CONTENT[1]/MAT-CALENDAR[1]/MAT-CALENDAR-HEADER[1]/DIV[1]/DIV[1]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={aria-label=Next 20 years, class=mat-calendar-next-button mat-icon-button, mat-icon-button=, ng-reflect-disabled=false, type=button}}, source=StateVertexImpl{id=132, name=state132}, target=StateVertexImpl{id=160, name=state160}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "name"), "dog"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(106), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(160);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 160");

			testSuiteHelper.addStateToReportBuilder(160);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(160)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(160)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=52)
	public void method_3_36_69_107(){
		testSuiteHelper.newCurrentTestMethod("method_3_36_69_107");
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
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Add New");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-ADD[1]/DIV[1]/DIV[1]/FORM[1]/DIV[5]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save Vet, attributes={_ngcontent-c2=, class=btn btn-default, type=submit}}, source=StateVertexImpl{id=51, name=state51}, target=StateVertexImpl{id=97, name=state97}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "firstName"), "yihit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "lastName"), "sunman"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(69), "Event fired: Save Vet");
			testSuiteHelper.runInCrawlingPlugins(97);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 97");

			testSuiteHelper.addStateToReportBuilder(97);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(97)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(97)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/APP-ROOT[1]/APP-VET-LIST[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add Vet, attributes={_ngcontent-c3=, class=btn btn-default}}, source=StateVertexImpl{id=97, name=state97}, target=StateVertexImpl{id=103, name=state103}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(107), "Event fired: Add Vet");
			testSuiteHelper.runInCrawlingPlugins(103);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 103");

			testSuiteHelper.addStateToReportBuilder(103);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(103)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(103)
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
