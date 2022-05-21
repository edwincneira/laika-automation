package Page.AddressPage;

import Interfaces.AddressPage;
import Page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class AddressIOSPage extends BasePage implements AddressPage {

    public AddressIOSPage (IOSDriver<MobileElement> driverIOS) {
        super(driverIOS);
    }

    public void addLocationActualHowAddress() throws InterruptedException{
        System.out.println("Not implemented yet");
        Thread.sleep(2000);
    }

}
