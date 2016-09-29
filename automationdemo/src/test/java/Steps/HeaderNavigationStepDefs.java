package Steps;

import Context.DriverContext;
import Navigation.Header;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class HeaderNavigationStepDefs {
    private WebDriver driver;
    private Header header;

    public HeaderNavigationStepDefs(DriverContext driverContext) {
        driver = driverContext.getDriver();
        header = new Header(driver);
    }

    @When("^I click on the sport button on the header$")
    public void iClickOnTheSportButtonOnTheHeader() {
        header.navigateToSport();
    }

    @And("^I have clicked on the sport button on the header$")
    public void iHaveClickedOnTheSportButtonOnTheHeader() {
        iClickOnTheSportButtonOnTheHeader();
    }
}
