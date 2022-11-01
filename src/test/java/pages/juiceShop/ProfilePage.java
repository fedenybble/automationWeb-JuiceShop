package pages.juiceShop;

import controlSelenium.Button;
import controlSelenium.Input;
import org.openqa.selenium.By;

public class ProfilePage {

    public Input usernameInput = new Input(By.id("username"), "[Username] input in profile page");
    public Button setUsernameButton = new Button(By.id("submit"), "[Set Username] input in profile page");
    public Button backButton = new Button(By.xpath("//span[text()=\"Back\"]"), "[Back] button in profile page");

}
