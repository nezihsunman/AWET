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
 * Generated @ Wed Dec 02 21:21:01 TRT 2020
 */

public class GeneratedTests {

    private final String URL = "http://localhost:3000";
	private TestSuiteHelper testSuiteHelper;
	
	private final String TEST_SUITE_PATH = "/home/nezihsunman/workspace/AWET/awet/applications/dimeshift/localhost/crawl0/src/test/java/generated";

	private StateEquivalenceAssertionMode assertionMode = StateEquivalenceAssertionMode.ALL;
	
	private CrawljaxConfiguration getTestConfiguration() {
		CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);
		builder.crawlRules().waitAfterEvent(2500, TimeUnit.MILLISECONDS);
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
					"/home/nezihsunman/workspace/AWET/awet/applications/dimeshift/localhost/crawl0/src/test/java/generated/states.json",
					"/home/nezihsunman/workspace/AWET/awet/applications/dimeshift/localhost/crawl0/src/test/java/generated/eventables.json",
					"/home/nezihsunman/workspace/AWET/awet/applications/dimeshift/localhost/crawl0/screenshots",
					"/home/nezihsunman/workspace/AWET/awet/applications/dimeshift/localhost/crawl0/test-results",
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
	public void method_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23(){
		testSuiteHelper.newCurrentTestMethod("method_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$ dimeshift, attributes={class=btn btn-info btn-lg btn-logo, href=/}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=2, name=state2, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: $ dimeshift");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Home, attributes={class=menu_category menu_category_home, data-i18n=Home, href=/}}, source=PerceptualImageHashStateVertexImpl{id=2, name=state2, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(2), "Event fired: Home");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1], element=Element{node=[A: null], tag=A, text=Register, attributes={data-i18n=Register, href=/user/registration}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=5, name=state5, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Register");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Sign In, attributes={class=btn btn-default btn-sm, href=http://localhost:3000/user/signin}}, source=PerceptualImageHashStateVertexImpl{id=5, name=state5, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=6, name=state6, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_login"), "Yigit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_email"), "yigitsoydan98@gmail.com"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_password"), "123456789"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: Sign In");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1], element=Element{node=[A: null], tag=A, text=Register, attributes={class=btn btn-default btn-sm, href=http://localhost:3000/user/registration}}, source=PerceptualImageHashStateVertexImpl{id=6, name=state6, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=5, name=state5, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_password"), "123456789"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Register");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=×, attributes={aria-hidden=true, class=close, data-dismiss=modal, type=button}}, source=PerceptualImageHashStateVertexImpl{id=5, name=state5, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_login"), "Yigit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_email"), "yigitsoydan98@gmail.com"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_password"), "123456789"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: ×");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1], element=Element{node=[A: null], tag=A, text=Sign In, attributes={class=signin_caller, data-i18n=Sign In, href=/user/signin}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=6, name=state6, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Sign In");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[2], element=Element{node=[A: null], tag=A, text=Restore your password, attributes={class=btn btn-default btn-sm, href=http://localhost:3000/user/restore}}, source=PerceptualImageHashStateVertexImpl{id=6, name=state6, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=10, name=state10, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_password"), "123456789"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Restore your password");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Register, attributes={class=btn btn-default btn-sm, href=http://localhost:3000/user/registration}}, source=PerceptualImageHashStateVertexImpl{id=10, name=state10, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=5, name=state5, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_email"), "yigitsoydan98@gmail.com"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Register");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Registration..., id=registration_modal_form_submit, type=submit, value=Sign Up}}, source=PerceptualImageHashStateVertexImpl{id=5, name=state5, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=12, name=state12, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_login"), "Yigit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_email"), "yigitsoydan98@gmail.com"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_password"), "123456789"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Goals, attributes={class=menu_category menu_category_wallets, data-i18n=Goals, href=/plans}}, source=PerceptualImageHashStateVertexImpl{id=12, name=state12, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=14, name=state14, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_login"), "Yigit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_email"), "yigitsoydan98@gmail.com"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_password"), "123456789"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Goals");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[8]/A[1], element=Element{node=[A: null], tag=A, text=Settings, attributes={data-i18n=Settings, href=/profile}}, source=PerceptualImageHashStateVertexImpl{id=14, name=state14, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=15, name=state15, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Settings");
			testSuiteHelper.runInCrawlingPlugins(15);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 15");

			testSuiteHelper.addStateToReportBuilder(15);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(15)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(15)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[9]/A[1], element=Element{node=[A: null], tag=A, text=Log Out, attributes={class=signout_caller, data-i18n=Log Out, href=/user/logout}}, source=PerceptualImageHashStateVertexImpl{id=15, name=state15, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "current_password_input"), "123456"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "new_password_input"), "789456"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "new_password_repeat_input"), "789456"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(13), "Event fired: Log Out");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=icon_holder, href=/user/change_language}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=17, name=state17, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=English, attributes={class=btn btn-default btn-block btn-primary process_button, data-code=default, type=button}}, source=PerceptualImageHashStateVertexImpl{id=17, name=state17, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: English");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=image-link, href=http://localhost:3000/images/homepage/screenshots/transactions.jpg, id=image-link-1, style=background-image: url('http://localhost:3000/images/homepage/screenshots/transactions.jpg');}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=×, attributes={class=mfp-close, title=Close (Esc), type=button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(17), "Event fired: ×");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=image-link, href=http://localhost:3000/images/homepage/screenshots/wallets.jpg, id=image-link-wallets, style=background-image: url('http://localhost:3000/images/homepage/screenshots/wallets.jpg');}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=21, name=state21, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(18), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(21);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 21");

			testSuiteHelper.addStateToReportBuilder(21);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(21)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(21)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={class=mfp-arrow mfp-arrow-left mfp-prevent-close, title=Previous (Left arrow key), type=button}}, source=PerceptualImageHashStateVertexImpl{id=21, name=state21, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(19), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={class=mfp-arrow mfp-arrow-left mfp-prevent-close, title=Previous (Left arrow key), type=button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=23, name=state23, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={class=mfp-arrow mfp-arrow-right mfp-prevent-close, title=Next (Right arrow key), type=button}}, source=PerceptualImageHashStateVertexImpl{id=23, name=state23, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(21), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={class=mfp-arrow mfp-arrow-right mfp-prevent-close, title=Next (Right arrow key), type=button}}, source=PerceptualImageHashStateVertexImpl{id=19, name=state19, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=21, name=state21, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(21);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 21");

			testSuiteHelper.addStateToReportBuilder(21);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(21)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(21)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[2]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=, attributes={class=mfp-arrow mfp-arrow-right mfp-prevent-close, title=Next (Right arrow key), type=button}}, source=PerceptualImageHashStateVertexImpl{id=21, name=state21, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=26, name=state26, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: ");
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

	@Test(priority=3)
	public void method_24(){
		testSuiteHelper.newCurrentTestMethod("method_24");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[3]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=image-link, href=http://localhost:3000/images/homepage/screenshots/goal.jpg, id=image-link-agpl, style=background-image: url('http://localhost:3000/images/homepage/screenshots/goal.jpg');}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=26, name=state26, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: ");
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

	@Test(priority=4)
	public void method_1_25(){
		testSuiteHelper.newCurrentTestMethod("method_1_25");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$ dimeshift, attributes={class=btn btn-info btn-lg btn-logo, href=/}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=2, name=state2, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: $ dimeshift");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1], element=Element{node=[A: null], tag=A, text=Register, attributes={data-i18n=Register, href=/user/registration}}, source=PerceptualImageHashStateVertexImpl{id=2, name=state2, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=5, name=state5, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(25), "Event fired: Register");
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

	@Test(priority=5)
	public void method_7_26_27(){
		testSuiteHelper.newCurrentTestMethod("method_7_26_27");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1], element=Element{node=[A: null], tag=A, text=Sign In, attributes={class=signin_caller, data-i18n=Sign In, href=/user/signin}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=6, name=state6, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Sign In");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=×, attributes={aria-hidden=true, class=close, data-dismiss=modal, type=button}}, source=PerceptualImageHashStateVertexImpl{id=6, name=state6, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_password"), "123456789"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: ×");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[4]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=image-link, href=http://localhost:3000/images/homepage/screenshots/i18n.jpg, id=image-link-2, style=background-image: url('http://localhost:3000/images/homepage/screenshots/i18n.jpg');}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=23, name=state23, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(27), "Event fired: ");
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

	@Test(priority=6)
	public void method_7_8_28(){
		testSuiteHelper.newCurrentTestMethod("method_7_8_28");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1], element=Element{node=[A: null], tag=A, text=Sign In, attributes={class=signin_caller, data-i18n=Sign In, href=/user/signin}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=6, name=state6, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Sign In");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[2], element=Element{node=[A: null], tag=A, text=Restore your password, attributes={class=btn btn-default btn-sm, href=http://localhost:3000/user/restore}}, source=PerceptualImageHashStateVertexImpl{id=6, name=state6, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=10, name=state10, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_password"), "123456789"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: Restore your password");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Processing..., id=restore_modal_form_submit, type=submit, value=Restore}}, source=PerceptualImageHashStateVertexImpl{id=10, name=state10, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=35, name=state35, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_email"), "yigitsoydan98@gmail.com"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(35);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 35");

			testSuiteHelper.addStateToReportBuilder(35);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(35)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(35)
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
	public void method_3_10(){
		testSuiteHelper.newCurrentTestMethod("method_3_10");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1], element=Element{node=[A: null], tag=A, text=Register, attributes={data-i18n=Register, href=/user/registration}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=5, name=state5, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Register");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Registration..., id=registration_modal_form_submit, type=submit, value=Sign Up}}, source=PerceptualImageHashStateVertexImpl{id=5, name=state5, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=12, name=state12, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_login"), "Yigit"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_email"), "yigitsoydan98@gmail.com"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_password"), "123456789"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: ");
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

	@Test(priority=8)
	public void method_14_29_30_31_32_33_34_35(){
		testSuiteHelper.newCurrentTestMethod("method_14_29_30_31_32_33_34_35");
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
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=icon_holder, href=/user/change_language}}, source=PerceptualImageHashStateVertexImpl{id=0, name=index, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=17, name=state17, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Українська, attributes={class=btn btn-default btn-block process_button, data-code=ua, type=button}}, source=PerceptualImageHashStateVertexImpl{id=17, name=state17, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=44, name=state44, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: Українська");
			testSuiteHelper.runInCrawlingPlugins(44);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 44");

			testSuiteHelper.addStateToReportBuilder(44);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(44)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(44)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/P[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary, data-i18nvalue=here, id=demo_signup, type=submit, value=сюди}}, source=PerceptualImageHashStateVertexImpl{id=44, name=state44, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=45, name=state45, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(30), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$3041.02 Приховати Редагувати ДоступSample Bank Account Wallet, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=45, name=state45, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=46, name=state46, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: $3041.02 Приховати Редагувати ДоступSample Bank Account Wallet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=встановити загальну суму у, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=46, name=state46, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=47, name=state47, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: встановити загальну суму у");
			testSuiteHelper.runInCrawlingPlugins(47);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 47");

			testSuiteHelper.addStateToReportBuilder(47);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(47)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(47)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[4]/DIV[3]/DIV[1]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Next », attributes={class=btn btn-sm btn-default, data-role=next}}, source=PerceptualImageHashStateVertexImpl{id=47, name=state47, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: Next »");
			testSuiteHelper.runInCrawlingPlugins(48);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 48");

			testSuiteHelper.addStateToReportBuilder(48);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(48)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(48)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Збереження..., type=submit, value=Встановити}}, source=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=49, name=state49, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(34), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=встановити загальну суму у, attributes={aria-describedby=popover240788, class=action tour-tour-element tour-tour-1-element tour-step-element-reflex, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=49, name=state49, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=50, name=state50, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: встановити загальну суму у");
			testSuiteHelper.runInCrawlingPlugins(50);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 50");

			testSuiteHelper.addStateToReportBuilder(50);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(50)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(50)
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
	public void method_38(){
		testSuiteHelper.newCurrentTestMethod("method_38");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(51);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(51)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(51)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$3041.02 Приховати Редагувати ДоступSample Bank Account Wallet, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=85, name=state85, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: $3041.02 Приховати Редагувати ДоступSample Bank Account Wallet");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=10)
	public void method_39(){
		testSuiteHelper.newCurrentTestMethod("method_39");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(51);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(51)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(51)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=$3417.06 Приховати Редагувати ДоступSample Cash Wallet, attributes={class=list-group-item item, data-id=3, href=http://localhost:3000/wallets/3}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=85, name=state85, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: $3417.06 Приховати Редагувати ДоступSample Cash Wallet");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=11)
	public void method_40_41_42_43_44_45_46(){
		testSuiteHelper.newCurrentTestMethod("method_40_41_42_43_44_45_46");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(51);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(51)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(51)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Додати, attributes={class=btn btn-primary, href=http://localhost:3000/wallets/add, id=add_wallet_button}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=89, name=state89, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(40), "Event fired: Додати");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Збереження..., id=add_wallet_modal_form_submit, type=submit, value=Додати}}, source=PerceptualImageHashStateVertexImpl{id=89, name=state89, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Приховані, attributes={class=filter_menu, data-status=hidden, href=#}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=92, name=state92, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: Приховані");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Головна, attributes={href=http://localhost:3000}}, source=PerceptualImageHashStateVertexImpl{id=92, name=state92, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=93, name=state93, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Головна");
			testSuiteHelper.runInCrawlingPlugins(93);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 93");

			testSuiteHelper.addStateToReportBuilder(93);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(93)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(93)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Активні, attributes={class=filter_menu, data-status=active, href=#}}, source=PerceptualImageHashStateVertexImpl{id=93, name=state93, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: Активні");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Ваші, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=97, name=state97, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: Ваші");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Інших користувачів, attributes={class=origin_menu, data-origin=shared, href=#}}, source=PerceptualImageHashStateVertexImpl{id=97, name=state97, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=98, name=state98, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(46), "Event fired: Інших користувачів");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=12)
	public void method_47_43_48_49(){
		testSuiteHelper.newCurrentTestMethod("method_47_43_48_49");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(99);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(99)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(99)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Приховані, attributes={class=filter_menu, data-status=hidden, href=#}}, source=PerceptualImageHashStateVertexImpl{id=99, name=state99, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=92, name=state92, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(47), "Event fired: Приховані");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Головна, attributes={href=http://localhost:3000}}, source=PerceptualImageHashStateVertexImpl{id=92, name=state92, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=93, name=state93, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Головна");
			testSuiteHelper.runInCrawlingPlugins(93);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 93");

			testSuiteHelper.addStateToReportBuilder(93);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(93)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(93)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Ваші, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=93, name=state93, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=107, name=state107, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: Ваші");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Інших користувачів, attributes={class=origin_menu, data-origin=shared, href=#}}, source=PerceptualImageHashStateVertexImpl{id=107, name=state107, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=108, name=state108, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: Інших користувачів");
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

	@Test(priority=13)
	public void method_47_43_44_45_50_51_52(){
		testSuiteHelper.newCurrentTestMethod("method_47_43_44_45_50_51_52");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(99);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(99)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(99)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Приховані, attributes={class=filter_menu, data-status=hidden, href=#}}, source=PerceptualImageHashStateVertexImpl{id=99, name=state99, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=92, name=state92, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(47), "Event fired: Приховані");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Головна, attributes={href=http://localhost:3000}}, source=PerceptualImageHashStateVertexImpl{id=92, name=state92, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=93, name=state93, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Головна");
			testSuiteHelper.runInCrawlingPlugins(93);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 93");

			testSuiteHelper.addStateToReportBuilder(93);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(93)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(93)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Активні, attributes={class=filter_menu, data-status=active, href=#}}, source=PerceptualImageHashStateVertexImpl{id=93, name=state93, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: Активні");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Ваші, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=97, name=state97, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: Ваші");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Приховати, attributes={class=btn btn-default btn-xs item_button_remove}}, source=PerceptualImageHashStateVertexImpl{id=97, name=state97, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=110, name=state110, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Приховати");
			testSuiteHelper.runInCrawlingPlugins(110);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 110");

			testSuiteHelper.addStateToReportBuilder(110);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(110)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(110)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[2], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Скасування..., type=submit, value=Скасувати}}, source=PerceptualImageHashStateVertexImpl{id=110, name=state110, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=111, name=state111, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(111);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 111");

			testSuiteHelper.addStateToReportBuilder(111);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(111)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(111)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3], element=Element{node=[A: null], tag=A, text=$0.00 Приховати Редагувати ДоступBigPlan, attributes={class=list-group-item item, data-id=4, href=http://localhost:3000/wallets/4}}, source=PerceptualImageHashStateVertexImpl{id=111, name=state111, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=85, name=state85, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(52), "Event fired: $0.00 Приховати Редагувати ДоступBigPlan");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=14)
	public void method_53(){
		testSuiteHelper.newCurrentTestMethod("method_53");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(99);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(99)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(99)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3], element=Element{node=[A: null], tag=A, text=$0.00 Приховати Редагувати ДоступBigPlan, attributes={class=list-group-item item, data-id=4, href=http://localhost:3000/wallets/4}}, source=PerceptualImageHashStateVertexImpl{id=99, name=state99, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=85, name=state85, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(53), "Event fired: $0.00 Приховати Редагувати ДоступBigPlan");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=15)
	public void method_47_43_54(){
		testSuiteHelper.newCurrentTestMethod("method_47_43_54");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(99);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(99)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(99)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Приховані, attributes={class=filter_menu, data-status=hidden, href=#}}, source=PerceptualImageHashStateVertexImpl{id=99, name=state99, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=92, name=state92, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(47), "Event fired: Приховані");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Головна, attributes={href=http://localhost:3000}}, source=PerceptualImageHashStateVertexImpl{id=92, name=state92, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=93, name=state93, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Головна");
			testSuiteHelper.runInCrawlingPlugins(93);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 93");

			testSuiteHelper.addStateToReportBuilder(93);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(93)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(93)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Інших користувачів, attributes={class=origin_menu, data-origin=shared, href=#}}, source=PerceptualImageHashStateVertexImpl{id=93, name=state93, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=108, name=state108, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(54), "Event fired: Інших користувачів");
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

	@Test(priority=16)
	public void method_47_43_44_45_55_56_57(){
		testSuiteHelper.newCurrentTestMethod("method_47_43_44_45_55_56_57");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(99);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(99)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(99)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Приховані, attributes={class=filter_menu, data-status=hidden, href=#}}, source=PerceptualImageHashStateVertexImpl{id=99, name=state99, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=92, name=state92, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(47), "Event fired: Приховані");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Головна, attributes={href=http://localhost:3000}}, source=PerceptualImageHashStateVertexImpl{id=92, name=state92, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=93, name=state93, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Головна");
			testSuiteHelper.runInCrawlingPlugins(93);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 93");

			testSuiteHelper.addStateToReportBuilder(93);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(93)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(93)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Активні, attributes={class=filter_menu, data-status=active, href=#}}, source=PerceptualImageHashStateVertexImpl{id=93, name=state93, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: Активні");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Ваші, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=97, name=state97, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: Ваші");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Редагувати, attributes={class=btn btn-default btn-xs item_button_edit}}, source=PerceptualImageHashStateVertexImpl{id=97, name=state97, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=118, name=state118, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(55), "Event fired: Редагувати");
			testSuiteHelper.runInCrawlingPlugins(118);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 118");

			testSuiteHelper.addStateToReportBuilder(118);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(118)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(118)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Збереження..., type=submit, value=Зберегти}}, source=PerceptualImageHashStateVertexImpl{id=118, name=state118, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=119, name=state119, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(119);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 119");

			testSuiteHelper.addStateToReportBuilder(119);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(119)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(119)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Додати, attributes={class=btn btn-primary, href=http://localhost:3000/wallets/add, id=add_wallet_button}}, source=PerceptualImageHashStateVertexImpl{id=119, name=state119, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=120, name=state120, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(57), "Event fired: Додати");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=17)
	public void method_58_44_45_50_59_60(){
		testSuiteHelper.newCurrentTestMethod("method_58_44_45_50_59_60");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(121);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(121)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(121)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Приховані, attributes={class=filter_menu, data-status=hidden, href=#}}, source=PerceptualImageHashStateVertexImpl{id=121, name=state121, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=92, name=state92, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(58), "Event fired: Приховані");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Активні, attributes={class=filter_menu, data-status=active, href=#}}, source=PerceptualImageHashStateVertexImpl{id=93, name=state93, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: Активні");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Ваші, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=97, name=state97, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: Ваші");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Приховати, attributes={class=btn btn-default btn-xs item_button_remove}}, source=PerceptualImageHashStateVertexImpl{id=97, name=state97, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=110, name=state110, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Приховати");
			testSuiteHelper.runInCrawlingPlugins(110);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 110");

			testSuiteHelper.addStateToReportBuilder(110);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(110)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(110)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=process_button btn btn-danger pull-left, data-loading-text=Обробка..., type=button, value=Так, приховати}}, source=PerceptualImageHashStateVertexImpl{id=110, name=state110, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=123, name=state123, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(123);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 123");

			testSuiteHelper.addStateToReportBuilder(123);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(123)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(123)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=$0.00 Приховати Редагувати ДоступBigPlan, attributes={class=list-group-item item, data-id=4, href=http://localhost:3000/wallets/4}}, source=PerceptualImageHashStateVertexImpl{id=123, name=state123, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=85, name=state85, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: $0.00 Приховати Редагувати ДоступBigPlan");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=18)
	public void method_61_44_45_50_51_62(){
		testSuiteHelper.newCurrentTestMethod("method_61_44_45_50_51_62");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(125);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(125)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(125)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Приховані, attributes={class=filter_menu, data-status=hidden, href=#}}, source=PerceptualImageHashStateVertexImpl{id=125, name=state125, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=92, name=state92, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: Приховані");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Активні, attributes={class=filter_menu, data-status=active, href=#}}, source=PerceptualImageHashStateVertexImpl{id=93, name=state93, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: Активні");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Ваші, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=97, name=state97, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: Ваші");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Приховати, attributes={class=btn btn-default btn-xs item_button_remove}}, source=PerceptualImageHashStateVertexImpl{id=97, name=state97, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=110, name=state110, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Приховати");
			testSuiteHelper.runInCrawlingPlugins(110);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 110");

			testSuiteHelper.addStateToReportBuilder(110);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(110)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(110)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[2], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Скасування..., type=submit, value=Скасувати}}, source=PerceptualImageHashStateVertexImpl{id=110, name=state110, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=111, name=state111, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(111);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 111");

			testSuiteHelper.addStateToReportBuilder(111);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(111)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(111)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Додати, attributes={class=btn btn-primary, href=http://localhost:3000/wallets/add, id=add_wallet_button}}, source=PerceptualImageHashStateVertexImpl{id=111, name=state111, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=127, name=state127, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(62), "Event fired: Додати");
			testSuiteHelper.runInCrawlingPlugins(127);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 127");

			testSuiteHelper.addStateToReportBuilder(127);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(127)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(127)
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
	public void method_61_43_44_45_63_64_65_66(){
		testSuiteHelper.newCurrentTestMethod("method_61_43_44_45_63_64_65_66");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(125);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(125)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(125)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Приховані, attributes={class=filter_menu, data-status=hidden, href=#}}, source=PerceptualImageHashStateVertexImpl{id=125, name=state125, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=92, name=state92, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: Приховані");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Головна, attributes={href=http://localhost:3000}}, source=PerceptualImageHashStateVertexImpl{id=92, name=state92, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=93, name=state93, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Головна");
			testSuiteHelper.runInCrawlingPlugins(93);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 93");

			testSuiteHelper.addStateToReportBuilder(93);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(93)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(93)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Активні, attributes={class=filter_menu, data-status=active, href=#}}, source=PerceptualImageHashStateVertexImpl{id=93, name=state93, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: Активні");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Ваші, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=97, name=state97, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: Ваші");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[3], element=Element{node=[BUTTON: null], tag=BUTTON, text=Доступ, attributes={class=btn btn-default btn-xs item_button_accesses}}, source=PerceptualImageHashStateVertexImpl{id=97, name=state97, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=131, name=state131, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(63), "Event fired: Доступ");
			testSuiteHelper.runInCrawlingPlugins(131);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 131");

			testSuiteHelper.addStateToReportBuilder(131);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(131)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(131)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[2]/DIV[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Збереження..., type=submit, value=Дозволити доступ}}, source=PerceptualImageHashStateVertexImpl{id=131, name=state131, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=132, name=state132, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_email"), "yigitsoydan98@gmail.com"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/FIELDSET[1]/DIV[1]/DIV[1]/TABLE[1]/TBODY[1]/TR[1]/TD[4]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Видалити доступ, attributes={class=btn btn-default btn-xs item_button_remove_access, data-id=1, href=#}}, source=PerceptualImageHashStateVertexImpl{id=132, name=state132, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=133, name=state133, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_email"), "yigitsoydan98@gmail.com"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(65), "Event fired: Видалити доступ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=process_button btn btn-danger pull-left, data-loading-text=Обробка..., type=button, value=Так, видалити}}, source=PerceptualImageHashStateVertexImpl{id=133, name=state133, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=131, name=state131, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(131);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 131");

			testSuiteHelper.addStateToReportBuilder(131);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(131)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(131)
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
	public void method_61_43_44_45_55_56_67(){
		testSuiteHelper.newCurrentTestMethod("method_61_43_44_45_55_56_67");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(125);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(125)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(125)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Приховані, attributes={class=filter_menu, data-status=hidden, href=#}}, source=PerceptualImageHashStateVertexImpl{id=125, name=state125, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=92, name=state92, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: Приховані");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Головна, attributes={href=http://localhost:3000}}, source=PerceptualImageHashStateVertexImpl{id=92, name=state92, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=93, name=state93, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Головна");
			testSuiteHelper.runInCrawlingPlugins(93);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 93");

			testSuiteHelper.addStateToReportBuilder(93);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(93)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(93)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Активні, attributes={class=filter_menu, data-status=active, href=#}}, source=PerceptualImageHashStateVertexImpl{id=93, name=state93, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: Активні");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Ваші, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=97, name=state97, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: Ваші");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Редагувати, attributes={class=btn btn-default btn-xs item_button_edit}}, source=PerceptualImageHashStateVertexImpl{id=97, name=state97, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=118, name=state118, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(55), "Event fired: Редагувати");
			testSuiteHelper.runInCrawlingPlugins(118);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 118");

			testSuiteHelper.addStateToReportBuilder(118);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(118)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(118)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Збереження..., type=submit, value=Зберегти}}, source=PerceptualImageHashStateVertexImpl{id=118, name=state118, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=119, name=state119, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(119);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 119");

			testSuiteHelper.addStateToReportBuilder(119);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(119)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(119)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Приховати, attributes={class=btn btn-default btn-xs item_button_remove}}, source=PerceptualImageHashStateVertexImpl{id=119, name=state119, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=136, name=state136, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(67), "Event fired: Приховати");
			testSuiteHelper.runInCrawlingPlugins(136);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 136");

			testSuiteHelper.addStateToReportBuilder(136);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(136)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(136)
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
