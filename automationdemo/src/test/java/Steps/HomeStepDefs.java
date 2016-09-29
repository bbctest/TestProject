package Steps;

import Context.DriverContext;
import Pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class HomeStepDefs {
    private WebDriver driver;
    private HomePage homePage;

    public HomeStepDefs(DriverContext driverContext) {
        driver = driverContext.getDriver();
        homePage = new HomePage(driver);
    }

    @Given("^I have navigated to the BBC home page$")
    public void iHaveNavigatedToTheBBCHomePage() {
        homePage.goTo();
    }

    @When("^I navigate to the BBC website$")
    public void iNavigateToTheBBCWebsite() {
        iHaveNavigatedToTheBBCHomePage();
    }

    @Then("^I should see a welcome message$")
    public void iShouldSeeAWelcomeMessage() {
        assertThat("Welcome message not displayed", homePage.isWelcomeDisplayed(), is(true));
        assertThat(homePage.getWelcomeText(), startsWith("Welcome to BBC.com"));
    }

    @Then("^I should be on the BBC home page$")
    public void iShouldBeOnTheBBCHomePage() {
        assertThat(driver.getCurrentUrl(), is(equalTo(homePage.URL)));
    }
}
