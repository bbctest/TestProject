package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExtensionMethods {
    public static boolean waitForElementDisplayed(WebDriver driver, By by, int timeoutInSeconds)
    {
//        if (timeoutInSeconds > 0)
//        {
//            var wait = new WebDriverWait(driver, TimeSpan.FromSeconds(timeoutInSeconds));
//            return wait.Until(drv => drv.FindElement(by));
//        }
//        return driver.findElement(by);
        return true;
    }
}