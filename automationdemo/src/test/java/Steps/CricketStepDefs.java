package Steps;

import Context.DriverContext;
import Pages.CricketPage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CricketStepDefs {
    private WebDriver driver;
    private CricketPage cricketPage;

    public CricketStepDefs(DriverContext driverContext) {
        driver = driverContext.getDriver();
        cricketPage = new CricketPage(driver);
    }

    @Then("^I should be redirected to the cricket page$")
    public void iShouldBeRedirectedToTheCricketPage() {
        assertThat(driver.getCurrentUrl(), is(equalTo(cricketPage.URL)));
    }
}