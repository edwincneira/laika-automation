package Interfaces;

import org.openqa.selenium.NoSuchElementException;

public interface LoginPage {

    void inside(String email, String password) throws InterruptedException, NoSuchElementException;
    void outside() throws InterruptedException, NoSuchElementException;

}
