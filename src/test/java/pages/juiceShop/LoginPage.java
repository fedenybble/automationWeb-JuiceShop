package pages.juiceShop;

import controlSelenium.Button;
import controlSelenium.Input;
import org.openqa.selenium.By;

public class LoginPage {

    public Input loginEmailInput = new Input(By.id("email"), "[Email] input in login page");
    public Input loginPasswordInput = new Input(By.id("password"), "[Password] input in login page");
    public Button loginButton = new Button(By.id("loginButton"), "[Login] button in login page");

}
