package Navigation;

import Common.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
    private WebDriver driver;

    @FindBy(linkText = "Sport")
    private WebElement sport;

    @FindBy(className = "module__title")
    private WebElement welcome;

    public Header(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToSport() {
        DriverHelper.waitForElement(driver, sport);
        sport.click();
    }
}
