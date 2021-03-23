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
 * Generated @ Sun Nov 15 11:04:23 EST 2020
 */

public class GeneratedTests {

    private final String URL = "http://localhost:3000";
	private TestSuiteHelper testSuiteHelper;
	
	private final String TEST_SUITE_PATH = "/home/nezihsunman/workspace/AWET/awet/applications/ecommerce/localhost/crawl0/src/test/java/generated";

	private StateEquivalenceAssertionMode assertionMode = StateEquivalenceAssertionMode.ALL;
	
	private CrawljaxConfiguration getTestConfiguration() {
		CrawljaxConfigurationBuilder builder = CrawljaxConfiguration.builderFor(URL);
		builder.crawlRules().waitAfterEvent(250, TimeUnit.MILLISECONDS);
		builder.crawlRules().waitAfterReloadUrl(200, TimeUnit.MILLISECONDS);
		builder.setBrowserConfig(new BrowserConfiguration(BrowserType.CHROME, 1, new BrowserOptions(false, 2)));
		return builder.build();
	}	
	
	@BeforeClass
	public void oneTimeSetUp(){
		try {
			//load needed data from json files
			testSuiteHelper = new TestSuiteHelper(
					getTestConfiguration(),
					"/home/nezihsunman/workspace/AWET/awet/applications/ecommerce/localhost/crawl0/src/test/java/generated/states.json",
					"/home/nezihsunman/workspace/AWET/awet/applications/ecommerce/localhost/crawl0/src/test/java/generated/eventables.json",
					"/home/nezihsunman/workspace/AWET/awet/applications/ecommerce/localhost/crawl0/screenshots",
					"/home/nezihsunman/workspace/AWET/awet/applications/ecommerce/localhost/crawl0/test-results",
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
			/* Eventable{eventType=click, identification=xpath //A[@id = 'purchased'], element=Element{node=[A: null], tag=A, text=Products purchased, attributes={href=/purchased, id=purchased, ng-reflect-href=/purchased, ng-reflect-router-link=/purchased}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=3, name=state3}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Products purchased");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'shop-cart-icon'], element=Element{node=[A: null], tag=A, text=0 - Items, attributes={aria-expanded=false, href=/shopping, id=shop-cart-icon, ng-reflect-href=/shopping, ng-reflect-router-link=/shopping, role=button}}, source=StateVertexImpl{id=3, name=state3}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(2), "Event fired: 0 - Items");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'back'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Continue Shopping, attributes={class=btn btn-default, id=back, type=button}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Continue Shopping");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'shop-cart-icon'], element=Element{node=[A: null], tag=A, text=0 - Items, attributes={aria-expanded=false, href=/shopping, id=shop-cart-icon, ng-reflect-href=/shopping, ng-reflect-router-link=/shopping, role=button}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(4), "Event fired: 0 - Items");
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
	public void method_5_6_7_8_9_10_11(){
		testSuiteHelper.newCurrentTestMethod("method_5_6_7_8_9_10_11");
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
			/* Eventable{eventType=click, identification=xpath //A[@id = 'second-category'], element=Element{node=[A: null], tag=A, text=Category 2, attributes={class=list-group-item, href=/home/2, id=second-category, ng-reflect-href=/home/2, ng-reflect-router-link=/home,2, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=9, name=state9}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Category 2");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'first-category'], element=Element{node=[A: null], tag=A, text=Category 1, attributes={class=list-group-item, href=/home/1, id=first-category, ng-reflect-href=/home/1, ng-reflect-router-link=/home,1, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=9, name=state9}, target=StateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(6), "Event fired: Category 1");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'third-category'], element=Element{node=[A: null], tag=A, text=Category 3, attributes={class=list-group-item, href=/home/3, id=third-category, ng-reflect-href=/home/3, ng-reflect-router-link=/home,3, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=11, name=state11}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Category 3");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'product-1-3'], element=Element{node=[A: null], tag=A, text=nps.gov, attributes={id=product-1-3}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: nps.gov");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'add'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add to cart, attributes={class=btn btn-success pull-right, id=add, type=button}}, source=StateVertexImpl{id=15, name=state15}, target=StateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Add to cart");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'go-to-cart'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Go to cart, attributes={class=btn btn-primary text-center, id=go-to-cart, type=button}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Go to cart");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'remove-product-1-3'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Remove, attributes={class=btn btn-danger, id=remove-product-1-3, type=button}}, source=StateVertexImpl{id=17, name=state17}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(11), "Event fired: Remove");
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

	@Test(priority=4)
	public void method_1_12_13_14_15(){
		testSuiteHelper.newCurrentTestMethod("method_1_12_13_14_15");
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
			/* Eventable{eventType=click, identification=xpath //A[@id = 'purchased'], element=Element{node=[A: null], tag=A, text=Products purchased, attributes={href=/purchased, id=purchased, ng-reflect-href=/purchased, ng-reflect-router-link=/purchased}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=3, name=state3}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(1), "Event fired: Products purchased");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'back'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Continue Shopping, attributes={class=btn btn-default, id=back, type=button}}, source=StateVertexImpl{id=3, name=state3}, target=StateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(12), "Event fired: Continue Shopping");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'product-1-1'], element=Element{node=[A: null], tag=A, text=Bitchip, attributes={id=product-1-1}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=23, name=state23}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(13), "Event fired: Bitchip");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'back'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={class=btn btn-primary, id=back, type=button}}, source=StateVertexImpl{id=23, name=state23}, target=StateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(14), "Event fired: Back");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'product-2-1'], element=Element{node=[A: null], tag=A, text=Zathin, attributes={id=product-2-1}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=25, name=state25}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(15), "Event fired: Zathin");
			testSuiteHelper.runInCrawlingPlugins(25);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 25");

			testSuiteHelper.addStateToReportBuilder(25);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(25)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(25)
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
	public void method_16(){
		testSuiteHelper.newCurrentTestMethod("method_16");
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
			/* Eventable{eventType=click, identification=xpath //A[@id = 'product-3-1'], element=Element{node=[A: null], tag=A, text=Flexidy, attributes={id=product-3-1}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=27, name=state27}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(16), "Event fired: Flexidy");
			testSuiteHelper.runInCrawlingPlugins(27);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 27");

			testSuiteHelper.addStateToReportBuilder(27);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(27)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(27)
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
	public void method_5_17_18(){
		testSuiteHelper.newCurrentTestMethod("method_5_17_18");
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
			/* Eventable{eventType=click, identification=xpath //A[@id = 'second-category'], element=Element{node=[A: null], tag=A, text=Category 2, attributes={class=list-group-item, href=/home/2, id=second-category, ng-reflect-href=/home/2, ng-reflect-router-link=/home,2, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=9, name=state9}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Category 2");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'third-category'], element=Element{node=[A: null], tag=A, text=Category 3, attributes={class=list-group-item, href=/home/3, id=third-category, ng-reflect-href=/home/3, ng-reflect-router-link=/home,3, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=9, name=state9}, target=StateVertexImpl{id=11, name=state11}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(17), "Event fired: Category 3");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'product-2-3'], element=Element{node=[A: null], tag=A, text=google.de, attributes={id=product-2-3}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=31, name=state31}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(18), "Event fired: google.de");
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

	@Test(priority=7)
	public void method_7_19(){
		testSuiteHelper.newCurrentTestMethod("method_7_19");
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
			/* Eventable{eventType=click, identification=xpath //A[@id = 'third-category'], element=Element{node=[A: null], tag=A, text=Category 3, attributes={class=list-group-item, href=/home/3, id=third-category, ng-reflect-href=/home/3, ng-reflect-router-link=/home,3, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=11, name=state11}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Category 3");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'product-3-3'], element=Element{node=[A: null], tag=A, text=howstuffworks.com, attributes={id=product-3-3}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=33, name=state33}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(19), "Event fired: howstuffworks.com");
			testSuiteHelper.runInCrawlingPlugins(33);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 33");

			testSuiteHelper.addStateToReportBuilder(33);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(33)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(33)
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
	public void method_7_8_20(){
		testSuiteHelper.newCurrentTestMethod("method_7_8_20");
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
			/* Eventable{eventType=click, identification=xpath //A[@id = 'third-category'], element=Element{node=[A: null], tag=A, text=Category 3, attributes={class=list-group-item, href=/home/3, id=third-category, ng-reflect-href=/home/3, ng-reflect-router-link=/home,3, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=11, name=state11}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Category 3");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'product-1-3'], element=Element{node=[A: null], tag=A, text=nps.gov, attributes={id=product-1-3}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: nps.gov");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'go-to-cart'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Go to cart, attributes={class=btn btn-primary text-center, id=go-to-cart, type=button}}, source=StateVertexImpl{id=15, name=state15}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Go to cart");
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

	@Test(priority=9)
	public void method_7_8_9_21(){
		testSuiteHelper.newCurrentTestMethod("method_7_8_9_21");
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
			/* Eventable{eventType=click, identification=xpath //A[@id = 'third-category'], element=Element{node=[A: null], tag=A, text=Category 3, attributes={class=list-group-item, href=/home/3, id=third-category, ng-reflect-href=/home/3, ng-reflect-router-link=/home,3, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=11, name=state11}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(7), "Event fired: Category 3");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'product-1-3'], element=Element{node=[A: null], tag=A, text=nps.gov, attributes={id=product-1-3}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: nps.gov");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'add'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add to cart, attributes={class=btn btn-success pull-right, id=add, type=button}}, source=StateVertexImpl{id=15, name=state15}, target=StateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Add to cart");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'back'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={class=btn btn-primary, id=back, type=button}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=37, name=state37}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(21), "Event fired: Back");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=10)
	public void method_22_9_10_23_24(){
		testSuiteHelper.newCurrentTestMethod("method_22_9_10_23_24");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(38);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(38)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(38)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //A[@id = 'third-category'], element=Element{node=[A: null], tag=A, text=Category 3, attributes={class=list-group-item, href=/home/3, id=third-category, ng-reflect-href=/home/3, ng-reflect-router-link=/home,3, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=38, name=state38}, target=StateVertexImpl{id=11, name=state11}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(22), "Event fired: Category 3");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'add'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add to cart, attributes={class=btn btn-success pull-right, id=add, type=button}}, source=StateVertexImpl{id=15, name=state15}, target=StateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Add to cart");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'go-to-cart'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Go to cart, attributes={class=btn btn-primary text-center, id=go-to-cart, type=button}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Go to cart");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'checkout'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Checkout, attributes={class=btn btn-success, id=checkout, type=button}}, source=StateVertexImpl{id=17, name=state17}, target=StateVertexImpl{id=39, name=state39}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Checkout");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MODAL-OVERLAY[1]/BS-MODAL-CONTAINER[1]/DIV[1]/DIV[1]/MODAL-CONTENT[1]/MODAL-TITLE[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=×, attributes={aria-label=Close, class=close, type=button}}, source=StateVertexImpl{id=39, name=state39}, target=StateVertexImpl{id=40, name=state40}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(24), "Event fired: ×");
			testSuiteHelper.runInCrawlingPlugins(40);
			Assert.assertTrue(testSuiteHelper.checkInvariants(), "Invariants satisfied in state: 40");

			testSuiteHelper.addStateToReportBuilder(40);
			
			if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(40)
									&& allStatesIdentical;
			}

			if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    /* Perform a visual diff on the two states. */
			    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(40)
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
	public void method_26_20_3_5_27_28(){
		testSuiteHelper.newCurrentTestMethod("method_26_20_3_5_27_28");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(41);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(41)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(41)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //A[@id = 'third-category'], element=Element{node=[A: null], tag=A, text=Category 3, attributes={class=list-group-item, href=/home/3, id=third-category, ng-reflect-href=/home/3, ng-reflect-router-link=/home,3, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=41, name=state41}, target=StateVertexImpl{id=11, name=state11}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Category 3");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'go-to-cart'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Go to cart, attributes={class=btn btn-primary text-center, id=go-to-cart, type=button}}, source=StateVertexImpl{id=15, name=state15}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Go to cart");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'back'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Continue Shopping, attributes={class=btn btn-default, id=back, type=button}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Continue Shopping");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'second-category'], element=Element{node=[A: null], tag=A, text=Category 2, attributes={class=list-group-item, href=/home/2, id=second-category, ng-reflect-href=/home/2, ng-reflect-router-link=/home,2, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=9, name=state9}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Category 2");
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
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'carousel-example-generic']/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=left carousel-control, data-slide=prev, href=#carousel-example-generic}}, source=StateVertexImpl{id=9, name=state9}, target=StateVertexImpl{id=43, name=state43}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(27), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'product-1-2'], element=Element{node=[A: null], tag=A, text=Teal, attributes={id=product-1-2}}, source=StateVertexImpl{id=43, name=state43}, target=StateVertexImpl{id=44, name=state44}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(28), "Event fired: Teal");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=12)
	public void method_26_8_29(){
		testSuiteHelper.newCurrentTestMethod("method_26_8_29");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(41);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(41)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(41)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //A[@id = 'third-category'], element=Element{node=[A: null], tag=A, text=Category 3, attributes={class=list-group-item, href=/home/3, id=third-category, ng-reflect-href=/home/3, ng-reflect-router-link=/home,3, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=41, name=state41}, target=StateVertexImpl{id=11, name=state11}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Category 3");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'product-1-3'], element=Element{node=[A: null], tag=A, text=nps.gov, attributes={id=product-1-3}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: nps.gov");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'back'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Back, attributes={class=btn btn-primary, id=back, type=button}}, source=StateVertexImpl{id=15, name=state15}, target=StateVertexImpl{id=46, name=state46}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(29), "Event fired: Back");
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

	@Test(priority=13)
	public void method_26_8_9_10_23_30(){
		testSuiteHelper.newCurrentTestMethod("method_26_8_9_10_23_30");
		List<FormInput> formInputs;
		
		boolean allStatesIdentical = true;
		
		testSuiteHelper.addStateToReportBuilder(41);

		if (assertionMode == StateEquivalenceAssertionMode.DOM || assertionMode == StateEquivalenceAssertionMode.ALL) {
			    allStatesIdentical = testSuiteHelper.compareCurrentDomWithState(41)
									&& allStatesIdentical;
		}

		if (assertionMode == StateEquivalenceAssertionMode.VISUAL || assertionMode == StateEquivalenceAssertionMode.ALL) {
		    allStatesIdentical = testSuiteHelper.compareCurrentScreenshotWithState(41)
				&& allStatesIdentical;
		}
		try {
			/* Eventable{eventType=click, identification=xpath //A[@id = 'third-category'], element=Element{node=[A: null], tag=A, text=Category 3, attributes={class=list-group-item, href=/home/3, id=third-category, ng-reflect-href=/home/3, ng-reflect-router-link=/home,3, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=41, name=state41}, target=StateVertexImpl{id=11, name=state11}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(26), "Event fired: Category 3");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'product-1-3'], element=Element{node=[A: null], tag=A, text=nps.gov, attributes={id=product-1-3}}, source=StateVertexImpl{id=11, name=state11}, target=StateVertexImpl{id=15, name=state15}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(8), "Event fired: nps.gov");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'add'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Add to cart, attributes={class=btn btn-success pull-right, id=add, type=button}}, source=StateVertexImpl{id=15, name=state15}, target=StateVertexImpl{id=16, name=state16}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(9), "Event fired: Add to cart");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'go-to-cart'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Go to cart, attributes={class=btn btn-primary text-center, id=go-to-cart, type=button}}, source=StateVertexImpl{id=16, name=state16}, target=StateVertexImpl{id=17, name=state17}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(10), "Event fired: Go to cart");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'checkout'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Checkout, attributes={class=btn btn-success, id=checkout, type=button}}, source=StateVertexImpl{id=17, name=state17}, target=StateVertexImpl{id=39, name=state39}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(23), "Event fired: Checkout");
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
			
			/* Eventable{eventType=click, identification=xpath /HTML[1]/BODY[1]/MODAL-OVERLAY[1]/BS-MODAL-CONTAINER[1]/DIV[1]/DIV[1]/MODAL-CONTENT[1]/MODAL-FOOTER[1]/DIV[1]/BUTTON[1], element=Element{node=[BUTTON: null], tag=BUTTON, text=OK, attributes={class=btn btn-primary, ng-reflect-ng-class=btn btn-primary}}, source=StateVertexImpl{id=39, name=state39}, target=StateVertexImpl{id=48, name=state48}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(30), "Event fired: OK");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=14)
	public void method_32_20_3_5_33_34(){
		testSuiteHelper.newCurrentTestMethod("method_32_20_3_5_33_34");
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
			/* Eventable{eventType=click, identification=xpath //A[@id = 'third-category'], element=Element{node=[A: null], tag=A, text=Category 3, attributes={class=list-group-item, href=/home/3, id=third-category, ng-reflect-href=/home/3, ng-reflect-router-link=/home,3, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=49, name=state49}, target=StateVertexImpl{id=11, name=state11}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(32), "Event fired: Category 3");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'go-to-cart'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Go to cart, attributes={class=btn btn-primary text-center, id=go-to-cart, type=button}}, source=StateVertexImpl{id=15, name=state15}, target=StateVertexImpl{id=4, name=state4}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(20), "Event fired: Go to cart");
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
			
			/* Eventable{eventType=click, identification=xpath //BUTTON[@id = 'back'], element=Element{node=[BUTTON: null], tag=BUTTON, text=Continue Shopping, attributes={class=btn btn-default, id=back, type=button}}, source=StateVertexImpl{id=4, name=state4}, target=StateVertexImpl{id=0, name=index}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(3), "Event fired: Continue Shopping");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'second-category'], element=Element{node=[A: null], tag=A, text=Category 2, attributes={class=list-group-item, href=/home/2, id=second-category, ng-reflect-href=/home/2, ng-reflect-router-link=/home,2, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=0, name=index}, target=StateVertexImpl{id=9, name=state9}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(5), "Event fired: Category 2");
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
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'carousel-example-generic']/A[2], element=Element{node=[A: null], tag=A, text=, attributes={class=right carousel-control, data-slide=next, href=#carousel-example-generic}}, source=StateVertexImpl{id=9, name=state9}, target=StateVertexImpl{id=51, name=state51}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'product-2-2'], element=Element{node=[A: null], tag=A, text=Blue, attributes={id=product-2-2}}, source=StateVertexImpl{id=51, name=state51}, target=StateVertexImpl{id=52, name=state52}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(34), "Event fired: Blue");
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

	@Test(priority=15)
	public void method_31_27_35(){
		testSuiteHelper.newCurrentTestMethod("method_31_27_35");
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
			/* Eventable{eventType=click, identification=xpath //A[@id = 'second-category'], element=Element{node=[A: null], tag=A, text=Category 2, attributes={class=list-group-item, href=/home/2, id=second-category, ng-reflect-href=/home/2, ng-reflect-router-link=/home,2, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=49, name=state49}, target=StateVertexImpl{id=9, name=state9}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: Category 2");
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
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'carousel-example-generic']/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=left carousel-control, data-slide=prev, href=#carousel-example-generic}}, source=StateVertexImpl{id=9, name=state9}, target=StateVertexImpl{id=43, name=state43}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(27), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'product-2-2'], element=Element{node=[A: null], tag=A, text=Blue, attributes={id=product-2-2}}, source=StateVertexImpl{id=43, name=state43}, target=StateVertexImpl{id=52, name=state52}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(35), "Event fired: Blue");
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

	@Test(priority=16)
	public void method_31_36(){
		testSuiteHelper.newCurrentTestMethod("method_31_36");
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
			/* Eventable{eventType=click, identification=xpath //A[@id = 'second-category'], element=Element{node=[A: null], tag=A, text=Category 2, attributes={class=list-group-item, href=/home/2, id=second-category, ng-reflect-href=/home/2, ng-reflect-router-link=/home,2, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=49, name=state49}, target=StateVertexImpl{id=9, name=state9}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: Category 2");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'product-1-2'], element=Element{node=[A: null], tag=A, text=Teal, attributes={id=product-1-2}}, source=StateVertexImpl{id=9, name=state9}, target=StateVertexImpl{id=56, name=state56}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(36), "Event fired: Teal");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=17)
	public void method_31_33_37(){
		testSuiteHelper.newCurrentTestMethod("method_31_33_37");
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
			/* Eventable{eventType=click, identification=xpath //A[@id = 'second-category'], element=Element{node=[A: null], tag=A, text=Category 2, attributes={class=list-group-item, href=/home/2, id=second-category, ng-reflect-href=/home/2, ng-reflect-router-link=/home,2, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=49, name=state49}, target=StateVertexImpl{id=9, name=state9}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: Category 2");
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
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'carousel-example-generic']/A[2], element=Element{node=[A: null], tag=A, text=, attributes={class=right carousel-control, data-slide=next, href=#carousel-example-generic}}, source=StateVertexImpl{id=9, name=state9}, target=StateVertexImpl{id=51, name=state51}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(33), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'product-3-2'], element=Element{node=[A: null], tag=A, text=Mauv, attributes={id=product-3-2}}, source=StateVertexImpl{id=51, name=state51}, target=StateVertexImpl{id=58, name=state58}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(37), "Event fired: Mauv");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=18)
	public void method_31_27_38(){
		testSuiteHelper.newCurrentTestMethod("method_31_27_38");
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
			/* Eventable{eventType=click, identification=xpath //A[@id = 'second-category'], element=Element{node=[A: null], tag=A, text=Category 2, attributes={class=list-group-item, href=/home/2, id=second-category, ng-reflect-href=/home/2, ng-reflect-router-link=/home,2, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=49, name=state49}, target=StateVertexImpl{id=9, name=state9}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: Category 2");
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
			
			/* Eventable{eventType=click, identification=xpath //DIV[@id = 'carousel-example-generic']/A[1], element=Element{node=[A: null], tag=A, text=, attributes={class=left carousel-control, data-slide=prev, href=#carousel-example-generic}}, source=StateVertexImpl{id=9, name=state9}, target=StateVertexImpl{id=43, name=state43}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(27), "Event fired: ");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'product-3-2'], element=Element{node=[A: null], tag=A, text=Mauv, attributes={id=product-3-2}}, source=StateVertexImpl{id=43, name=state43}, target=StateVertexImpl{id=58, name=state58}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(38), "Event fired: Mauv");
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
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		if(!allStatesIdentical) {
			Assert.fail("At least one state is different.");
		}
	}

	@Test(priority=19)
	public void method_31_39(){
		testSuiteHelper.newCurrentTestMethod("method_31_39");
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
			/* Eventable{eventType=click, identification=xpath //A[@id = 'second-category'], element=Element{node=[A: null], tag=A, text=Category 2, attributes={class=list-group-item, href=/home/2, id=second-category, ng-reflect-href=/home/2, ng-reflect-router-link=/home,2, ng-reflect-router-link-active=active, routerlinkactive=active}}, source=StateVertexImpl{id=49, name=state49}, target=StateVertexImpl{id=9, name=state9}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(31), "Event fired: Category 2");
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
			
			/* Eventable{eventType=click, identification=xpath //A[@id = 'product-2-2'], element=Element{node=[A: null], tag=A, text=Blue, attributes={id=product-2-2}}, source=StateVertexImpl{id=9, name=state9}, target=StateVertexImpl{id=52, name=state52}} */
			Assert.assertTrue(testSuiteHelper.fireEvent(39), "Event fired: Blue");
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


}	 
