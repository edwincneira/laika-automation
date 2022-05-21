package Utilities;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.NoSuchElementException;
import static Utilities.ActionIOS.*;

public class Visible {

    public static boolean isVisible(MobileElement mobileElement)
    {
        try {
            if (mobileElement.isDisplayed()) {
                return true;
            }
        } catch (NoSuchElementException e) {
            return false;
        }
        return false;
    }

    public static boolean isVisibleByClassChain(String search) throws NoSuchElementException {
        MobileElement element = elementByClassChain(search);
        try {
            if (element.isDisplayed()) {
                return true;
            }
        } catch (NoSuchElementException e) {
            return false;
        }
        return false;
    }

}
