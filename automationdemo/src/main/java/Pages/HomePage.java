package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BbcPage {
    public static final String URL = "http://www.bbc.com/";

    @FindBy(className = "module__title")
    private WebElement welcome;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void goTo() {
        driver.get(URL);
    }

    public boolean isWelcomeDisplayed() {
        return welcome.isDisplayed();
    }

    public String getWelcomeText() {
        return welcome.getText();
    }
}