package Test;

import Base.BaseClass;
import Utilities.SwitchDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.NoSuchElementException;

import java.awt.*;

import static Encapsulation.Instance.*;

@CucumberOptions(
        strict = true,
        monochrome = true,
        features = "classpath:LoginTest/LoginTest.feature",
        tags = "@InsideApp",
        plugin = {
                "pretty"
        }
)

public class LoginTest extends BaseClass {

    @Override
    public void setUpPage() throws AWTException {
    }

    @Before("@LoginTest")
    public void setDriver(cucumber.api.Scenario scenario) throws InterruptedException {
        String so = SwitchDriver.getSO(scenario);
        if(so.contains("Android")) instanceObjectsAndroid(driverAndroid);
        if(so.contains("iOS")) instanceObjectsIOS(driverIOS);
    }

    @When("^The user is inside the application with the (.*) and (.*)$")
    public void validation(String email, String password) throws InterruptedException, Exception {
        login_page().inside(email, password);
    }

    @Then("^Close the session$")
    public void location() throws InterruptedException, NoSuchElementException {
        login_page().outside();
    }


}
