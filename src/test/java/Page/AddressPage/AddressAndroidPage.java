package Page.AddressPage;

import Interfaces.AddressPage;
import Page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AddressAndroidPage extends BasePage implements AddressPage {

    public AddressAndroidPage(AndroidDriver<MobileElement> driverAndroid) {
        super(driverAndroid);
    }



    public void addLocationActualHowAddress() throws InterruptedException{
        System.out.println("Not implemented yet");
        Thread.sleep(2000);
    }

}
