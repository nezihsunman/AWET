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

public class GeneratedTestSuiteFired {

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
		Thread.sleep(2500);
	}

	@Test()
	public void test0() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(1000);
		driver.findElement(By.id("demo_signup")).click();
		Thread.sleep(9000);
		driver.findElement(By.cssSelector(".popover-navigation > .btn"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#add_wallet_button > span")).click();
		Thread.sleep(1000);
		{
			WebElement element = driver.findElement(By
					.cssSelector("#add_wallet_button > span"));
			Thread.sleep(1000);
			Actions builder = new Actions(driver);
			Thread.sleep(1000);
			builder.moveToElement(element).perform();
			Thread.sleep(1000);
		}
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Thread.sleep(1000);
			Actions builder = new Actions(driver);
			Thread.sleep(1000);
			builder.moveToElement(element, 0, 0).perform();
			Thread.sleep(1000);
		}
		driver.findElement(By.id("input_name")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("input_name")).sendKeys("Arkados");
		Thread.sleep(1000);
		driver.findElement(By.id("add_wallet_modal_form_submit")).click();
		Thread.sleep(1000);
		driver.findElement(
				By.cssSelector(".list-group-item:nth-child(3) .item_button_edit > span:nth-child(2)"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".pull-left")).click();
		Thread.sleep(1000);
		driver.findElement(
				By.cssSelector(".list-group-item:nth-child(3) strong")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".btn-group > .btn:nth-child(2)"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#add_profit_button > span")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("input_amount")).sendKeys("10000");
		Thread.sleep(1000);
		driver.findElement(By.id("input_description")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("input_description")).sendKeys(
				"Expected salary");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".btn-primary:nth-child(1)")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add_transaction_text")).click();
		Thread.sleep(1000);
	}

	@Test()
	public void test1() throws Exception {
		driver.get("http://localhost:3000//wallets");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Wallets")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Goals")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("button_create_new")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("input_name")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("input_name")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("input_name")).sendKeys("heıst");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".row:nth-child(3) .panel-body"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sample Cash Wallet")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#button_step1_next > span")).click();
		Thread.sleep(1000);
		driver.findElement(
				By.cssSelector("tr:nth-child(4) > .day:nth-child(5)")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("input_goal_balance")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("input_goal_balance")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("input_goal_balance")).sendKeys("10000");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#button_step2_save > span")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Contact")).click();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}

}