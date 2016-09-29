package Context;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// TODO adapt the Driver initialization depending on the project needs
// Case 1: Implement driver as thread safe singleton
// Case 2: Initialize driver on scoped step calls before features (or scenarios)
public class DriverContext {
    private static boolean initialized = false;

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        if (!initialized) {
            // initializes the driver
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            initialized = true;
        }
    }

    @After
    public void tearDown() throws Exception {
        if (initialized) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}