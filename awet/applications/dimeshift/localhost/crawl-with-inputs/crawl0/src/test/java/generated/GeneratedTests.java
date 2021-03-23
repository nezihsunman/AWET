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
 * Generated @ Tue Jan 19 12:30:47 TRT 2021
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
		builder.setBrowserConfig(new BrowserConfiguration(BrowserType.CHROME, 1, new BrowserOptions(false, 2)));
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
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "new_password_repeat_input"), "789"));
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
	public void method_14_29_30_31_32_33_34_35_36_37_38_39_40_41_42_43_44_45(){
		testSuiteHelper.newCurrentTestMethod("method_14_29_30_31_32_33_34_35_36_37_38_39_40_41_42_43_44_45");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/UL[1]/LI[1]/A[1], element=Element{node=[A: null], tag=A, text=Головна, attributes={href=http://localhost:3000}}, source=PerceptualImageHashStateVertexImpl{id=45, name=state45, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=46, name=state46, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: Головна");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$4332.43 Приховати Редагувати ДоступSample Cash Wallet, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=46, name=state46, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: $4332.43 Приховати Редагувати ДоступSample Cash Wallet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=встановити загальну суму у, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=49, name=state49, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: встановити загальну суму у");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Збереження..., type=submit, value=Встановити}}, source=PerceptualImageHashStateVertexImpl{id=49, name=state49, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(34), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Встановити ціль, attributes={class=btn btn-default btn-block, href=http://localhost:3000/plans}}, source=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: Встановити ціль");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Додати нову, attributes={class=btn btn-primary, id=button_create_new, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=52, name=state52, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Додати нову");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Sample Cash Wallet , attributes={class=list-group-item step1_wallet_checkbox , data-id=2, href=#}}, source=PerceptualImageHashStateVertexImpl{id=52, name=state52, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Sample Cash Wallet ");
			testSuiteHelper.runInCrawlingPlugins(53);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 53");

			testSuiteHelper.addStateToReportBuilder(53);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(53)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(53)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Sample Cash Wallet , attributes={class=list-group-item step1_wallet_checkbox  active, data-id=2, href=#}}, source=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=54, name=state54, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Sample Cash Wallet ");
			testSuiteHelper.runInCrawlingPlugins(54);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 54");

			testSuiteHelper.addStateToReportBuilder(54);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(54)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(54)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Sample Cash Wallet , attributes={class=list-group-item step1_wallet_checkbox, data-id=2, href=#}}, source=PerceptualImageHashStateVertexImpl{id=54, name=state54, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: Sample Cash Wallet ");
			testSuiteHelper.runInCrawlingPlugins(53);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 53");

			testSuiteHelper.addStateToReportBuilder(53);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(53)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(53)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=Sample Bank Account Wallet , attributes={class=list-group-item step1_wallet_checkbox , data-id=3, href=#}}, source=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=56, name=state56, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(40), "Event fired: Sample Bank Account Wallet ");
			testSuiteHelper.runInCrawlingPlugins(56);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 56");

			testSuiteHelper.addStateToReportBuilder(56);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(56)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(56)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Sample Cash Wallet , attributes={class=list-group-item step1_wallet_checkbox active, data-id=2, href=#}}, source=PerceptualImageHashStateVertexImpl{id=56, name=state56, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=57, name=state57, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Sample Cash Wallet ");
			testSuiteHelper.runInCrawlingPlugins(57);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 57");

			testSuiteHelper.addStateToReportBuilder(57);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(57)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(57)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=Sample Bank Account Wallet , attributes={class=list-group-item step1_wallet_checkbox  active, data-id=3, href=#}}, source=PerceptualImageHashStateVertexImpl{id=57, name=state57, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=54, name=state54, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(42), "Event fired: Sample Bank Account Wallet ");
			testSuiteHelper.runInCrawlingPlugins(54);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 54");

			testSuiteHelper.addStateToReportBuilder(54);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(54)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(54)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=Sample Bank Account Wallet , attributes={class=list-group-item step1_wallet_checkbox , data-id=3, href=#}}, source=PerceptualImageHashStateVertexImpl{id=54, name=state54, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(43), "Event fired: Sample Bank Account Wallet ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=Sample Bank Account Wallet , attributes={class=list-group-item step1_wallet_checkbox active, data-id=3, href=#}}, source=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=54, name=state54, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: Sample Bank Account Wallet ");
			testSuiteHelper.runInCrawlingPlugins(54);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 54");

			testSuiteHelper.addStateToReportBuilder(54);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(54)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(54)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Назад, attributes={class=btn btn-default, id=button_step1_back, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=54, name=state54, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(45), "Event fired: Назад");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=9)
	public void method_48_49(){
		testSuiteHelper.newCurrentTestMethod("method_48_49");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(46);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=$1699.03 Приховати Редагувати ДоступSample Bank Account Wallet, attributes={class=list-group-item item, data-id=3, href=http://localhost:3000/wallets/3}}, source=PerceptualImageHashStateVertexImpl{id=46, name=state46, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=84, name=state84, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(48), "Event fired: $1699.03 Приховати Редагувати ДоступSample Bank Account Wallet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=встановити загальну суму у, attributes={class=action, href=#, id=set_total_to_button}}, source=PerceptualImageHashStateVertexImpl{id=84, name=state84, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=85, name=state85, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(49), "Event fired: встановити загальну суму у");
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
	public void method_32_50_51_52_53(){
		testSuiteHelper.newCurrentTestMethod("method_32_50_51_52_53");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(46);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$4332.43 Приховати Редагувати ДоступSample Cash Wallet, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=46, name=state46, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: $4332.43 Приховати Редагувати ДоступSample Cash Wallet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Додати прибуток, attributes={aria-describedby=popover52612, class=btn btn-success btn-block tour-tour-element tour-tour-0-element tour-step-element-reflex, id=add_profit_button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=87, name=state87, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Додати прибуток");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Збереження..., type=submit, value=Додати}}, source=PerceptualImageHashStateVertexImpl{id=87, name=state87, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=88, name=state88, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_amount"), "1500"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_description"), "nezih"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Встановити ціль, attributes={class=btn btn-default btn-block, href=http://localhost:3000/plans}}, source=PerceptualImageHashStateVertexImpl{id=88, name=state88, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=90, name=state90, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(52), "Event fired: Встановити ціль");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Заповнити, attributes={class=btn btn-primary btn-xs, data-i18n=Do it, href=/user/fillprofile}}, source=PerceptualImageHashStateVertexImpl{id=90, name=state90, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=91, name=state91, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(53), "Event fired: Заповнити");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=11)
	public void method_32_35_36_54_55(){
		testSuiteHelper.newCurrentTestMethod("method_32_35_36_54_55");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(46);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$4332.43 Приховати Редагувати ДоступSample Cash Wallet, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=46, name=state46, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: $4332.43 Приховати Редагувати ДоступSample Cash Wallet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Встановити ціль, attributes={class=btn btn-default btn-block, href=http://localhost:3000/plans}}, source=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: Встановити ціль");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Додати нову, attributes={class=btn btn-primary, id=button_create_new, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=52, name=state52, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Додати нову");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=Sample Bank Account Wallet , attributes={class=list-group-item step1_wallet_checkbox , data-id=3, href=#}}, source=PerceptualImageHashStateVertexImpl{id=52, name=state52, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(54), "Event fired: Sample Bank Account Wallet ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Назад, attributes={class=btn btn-default, id=button_step1_back, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(55), "Event fired: Назад");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=12)
	public void method_32_35_36_37_56(){
		testSuiteHelper.newCurrentTestMethod("method_32_35_36_37_56");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(46);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$4332.43 Приховати Редагувати ДоступSample Cash Wallet, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=46, name=state46, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: $4332.43 Приховати Редагувати ДоступSample Cash Wallet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Встановити ціль, attributes={class=btn btn-default btn-block, href=http://localhost:3000/plans}}, source=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: Встановити ціль");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Додати нову, attributes={class=btn btn-primary, id=button_create_new, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=52, name=state52, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Додати нову");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Sample Cash Wallet , attributes={class=list-group-item step1_wallet_checkbox , data-id=2, href=#}}, source=PerceptualImageHashStateVertexImpl{id=52, name=state52, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Sample Cash Wallet ");
			testSuiteHelper.runInCrawlingPlugins(53);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 53");

			testSuiteHelper.addStateToReportBuilder(53);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(53)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(53)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Назад, attributes={class=btn btn-default, id=button_step1_back, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(56), "Event fired: Назад");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=13)
	public void method_32_35_36_54_44(){
		testSuiteHelper.newCurrentTestMethod("method_32_35_36_54_44");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(46);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$4332.43 Приховати Редагувати ДоступSample Cash Wallet, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=46, name=state46, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: $4332.43 Приховати Редагувати ДоступSample Cash Wallet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Встановити ціль, attributes={class=btn btn-default btn-block, href=http://localhost:3000/plans}}, source=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: Встановити ціль");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Додати нову, attributes={class=btn btn-primary, id=button_create_new, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=52, name=state52, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Додати нову");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=Sample Bank Account Wallet , attributes={class=list-group-item step1_wallet_checkbox , data-id=3, href=#}}, source=PerceptualImageHashStateVertexImpl{id=52, name=state52, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(54), "Event fired: Sample Bank Account Wallet ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=Sample Bank Account Wallet , attributes={class=list-group-item step1_wallet_checkbox active, data-id=3, href=#}}, source=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=54, name=state54, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(44), "Event fired: Sample Bank Account Wallet ");
			testSuiteHelper.runInCrawlingPlugins(54);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 54");

			testSuiteHelper.addStateToReportBuilder(54);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(54)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(54)
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
	public void method_32_35_36_37_40_57_58(){
		testSuiteHelper.newCurrentTestMethod("method_32_35_36_37_40_57_58");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(46);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$4332.43 Приховати Редагувати ДоступSample Cash Wallet, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=46, name=state46, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: $4332.43 Приховати Редагувати ДоступSample Cash Wallet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Встановити ціль, attributes={class=btn btn-default btn-block, href=http://localhost:3000/plans}}, source=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: Встановити ціль");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Додати нову, attributes={class=btn btn-primary, id=button_create_new, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=52, name=state52, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Додати нову");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Sample Cash Wallet , attributes={class=list-group-item step1_wallet_checkbox , data-id=2, href=#}}, source=PerceptualImageHashStateVertexImpl{id=52, name=state52, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Sample Cash Wallet ");
			testSuiteHelper.runInCrawlingPlugins(53);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 53");

			testSuiteHelper.addStateToReportBuilder(53);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(53)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(53)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=Sample Bank Account Wallet , attributes={class=list-group-item step1_wallet_checkbox , data-id=3, href=#}}, source=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=56, name=state56, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(40), "Event fired: Sample Bank Account Wallet ");
			testSuiteHelper.runInCrawlingPlugins(56);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 56");

			testSuiteHelper.addStateToReportBuilder(56);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(56)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(56)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=Sample Bank Account Wallet , attributes={class=list-group-item step1_wallet_checkbox  active, data-id=3, href=#}}, source=PerceptualImageHashStateVertexImpl{id=56, name=state56, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=100, name=state100, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(57), "Event fired: Sample Bank Account Wallet ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Sample Cash Wallet , attributes={class=list-group-item step1_wallet_checkbox  active, data-id=2, href=#}}, source=PerceptualImageHashStateVertexImpl{id=100, name=state100, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=54, name=state54, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(58), "Event fired: Sample Cash Wallet ");
			testSuiteHelper.runInCrawlingPlugins(54);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 54");

			testSuiteHelper.addStateToReportBuilder(54);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(54)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(54)
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
	public void method_32_35_36_37_40_41_59(){
		testSuiteHelper.newCurrentTestMethod("method_32_35_36_37_40_41_59");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(46);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$4332.43 Приховати Редагувати ДоступSample Cash Wallet, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=46, name=state46, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: $4332.43 Приховати Редагувати ДоступSample Cash Wallet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Встановити ціль, attributes={class=btn btn-default btn-block, href=http://localhost:3000/plans}}, source=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: Встановити ціль");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Додати нову, attributes={class=btn btn-primary, id=button_create_new, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=52, name=state52, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Додати нову");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Sample Cash Wallet , attributes={class=list-group-item step1_wallet_checkbox , data-id=2, href=#}}, source=PerceptualImageHashStateVertexImpl{id=52, name=state52, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Sample Cash Wallet ");
			testSuiteHelper.runInCrawlingPlugins(53);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 53");

			testSuiteHelper.addStateToReportBuilder(53);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(53)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(53)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=Sample Bank Account Wallet , attributes={class=list-group-item step1_wallet_checkbox , data-id=3, href=#}}, source=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=56, name=state56, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(40), "Event fired: Sample Bank Account Wallet ");
			testSuiteHelper.runInCrawlingPlugins(56);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 56");

			testSuiteHelper.addStateToReportBuilder(56);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(56)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(56)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Sample Cash Wallet , attributes={class=list-group-item step1_wallet_checkbox active, data-id=2, href=#}}, source=PerceptualImageHashStateVertexImpl{id=56, name=state56, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=57, name=state57, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(41), "Event fired: Sample Cash Wallet ");
			testSuiteHelper.runInCrawlingPlugins(57);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 57");

			testSuiteHelper.addStateToReportBuilder(57);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(57)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(57)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Назад, attributes={class=btn btn-default, id=button_step1_back, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=57, name=state57, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(59), "Event fired: Назад");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=16)
	public void method_32_35_36_54_60_61(){
		testSuiteHelper.newCurrentTestMethod("method_32_35_36_54_60_61");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(46);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$4332.43 Приховати Редагувати ДоступSample Cash Wallet, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=46, name=state46, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: $4332.43 Приховати Редагувати ДоступSample Cash Wallet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Встановити ціль, attributes={class=btn btn-default btn-block, href=http://localhost:3000/plans}}, source=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: Встановити ціль");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Додати нову, attributes={class=btn btn-primary, id=button_create_new, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=52, name=state52, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Додати нову");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=Sample Bank Account Wallet , attributes={class=list-group-item step1_wallet_checkbox , data-id=3, href=#}}, source=PerceptualImageHashStateVertexImpl{id=52, name=state52, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(54), "Event fired: Sample Bank Account Wallet ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Далі, attributes={class=btn btn-primary, id=button_step1_next, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=105, name=state105, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(60), "Event fired: Далі");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Назад, attributes={class=btn btn-default, id=button_step2_back, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=105, name=state105, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=59, name=state59, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(61), "Event fired: Назад");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=17)
	public void method_62_63_64_65_66(){
		testSuiteHelper.newCurrentTestMethod("method_62_63_64_65_66");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(46);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Додати, attributes={class=btn btn-primary, href=http://localhost:3000/wallets/add, id=add_wallet_button}}, source=PerceptualImageHashStateVertexImpl{id=46, name=state46, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=108, name=state108, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(62), "Event fired: Додати");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Збереження..., id=add_wallet_modal_form_submit, type=submit, value=Додати}}, source=PerceptualImageHashStateVertexImpl{id=108, name=state108, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=46, name=state46, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(63), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Приховані, attributes={class=filter_menu, data-status=hidden, href=#}}, source=PerceptualImageHashStateVertexImpl{id=46, name=state46, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=111, name=state111, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(64), "Event fired: Приховані");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Ваші, attributes={class=origin_menu, data-origin=mine, href=#}}, source=PerceptualImageHashStateVertexImpl{id=111, name=state111, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=113, name=state113, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(65), "Event fired: Ваші");
			testSuiteHelper.runInCrawlingPlugins(113);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 113");

			testSuiteHelper.addStateToReportBuilder(113);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(113)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(113)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[3]/A[1], element=Element{node=[A: null], tag=A, text=Інших користувачів, attributes={class=origin_menu, data-origin=shared, href=#}}, source=PerceptualImageHashStateVertexImpl{id=113, name=state113, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=114, name=state114, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(66), "Event fired: Інших користувачів");
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

	@Test(priority=18)
	public void method_68_50_51_69(){
		testSuiteHelper.newCurrentTestMethod("method_68_50_51_69");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(115);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(115)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(115)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$4332.43 Приховати Редагувати ДоступSample Cash Wallet, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=115, name=state115, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(68), "Event fired: $4332.43 Приховати Редагувати ДоступSample Cash Wallet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Додати прибуток, attributes={aria-describedby=popover52612, class=btn btn-success btn-block tour-tour-element tour-tour-0-element tour-step-element-reflex, id=add_profit_button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=87, name=state87, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Додати прибуток");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Збереження..., type=submit, value=Додати}}, source=PerceptualImageHashStateVertexImpl{id=87, name=state87, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=88, name=state88, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_amount"), "1500"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_description"), "nezih"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Додати прибуток, attributes={class=btn btn-success btn-block, id=add_profit_button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=88, name=state88, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=124, name=state124, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(69), "Event fired: Додати прибуток");
			testSuiteHelper.runInCrawlingPlugins(124);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 124");

			testSuiteHelper.addStateToReportBuilder(124);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(124)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(124)
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
	public void method_68_50_51_52_70_71_72_73_74_75_76_77_78_79(){
		testSuiteHelper.newCurrentTestMethod("method_68_50_51_52_70_71_72_73_74_75_76_77_78_79");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(115);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(115)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(115)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$4332.43 Приховати Редагувати ДоступSample Cash Wallet, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=115, name=state115, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(68), "Event fired: $4332.43 Приховати Редагувати ДоступSample Cash Wallet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Додати прибуток, attributes={aria-describedby=popover52612, class=btn btn-success btn-block tour-tour-element tour-tour-0-element tour-step-element-reflex, id=add_profit_button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=87, name=state87, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Додати прибуток");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Збереження..., type=submit, value=Додати}}, source=PerceptualImageHashStateVertexImpl{id=87, name=state87, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=88, name=state88, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_amount"), "1500"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_description"), "nezih"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Встановити ціль, attributes={class=btn btn-default btn-block, href=http://localhost:3000/plans}}, source=PerceptualImageHashStateVertexImpl{id=88, name=state88, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=90, name=state90, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(52), "Event fired: Встановити ціль");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Додати нову, attributes={class=btn btn-primary, id=button_create_new, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=90, name=state90, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=126, name=state126, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(70), "Event fired: Додати нову");
			testSuiteHelper.runInCrawlingPlugins(126);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 126");

			testSuiteHelper.addStateToReportBuilder(126);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(126)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(126)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Sample Cash Wallet , attributes={class=list-group-item step1_wallet_checkbox , data-id=2, href=#}}, source=PerceptualImageHashStateVertexImpl{id=126, name=state126, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=127, name=state127, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(71), "Event fired: Sample Cash Wallet ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=Sample Bank Account Wallet , attributes={class=list-group-item step1_wallet_checkbox , data-id=3, href=#}}, source=PerceptualImageHashStateVertexImpl{id=127, name=state127, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=128, name=state128, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(72), "Event fired: Sample Bank Account Wallet ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=Sample Bank Account Wallet , attributes={class=list-group-item step1_wallet_checkbox  active, data-id=3, href=#}}, source=PerceptualImageHashStateVertexImpl{id=128, name=state128, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=127, name=state127, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(73), "Event fired: Sample Bank Account Wallet ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[3], element=Element{node=[A: null], tag=A, text=BigPlan , attributes={class=list-group-item step1_wallet_checkbox , data-id=4, href=#}}, source=PerceptualImageHashStateVertexImpl{id=127, name=state127, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=130, name=state130, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(74), "Event fired: BigPlan ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=Sample Bank Account Wallet , attributes={class=list-group-item step1_wallet_checkbox, data-id=3, href=#}}, source=PerceptualImageHashStateVertexImpl{id=130, name=state130, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=131, name=state131, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(75), "Event fired: Sample Bank Account Wallet ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=Sample Bank Account Wallet , attributes={class=list-group-item step1_wallet_checkbox active, data-id=3, href=#}}, source=PerceptualImageHashStateVertexImpl{id=131, name=state131, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=130, name=state130, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(76), "Event fired: Sample Bank Account Wallet ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[3], element=Element{node=[A: null], tag=A, text=BigPlan , attributes={class=list-group-item step1_wallet_checkbox  active, data-id=4, href=#}}, source=PerceptualImageHashStateVertexImpl{id=130, name=state130, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=133, name=state133, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(77), "Event fired: BigPlan ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[3], element=Element{node=[A: null], tag=A, text=BigPlan , attributes={class=list-group-item step1_wallet_checkbox, data-id=4, href=#}}, source=PerceptualImageHashStateVertexImpl{id=133, name=state133, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=130, name=state130, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(78), "Event fired: BigPlan ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Назад, attributes={class=btn btn-default, id=button_step1_back, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=130, name=state130, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=90, name=state90, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(79), "Event fired: Назад");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=20)
	public void method_68_35_36_80(){
		testSuiteHelper.newCurrentTestMethod("method_68_35_36_80");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(115);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(115)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(115)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$4332.43 Приховати Редагувати ДоступSample Cash Wallet, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=115, name=state115, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(68), "Event fired: $4332.43 Приховати Редагувати ДоступSample Cash Wallet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Встановити ціль, attributes={class=btn btn-default btn-block, href=http://localhost:3000/plans}}, source=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: Встановити ціль");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Додати нову, attributes={class=btn btn-primary, id=button_create_new, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=52, name=state52, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Додати нову");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Назад, attributes={class=btn btn-default, id=button_step1_back, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=52, name=state52, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(80), "Event fired: Назад");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=21)
	public void method_68_35_36_37_81_82_83_84_85(){
		testSuiteHelper.newCurrentTestMethod("method_68_35_36_37_81_82_83_84_85");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(115);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(115)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(115)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$4332.43 Приховати Редагувати ДоступSample Cash Wallet, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=115, name=state115, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(68), "Event fired: $4332.43 Приховати Редагувати ДоступSample Cash Wallet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Встановити ціль, attributes={class=btn btn-default btn-block, href=http://localhost:3000/plans}}, source=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: Встановити ціль");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Додати нову, attributes={class=btn btn-primary, id=button_create_new, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=51, name=state51, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=52, name=state52, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Додати нову");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Sample Cash Wallet , attributes={class=list-group-item step1_wallet_checkbox , data-id=2, href=#}}, source=PerceptualImageHashStateVertexImpl{id=52, name=state52, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Sample Cash Wallet ");
			testSuiteHelper.runInCrawlingPlugins(53);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 53");

			testSuiteHelper.addStateToReportBuilder(53);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(53)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(53)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Далі, attributes={class=btn btn-primary, id=button_step1_next, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=53, name=state53, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=105, name=state105, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(81), "Event fired: Далі");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2], element=Element{node=[BUTTON: null], tag=BUTTON, text=Підтвердити і зберегти, attributes={class=btn btn-primary, id=button_step2_save, type=submit}}, source=PerceptualImageHashStateVertexImpl{id=105, name=state105, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=140, name=state140, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(82), "Event fired: Підтвердити і зберегти");
			testSuiteHelper.runInCrawlingPlugins(140);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 140");

			testSuiteHelper.addStateToReportBuilder(140);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(140)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(140)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Планування витрат, attributes={href=http://localhost:3000/plans}}, source=PerceptualImageHashStateVertexImpl{id=140, name=state140, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=141, name=state141, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(83), "Event fired: Планування витрат");
			testSuiteHelper.runInCrawlingPlugins(141);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 141");

			testSuiteHelper.addStateToReportBuilder(141);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(141)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(141)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Звіт, attributes={class=btn btn-default btn-xs, href=http://localhost:3000/plans/2}}, source=PerceptualImageHashStateVertexImpl{id=141, name=state141, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=140, name=state140, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(84), "Event fired: Звіт");
			testSuiteHelper.runInCrawlingPlugins(140);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 140");

			testSuiteHelper.addStateToReportBuilder(140);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(140)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(140)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Refresh, attributes={class=btn btn-default, data-loading-text=Loading..., href=#, id=reload_stats_button, role=button}}, source=PerceptualImageHashStateVertexImpl{id=140, name=state140, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=143, name=state143, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(85), "Event fired: Refresh");
			testSuiteHelper.runInCrawlingPlugins(143);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 143");

			testSuiteHelper.addStateToReportBuilder(143);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(143)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(143)
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
	public void method_87_88_89_90_91_92_93(){
		testSuiteHelper.newCurrentTestMethod("method_87_88_89_90_91_92_93");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(115);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(115)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(115)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3], element=Element{node=[A: null], tag=A, text=$0.00 Приховати Редагувати ДоступBigPlan, attributes={class=list-group-item item, data-id=4, href=http://localhost:3000/wallets/4}}, source=PerceptualImageHashStateVertexImpl{id=115, name=state115, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=167, name=state167, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(87), "Event fired: $0.00 Приховати Редагувати ДоступBigPlan");
			testSuiteHelper.runInCrawlingPlugins(167);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 167");

			testSuiteHelper.addStateToReportBuilder(167);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(167)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(167)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/H3[1]/SPAN[2]/A[1], element=Element{node=[A: null], tag=A, text=Імпорт, attributes={class=btn btn-default btn-xs, href=http://localhost:3000/wallets/4/import/}}, source=PerceptualImageHashStateVertexImpl{id=167, name=state167, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=168, name=state168, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(88), "Event fired: Імпорт");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Гаманці, attributes={href=http://localhost:3000/wallets}}, source=PerceptualImageHashStateVertexImpl{id=168, name=state168, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=115, name=state115, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(89), "Event fired: Гаманці");
			testSuiteHelper.runInCrawlingPlugins(115);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 115");

			testSuiteHelper.addStateToReportBuilder(115);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(115)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(115)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Приховати, attributes={class=btn btn-default btn-xs item_button_remove}}, source=PerceptualImageHashStateVertexImpl{id=115, name=state115, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=170, name=state170, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(90), "Event fired: Приховати");
			testSuiteHelper.runInCrawlingPlugins(170);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 170");

			testSuiteHelper.addStateToReportBuilder(170);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(170)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(170)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[2], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Скасування..., type=submit, value=Скасувати}}, source=PerceptualImageHashStateVertexImpl{id=170, name=state170, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=171, name=state171, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(91), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(171);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 171");

			testSuiteHelper.addStateToReportBuilder(171);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(171)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(171)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$8832.43 Приховати Редагувати ДоступSample Cash Wallet, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=171, name=state171, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=172, name=state172, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(92), "Event fired: $8832.43 Приховати Редагувати ДоступSample Cash Wallet");
			testSuiteHelper.runInCrawlingPlugins(172);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 172");

			testSuiteHelper.addStateToReportBuilder(172);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(172)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(172)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=BigPlanВиможете витратити $8825.43сьогодні, attributes={class=list-group-item, href=http://localhost:3000/plans/2}}, source=PerceptualImageHashStateVertexImpl{id=172, name=state172, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=140, name=state140, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: BigPlanВиможете витратити $8825.43сьогодні");
			testSuiteHelper.runInCrawlingPlugins(140);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 140");

			testSuiteHelper.addStateToReportBuilder(140);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(140)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(140)
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
	public void method_68_50_51_94_95_96_97_98(){
		testSuiteHelper.newCurrentTestMethod("method_68_50_51_94_95_96_97_98");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(115);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(115)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(115)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$4332.43 Приховати Редагувати ДоступSample Cash Wallet, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=115, name=state115, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(68), "Event fired: $4332.43 Приховати Редагувати ДоступSample Cash Wallet");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Додати прибуток, attributes={aria-describedby=popover52612, class=btn btn-success btn-block tour-tour-element tour-tour-0-element tour-step-element-reflex, id=add_profit_button, type=button}}, source=PerceptualImageHashStateVertexImpl{id=48, name=state48, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=87, name=state87, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(50), "Event fired: Додати прибуток");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Збереження..., type=submit, value=Додати}}, source=PerceptualImageHashStateVertexImpl{id=87, name=state87, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=88, name=state88, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_amount"), "1500"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_description"), "nezih"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(51), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[20]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Грудень 2020, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=88, name=state88, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=175, name=state175, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(94), "Event fired: Грудень 2020");
			testSuiteHelper.runInCrawlingPlugins(175);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 175");

			testSuiteHelper.addStateToReportBuilder(175);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(175)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(175)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=BigPlanВиможете витратити $8825.43сьогодні, attributes={class=list-group-item, href=http://localhost:3000/plans/2}}, source=PerceptualImageHashStateVertexImpl{id=175, name=state175, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=176, name=state176, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(95), "Event fired: BigPlanВиможете витратити $8825.43сьогодні");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Планування витрат, attributes={href=http://localhost:3000/plans}}, source=PerceptualImageHashStateVertexImpl{id=176, name=state176, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=177, name=state177, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(96), "Event fired: Планування витрат");
			testSuiteHelper.runInCrawlingPlugins(177);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 177");

			testSuiteHelper.addStateToReportBuilder(177);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(177)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(177)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Звіт, attributes={class=btn btn-default btn-xs, href=http://localhost:3000/plans/2}}, source=PerceptualImageHashStateVertexImpl{id=177, name=state177, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=176, name=state176, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(97), "Event fired: Звіт");
			testSuiteHelper.runInCrawlingPlugins(176);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 176");

			testSuiteHelper.addStateToReportBuilder(176);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(176)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(176)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=Refresh, attributes={class=btn btn-default, data-loading-text=Loading..., href=#, id=reload_stats_button, role=button}}, source=PerceptualImageHashStateVertexImpl{id=176, name=state176, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=179, name=state179, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(98), "Event fired: Refresh");
			testSuiteHelper.runInCrawlingPlugins(179);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 179");

			testSuiteHelper.addStateToReportBuilder(179);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(179)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(179)
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
	public void method_99_92_93_83_100(){
		testSuiteHelper.newCurrentTestMethod("method_99_92_93_83_100");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(180);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(180)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(180)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Приховати, attributes={class=btn btn-default btn-xs item_button_remove}}, source=PerceptualImageHashStateVertexImpl{id=180, name=state180, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=170, name=state170, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(99), "Event fired: Приховати");
			testSuiteHelper.runInCrawlingPlugins(170);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 170");

			testSuiteHelper.addStateToReportBuilder(170);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(170)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(170)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1], element=Element{node=[A: null], tag=A, text=$8832.43 Приховати Редагувати ДоступSample Cash Wallet, attributes={class=list-group-item item, data-id=2, href=http://localhost:3000/wallets/2}}, source=PerceptualImageHashStateVertexImpl{id=171, name=state171, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=172, name=state172, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(92), "Event fired: $8832.43 Приховати Редагувати ДоступSample Cash Wallet");
			testSuiteHelper.runInCrawlingPlugins(172);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 172");

			testSuiteHelper.addStateToReportBuilder(172);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(172)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(172)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=BigPlanВиможете витратити $8825.43сьогодні, attributes={class=list-group-item, href=http://localhost:3000/plans/2}}, source=PerceptualImageHashStateVertexImpl{id=172, name=state172, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=140, name=state140, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(93), "Event fired: BigPlanВиможете витратити $8825.43сьогодні");
			testSuiteHelper.runInCrawlingPlugins(140);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 140");

			testSuiteHelper.addStateToReportBuilder(140);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(140)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(140)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1], element=Element{node=[A: null], tag=A, text=Планування витрат, attributes={href=http://localhost:3000/plans}}, source=PerceptualImageHashStateVertexImpl{id=140, name=state140, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=141, name=state141, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(83), "Event fired: Планування витрат");
			testSuiteHelper.runInCrawlingPlugins(141);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 141");

			testSuiteHelper.addStateToReportBuilder(141);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(141)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(141)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Редагувати, attributes={class=btn btn-default btn-xs edit_plan_button, data-id=2}}, source=PerceptualImageHashStateVertexImpl{id=141, name=state141, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=211, name=state211, hash=PHash_0.0}} */
			formInputs = new ArrayList<FormInput>();
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_name"), "BigPlan"));
			formInputs.add(new FormInput(FormInput.InputType.TEXT, new Identification(How.id, "input_goal_balance"), "7"));
			testSuiteHelper.handleFormInputs(formInputs);
			Thread.sleep(100);
			Assert.assertTrue(testSuiteHelper.fireEvent(100), "Event fired: Редагувати");
			testSuiteHelper.runInCrawlingPlugins(211);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 211");

			testSuiteHelper.addStateToReportBuilder(211);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(211)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(211)
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
	public void method_101_88_102_103_104(){
		testSuiteHelper.newCurrentTestMethod("method_101_88_102_103_104");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(180);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(180)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(180)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3], element=Element{node=[A: null], tag=A, text=$0.00 Приховати Редагувати ДоступBigPlan, attributes={class=list-group-item item, data-id=4, href=http://localhost:3000/wallets/4}}, source=PerceptualImageHashStateVertexImpl{id=180, name=state180, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=167, name=state167, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(101), "Event fired: $0.00 Приховати Редагувати ДоступBigPlan");
			testSuiteHelper.runInCrawlingPlugins(167);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 167");

			testSuiteHelper.addStateToReportBuilder(167);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(167)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(167)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/H3[1]/SPAN[2]/A[1], element=Element{node=[A: null], tag=A, text=Імпорт, attributes={class=btn btn-default btn-xs, href=http://localhost:3000/wallets/4/import/}}, source=PerceptualImageHashStateVertexImpl{id=167, name=state167, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=168, name=state168, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(88), "Event fired: Імпорт");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/A[1], element=Element{node=[A: null], tag=A, text=Скасувати, attributes={class=btn btn-default, href=http://localhost:3000/wallets/4}}, source=PerceptualImageHashStateVertexImpl{id=168, name=state168, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=221, name=state221, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(102), "Event fired: Скасувати");
			testSuiteHelper.runInCrawlingPlugins(221);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 221");

			testSuiteHelper.addStateToReportBuilder(221);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(221)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(221)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Грудень 2020, attributes={class=btn btn-default btn-sm btn-info btn-block, id=goto_prev, type=button}}, source=PerceptualImageHashStateVertexImpl{id=221, name=state221, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=222, name=state222, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(103), "Event fired: Грудень 2020");
			testSuiteHelper.runInCrawlingPlugins(222);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 222");

			testSuiteHelper.addStateToReportBuilder(222);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(222)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(222)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Січень 2021, attributes={class=btn btn-default btn-sm  btn-info btn-block, id=goto_next, type=button}}, source=PerceptualImageHashStateVertexImpl{id=222, name=state222, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=221, name=state221, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(104), "Event fired: Січень 2021");
			testSuiteHelper.runInCrawlingPlugins(221);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 221");

			testSuiteHelper.addStateToReportBuilder(221);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(221)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(221)
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
	public void method_99_105(){
		testSuiteHelper.newCurrentTestMethod("method_99_105");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(180);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(180)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(180)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Приховати, attributes={class=btn btn-default btn-xs item_button_remove}}, source=PerceptualImageHashStateVertexImpl{id=180, name=state180, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=170, name=state170, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(99), "Event fired: Приховати");
			testSuiteHelper.runInCrawlingPlugins(170);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 170");

			testSuiteHelper.addStateToReportBuilder(170);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(170)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(170)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=process_button btn btn-danger pull-left, data-loading-text=Обробка..., type=button, value=Так, приховати}}, source=PerceptualImageHashStateVertexImpl{id=170, name=state170, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=46, name=state46, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(105), "Event fired: ");
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

	@Test(priority=27)
	public void method_106_107(){
		testSuiteHelper.newCurrentTestMethod("method_106_107");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(46);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(46)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(46)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Приховати, attributes={class=btn btn-default btn-xs item_button_remove}}, source=PerceptualImageHashStateVertexImpl{id=46, name=state46, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=170, name=state170, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(106), "Event fired: Приховати");
			testSuiteHelper.runInCrawlingPlugins(170);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 170");

			testSuiteHelper.addStateToReportBuilder(170);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(170)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(170)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2], element=Element{node=[A: null], tag=A, text=$1699.03 Приховати Редагувати ДоступSample Bank Account Wallet, attributes={class=list-group-item item, data-id=3, href=http://localhost:3000/wallets/3}}, source=PerceptualImageHashStateVertexImpl{id=171, name=state171, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=84, name=state84, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(107), "Event fired: $1699.03 Приховати Редагувати ДоступSample Bank Account Wallet");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=28)
	public void method_90_91(){
		testSuiteHelper.newCurrentTestMethod("method_90_91");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(115);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(115)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(115)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=Приховати, attributes={class=btn btn-default btn-xs item_button_remove}}, source=PerceptualImageHashStateVertexImpl{id=115, name=state115, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=170, name=state170, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(90), "Event fired: Приховати");
			testSuiteHelper.runInCrawlingPlugins(170);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 170");

			testSuiteHelper.addStateToReportBuilder(170);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(170)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(170)
					&& allStatesIdentical;
			}
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[2], element=Element{node=[INPUT: null], tag=INPUT, text=, attributes={class=btn btn-primary pull-left, data-loading-text=Скасування..., type=submit, value=Скасувати}}, source=PerceptualImageHashStateVertexImpl{id=170, name=state170, hash=PHash_0.0}, target=PerceptualImageHashStateVertexImpl{id=171, name=state171, hash=PHash_0.0}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(91), "Event fired: ");
			testSuiteHelper.runInCrawlingPlugins(171);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 171");

			testSuiteHelper.addStateToReportBuilder(171);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(171)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(171)
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
