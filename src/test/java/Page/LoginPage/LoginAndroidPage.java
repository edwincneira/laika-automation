package Page.LoginPage;

import Interfaces.LoginPage;
import Page.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.NoSuchElementException;

import static Utilities.Time.sleep;
import static Utilities.Scroll.*;

public class LoginAndroidPage extends BasePage implements LoginPage {

     public LoginAndroidPage(AndroidDriver<MobileElement> driverAndroid) {
          super(driverAndroid);
     }

     @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Correo\"]")
     private MobileElement txtEmail;

     @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Contraseña\"]")
     private MobileElement txtPassword;

     @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Iniciar Sesión\"]")
     private MobileElement btnInitialSession;

     @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Iniciar sesión\"]")
     private MobileElement btnInitSession;

     @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Cuenta\"]")
     private MobileElement btnAccount;

     @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Cerrar sesión\"]")
     private MobileElement btnCloseSession;

     public void inside(String email, String password) throws InterruptedException, NoSuchElementException {
          sleep(3);
          btnInitialSession.click();
          sleep(1);
          txtEmail.click();
          txtEmail.sendKeys(email);
          sleep(1);
          txtPassword.click();
          txtPassword.sendKeys(password);
          sleep(1);
          btnInitSession.click();
          sleep(1);
          btnInitSession.click();
          sleep(3);
     }

     public void outside() throws InterruptedException, NoSuchElementException {
          btnAccount.click();
          sleep(1);
          scrollByRange(0.5, 0.8, 0.5, 0.3, false);
          sleep(1);
          btnCloseSession.click();
          sleep(2);
     }
}
