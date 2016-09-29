package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SportPage {

    public static final String URL = "http://www.bbc.com/sport";
    private WebDriver driver;

    @FindBy(className = "primary-nav__link=text", xpath = "//span[contains(.,'Cricket')]")
    private WebElement cricket;

    public SportPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        driver.get(URL);
    }

    public void navigateToCricket(){
        cricket.isDisplayed();
        cricket.click();
    }
}