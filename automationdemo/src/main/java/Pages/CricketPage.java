package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CricketPage extends BbcPage {
    public static final String URL = "http://www.bbc.com/sport/cricket";

    public CricketPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
