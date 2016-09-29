package Pages;

import org.openqa.selenium.WebDriver;

public abstract class BbcPage {
    protected WebDriver driver;

    public BbcPage(WebDriver driver) {
        this.driver = driver;
    }
}
