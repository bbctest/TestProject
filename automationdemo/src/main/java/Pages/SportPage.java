package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SportPage extends BbcPage {

    public static final String URL = "http://www.bbc.com/sport";

    public SportPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}