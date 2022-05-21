package Utilities;

import Base.BaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.TouchAction;

import java.awt.*;

public class ActionIOS extends BaseClass {

    public static void clickElementByiOSNsPredicateString (String search) throws NoSuchElementException
    {
        try {
            driverIOS.findElementByIosNsPredicate(search).click();
        }catch (NoSuchElementException e) {
            System.out.printf(e.getMessage());
            throw new NoSuchElementException("Ups! we couldn't find this element " + search);
        }
    }

    public static MobileElement elementByClassChain (String search) throws NoSuchElementException
    {
        try {
            return driverIOS.findElementByIosClassChain(search);
        }catch (NoSuchElementException e) {
            System.out.printf(e.getMessage());
            return driverIOS.findElementByIosClassChain("");
        }
    }

    public static void clickElementByiOSClassChain (String search) throws NoSuchElementException
    {
        try {
            driverIOS.findElementByIosClassChain(search).click();
        }catch (NoSuchElementException e) {
            System.out.printf(e.getMessage());
            throw new NoSuchElementException("Ups! we couldn't find this element " + search);
        }
    }

    public static void sendKeysElementByiOSNsPredicateString (String search, String message) throws NoSuchElementException
    {
        try {
            driverIOS.findElementByIosNsPredicate(search).sendKeys(message);
        }catch (NoSuchElementException e) {
            System.out.printf(e.getMessage());
            throw new NoSuchElementException("Ups! we couldn't find this element " + search);
        }
    }

    public static void hideKeyBoard () {
        driverIOS.hideKeyboard();
    }

    public static void tapByCoordinates(int x, int y)
    {
        new TouchAction(driverIOS).tap(PointOption.point(x,y)).release().perform();
    }


    @BeforeTest
    @Override
    public void setUpPage() throws AWTException {

    }
}
