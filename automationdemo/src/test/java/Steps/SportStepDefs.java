package Steps;

import Context.DriverContext;
import Pages.SportPage;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class SportStepDefs {
    private WebDriver driver;
    private SportPage sportPage;

    public SportStepDefs(DriverContext driverContext){
        driver = driverContext.getDriver();
        sportPage = new SportPage(driver);
    }

    @Given("^I have clicked on the Cricket$")
    public void iHaveClickedOnTheCricket() {
        sportPage.navigateToCricket();
    }
}
