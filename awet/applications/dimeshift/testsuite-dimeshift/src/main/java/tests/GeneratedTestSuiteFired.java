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
	public void test00() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[3]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[8]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("current_password_input")).clear();
		driver.findElement(By.id("current_password_input")).sendKeys("123456");
		driver.findElement(By.id("new_password_input")).clear();
		driver.findElement(By.id("new_password_input")).sendKeys("789456");
		driver.findElement(By.id("new_password_repeat_input")).clear();
		driver.findElement(By.id("new_password_repeat_input")).sendKeys("789");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[9]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[2]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[2]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[2]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[2]/DIV[1]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("/HTML[1]/BODY/DIV[2]/DIV[1]/BUTTON[2]"))
				.click();
	}

	@Test()
	public void test01() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[3]/A[1]"))
				.click();
	}

	@Test()
	public void test02() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"))
				.click();
	}

	@Test()
	public void test03() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[4]/A[1]"))
				.click();
	}

	@Test()
	public void test04() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[7]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"))
				.click();
	}

	@Test()
	public void test05() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
	}

	@Test()
	public void test06() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[6]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/P[1]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[3]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
	}

	@Test()
	public void test07() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/A[1]"))
				.click();
	}

	@Test()
	public void test08() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(By.id("input_login")).clear();
		driver.findElement(By.id("input_login")).sendKeys("Yigit");
		driver.findElement(By.id("input_email")).clear();
		driver.findElement(By.id("input_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		driver.findElement(By.id("input_password")).clear();
		driver.findElement(By.id("input_password")).sendKeys("123456789");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[5]/INPUT[1]"))
				.click();
	}

	@Test()
	public void test09() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
	}

	@Test()
	public void test10() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
	}

	@Test()
	public void test11() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
	}

	@Test()
	public void test12() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1]"))
				.click();
	}

	@Test()
	public void test13() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
	}

	@Test()
	public void test14() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_goal_balance")).clear();
		driver.findElement(By.id("input_goal_balance")).sendKeys("7");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
	}

	@Test()
	public void test15() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[2]/DIV[2]/UL[1]/LI[3]/A[1]"))
				.click();
	}

	@Test()
	public void test16() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
	}

	@Test()
	public void test17() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[3]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[3]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[3]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
	}

	@Test()
	public void test18() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
	}

	@Test()
	public void test19() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_goal_balance")).clear();
		driver.findElement(By.id("input_goal_balance")).sendKeys("7");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/DIV[1]/A[1]"))
				.click();
	}

	@Test()
	public void test20() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/H3[1]/SPAN[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
	}

	@Test()
	public void test21() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[23]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[3]/DIV[1]/A[1]"))
				.click();
	}

	@Test()
	public void test22() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[3]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/UL[1]/LI[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[1]/DIV[1]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_name")).clear();
		driver.findElement(By.id("input_name")).sendKeys("BigPlan");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/A[3]"))
				.click();
	}

	@Test()
	public void test23() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[3]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/H3[1]/SPAN[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test()
	public void test24() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[1]"))
				.click();
	}

	@Test()
	public void test25() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[2]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
	}

	@Test()
	public void test26() throws Exception {
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[1]/DIV[1]/DIV[2]/UL[1]/LI[10]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[2]/BUTTON[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/DIV[1]/INPUT[2]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.get("http://localhost:3000");
		Thread.sleep(2500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(By.id("input_amount")).clear();
		driver.findElement(By.id("input_amount")).sendKeys("1500");
		driver.findElement(By.id("input_description")).clear();
		driver.findElement(By.id("input_description")).sendKeys("nezih");
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[3]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/FORM[1]/FIELDSET[1]/DIV[4]/INPUT[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[21]/BUTTON[1]"))
				.click();
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/HTML[1]/BODY/DIV[1]/DIV[2]/DIV[2]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1]"))
				.click();
	}

	@Test()
	public void test27() throws Exception {
		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(.,\'Create new account\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_first_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_first_name")).sendKeys("Yigit");
		Thread.sleep(3000);

		driver.findElement(By.id("user_last_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_last_name")).sendKeys("Soydan");
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.id("user_password")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_password")).sendKeys("123456");
		Thread.sleep(3000);

		driver.findElement(By.id("user_password_confirmation")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_password_confirmation")).sendKeys(
				"123456");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Sign up\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(.,\' Boards\')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(.,\' Boards\')]")).click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/header/a/span"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(.,\'Yigit Soydan\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/header/nav[2]/ul/li/a/img"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.id("add_new_board")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("board_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("board_name")).sendKeys("my_board");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Create board\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div/div/div/div/div"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.id("list_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("list_name")).sendKeys("my_list");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Save list\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div/div/div/div[2]/div"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.id("list_name")).sendKeys("my_second_list");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Save list\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@id=\'list_86\']/div")).click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div/div/div/div[3]/div"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.id("list_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("list_name")).sendKeys("my_second_list");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(.,\'cancel\')]")).click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("(//a[contains(text(),\'Add a new card...\')])[2]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.id("card_name")).sendKeys("hey");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Add\')]")).click();
		Thread.sleep(3000);

		{
			WebElement element = driver.findElement(By
					.xpath("//button[contains(.,\'Add\')]"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.moveToElement(element).perform();
			Thread.sleep(3000);

		}
		driver.findElement(
				By.xpath("(//a[contains(text(),\'Add a new card...\')])[2]"))
				.click();
		Thread.sleep(3000);

		{
			WebElement element = driver.findElement(By
					.xpath("(//a[contains(text(),\'Add a new card...\')])[2]"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.moveToElement(element).perform();
			Thread.sleep(3000);

		}
		driver.findElement(By.id("card_name")).sendKeys("hello");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(.,\'cancel\')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(.,\'Add a new card...\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.id("card_name")).sendKeys("first");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Add\')]")).click();
		Thread.sleep(3000);

		{
			WebElement element = driver.findElement(By
					.xpath("//button[contains(.,\'Add\')]"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.moveToElement(element).perform();
			Thread.sleep(3000);

		}
		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div/div"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/header/ul/span/li[2]/a/i"))
				.click();
		Thread.sleep(3000);

		{
			WebElement element = driver
					.findElement(By
							.xpath("//div[@id=\'authentication_container\']/div/div/header/ul/span/li[2]/a/i"));
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
		driver.findElement(By.id("crawljax_member_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("crawljax_member_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("crawljax_member_email")).sendKeys(
				"nezih123456789@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Add member\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(.,\'cancel\')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(.,\' Sign out\')]")).click();
	}

	@Test()
	public void test28() throws Exception {
		driver.findElement(By.xpath("//footer[@id=\'main_footer\']/small"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//footer[@id=\'main_footer\']/small"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(.,\'Diacode\')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(.,\'@bigardone\')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Sign in\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(.,\'John Doe\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@id=\'7-phoenix-board\']/div"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//footer[contains(.,\' 1\')]")).click();
		Thread.sleep(3000);

		{
			WebElement element = driver.findElement(By
					.xpath("//a[contains(.,\'Add a new card...\')]"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.moveToElement(element).perform();
			Thread.sleep(3000);

		}
		driver.findElement(By.xpath("//span[contains(.,\' Members\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/ul/li/a/span"))
				.click();
		Thread.sleep(3000);

		{
			WebElement element = driver
					.findElement(By
							.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/ul/li/a"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.moveToElement(element).perform();
			Thread.sleep(3000);

		}
		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/ul/li/a/i"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/header/a/i"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/a[2]"))
				.click();
		Thread.sleep(3000);

		{
			WebElement element = driver
					.findElement(By
							.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/a[2]"));
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
		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/ul/li/a"))
				.click();
		Thread.sleep(3000);

		{
			WebElement element = driver
					.findElement(By
							.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/ul/li/a"));
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
		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/ul/li[2]/a"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/ul/li[3]/a"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/ul/li[4]/a"))
				.click();
		Thread.sleep(3000);

		{
			WebElement element = driver
					.findElement(By
							.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/ul/li[4]/a"));
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
		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/ul/li[5]/a"))
				.click();
		Thread.sleep(3000);

		{
			WebElement element = driver
					.findElement(By
							.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/ul/li[5]/a"));
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
		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/ul/li[6]/a"))
				.click();
		Thread.sleep(3000);

		{
			WebElement element = driver
					.findElement(By
							.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/ul/li[6]/a"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.moveToElement(element).perform();
			Thread.sleep(3000);

		}
		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/ul/li[6]/a"))
				.click();
		Thread.sleep(3000);

		{
			WebElement element = driver.findElement(By.tagName("body"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.moveToElement(element, 0, 0).perform();
			Thread.sleep(3000);

		}
		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/ul/li[5]/a"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/ul/li[4]/a"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/ul/li[3]/a"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/ul/li[2]/a"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/ul/li/a"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/header/span"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/header/a/i"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div/div/form/div[2]/textarea"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div/div/form/div[2]/textarea"))
				.sendKeys("deneme");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Save comment\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(.,\'Edit\')]")).click();
		Thread.sleep(3000);

		{
			WebElement element = driver.findElement(By
					.xpath("//a[contains(.,\'Edit\')]"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.moveToElement(element).perform();
			Thread.sleep(3000);

		}
		driver.findElement(By.xpath("//input[@value=\'phoenix card\']"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@value=\'phoenix card\']"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div/header/form/input"))
				.sendKeys("my phoenix card");
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div/header/form/textarea"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div/header/form/textarea"))
				.sendKeys("my desc");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Save card\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(.,\'Edit\')]")).click();
		Thread.sleep(3000);

		{
			WebElement element = driver.findElement(By
					.xpath("//a[contains(.,\'Edit\')]"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.moveToElement(element).perform();
			Thread.sleep(3000);

		}
		driver.findElement(By.xpath("//a[contains(.,\'cancel\')]")).click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div/div/form/div[2]/textarea"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div/div/form/div/img"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//h4[contains(.,\'Add comment\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Save comment\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/a[2]/i"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//header[contains(.,\'phoenix list\')]"))
				.click();
		Thread.sleep(3000);

		{
			WebElement element = driver.findElement(By
					.xpath("//a[contains(.,\'Add a new card...\')]"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.moveToElement(element).perform();
			Thread.sleep(3000);

		}
		driver.findElement(By.xpath("//button[contains(.,\'Update list\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(.,\'Add a new card...\')]"))
				.click();
		Thread.sleep(3000);

		{
			WebElement element = driver.findElement(By
					.xpath("//a[contains(.,\'Add a new card...\')]"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.moveToElement(element).perform();
			Thread.sleep(3000);

		}
		driver.findElement(By.id("card_name")).sendKeys("card");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Add\')]")).click();
		Thread.sleep(3000);

		{
			WebElement element = driver.findElement(By
					.xpath("//button[contains(.,\'Add\')]"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.moveToElement(element).perform();
			Thread.sleep(3000);

		}
		driver.findElement(By.xpath("//div[@id=\'card_33\']/div")).click();
		Thread.sleep(3000);

		{
			WebElement element = driver.findElement(By
					.xpath("//a[contains(.,\'Add a new card...\')]"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.moveToElement(element).perform();
			Thread.sleep(3000);

		}
		driver.findElement(By.xpath("//a[contains(.,\'Edit\')]")).click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div/header/form/textarea"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div/header/form/textarea"))
				.sendKeys("hello");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Save card\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(.,\' Members\')]"))
				.click();
		Thread.sleep(3000);

		{
			WebElement element = driver.findElement(By
					.xpath("//span[contains(.,\' Members\')]"));
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
		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/div[2]/div/header/a/i"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div[2]/div/div/a/i"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/header/ul/span/li[2]/a"))
				.click();
		Thread.sleep(3000);

		{
			WebElement element = driver
					.findElement(By
							.xpath("//div[@id=\'authentication_container\']/div/div/header/ul/span/li[2]/a"));
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
		driver.findElement(By.id("crawljax_member_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("crawljax_member_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Add member\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/header/ul/span/li[2]/img"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/header/ul/span/li/img"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(.,\'John Doe\')]"))
				.click();
	}

	@Test()
	public void test29() throws Exception {
		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(.,\'Create new account\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_first_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_first_name")).sendKeys("Yigit");
		Thread.sleep(3000);

		driver.findElement(By.id("user_last_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_last_name")).sendKeys("Soydan");
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_email")).sendKeys(
				"yigitsoydan98@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.id("user_password")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_password")).sendKeys("123456");
		Thread.sleep(3000);

		driver.findElement(By.id("user_password_confirmation")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("user_password_confirmation")).sendKeys(
				"123456");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Sign up\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(.,\' Boards\')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(.,\' Boards\')]")).click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/header/a/span"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(.,\'Yigit Soydan\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/header/nav[2]/ul/li/a/img"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.id("add_new_board")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("board_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("board_name")).sendKeys("my_board");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Create board\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div/div/div/div/div"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.id("list_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("list_name")).sendKeys("my_list");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Save list\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div/div/div/div[2]/div"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.id("list_name")).sendKeys("my_second_list");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Save list\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@id=\'list_86\']/div")).click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div/div/div/div[3]/div"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.id("list_name")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("list_name")).sendKeys("my_second_list");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(.,\'cancel\')]")).click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("(//a[contains(text(),\'Add a new card...\')])[2]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.id("card_name")).sendKeys("hey");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Add\')]")).click();
		Thread.sleep(3000);

		{
			WebElement element = driver.findElement(By
					.xpath("//button[contains(.,\'Add\')]"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.moveToElement(element).perform();
			Thread.sleep(3000);

		}
		driver.findElement(
				By.xpath("(//a[contains(text(),\'Add a new card...\')])[2]"))
				.click();
		Thread.sleep(3000);

		{
			WebElement element = driver.findElement(By
					.xpath("(//a[contains(text(),\'Add a new card...\')])[2]"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.moveToElement(element).perform();
			Thread.sleep(3000);

		}
		driver.findElement(By.id("card_name")).sendKeys("hello");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(.,\'cancel\')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(.,\'Add a new card...\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.id("card_name")).sendKeys("first");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Add\')]")).click();
		Thread.sleep(3000);

		{
			WebElement element = driver.findElement(By
					.xpath("//button[contains(.,\'Add\')]"));
			Thread.sleep(3000);

			Actions builder = new Actions(driver);
			Thread.sleep(3000);

			builder.moveToElement(element).perform();
			Thread.sleep(3000);

		}
		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/div/div"))
				.click();
		Thread.sleep(3000);

		driver.findElement(
				By.xpath("//div[@id=\'authentication_container\']/div/div/header/ul/span/li[2]/a/i"))
				.click();
		Thread.sleep(3000);

		{
			WebElement element = driver
					.findElement(By
							.xpath("//div[@id=\'authentication_container\']/div/div/header/ul/span/li[2]/a/i"));
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
		driver.findElement(By.id("crawljax_member_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("crawljax_member_email")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("crawljax_member_email")).sendKeys(
				"nezih123456789@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(.,\'Add member\')]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(.,\'cancel\')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(.,\' Sign out\')]")).click();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}

}