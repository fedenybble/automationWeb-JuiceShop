package pages.juiceShop;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class MainPage {

    public Button popUpButton = new Button(By.xpath("//button[@aria-label=\"Close Welcome Banner\"]"), "[Pop Up] button in main page");
    public Button accountNavbarBtn = new Button(By.id("navbarAccount"), "[Account] button in main page");
    public Button yourBasketNavBarBtn = new Button(By.xpath("//button[@routerlink=\"/basket\"]"), "[Your basket] button in main page");
    public Button loginButton = new Button(By.xpath("//button[@routerlink=\"/login\"]"), "[Login] button in main page");
    public Button profileButton = new Button(By.xpath("//button[@aria-label=\"Go to user profile\"]"), "[Profile] button in main page");



}
