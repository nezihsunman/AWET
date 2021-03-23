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
 * Generated @ Sun Dec 06 19:14:34 TRT 2020
 */

public class GeneratedTests {

    private final String URL = "http://localhost:4000";
	private TestSuiteHelper testSuiteHelper;
	
	private final String TEST_SUITE_PATH = "/home/nezihsunman/workspace/AWET/awet/applications/retroboard/localhost/crawl0/src/test/java/generated";

	private StateEquivalenceAssertionMode assertionMode = StateEquivalenceAssertionMode.ALL;
	
	private CrawljaxConfiguration getTestConfiguration() {
		CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);
		builder.crawlRules().waitAfterEvent(1000, TimeUnit.MILLISECONDS);
		builder.crawlRules().waitAfterReloadUrl(1000, TimeUnit.MILLISECONDS);
		builder.setBrowserConfig(new BrowserConfiguration(BrowserType.CHROME_HEADLESS, 1, new BrowserOptions(false, 2)));
		return builder.build();
	}	
	
	@BeforeClass
	public void oneTimeSetUp(){
		try {
			//load needed data from json files
			testSuiteHelper = new TestSuiteHelper(
					getTestConfiguration(),
					"/home/nezihsunman/workspace/AWET/awet/applications/retroboard/localhost/crawl0/src/test/java/generated/states.json",
					"/home/nezihsunman/workspace/AWET/awet/applications/retroboard/localhost/crawl0/src/test/java/generated/eventables.json",
					"/home/nezihsunman/workspace/AWET/awet/applications/retroboard/localhost/crawl0/screenshots",
					"/home/nezihsunman/workspace/AWET/awet/applications/retroboard/localhost/crawl0/test-results",
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
	public void method_1_2_3_4_5_6_7_8(){
		testSuiteHelper.newCurrentTestMethod("method_1_2_3_4_5_6_7_8");
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
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'content']/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Let's start, attributes={class=theme__button___1iKuo theme__raised___ONZv6 theme__accent___3MS_k, data-react-toolbox=button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=3, name=state3, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/INPUT[1]"), "admin"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Let's start");
			testSuiteHelper.runInCrawlingPlugins(3);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 3");

			testSuiteHelper.addStateToReportBuilder(3);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'content']/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SECTION[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Create a new session, attributes={class=theme__button___1iKuo theme__raised___ONZv6 theme__accent___3MS_k, data-react-toolbox=button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=3, name=state3, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=4, name=state4, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Work"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Social life"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Brilliant idea"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(2), "Event fired: Create a new session");
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
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'content']/DIV[1]/DIV[1]/DIV[1]/DIV[1]/HEADER[1]/DIV[2]/SPAN[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={class=theme__toggle___1Zy-o theme__neutral___uDC3j theme__inverse___2Z8iZ, data-react-toolbox=button, title=Invite, type=button}}, source=PerceptualImageHashStateVertexImpl{id=4, name=state4, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=5, name=state5, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Work"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Social life"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Brilliant idea"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(5);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 5");

			testSuiteHelper.addStateToReportBuilder(5);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(5)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(5)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/DIV[2]/SECTION[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Copy URL to Clipboard, attributes={class=theme__button___1iKuo theme__flat___2ui7t theme__primary___2NhN1, data-react-toolbox=button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=5, name=state5, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=6, name=state6, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Work"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Social life"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Brilliant idea"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: Copy URL to Clipboard");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/DIV[2]/NAV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Ok, attributes={class=theme__button___1iKuo theme__flat___2ui7t theme__neutral___uDC3j theme__button___3HGWm, data-react-toolbox=button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=6, name=state6, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=7, name=state7, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Work"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Social life"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Brilliant idea"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Ok");
			testSuiteHelper.runInCrawlingPlugins(7);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 7");

			testSuiteHelper.addStateToReportBuilder(7);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(7)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(7)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'crawljax-menu'], element=Element{node=[BUTTON: null], tag=BUTTON, text=menu, attributes={class=theme__toggle___1Zy-o theme__neutral___uDC3j theme__inverse___2Z8iZ, data-react-toolbox=button, id=crawljax-menu, type=button}}, source=PerceptualImageHashStateVertexImpl{id=7, name=state7, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=8, name=state8, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Work"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Social life"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Brilliant idea"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: menu");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/DIV[2]/ASIDE[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Leave, attributes={class=theme__button___1iKuo theme__flat___2ui7t theme__accent___3MS_k, data-react-toolbox=button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=8, name=state8, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=9, name=state9, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Work"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Social life"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Brilliant idea"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Leave");
			testSuiteHelper.runInCrawlingPlugins(9);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 9");

			testSuiteHelper.addStateToReportBuilder(9);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(9)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(9)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'crawljax-logout'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Logout, attributes={class=theme__button___1iKuo theme__flat___2ui7t theme__accent___3MS_k, data-react-toolbox=button, id=crawljax-logout, type=button}}, source=PerceptualImageHashStateVertexImpl{id=9, name=state9, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=10, name=state10, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Logout");
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

	@Test(priority=3)
	public void method_1_2_9(){
		testSuiteHelper.newCurrentTestMethod("method_1_2_9");
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
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'content']/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Let's start, attributes={class=theme__button___1iKuo theme__raised___ONZv6 theme__accent___3MS_k, data-react-toolbox=button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=3, name=state3, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/INPUT[1]"), "admin"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Let's start");
			testSuiteHelper.runInCrawlingPlugins(3);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 3");

			testSuiteHelper.addStateToReportBuilder(3);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(3)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(3)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'content']/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SECTION[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Create a new session, attributes={class=theme__button___1iKuo theme__raised___ONZv6 theme__accent___3MS_k, data-react-toolbox=button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=3, name=state3, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=4, name=state4, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Work"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Social life"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Brilliant idea"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(2), "Event fired: Create a new session");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'crawljax-menu'], element=Element{node=[BUTTON: null], tag=BUTTON, text=menu, attributes={class=theme__toggle___1Zy-o theme__neutral___uDC3j theme__inverse___2Z8iZ, data-react-toolbox=button, id=crawljax-menu, type=button}}, source=PerceptualImageHashStateVertexImpl{id=4, name=state4, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=12, name=state12, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Work"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Social life"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.xpath, "/HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"), "Brilliant idea"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: menu");
			testSuiteHelper.runInCrawlingPlugins(12);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 12");

			testSuiteHelper.addStateToReportBuilder(12);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(12)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(12)
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
