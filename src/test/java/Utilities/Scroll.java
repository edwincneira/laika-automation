package Utilities;

import Base.BaseClass;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.testng.annotations.BeforeTest;

import java.awt.*;
import java.time.Duration;

public class Scroll extends BaseClass {

    public static void scroll( int init_x, int init_y, int final_x, int final_y, boolean ios)
    {
        if(ios) {
            new TouchAction(driverIOS).press(PointOption.point(init_x, init_y))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(final_x, final_y))
                    .release().perform();
        } else {
            new TouchAction(driverAndroid).press(PointOption.point(init_x, init_y))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(final_x, final_y))
                    .release().perform();
        }

    }

    public static void scrollByRange(double init_x, double init_y, double final_x, double final_y, boolean ios)
    {
        if(ios) {
            Dimension dimension = driverIOS.manage().window().getSize();
            int start_x = (int) (dimension.width * init_x);
            int start_y = (int) (dimension.height * init_y);
            int end_x = (int) (dimension.width * final_x);
            int end_y = (int) (dimension.height * final_y);
            new TouchAction(driverIOS).press(PointOption.point(start_x, start_y))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(end_x, end_y))
                    .release().perform();
        }else {
            Dimension dimension = driverAndroid.manage().window().getSize();
            int start_x = (int) (dimension.width * init_x);
            int start_y = (int) (dimension.height * init_y);
            int end_x = (int) (dimension.width * final_x);
            int end_y = (int) (dimension.height * final_y);
            new TouchAction(driverAndroid).press(PointOption.point(start_x, start_y))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(end_x, end_y))
                    .release().perform();
        }
    }

    @BeforeTest
    @Override
    public void setUpPage() throws AWTException {

    }
}
