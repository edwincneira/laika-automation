package Page.LoginPage;

import Interfaces.LoginPage;
import Page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.NoSuchElementException;

import static Utilities.ActionIOS.*;
import static Utilities.Scroll.scrollByRange;
import static Utilities.Time.sleep;
import static Utilities.Visible.*;

public class LoginIOSPage extends BasePage implements LoginPage {

    public LoginIOSPage(IOSDriver<MobileElement> driverIOS) {
        super(driverIOS);
    }

    String iosPredicableTxtEmail = "value CONTAINS 'Correo' AND accessible == true";
    String iosPredicableTxtPassword = "value CONTAINS 'Contraseña' AND accessible == true";
    String iosPredicableBtnInitialSession = "name CONTAINS 'Iniciar Sesión' AND accessible == true";
    String iosPredicableBtnInitSession = "name CONTAINS 'Iniciar sesión' AND accessible == true AND index == 3";

    String iosPredicableBtnAccount = "name CONTAINS 'Cuenta' AND accessible == true";
    String iosPredicableBtnCloseSession = "name CONTAINS 'Cerrar sesión' AND accessible == true";
    String iosClassChainScreenPublicity = String.format("**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton");

    int s=2;
    public void inside(String email, String password) throws InterruptedException, NoSuchElementException{
        sleep(3);
        clickElementByiOSNsPredicateString(iosPredicableBtnInitialSession);
        sleep(1);
        clickElementByiOSNsPredicateString(iosPredicableTxtEmail);
        sendKeysElementByiOSNsPredicateString(iosPredicableTxtEmail, email);
        sleep(1);
        clickElementByiOSNsPredicateString(iosPredicableTxtPassword);
        sendKeysElementByiOSNsPredicateString(iosPredicableTxtPassword, password);
        sleep(1);
        tapByCoordinates(30, 30);
        sleep(1);
        clickElementByiOSNsPredicateString(iosPredicableBtnInitSession);
        sleep(3);
    }

    public void outside() throws InterruptedException, NoSuchElementException {
        clickElementByiOSNsPredicateString(iosPredicableBtnAccount);
        sleep(1);
        scrollByRange(0.5, 0.8, 0.5, 0.3, true);
        sleep(1);
        scrollByRange(0.5, 0.8, 0.5, 0.45, true);
        clickElementByiOSNsPredicateString(iosPredicableBtnCloseSession);
    }
}
