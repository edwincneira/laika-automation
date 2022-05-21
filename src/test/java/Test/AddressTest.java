package Test;

import Utilities.SwitchDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.awt.*;
import static Encapsulation.Instance.*;

import Base.BaseClass;

@CucumberOptions(
        strict = true,
        monochrome = true,
        features = "classpath:AddressTest/AddressTest.feature",
        tags = "@iOS",
        plugin = {
                "pretty"
        }
)

public class AddressTest extends BaseClass {

    @Override
    public void setUpPage() throws AWTException {
    }

    @Before("@AddressTest")
    public void setDriver(cucumber.api.Scenario scenario) throws InterruptedException {
        String so = SwitchDriver.getSO(scenario);
        if(so.contains("Android")) instanceObjectsAndroid(driverAndroid);
        if(so.contains("iOS")) instanceObjectsIOS(driverIOS);
    }

    @Then("^Change your address to the current location where he are$")
    public void location() throws InterruptedException {

    }

}