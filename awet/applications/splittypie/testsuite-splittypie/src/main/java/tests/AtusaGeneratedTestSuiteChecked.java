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

public class AtusaGeneratedTestSuiteChecked {

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
		Thread.sleep(4000);
	}

	@Test
	public void test00() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).sendKeys("Euro (EUR)");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).sendKeys("MaVcOAkY");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).sendKeys("PsBROusy");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).sendKeys("QACzjkDb");
			} else {
				throw new RuntimeException("Input element not found");
			}
			elements1.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test01() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).sendKeys("MWerTqrB");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).sendKeys("xOecSHlV");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).sendKeys("XWSutkTq");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).sendKeys("Euro (EUR)");
			} else {
				throw new RuntimeException("Input element not found");
			}
			elements1.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[2]"));
		if (elements4.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
			} else {
				throw new RuntimeException("Input element not found");
			}
			elements4.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements5 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements5.size() > 0) {
			elements5.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test02() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).sendKeys("rIELzoeB");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).sendKeys("GMTRubvo");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).sendKeys("DNlXLjYe");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).sendKeys("Euro (EUR)");
			} else {
				throw new RuntimeException("Input element not found");
			}
			elements1.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test03() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).sendKeys("Euro (EUR)");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).sendKeys("kUEiIJLQ");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).sendKeys("cxrRyfAv");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).sendKeys("RMgVOjqp");
			} else {
				throw new RuntimeException("Input element not found");
			}
			elements1.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test04() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).sendKeys("MWerTqrB");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).sendKeys("xOecSHlV");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).sendKeys("XWSutkTq");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).sendKeys("Euro (EUR)");
			} else {
				throw new RuntimeException("Input element not found");
			}
			elements1.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test05() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).sendKeys("MWerTqrB");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).sendKeys("xOecSHlV");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).sendKeys("XWSutkTq");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).sendKeys("Euro (EUR)");
			} else {
				throw new RuntimeException("Input element not found");
			}
			elements1.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements4 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements4.size() > 0) {
			elements4.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test06() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).sendKeys("Euro (EUR)");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).sendKeys("kUEiIJLQ");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).sendKeys("cxrRyfAv");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).sendKeys("RMgVOjqp");
			} else {
				throw new RuntimeException("Input element not found");
			}
			elements1.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[2]/A[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test07() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).sendKeys("Euro (EUR)");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).sendKeys("SHSnBvIC");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).sendKeys("WzxFilIx");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).sendKeys("cYQLPBlH");
			} else {
				throw new RuntimeException("Input element not found");
			}
			elements1.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/UL[1]/LI[1]/A[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test08() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).sendKeys("rIELzoeB");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).sendKeys("GMTRubvo");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).sendKeys("DNlXLjYe");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).sendKeys("Euro (EUR)");
			} else {
				throw new RuntimeException("Input element not found");
			}
			elements1.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test09() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).sendKeys("rIELzoeB");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).sendKeys("GMTRubvo");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).sendKeys("DNlXLjYe");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).sendKeys("Euro (EUR)");
			} else {
				throw new RuntimeException("Input element not found");
			}
			elements1.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test10() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).sendKeys("rIELzoeB");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).sendKeys("GMTRubvo");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).sendKeys("DNlXLjYe");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).sendKeys("Euro (EUR)");
			} else {
				throw new RuntimeException("Input element not found");
			}
			elements1.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[4]/A[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/BUTTON[1]"));
		if (elements3.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[4]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).sendKeys("03/24 40 Museum Tickets");
			} else {
				throw new RuntimeException("Input element not found");
			}
			elements3.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@Test
	public void test11() throws Exception {
		List<WebElement> elements0 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/NAV[1]/DIV[1]/DIV[2]/UL[1]/LI[4]/A[1]"));
		if (elements0.size() > 0) {
			elements0.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements1 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[2]/BUTTON[1]"));
		if (elements1.size() > 0) {
			List<WebElement> inputElements0 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements0.size() > 0) {
				inputElements0.get(0).sendKeys("MWerTqrB");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements1 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[1]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements1.size() > 0) {
				inputElements1.get(0).sendKeys("xOecSHlV");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements2 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[3]/UL[1]/LI[2]/DIV[1]/DIV[1]/INPUT[1]"));
			if (inputElements2.size() > 0) {
				inputElements2.get(0).sendKeys("XWSutkTq");
			} else {
				throw new RuntimeException("Input element not found");
			}
			List<WebElement> inputElements3 = driver
					.findElements(By
							.xpath("/HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[1]/FORM[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/SELECT[1]"));
			if (inputElements3.size() > 0) {
				inputElements3.get(0).sendKeys("Euro (EUR)");
			} else {
				throw new RuntimeException("Input element not found");
			}
			elements1.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements2 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/BUTTON[1]"));
		if (elements2.size() > 0) {
			elements2.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
		List<WebElement> elements3 = driver
				.findElements(By
						.xpath(" /HTML[1]/BODY[1]/DIV[1]/DIV[3]/MAIN[1]/DIV[1]/DIV[2]/DIV[1]/DIV[2]/BUTTON[1]"));
		if (elements3.size() > 0) {
			elements3.get(0).click();
			Thread.sleep(3000);
		} else {
			throw new RuntimeException("Clickable element not found");
		}
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}

}