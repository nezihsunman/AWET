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
		driver.get("http://localhost:4000/sign_in");
		Thread.sleep(3000);

		driver.findElement(By.id("user_password")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_password")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".view-container > main")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_first_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_first_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_first_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_first_name")).sendKeys("ark");
		Thread.sleep(3000);

		driver.findElement(By.id("user_last_name")).sendKeys("kan");
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).sendKeys("asdfhasd.asd");
		Thread.sleep(3000);

		driver.findElement(By.id("user_password")).sendKeys("123456");
		Thread.sleep(3000);

		driver.findElement(By.id("user_password_confirmation")).sendKeys(
				"123456");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".view-container > main")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).sendKeys("kal.kal");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).sendKeys("kal");
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("user_email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("user_email")).sendKeys("kal@kal.com");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".inner")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("board_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("board_name")).sendKeys("helo");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".inner")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("list_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("list_name")).sendKeys("hello");
		Thread.sleep(3000);

		driver.findElement(By.id("list_name")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".canvas")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Add a new card...")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("card_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("card_name")).sendKeys("to do l\'st");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#boards_nav span")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#crawler-sign-out > span")).click();
	}

	@Test()
	public void test1() throws Exception {
		driver.get("http://localhost:4000/sign_in");
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("user_email")).clear();

		driver.findElement(By.id("user_email")).sendKeys("kal@kal.com");
		Thread.sleep(3000);

		driver.findElement(By.id("user_password")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("user_password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("user_password")).sendKeys("123456");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#boards_nav span")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("View all boards")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#\\31 1-helo > .inner")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Add a new card...")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("card_name")).sendKeys("adım");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("ark kan")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("span:nth-child(3)")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".fa-plus")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("crawljax_member_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("crawljax_member_email")).sendKeys("nez");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("crawljax_member_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("h3")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".logo")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".logo")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".add-new > .inner")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".view-container")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("h4")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".add-new > .inner")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("list_name")).sendKeys("hello2");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);

		{
			WebElement dragged = driver.findElement(By.id("list_86"));
			Thread.sleep(3000);

			WebElement dropped = driver.findElement(By
					.linkText("Add a new card..."));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.dragAndDrop(dragged, dropped).perform();
			Thread.sleep(3000);

		}
		{
			WebElement dragged = driver.findElement(By.id("list_85"));
			Thread.sleep(3000);

			WebElement dropped = driver.findElement(By
					.cssSelector(".lists-wrapper"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.dragAndDrop(dragged, dropped).perform();
			Thread.sleep(3000);

		}
		{
			WebElement dragged = driver.findElement(By.id("list_86"));
			Thread.sleep(3000);

			WebElement dropped = driver.findElement(By.cssSelector(".canvas"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.dragAndDrop(dragged, dropped).perform();
			Thread.sleep(3000);

		}
		driver.findElement(By.cssSelector("#card_32 > .card-content")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Members")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".members-selector > header"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".close:nth-child(2) > .fa")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Tags")).click();
		Thread.sleep(3000);

		{
			WebElement element = driver.findElement(By.linkText("Tags"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.moveToElement(element).perform();
			Thread.sleep(3000);

		}
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.moveToElement(element, 0, 0).perform();
			Thread.sleep(3000);

		}
		driver.findElement(By.cssSelector(".red")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("textarea")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("textarea")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("textarea")).sendKeys("yapılacak");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("cancel")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".md-content")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".md-content")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".fa-close")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#card_31 > .card-content")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".md-content")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".fa-trash-o")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#list_85 .add-new")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("card_name")).sendKeys("asdasdas");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#card_33 > .card-content")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".fa-close")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Add a new card...")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("card_name")).sendKeys("adsadadd");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#card_34 > .card-content")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".fa-close")).click();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}

}