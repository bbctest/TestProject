package Steps;

import Context.DriverContext;
import Pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class HomeStepDefs {
    private WebDriver driver;
    private HomePage homePage;

    public HomeStepDefs(DriverContext driverContext){
        driver = driverContext.getDriver();
        homePage = new HomePage(driver);
    }

    @Given("^I have navigated to the BBC Home page$")
    public void iHaveNavigatedToTheBBCHomePage() {
        homePage.goTo();
    }

    @And("^I have navigated the Sports page$")
    public void iHaveNavigatedTheSportsPage() {
        homePage.navigateToSport();
    }
}
