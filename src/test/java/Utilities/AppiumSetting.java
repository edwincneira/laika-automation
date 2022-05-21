package Utilities;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumSetting {

    public static DesiredCapabilities getCapabilitiesAndroid(String deviceName, String udid, String version)
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage", "com.kubo.laika");
        capabilities.setCapability("appActivity", "com.kubo.laika.MainActivity");
        capabilities.setCapability("platformVersion", version);
        capabilities.setCapability("newCommandTimeout", "95000");
        capabilities.setCapability("udid", udid);
        capabilities.setCapability("unicodeKeyboard", "false");
        return capabilities;
    }

    public static DesiredCapabilities getCapabilitiesIOS(String deviceName, String udid, String version)
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        //capabilities.setCapability("noReset", "true");
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("bundleId", "com.kubo.lika");
        capabilities.setCapability("udid", udid);
        capabilities.setCapability("platformVersion", version);
        capabilities.setCapability("newCommandTimeout", "95000");
        capabilities.setCapability("connectHardwareKeyboard", "true");
        return capabilities;
    }

    public static URL setUrl(String port) throws MalformedURLException
    {
        return new URL(String.format("http://127.0.0.1:%s/wd/hub", port));
    }
}