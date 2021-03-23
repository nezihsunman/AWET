package tests;

import java.util.*;

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
import org.junit.Assert.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GeneratedTestSuiteCheckedCoverage {

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
		driver.get(Properties.app_url);
		Thread.sleep(2000);
	}

	@Test
	public void test0() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test0");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[2]/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input")).sendKeys("Go to Nevşehir");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".event-currency")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("option:nth-child(2)")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//li/div/div/input")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//li/div/div/input")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//li/div/div/input")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//li/div/div/input")).sendKeys("Nadir");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//li[2]/div/div/input")).sendKeys("Ahmet");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn-primary")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("ember897")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("ember897")).sendKeys("Mehmet");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("main > .container")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn-success")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn-success")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".alert")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".alert")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#ember1229 > a")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#ember1228 > a")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#ember1411 .label")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#ember1412 .label")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("ember1227")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn-success")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("dropDownUsers")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Ahmet")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("dropDownUsers")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Nadir")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#ember1546 > a")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn-primary > .icon")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("ember1675")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("ember1675")).sendKeys("3 bus ticket");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".transaction-list-item-description"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".transaction-list-item-amount > strong"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".transaction-list-item-description"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.id("ember1675")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("ember1675")).sendKeys("16 bus ticket");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn-add")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#ember1545 > a")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#ember2117 .label")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#ember2117 .label")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#ember2117 .label")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#ember2117 .label")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("dropDownUsers")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("dropDownUsers")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("dropDownEvents")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("dropDownEvents")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#ember663 g:nth-child(1) > path"))
				.click();
	}

	@Test
	public void test1() throws Exception {
		codeCoverage.setTestCaseNameBeingExecuted("test1");
		driver.get(Properties.app_url);
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(2560, 1440));
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#ember760 g:nth-child(1) > path"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn-default path")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn-primary:nth-child(2)")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Features")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Source")).click();
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