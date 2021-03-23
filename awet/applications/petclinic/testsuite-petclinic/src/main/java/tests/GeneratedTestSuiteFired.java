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
		Thread.sleep(3000);
	}

	@Test()
	public void test0() throws Exception {
		driver.findElement(
				By.cssSelector(".nav > li:nth-child(1) span:nth-child(2)"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".dropdown:nth-child(2) > .dropdown-toggle"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".open li:nth-child(2) span:nth-child(2)"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.id("firstName")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("firstName")).sendKeys("Ahmet");
		Thread.sleep(3000);

		driver.findElement(By.id("lastName")).sendKeys("Esk\'");
		Thread.sleep(3000);

		driver.findElement(By.id("address")).sendKeys("adres");
		Thread.sleep(3000);

		driver.findElement(By.id("city")).sendKeys("İstanbul");
		Thread.sleep(3000);

		driver.findElement(By.id("telephone")).sendKeys("905055055");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("td:nth-child(3)")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("td:nth-child(3)")).click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".dropdown:nth-child(3) > .dropdown-toggle"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".open li:nth-child(2) span:nth-child(2)"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.id("firstName")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("firstName")).sendKeys("Yen\'");
		Thread.sleep(3000);

		driver.findElement(By.id("lastName")).sendKeys("Doktor");
		Thread.sleep(3000);

		driver.findElement(By.id("specialties")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("specialties")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("specialties")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("specialties")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("specialties")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn:nth-child(3)")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("li:nth-child(4) span:nth-child(2)"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("li:nth-child(5) span:nth-child(2)"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("li:nth-child(4) > a")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("th:nth-child(1)")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".form-group > .form-group")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("name")).sendKeys("Ked\'");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn:nth-child(3)")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("div > .btn:nth-child(2)")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("div > .btn:nth-child(2)")).click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector("app-pettype-list > .container-fluid")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("div > .btn:nth-child(2)")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("name")).sendKeys("Köpek");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn:nth-child(3)")).click();
		Thread.sleep(3000);

	}

	@Test()
	public void test1() throws Exception {
		driver.findElement(
				By.cssSelector(".dropdown:nth-child(3) > .dropdown-toggle"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".open > .dropdown-toggle")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("li:nth-child(5) span:nth-child(2)"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("name")).click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".dropdown:nth-child(2) > .dropdown-toggle"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".open > .dropdown-toggle")).click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".dropdown:nth-child(3) > .dropdown-toggle"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("li:nth-child(4) span:nth-child(2)"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("li:nth-child(5) span:nth-child(2)"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("li:nth-child(4) span:nth-child(2)"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("tr:nth-child(2) .btn:nth-child(2)"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("div > .btn:nth-child(2)")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("name")).sendKeys("Gergedan");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn:nth-child(3)")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("li:nth-child(5) span:nth-child(2)"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("name")).sendKeys("Solunum");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn:nth-child(3)")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("td > .btn:nth-child(1)")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("name")).sendKeys("Kem\'k");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".btn:nth-child(3)")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("td > .btn:nth-child(2)")).click();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}

}