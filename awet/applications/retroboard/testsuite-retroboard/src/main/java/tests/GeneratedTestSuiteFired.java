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
		Thread.sleep(1000);
	}

	@Test()
	public void test0() throws Exception {
		driver.findElement(
				By.cssSelector(".theme__withIcon___f6YT1 > .theme__inputElement___27dyY"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".theme__filled___1UI7Z")).sendKeys(
				"Nadir");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".theme__dropdown___co-4M")).click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".theme__selected___2Uc3r div:nth-child(2)"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".theme__templateValue___3if5o div:nth-child(2)"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".theme__selected___2Uc3r div:nth-child(2)"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".theme__button___1iKuo")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("1")).click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".theme__templateValue___3if5o strong")).click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".theme__selected___2Uc3r div:nth-child(2)"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.id("0")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".theme__button___1iKuo")).click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".PostBoard__column___2nAoB:nth-child(1) .theme__inputElement___27dyY"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".theme__filled___1UI7Z")).sendKeys(
				"Deadlinea yeti??tik");
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".PostBoard__column___2nAoB:nth-child(2) .theme__inputElement___27dyY"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".PostBoard__column___2nAoB:nth-child(2) .theme__inputElement___27dyY"))
				.sendKeys("??ok basit oldu.");
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".PostBoard__column___2nAoB:nth-child(3) .theme__inputElement___27dyY"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".PostBoard__column___2nAoB:nth-child(3) .theme__inputElement___27dyY"))
				.sendKeys("Planl?? ??al??????n.");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".SessionName__editIcon___AOR2M"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".SessionName__edit___2Unj- .theme__inputElement___27dyY"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".SessionName__edit___2Unj- .theme__inputElement___27dyY"))
				.sendKeys("Last Retro");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("body")).click();
		Thread.sleep(3000);

		driver.findElement(
				By.cssSelector(".PostBoard__column___2nAoB:nth-child(1) .theme__inputElement___27dyY"))
				.click();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}

}