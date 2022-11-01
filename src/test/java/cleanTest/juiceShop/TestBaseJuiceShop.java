package cleanTest.juiceShop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.juiceShop.LoginPage;
import pages.juiceShop.MainPage;
import pages.juiceShop.ProfilePage;
import singletonSession.Session;

public class TestBaseJuiceShop {

    public MainPage mainPage = new MainPage();
    public LoginPage loginPage = new LoginPage();
    public ProfilePage profilePage = new ProfilePage();

    @BeforeEach
    public void setup(){
        Session.getInstance().getBrowser().get("http://localhost:3000/#/");
    }

    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }
}
