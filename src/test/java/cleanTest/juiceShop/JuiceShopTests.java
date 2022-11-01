package cleanTest.juiceShop;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class JuiceShopTests extends TestBaseJuiceShop {

    String email = "ejemplo@ejemplo.com";
    String password = "ejemplo";

    @Test
    @Order(1)
    @DisplayName("Verify that login is successful.")
    @Description("This test case is to verify that the user can log in with a valid email and a valid password.")
    @Owner("Fede Padin")
    @Epic("Login")
    public void verifyLogin() throws InterruptedException {

        mainPage.popUpButton.click();
        mainPage.accountNavbarBtn.click();
        mainPage.loginButton.waitClickable();
        mainPage.loginButton.click();

        loginPage.loginEmailInput.waitToBePresent();
        loginPage.loginEmailInput.setText(email);
        loginPage.loginPasswordInput.waitToBePresent();
        loginPage.loginPasswordInput.setText(password);
        loginPage.loginButton.waitClickable();
        loginPage.loginButton.click();

        Assertions.assertTrue(mainPage.yourBasketNavBarBtn.isControlDisplayed(), "ERROR: the user was not logged in correctly.");

        Thread.sleep(3000);

    }

    @Test
    @Order(2)
    @DisplayName("Verify that the username can be setted.")
    @Description("This test case is to verify that the user can set the username from Profile page.")
    @Owner("Fede Padin")
    @Epic("Account")
    public void verifyNameCanBeSetted() throws InterruptedException {

        String newName = "name"+ new Date().getTime();

        // ----- LOGIN -----
        mainPage.popUpButton.click();
        mainPage.accountNavbarBtn.click();
        mainPage.loginButton.waitClickable();
        mainPage.loginButton.click();

        loginPage.loginEmailInput.waitToBePresent();
        loginPage.loginEmailInput.setText(email);
        loginPage.loginPasswordInput.waitToBePresent();
        loginPage.loginPasswordInput.setText(password);
        loginPage.loginButton.waitClickable();
        loginPage.loginButton.click();

        Assertions.assertTrue(mainPage.yourBasketNavBarBtn.isControlDisplayed(), "ERROR: the user was not logged in correctly.");

        // ----- SET NEW NAME -----
        mainPage.accountNavbarBtn.waitClickable();
        mainPage.accountNavbarBtn.click();
        mainPage.profileButton.waitClickable();
        mainPage.profileButton.click();
        profilePage.usernameInput.clear();
        profilePage.usernameInput.setText(newName);
        profilePage.setUsernameButton.waitClickable();
        profilePage.setUsernameButton.click();

        profilePage.backButton.click();

        // ----- VERIFICATION -----
        mainPage.accountNavbarBtn.waitClickable();
        mainPage.accountNavbarBtn.click();
        mainPage.profileButton.waitClickable();
        mainPage.profileButton.click();
        String valueFromInput = profilePage.usernameInput.getAttribute("value");

        Assertions.assertEquals(newName, valueFromInput, "ERROR: Username was not setted correctly.");

        Thread.sleep(5000);


    }

}
