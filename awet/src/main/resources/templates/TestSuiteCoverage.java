package tests;

import java.util.*;

import coverage.CodeCoverage;
import io.webfolder.cdp.session.Session;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import utils.BasePageObject;
import utils.DriverProvider;
import utils.Properties;
import utils.SessionProvider;
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
    private static Session session;
    private static CodeCoverage codeCoverage;
    private static BasePageObject basePageObject;

    @BeforeClass
    public static void oneTimeSetUp() throws Exception {
        driver = DriverProvider.getInstance().getDriver();
        session = SessionProvider.getInstance().createSession(driver);
        codeCoverage = new CodeCoverage(session);
        driver.get(Properties.app_url);
        Thread.sleep(2000);
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
    @Test
    public void {{test_name}}() throws Exception {
        codeCoverage.setTestCaseNameBeingExecuted("{{test_name}}");
        {% if application_name != "ecommerce" %}
            driver.get(Properties.app_url);
            Thread.sleep({{wait_time_after_reload}});
        {% endif %}
        {% for statement in map_statements.get(test_name) %}
            {{statement}}

        {% endfor %}
    }

    {% endfor %}


    @After
    public void saveIntermediateReport() throws Exception {
        codeCoverage.saveCoverage(true);
        codeCoverage.resetCoveragePerTest();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        codeCoverage.saveCoverage(false);
        session.close();
        driver.quit();
    }

}
