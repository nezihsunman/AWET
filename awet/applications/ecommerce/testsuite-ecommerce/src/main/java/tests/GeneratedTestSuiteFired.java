package tests;

import java.util.concurrent.TimeUnit;
import java.util.List;

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
		Thread.sleep(250);
	}

	@Test()
	public void test00() throws Exception {
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

	@Test()
	public void test01() throws Exception {
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

	@Test()
	public void test02() throws Exception {
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

	@Test()
	public void test03() throws Exception {
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'product-3-1']")).click();
	}

	@Test()
	public void test04() throws Exception {
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

	@Test()
	public void test05() throws Exception {
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'third-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-3-3']")).click();
	}

	@Test()
	public void test06() throws Exception {
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'third-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-1-3']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'go-to-cart']")).click();
	}

	@Test()
	public void test07() throws Exception {
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

	@Test()
	public void test08() throws Exception {
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

	@Test()
	public void test09() throws Exception {
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

	@Test()
	public void test10() throws Exception {
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'third-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-1-3']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//BUTTON[@id = 'back']")).click();
	}

	@Test()
	public void test11() throws Exception {
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

	@Test()
	public void test12() throws Exception {
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

	@Test()
	public void test13() throws Exception {
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

	@Test()
	public void test14() throws Exception {
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'second-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-1-2']")).click();
	}

	@Test()
	public void test15() throws Exception {
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

	@Test()
	public void test16() throws Exception {
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

	@Test()
	public void test17() throws Exception {
		driver.findElement(By.xpath("//a[@id=\"home\"]")).click();
		Thread.sleep(250);
		driver.findElement(By.xpath("//A[@id = 'second-category']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//A[@id = 'product-2-2']")).click();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}

}