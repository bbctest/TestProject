package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public static final String URL = "http://www.bbc.com/";
    private WebDriver driver;

    @FindBy(linkText = "Sport")
    private WebElement sport;


    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        driver.get(URL);
    }

    public void navigateToSport(){
        sport.click();
    }
}