package Navigation;

import Common.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SportNavigator {
    private WebDriver driver;

    @FindBy(css = "a[href='/sport/cricket']")
    private WebElement cricket;

    public SportNavigator(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToCricket() {
        DriverHelper.waitForElement(driver, cricket);
        cricket.click();
    }
}
