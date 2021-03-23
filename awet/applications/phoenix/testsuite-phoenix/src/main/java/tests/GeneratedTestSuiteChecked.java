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
		Thread.sleep(1000);
	}

	@Test()
	public void test0() throws Exception {
		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_first_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_first_name")).sendKeys("nad\'r");
		Thread.sleep(3000);

		driver.findElement(By.id("user_last_name")).sendKeys("yuceer");
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).sendKeys(
				"nadır.yuceer@gmaıl.com");
		Thread.sleep(3000);

		driver.findElement(By.id("user_password")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_password")).sendKeys("asdasd");
		Thread.sleep(3000);

		driver.findElement(By.id("user_password_confirmation")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_password_confirmation")).sendKeys(
				"asdasd");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).sendKeys(
				"nadır.yuceer@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).sendKeys(
				"nadir.yuceer@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".inner")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("board_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("board_name")).sendKeys("New");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".inner")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("list_name")).sendKeys("bakkaldan alınacak");
		Thread.sleep(3000);

		driver.findElement(By.id("list_name")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		driver.findElement(By.linkText("Add a new card...")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("card_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("card_name")).sendKeys(
				"Peyn\'r\\nEkmek\\nZeyt\'n");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Add a new card...")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("card_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".canvas")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".add-new > .inner")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("list_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".canvas")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".add-new > .inner")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("list_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("list_name")).sendKeys("Bugün yapılacaklar");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#list_86 .add-new")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("card_name")).sendKeys(
				"Su doldurmaya g\'t\\nAlışver\'ş merkez\'ne uğra\\n");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("span:nth-child(3)")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("span:nth-child(3)")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("span:nth-child(3)")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("span:nth-child(3)")).click();
		Thread.sleep(3000);

		{
			WebElement element = driver.findElement(By
					.cssSelector("span:nth-child(3)"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.doubleClick(element).perform();
			Thread.sleep(3000);

		}
		driver.findElement(By.cssSelector("span:nth-child(3)")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("span:nth-child(3)")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".connected > .react-gravatar"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("li > .add-new")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("crawljax_member_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("crawljax_member_email")).sendKeys("a");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("crawljax_member_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("crawljax_member_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("cancel")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#list_86 h4")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("cancel")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#list_86 > .inner")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#card_32 > .card-content")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".fa-close")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("h3")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#card_32 > .card-content")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".button:nth-child(3) > span"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".red")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".items-wrapper")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".button:nth-child(2) > span"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".close:nth-child(2) > .fa")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("textarea")).click();
	}

	@Test()
	public void test1() throws Exception {
		driver.findElement(By.cssSelector("#\\31 1-new > .inner")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#boards_nav span")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("View all boards")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("add_new_board")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".boards-wrapper")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("span:nth-child(3)")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#crawler-sign-out > span")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_password")).click();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}

}