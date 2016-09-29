package Steps;

import Context.DriverContext;
import Navigation.SportNavigator;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class SportNavigationStepDefs {
    private WebDriver driver;
    private SportNavigator sportNavigator;

    public SportNavigationStepDefs(DriverContext driverContext) {
        driver = driverContext.getDriver();
        sportNavigator = new SportNavigator(driver);
    }

    @When("^I click on the cricket button on the sports menu$")
    public void iClickOnTheCricketButtonOnTheSportsMenu() {
        sportNavigator.navigateToCricket();
    }
}
