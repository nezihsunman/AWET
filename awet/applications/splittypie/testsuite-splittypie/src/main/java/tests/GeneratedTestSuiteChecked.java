package tests;

import java.util.*;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import utils.DriverProvider;
import utils.Properties;
import utils.BasePageObject;

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

public class GeneratedTestSuiteChecked {

	private static WebDriver driver;
	private static BasePageObject basePageObject;

	@BeforeClass
	public static void oneTimeSetUp() throws Exception {
		driver = DriverProvider.getInstance().getDriver();
		driver.get(Properties.app_url);
		basePageObject = new BasePageObject(driver);
	}

	@Before
	public void setUp() throws Exception {
		driver.get(Properties.app_url);
		Thread.sleep(2000);
	}

	@Test()
	public void test0() throws Exception {
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

	@Test()
	public void test1() throws Exception {
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

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}

}