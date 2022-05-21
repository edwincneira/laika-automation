package Base;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.awt.*;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import Utilities.AppiumSetting;
import static Utilities.Env.*;
public abstract class BaseClass extends AbstractTestNGCucumberTests {

    public static AndroidDriver<MobileElement> driverAndroid;
    public static IOSDriver<MobileElement> driverIOS;

    @BeforeTest
    public abstract void setUpPage() throws AWTException;

    @BeforeSuite()
    public void setup() throws Exception {
        DesiredCapabilities capabilitiesAndroid = AppiumSetting.getCapabilitiesAndroid(ANDROID_DEVICE_NAME, ANDROID_SERIAL_NAME, ANDROID_VERSION);
        URL urlAndroid = AppiumSetting.setUrl("4723");
        System.out.println("Laika Android Iniciando...");
        try {
            driverAndroid = new AndroidDriver<MobileElement>(urlAndroid, capabilitiesAndroid);
            driverAndroid.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (WebDriverException e) {
            System.out.println("Exception catch: " + e.getMessage());
            System.out.println("Android Error...");
        }
        DesiredCapabilities capabilitiesIos = AppiumSetting.getCapabilitiesIOS(IOS_DEVICE_NAME, IOS_SERIAL_NAME, IOS_VERSION);
        URL urlIos = AppiumSetting.setUrl("4724");
        System.out.println("Laika IOS Iniciando... ");
        try {
            driverIOS = new IOSDriver<>(urlIos, capabilitiesIos);
            driverIOS.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (WebDriverException e) {
            System.out.println("Exception catch: " + e.getMessage());
            System.out.println("IOS Error...");
        }
    }

    @AfterSuite
    public void disconnectAppium() throws Exception {
        driverAndroid.quit();
        driverIOS.quit();
    }
}
