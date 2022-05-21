package Encapsulation;

import Interfaces.LoginPage;
import Page.AddressPage.AddressAndroidPage;
import Page.AddressPage.AddressIOSPage;
import Interfaces.AddressPage;
import Page.LoginPage.LoginAndroidPage;
import Page.LoginPage.LoginIOSPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class Instance {

    private static AddressPage addressPage;
    private static LoginPage loginPage;

    public static void instanceObjectsAndroid(AndroidDriver driverAndroid) throws InterruptedException {
        addressPage = new AddressAndroidPage(driverAndroid);
        loginPage = new LoginAndroidPage(driverAndroid);
    }

    public static void instanceObjectsIOS(IOSDriver driverIOS) throws InterruptedException {
        addressPage = new AddressIOSPage(driverIOS);
        loginPage = new LoginIOSPage(driverIOS);
    }

    public static AddressPage address_page(){
        return addressPage;
    }
    public static LoginPage login_page(){
        return loginPage;
    }

}
