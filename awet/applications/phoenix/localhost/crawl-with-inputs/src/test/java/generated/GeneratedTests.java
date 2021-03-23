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
 * Generated @ Sun Dec 06 14:26:58 TRT 2020
 */

public class GeneratedTests {

    private final String URL = "http://localhost:4000";
	private TestSuiteHelper testSuiteHelper;
	
	private final String TEST_SUITE_PATH = "/home/nezihsunman/workspace/AWET/awet/applications/phoenix/localhost/crawl0/src/test/java/generated";

	private StateEquivalenceAssertionMode assertionMode = StateEquivalenceAssertionMode.ALL;
	
	private CrawljaxConfiguration getTestConfiguration() {
		CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);
		builder.crawlRules().waitAfterEvent(1000, TimeUnit.MILLISECONDS);
		builder.crawlRules().waitAfterReloadUrl(1500, TimeUnit.MILLISECONDS);
		builder.setBrowserConfig(new BrowserConfiguration(BrowserType.CHROME_HEADLESS, 1, new BrowserOptions(false, 2)));
		return builder.build();
	}	
	
	@BeforeClass
	public void oneTimeSetUp(){
		try {
			//load needed data from json files
			testSuiteHelper = new TestSuiteHelper(
					getTestConfiguration(),
					"/home/nezihsunman/workspace/AWET/awet/applications/phoenix/localhost/crawl0/src/test/java/generated/states.json",
					"/home/nezihsunman/workspace/AWET/awet/applications/phoenix/localhost/crawl0/src/test/java/generated/eventables.json",
					"/home/nezihsunman/workspace/AWET/awet/applications/phoenix/localhost/crawl0/screenshots",
					"/home/nezihsunman/workspace/AWET/awet/applications/phoenix/localhost/crawl0/test-results",
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
	public void method_1_2_3_4(){
		testSuiteHelper.newCurrentTestMethod("method_1_2_3_4");
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
			/* Eventable{eventType=click, identification=xpath //MAIN[@id = 'main_container']/DIV[1]/DIV[1]/MAIN[1]/A[1], element=Element{node=[A: null], tag=A, text=Create new account, attributes={data-reactid=.0.0.0.2, href=/sign_up}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=2, name=state2, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_email"), "yigitsoydan98@gmail.com"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_password"), "123456"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Create new account");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //MAIN[@id = 'main_container']/DIV[1]/DIV[1]/MAIN[1]/A[1], element=Element{node=[A: null], tag=A, text=Sign in, attributes={data-reactid=.0.0.0.2, href=/sign_in}}, source=PerceptualImageHashStateVertexImpl{id=2, name=state2, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_first_name"), "Yigit"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_last_name"), "Soydan"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_email"), "yigitsoydan98@gmail.com"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_password"), "123456"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_password_confirmation"), "123456"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(2), "Event fired: Sign in");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'sign_in_form']/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Sign in, attributes={data-reactid=.0.0.0.1.3, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=4, name=state4, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_email"), "yigitsoydan98@gmail.com"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_password"), "123456"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Sign in");
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
			
			/* Eventable{eventType=click, identification=xpath //MAIN[@id = 'main_container']/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Invalid email or passwordSign inCreate new account, attributes={data-reactid=.0}}, source=PerceptualImageHashStateVertexImpl{id=4, name=state4, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=5, name=state5, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_email"), "yigitsoydan98@gmail.com"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_password"), "123456"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: Invalid email or passwordSign inCreate new account");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=3)
	public void method_1_5_6(){
		testSuiteHelper.newCurrentTestMethod("method_1_5_6");
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
			/* Eventable{eventType=click, identification=xpath //MAIN[@id = 'main_container']/DIV[1]/DIV[1]/MAIN[1]/A[1], element=Element{node=[A: null], tag=A, text=Create new account, attributes={data-reactid=.0.0.0.2, href=/sign_up}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=2, name=state2, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_email"), "yigitsoydan98@gmail.com"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_password"), "123456"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Create new account");
			testSuiteHelper.runInCrawlingPlugins(2);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 2");

			testSuiteHelper.addStateToReportBuilder(2);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(2)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(2)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'sign_up_form']/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Sign up, attributes={data-reactid=.0.0.0.1.5, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=2, name=state2, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_first_name"), "Yigit"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_last_name"), "Soydan"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_email"), "yigitsoydan98@gmail.com"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_password"), "123456"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_password_confirmation"), "123456"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Sign up");
			testSuiteHelper.runInCrawlingPlugins(18);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 18");

			testSuiteHelper.addStateToReportBuilder(18);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'crawler-sign-out'], element=Element{node=[A: null], tag=A, text=Sign out, attributes={data-reactid=.0.0.0.2.0.1.0, href=#, id=crawler-sign-out}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Sign out");
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

	@Test(priority=4)
	public void method_3_7_8_9_10_11_12_13_14_15_16_17_18_19_20(){
		testSuiteHelper.newCurrentTestMethod("method_3_7_8_9_10_11_12_13_14_15_16_17_18_19_20");
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
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'sign_in_form']/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Sign in, attributes={data-reactid=.0.0.0.1.3, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=4, name=state4, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_email"), "yigitsoydan98@gmail.com"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_password"), "123456"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Sign in");
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
			
			/* Eventable{eventType=click, identification=xpath //MAIN[@id = 'main_container']/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Invalid email or passwordSign inCreate new account, attributes={class=view-container sessions new, data-reactid=.0.0}}, source=PerceptualImageHashStateVertexImpl{id=4, name=state4, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Invalid email or passwordSign inCreate new account");
			testSuiteHelper.runInCrawlingPlugins(18);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 18");

			testSuiteHelper.addStateToReportBuilder(18);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'add_new_board'], element=Element{node=[A: null], tag=A, text=Add new board..., attributes={data-reactid=.0.0.1.0.0.1.1.0.0, id=add_new_board}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=24, name=state24, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(24)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(24)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'new_board_form']/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.0.1.1.0.1.4, href=#}}, source=PerceptualImageHashStateVertexImpl{id=24, name=state24, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "board_name"), "my_board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: cancel");
			testSuiteHelper.runInCrawlingPlugins(18);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 18");

			testSuiteHelper.addStateToReportBuilder(18);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(18)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(18)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=18, name=state18, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=24, name=state24, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(24);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 24");

			testSuiteHelper.addStateToReportBuilder(24);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(24)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(24)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'new_board_form']/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Create board, attributes={data-reactid=.0.0.1.0.0.1.1.0.1.2, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=24, name=state24, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "board_name"), "my_board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Create board");
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
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=add-new, data-reactid=.0.0.1.0.0.1.0.$=11.0, href=#}}, source=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=32, name=state32, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(32);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 32");

			testSuiteHelper.addStateToReportBuilder(32);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(32)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(32)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/HEADER[1]/UL[1]/SPAN[1]/LI[2]/UL[1]/LI[1]/FORM[1]/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.0.1.0.$=11.1.0.0.5, href=#}}, source=PerceptualImageHashStateVertexImpl{id=32, name=state32, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "crawljax_member_email"), "yigitsoydan98@gmail.com"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(13), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=38, name=state38, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'new_list_form']/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.4, href=#}}, source=PerceptualImageHashStateVertexImpl{id=38, name=state38, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "list name"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=inner, data-reactid=.0.0.1.0.1.0.0.1.0}}, source=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=38, name=state38, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Add new list...");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'new_list_form']/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Save list, attributes={data-reactid=.0.0.1.0.1.0.0.1.0.0.2, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=38, name=state38, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=41, name=state41, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "list_name"), "list name"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(17), "Event fired: Save list");
			testSuiteHelper.runInCrawlingPlugins(41);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 41");

			testSuiteHelper.addStateToReportBuilder(41);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(41)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(41)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'list_85']/DIV[1]/FOOTER[1]/A[1], element=Element{node=[A: null], tag=A, text=Add a new card..., attributes={class=add-new, data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.1, href=#}}, source=PerceptualImageHashStateVertexImpl{id=41, name=state41, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=42, name=state42, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(18), "Event fired: Add a new card...");
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'new_card_form']/A[1], element=Element{node=[A: null], tag=A, text=cancel, attributes={data-reactid=.0.0.1.0.1.0.0.0:$85.0.2.0.0.4, href=#}}, source=PerceptualImageHashStateVertexImpl{id=42, name=state42, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=43, name=state43, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "card_name"), "first"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(19), "Event fired: cancel");
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
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new list..., attributes={class=list add-new, data-reactid=.0.0.1.0.1.0.0.1}}, source=PerceptualImageHashStateVertexImpl{id=43, name=state43, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=46, name=state46, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Add new list...");
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

	@Test(priority=5)
	public void method_21(){
		testSuiteHelper.newCurrentTestMethod("method_21");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(49);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '11-my_board'], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=board, data-reactid=.0.0.1.0.0.1.0:$11-my_board, id=11-my_board}}, source=PerceptualImageHashStateVertexImpl{id=49, name=state49, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=43, name=state43, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(21), "Event fired: my_board");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=6)
	public void method_22(){
		testSuiteHelper.newCurrentTestMethod("method_22");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(49);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '11-my_board']/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=inner, data-reactid=.0.0.1.0.0.1.0:$11-my_board.0}}, source=PerceptualImageHashStateVertexImpl{id=49, name=state49, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=43, name=state43, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: my_board");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=7)
	public void method_23_24(){
		testSuiteHelper.newCurrentTestMethod("method_23_24");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(49);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(49)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(49)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=49, name=state49, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=72, name=state72, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(72);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 72");

			testSuiteHelper.addStateToReportBuilder(72);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(72)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(72)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[2], element=Element{node=[DIV: null], tag=DIV, text=New boardCreate board or cancel, attributes={class=board form, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=72, name=state72, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "board_name"), "my_board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: New boardCreate board or cancel");
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

	@Test(priority=8)
	public void method_26(){
		testSuiteHelper.newCurrentTestMethod("method_26");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(74);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(74)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(74)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '12-my_board'], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=board, data-reactid=.0.0.1.0.0.1.0:$12-my_board, id=12-my_board}}, source=PerceptualImageHashStateVertexImpl{id=74, name=state74, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: my_board");
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

	@Test(priority=9)
	public void method_27(){
		testSuiteHelper.newCurrentTestMethod("method_27");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(74);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(74)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(74)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '12-my_board']/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=inner, data-reactid=.0.0.1.0.0.1.0:$12-my_board.0}}, source=PerceptualImageHashStateVertexImpl{id=74, name=state74, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=82, name=state82, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(27), "Event fired: my_board");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
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
	public void method_28_29(){
		testSuiteHelper.newCurrentTestMethod("method_28_29");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(74);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(74)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(74)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=74, name=state74, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=84, name=state84, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(84);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 84");

			testSuiteHelper.addStateToReportBuilder(84);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(84)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(84)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[3], element=Element{node=[DIV: null], tag=DIV, text=New boardCreate board or cancel, attributes={class=board form, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=84, name=state84, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "board_name"), "my_board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: New boardCreate board or cancel");
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

	@Test(priority=11)
	public void method_31(){
		testSuiteHelper.newCurrentTestMethod("method_31");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(86);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '13-my_board'], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=board, data-reactid=.0.0.1.0.0.1.0:$13-my_board, id=13-my_board}}, source=PerceptualImageHashStateVertexImpl{id=86, name=state86, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: my_board");
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

	@Test(priority=12)
	public void method_32(){
		testSuiteHelper.newCurrentTestMethod("method_32");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(86);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '13-my_board']/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=inner, data-reactid=.0.0.1.0.0.1.0:$13-my_board.0}}, source=PerceptualImageHashStateVertexImpl{id=86, name=state86, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=82, name=state82, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: my_board");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
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
	public void method_33_34(){
		testSuiteHelper.newCurrentTestMethod("method_33_34");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(86);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(86)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(86)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[4], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=86, name=state86, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=96, name=state96, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(96);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 96");

			testSuiteHelper.addStateToReportBuilder(96);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(96)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(96)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[4], element=Element{node=[DIV: null], tag=DIV, text=New boardCreate board or cancel, attributes={class=board form, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=96, name=state96, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "board_name"), "my_board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(34), "Event fired: New boardCreate board or cancel");
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

	@Test(priority=14)
	public void method_36(){
		testSuiteHelper.newCurrentTestMethod("method_36");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(98);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(98)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(98)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '14-my_board'], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=board, data-reactid=.0.0.1.0.0.1.0:$14-my_board, id=14-my_board}}, source=PerceptualImageHashStateVertexImpl{id=98, name=state98, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: my_board");
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

	@Test(priority=15)
	public void method_37(){
		testSuiteHelper.newCurrentTestMethod("method_37");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(98);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(98)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(98)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '14-my_board']/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=inner, data-reactid=.0.0.1.0.0.1.0:$14-my_board.0}}, source=PerceptualImageHashStateVertexImpl{id=98, name=state98, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=82, name=state82, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: my_board");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
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
	public void method_38_39(){
		testSuiteHelper.newCurrentTestMethod("method_38_39");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(98);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(98)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(98)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[5], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=98, name=state98, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=108, name=state108, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Add new board...");
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
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[5], element=Element{node=[DIV: null], tag=DIV, text=New boardCreate board or cancel, attributes={class=board form, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=108, name=state108, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "board_name"), "my_board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: New boardCreate board or cancel");
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

	@Test(priority=17)
	public void method_41(){
		testSuiteHelper.newCurrentTestMethod("method_41");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(110);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(110)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(110)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '15-my_board'], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=board, data-reactid=.0.0.1.0.0.1.0:$15-my_board, id=15-my_board}}, source=PerceptualImageHashStateVertexImpl{id=110, name=state110, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: my_board");
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
	public void method_42(){
		testSuiteHelper.newCurrentTestMethod("method_42");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(110);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(110)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(110)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '15-my_board']/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=inner, data-reactid=.0.0.1.0.0.1.0:$15-my_board.0}}, source=PerceptualImageHashStateVertexImpl{id=110, name=state110, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=82, name=state82, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: my_board");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
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
	public void method_43_44(){
		testSuiteHelper.newCurrentTestMethod("method_43_44");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(110);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(110)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(110)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[6], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=110, name=state110, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=120, name=state120, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(120);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 120");

			testSuiteHelper.addStateToReportBuilder(120);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(120)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(120)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[6], element=Element{node=[DIV: null], tag=DIV, text=New boardCreate board or cancel, attributes={class=board form, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=120, name=state120, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "board_name"), "my_board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: New boardCreate board or cancel");
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

	@Test(priority=20)
	public void method_46(){
		testSuiteHelper.newCurrentTestMethod("method_46");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(122);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(122)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(122)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '16-my_board'], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=board, data-reactid=.0.0.1.0.0.1.0:$16-my_board, id=16-my_board}}, source=PerceptualImageHashStateVertexImpl{id=122, name=state122, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(46), "Event fired: my_board");
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

	@Test(priority=21)
	public void method_47(){
		testSuiteHelper.newCurrentTestMethod("method_47");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(122);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(122)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(122)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '16-my_board']/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=inner, data-reactid=.0.0.1.0.0.1.0:$16-my_board.0}}, source=PerceptualImageHashStateVertexImpl{id=122, name=state122, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=82, name=state82, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(47), "Event fired: my_board");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
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
	public void method_48_49(){
		testSuiteHelper.newCurrentTestMethod("method_48_49");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(122);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(122)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(122)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[7], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=122, name=state122, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=132, name=state132, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: Add new board...");
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
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[7], element=Element{node=[DIV: null], tag=DIV, text=New boardCreate board or cancel, attributes={class=board form, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=132, name=state132, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "board_name"), "my_board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: New boardCreate board or cancel");
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

	@Test(priority=23)
	public void method_51(){
		testSuiteHelper.newCurrentTestMethod("method_51");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(134);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(134)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(134)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '17-my_board'], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=board, data-reactid=.0.0.1.0.0.1.0:$17-my_board, id=17-my_board}}, source=PerceptualImageHashStateVertexImpl{id=134, name=state134, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: my_board");
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

	@Test(priority=24)
	public void method_52(){
		testSuiteHelper.newCurrentTestMethod("method_52");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(134);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(134)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(134)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '17-my_board']/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=inner, data-reactid=.0.0.1.0.0.1.0:$17-my_board.0}}, source=PerceptualImageHashStateVertexImpl{id=134, name=state134, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=82, name=state82, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(52), "Event fired: my_board");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
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
	public void method_53_54(){
		testSuiteHelper.newCurrentTestMethod("method_53_54");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(134);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(134)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(134)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=134, name=state134, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=144, name=state144, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(53), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(144);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 144");

			testSuiteHelper.addStateToReportBuilder(144);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(144)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(144)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[8], element=Element{node=[DIV: null], tag=DIV, text=New boardCreate board or cancel, attributes={class=board form, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=144, name=state144, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "board_name"), "my_board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(54), "Event fired: New boardCreate board or cancel");
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

	@Test(priority=26)
	public void method_56(){
		testSuiteHelper.newCurrentTestMethod("method_56");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(146);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(146)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(146)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '18-my_board'], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=board, data-reactid=.0.0.1.0.0.1.0:$18-my_board, id=18-my_board}}, source=PerceptualImageHashStateVertexImpl{id=146, name=state146, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: my_board");
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

	@Test(priority=27)
	public void method_57(){
		testSuiteHelper.newCurrentTestMethod("method_57");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(146);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(146)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(146)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '18-my_board']/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=inner, data-reactid=.0.0.1.0.0.1.0:$18-my_board.0}}, source=PerceptualImageHashStateVertexImpl{id=146, name=state146, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=82, name=state82, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(57), "Event fired: my_board");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
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
	public void method_58_59(){
		testSuiteHelper.newCurrentTestMethod("method_58_59");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(146);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(146)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(146)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[9], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=146, name=state146, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=156, name=state156, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(58), "Event fired: Add new board...");
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
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[9], element=Element{node=[DIV: null], tag=DIV, text=New boardCreate board or cancel, attributes={class=board form, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=156, name=state156, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "board_name"), "my_board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: New boardCreate board or cancel");
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

	@Test(priority=29)
	public void method_61(){
		testSuiteHelper.newCurrentTestMethod("method_61");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(158);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(158)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(158)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '19-my_board'], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=board, data-reactid=.0.0.1.0.0.1.0:$19-my_board, id=19-my_board}}, source=PerceptualImageHashStateVertexImpl{id=158, name=state158, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: my_board");
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

	@Test(priority=30)
	public void method_62(){
		testSuiteHelper.newCurrentTestMethod("method_62");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(158);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(158)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(158)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '19-my_board']/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=inner, data-reactid=.0.0.1.0.0.1.0:$19-my_board.0}}, source=PerceptualImageHashStateVertexImpl{id=158, name=state158, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=82, name=state82, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(62), "Event fired: my_board");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
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
	public void method_63_64(){
		testSuiteHelper.newCurrentTestMethod("method_63_64");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(158);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(158)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(158)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[10], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=158, name=state158, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=168, name=state168, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(63), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(168);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 168");

			testSuiteHelper.addStateToReportBuilder(168);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(168)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(168)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[10], element=Element{node=[DIV: null], tag=DIV, text=New boardCreate board or cancel, attributes={class=board form, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=168, name=state168, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "board_name"), "my_board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: New boardCreate board or cancel");
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
	public void method_66(){
		testSuiteHelper.newCurrentTestMethod("method_66");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(170);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(170)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(170)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '20-my_board'], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=board, data-reactid=.0.0.1.0.0.1.0:$20-my_board, id=20-my_board}}, source=PerceptualImageHashStateVertexImpl{id=170, name=state170, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: my_board");
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

	@Test(priority=33)
	public void method_67(){
		testSuiteHelper.newCurrentTestMethod("method_67");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(170);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(170)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(170)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '20-my_board']/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=inner, data-reactid=.0.0.1.0.0.1.0:$20-my_board.0}}, source=PerceptualImageHashStateVertexImpl{id=170, name=state170, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=82, name=state82, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(67), "Event fired: my_board");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
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
	public void method_68_69(){
		testSuiteHelper.newCurrentTestMethod("method_68_69");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(170);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(170)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(170)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[11], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=170, name=state170, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=180, name=state180, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(68), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(180);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 180");

			testSuiteHelper.addStateToReportBuilder(180);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(180)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(180)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[11], element=Element{node=[DIV: null], tag=DIV, text=New boardCreate board or cancel, attributes={class=board form, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=180, name=state180, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "board_name"), "my_board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(69), "Event fired: New boardCreate board or cancel");
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

	@Test(priority=35)
	public void method_71(){
		testSuiteHelper.newCurrentTestMethod("method_71");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(182);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(182)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(182)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '21-my_board'], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=board, data-reactid=.0.0.1.0.0.1.0:$21-my_board, id=21-my_board}}, source=PerceptualImageHashStateVertexImpl{id=182, name=state182, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(71), "Event fired: my_board");
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

	@Test(priority=36)
	public void method_72(){
		testSuiteHelper.newCurrentTestMethod("method_72");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(182);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(182)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(182)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '21-my_board']/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=inner, data-reactid=.0.0.1.0.0.1.0:$21-my_board.0}}, source=PerceptualImageHashStateVertexImpl{id=182, name=state182, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=82, name=state82, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(72), "Event fired: my_board");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
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
	public void method_73_74(){
		testSuiteHelper.newCurrentTestMethod("method_73_74");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(182);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(182)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(182)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[12], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=182, name=state182, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=192, name=state192, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(73), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(192);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 192");

			testSuiteHelper.addStateToReportBuilder(192);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(192)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(192)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[12], element=Element{node=[DIV: null], tag=DIV, text=New boardCreate board or cancel, attributes={class=board form, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=192, name=state192, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "board_name"), "my_board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(74), "Event fired: New boardCreate board or cancel");
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

	@Test(priority=38)
	public void method_76(){
		testSuiteHelper.newCurrentTestMethod("method_76");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(194);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(194)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(194)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '22-my_board'], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=board, data-reactid=.0.0.1.0.0.1.0:$22-my_board, id=22-my_board}}, source=PerceptualImageHashStateVertexImpl{id=194, name=state194, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(76), "Event fired: my_board");
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

	@Test(priority=39)
	public void method_77(){
		testSuiteHelper.newCurrentTestMethod("method_77");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(194);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(194)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(194)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '22-my_board']/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=inner, data-reactid=.0.0.1.0.0.1.0:$22-my_board.0}}, source=PerceptualImageHashStateVertexImpl{id=194, name=state194, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=82, name=state82, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(77), "Event fired: my_board");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
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
	public void method_78_79(){
		testSuiteHelper.newCurrentTestMethod("method_78_79");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(194);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(194)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(194)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[13], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=194, name=state194, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=204, name=state204, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(78), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(204);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 204");

			testSuiteHelper.addStateToReportBuilder(204);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(204)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(204)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[13], element=Element{node=[DIV: null], tag=DIV, text=New boardCreate board or cancel, attributes={class=board form, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=204, name=state204, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "board_name"), "my_board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(79), "Event fired: New boardCreate board or cancel");
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

	@Test(priority=41)
	public void method_81(){
		testSuiteHelper.newCurrentTestMethod("method_81");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(206);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(206)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(206)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '23-my_board'], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=board, data-reactid=.0.0.1.0.0.1.0:$23-my_board, id=23-my_board}}, source=PerceptualImageHashStateVertexImpl{id=206, name=state206, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(81), "Event fired: my_board");
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

	@Test(priority=42)
	public void method_82(){
		testSuiteHelper.newCurrentTestMethod("method_82");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(206);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(206)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(206)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '23-my_board']/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=inner, data-reactid=.0.0.1.0.0.1.0:$23-my_board.0}}, source=PerceptualImageHashStateVertexImpl{id=206, name=state206, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=82, name=state82, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(82), "Event fired: my_board");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
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
	public void method_83_84(){
		testSuiteHelper.newCurrentTestMethod("method_83_84");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(206);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(206)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(206)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[14], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=206, name=state206, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=216, name=state216, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(83), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(216);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 216");

			testSuiteHelper.addStateToReportBuilder(216);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(216)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(216)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[14], element=Element{node=[DIV: null], tag=DIV, text=New boardCreate board or cancel, attributes={class=board form, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=216, name=state216, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "board_name"), "my_board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(84), "Event fired: New boardCreate board or cancel");
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

	@Test(priority=44)
	public void method_86(){
		testSuiteHelper.newCurrentTestMethod("method_86");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(218);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(218)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(218)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '24-my_board'], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=board, data-reactid=.0.0.1.0.0.1.0:$24-my_board, id=24-my_board}}, source=PerceptualImageHashStateVertexImpl{id=218, name=state218, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(86), "Event fired: my_board");
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

	@Test(priority=45)
	public void method_87(){
		testSuiteHelper.newCurrentTestMethod("method_87");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(218);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(218)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(218)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '24-my_board']/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=inner, data-reactid=.0.0.1.0.0.1.0:$24-my_board.0}}, source=PerceptualImageHashStateVertexImpl{id=218, name=state218, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=82, name=state82, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(87), "Event fired: my_board");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
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
	public void method_88_89(){
		testSuiteHelper.newCurrentTestMethod("method_88_89");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(218);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(218)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(218)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[15], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=218, name=state218, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=228, name=state228, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(88), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(228);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 228");

			testSuiteHelper.addStateToReportBuilder(228);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(228)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(228)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[15], element=Element{node=[DIV: null], tag=DIV, text=New boardCreate board or cancel, attributes={class=board form, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=228, name=state228, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "board_name"), "my_board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(89), "Event fired: New boardCreate board or cancel");
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

	@Test(priority=47)
	public void method_91(){
		testSuiteHelper.newCurrentTestMethod("method_91");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(230);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(230)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(230)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '25-my_board'], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=board, data-reactid=.0.0.1.0.0.1.0:$25-my_board, id=25-my_board}}, source=PerceptualImageHashStateVertexImpl{id=230, name=state230, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(91), "Event fired: my_board");
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

	@Test(priority=48)
	public void method_92(){
		testSuiteHelper.newCurrentTestMethod("method_92");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(230);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(230)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(230)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '25-my_board']/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=inner, data-reactid=.0.0.1.0.0.1.0:$25-my_board.0}}, source=PerceptualImageHashStateVertexImpl{id=230, name=state230, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=82, name=state82, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(92), "Event fired: my_board");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
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
	public void method_93_94(){
		testSuiteHelper.newCurrentTestMethod("method_93_94");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(230);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(230)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(230)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[16], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=230, name=state230, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=240, name=state240, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(240);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 240");

			testSuiteHelper.addStateToReportBuilder(240);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(240)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(240)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[16], element=Element{node=[DIV: null], tag=DIV, text=New boardCreate board or cancel, attributes={class=board form, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=240, name=state240, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "board_name"), "my_board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(94), "Event fired: New boardCreate board or cancel");
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

	@Test(priority=50)
	public void method_96(){
		testSuiteHelper.newCurrentTestMethod("method_96");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(242);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(242)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(242)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '26-my_board'], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=board, data-reactid=.0.0.1.0.0.1.0:$26-my_board, id=26-my_board}}, source=PerceptualImageHashStateVertexImpl{id=242, name=state242, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=31, name=state31, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(96), "Event fired: my_board");
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

	@Test(priority=51)
	public void method_97(){
		testSuiteHelper.newCurrentTestMethod("method_97");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(242);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(242)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(242)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = '26-my_board']/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=my_board, attributes={class=inner, data-reactid=.0.0.1.0.0.1.0:$26-my_board.0}}, source=PerceptualImageHashStateVertexImpl{id=242, name=state242, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=82, name=state82, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: my_board");
			testSuiteHelper.runInCrawlingPlugins(82);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 82");

			testSuiteHelper.addStateToReportBuilder(82);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(82)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(82)
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
	public void method_98_99_100(){
		testSuiteHelper.newCurrentTestMethod("method_98_99_100");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(242);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(242)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(242)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[17], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=board add-new, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=242, name=state242, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=252, name=state252, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(98), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(252);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 252");

			testSuiteHelper.addStateToReportBuilder(252);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(252)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(252)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[17], element=Element{node=[DIV: null], tag=DIV, text=New boardCreate board or cancel, attributes={class=board form, data-reactid=.0.0.1.0.0.1.1}}, source=PerceptualImageHashStateVertexImpl{id=252, name=state252, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=253, name=state253, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "board_name"), "my_board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(99), "Event fired: New boardCreate board or cancel");
			testSuiteHelper.runInCrawlingPlugins(253);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 253");

			testSuiteHelper.addStateToReportBuilder(253);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(253)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(253)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[17]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=New boardCreate board or cancel, attributes={class=inner, data-reactid=.0.0.1.0.0.1.1.0}}, source=PerceptualImageHashStateVertexImpl{id=253, name=state253, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=254, name=state254, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "board_name"), "my_board"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(100), "Event fired: New boardCreate board or cancel");
			testSuiteHelper.runInCrawlingPlugins(254);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 254");

			testSuiteHelper.addStateToReportBuilder(254);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(254)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(254)
					&& allStatesIdentical;
			}
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=53)
	public void method_101(){
		testSuiteHelper.newCurrentTestMethod("method_101");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(242);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(242)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(242)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'authentication_container']/DIV[1]/DIV[1]/SECTION[1]/DIV[1]/DIV[17]/DIV[1], element=Element{node=[DIV: null], tag=DIV, text=Add new board..., attributes={class=inner, data-reactid=.0.0.1.0.0.1.1.0}}, source=PerceptualImageHashStateVertexImpl{id=242, name=state242, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=256, name=state256, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(101), "Event fired: Add new board...");
			testSuiteHelper.runInCrawlingPlugins(256);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 256");

			testSuiteHelper.addStateToReportBuilder(256);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(256)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(256)
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
