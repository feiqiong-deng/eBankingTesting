package testCases;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;

public class LoginTest extends Base {

    @Test
    public void loginTest() {
        driver.get(url);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLogin(userName, password);

       if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
           Assert.assertTrue(true);
       } else {
           Assert.assertTrue(false);
       }
    }
}
