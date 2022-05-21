package Page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BasePage {

    public static AndroidDriver<MobileElement> driverAndroid;
    public static IOSDriver<MobileElement> driverIOS;

    public BasePage(AndroidDriver<MobileElement> driverAndroid) {
        this.driverAndroid = driverAndroid;
        PageFactory.initElements(new AppiumFieldDecorator(driverAndroid, Duration.ofSeconds(15)), this);
    }

    public BasePage(IOSDriver<MobileElement> driverIOS) {
        this.driverIOS = driverIOS;
        PageFactory.initElements(new AppiumFieldDecorator(driverIOS, Duration.ofSeconds(15)), this);
    }

}
