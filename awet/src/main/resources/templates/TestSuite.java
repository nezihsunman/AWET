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

public class {{test_suite_name}} {

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
        {% if application_name != "ecommerce" %}
            driver.get(Properties.app_url);
        {% endif %}
        Thread.sleep({{wait_time_after_reload}});
    }

    {% for test_name in test_names %}
    @Test()
    public void {{test_name}}() throws Exception {
        {% for statement in map_statements.get(test_name) %}
            {{statement}}

        {% endfor %}
    }

    {% endfor %}


    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }

}
