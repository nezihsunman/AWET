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
 * Generated @ Sun Dec 06 12:55:30 TRT 2020
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
	public void method_1_2_3(){
		testSuiteHelper.newCurrentTestMethod("method_1_2_3");
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
			/* Eventable{eventType=click, identification=xpath //MAIN[@id = 'main_container']/DIV[1]/DIV[1]/MAIN[1]/A[1], element=Element{node=[A: null], tag=A, text=Create new account, attributes={data-reactid=.0.0.0.2, href=/sign_up}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=2, name=state2}} */
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
			
			/* Eventable{eventType=click, identification=xpath //MAIN[@id = 'main_container']/DIV[1]/DIV[1]/MAIN[1]/A[1], element=Element{node=[A: null], tag=A, text=Sign in, attributes={data-reactid=.0.0.0.2, href=/sign_in}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=0, name=index}} */
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'sign_in_form']/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Sign in, attributes={data-reactid=.0.0.0.1.3, type=submit}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=3)
	public void method_1_4_5(){
		testSuiteHelper.newCurrentTestMethod("method_1_4_5");
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
			/* Eventable{eventType=click, identification=xpath //MAIN[@id = 'main_container']/DIV[1]/DIV[1]/MAIN[1]/A[1], element=Element{node=[A: null], tag=A, text=Create new account, attributes={data-reactid=.0.0.0.2, href=/sign_up}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=2, name=state2}} */
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
			
			/* Eventable{eventType=click, identification=xpath //FORM[@id = 'sign_up_form']/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Sign up, attributes={data-reactid=.0.0.0.1.5, type=submit}}, source=StateVertexImpl{id=2, name=state2}, target=StateVertexImpl{id=18, name=state18}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_first_name"), "Yigit"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_last_name"), "Soydan"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_email"), "yigitsoydan98@gmail.com"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_password"), "123456"));
			formInputs.add(new FormInput(FormInput.InputType.INPUT, new Identification(How.id, "user_password_confirmation"), "123456"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: Sign up");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'crawler-sign-out'], element=Element{node=[A: null], tag=A, text=Sign out, attributes={data-reactid=.0.0.0.2.0.1.0, href=#, id=crawler-sign-out}}, source=StateVertexImpl{id=18, name=state18}, target=StateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Sign out");
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
	public void method_1(){
		testSuiteHelper.newCurrentTestMethod("method_1");
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
			/* Eventable{eventType=click, identification=xpath //MAIN[@id = 'main_container']/DIV[1]/DIV[1]/MAIN[1]/A[1], element=Element{node=[A: null], tag=A, text=Create new account, attributes={data-reactid=.0.0.0.2, href=/sign_up}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=2, name=state2}} */
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}


}	 
