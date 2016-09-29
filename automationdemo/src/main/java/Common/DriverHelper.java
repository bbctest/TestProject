package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverHelper {
    public static WebElement waitForElement(WebDriver driver, WebElement webElement) {
        return waitForElement(driver, webElement, 15);
    }

    public static WebElement waitForElement(WebDriver driver, WebElement webElement, long timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        return wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
}