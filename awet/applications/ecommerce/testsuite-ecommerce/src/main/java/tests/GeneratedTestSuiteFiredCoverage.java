package tests;

import java.util.concurrent.TimeUnit;
import java.util.List;

import coverage.CodeCoverage;
import io.webfolder.cdp.session.Session;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import utils.BasePageObject;
import utils.DriverProvider;
import utils.Properties;
import utils.SessionProvider;

public class GeneratedTestSuiteFiredCoverage {

	private static WebDriver driver;
	private static Session session;
	private static CodeCoverage codeCoverage;
	private static BasePageObject basePageObject;

	@BeforeClass
	public static void oneTimeSetUp() throws Exception {
		driver = DriverProvider.getInstance().getDriver();
		session = SessionProvider.getInstance().createSession(driver);
		codeCoverage = new CodeCoverage(session);
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		basePageObject = new BasePageObject(driver);
	}

	@Before
	public void setUp() throws Exception {
		Thread.sleep(250);
	}

	@Test
	public void test00() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test00");
		driver.get("http://localhost:3000");
		Thread.sleep(250);
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'home']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'purchased']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'shop-cart-icon']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'back']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'shop-cart-icon']")).click();
	}

	@Test
	public void test01() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test01");
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'first-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'second-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'first-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'third-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'third-category']")).click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("//DIV[@id = 'carousel-example-generic']/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("//DIV[@id = 'carousel-example-generic']/A[2]"))
				.click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-1-3']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'add']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'go-to-cart']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'remove-product-1-3']"))
				.click();
	}

	@Test
	public void test02() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test02");
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'purchased']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'back']")).click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("//DIV[@id = 'carousel-example-generic']/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("//DIV[@id = 'carousel-example-generic']/A[2]"))
				.click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-1-1']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'back']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-2-1']")).click();
	}

	@Test
	public void test03() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test03");
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'product-3-1']")).click();
	}

	@Test
	public void test04() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test04");
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'second-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'second-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'third-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-2-3']")).click();
	}

	@Test
	public void test05() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test05");
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'third-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-3-3']")).click();
	}

	@Test
	public void test06() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test06");
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'third-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-1-3']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'go-to-cart']")).click();
	}

	@Test
	public void test07() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test07");
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'third-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-1-3']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'add']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'back']")).click();
	}

	@Test
	public void test08() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test08");
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'third-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-1-3']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'add']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'go-to-cart']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'checkout']")).click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MODAL-OVERLAY[1]/BS-MODAL-CONTAINER[1]/DIV[1]/DIV[1]/MODAL-CONTENT[1]/MODAL-TITLE[1]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test09() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test09");
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'second-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'third-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-1-3']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'go-to-cart']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'back']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'second-category']")).click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("//DIV[@id = 'carousel-example-generic']/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-1-2']")).click();
	}

	@Test
	public void test10() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test10");
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'third-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-1-3']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'back']")).click();
	}

	@Test
	public void test11() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test11");
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'third-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-1-3']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'add']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'go-to-cart']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'checkout']")).click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/MODAL-OVERLAY[1]/BS-MODAL-CONTAINER[1]/DIV[1]/DIV[1]/MODAL-CONTENT[1]/MODAL-FOOTER[1]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test
	public void test12() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test12");
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'second-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'third-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-1-3']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'go-to-cart']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'back']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'second-category']")).click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("//DIV[@id = 'carousel-example-generic']/A[2]"))
				.click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-2-2']")).click();
	}

	@Test
	public void test13() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test13");
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'second-category']")).click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("//DIV[@id = 'carousel-example-generic']/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-2-2']")).click();
	}

	@Test
	public void test14() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test14");
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'second-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-1-2']")).click();
	}

	@Test
	public void test15() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test15");
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'second-category']")).click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("//DIV[@id = 'carousel-example-generic']/A[2]"))
				.click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-3-2']")).click();
	}

	@Test
	public void test16() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test16");
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'second-category']")).click();
		Thread.sleep(200);
		driver.findElement(
				By.xpath("//DIV[@id = 'carousel-example-generic']/A[1]"))
				.click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-3-2']")).click();
	}

	@Test
	public void test17() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test17");
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'second-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-2-2']")).click();
	}

	@After
	public void saveIntermediateReport() throws Exception {
		codeCoverage.saveCoverage(true);
		codeCoverage.resetCoveragePerTest();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		codeCoverage.saveCoverage(false);
		session.close();
		driver.quit();
	}

}