package Steps;

import Context.DriverContext;
import Pages.SportPage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SportStepDefs {
    private WebDriver driver;
    private SportPage sportPage;

    public SportStepDefs(DriverContext driverContext) {
        driver = driverContext.getDriver();
        sportPage = new SportPage(driver);
    }

    @Then("^I should be redirected to the sport page$")
    public void iShouldBeRedirectedToTheSportPage() {
        assertThat(driver.getCurrentUrl(), is(equalTo(sportPage.URL)));
    }
}
