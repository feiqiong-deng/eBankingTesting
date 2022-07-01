package testCases;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;

import java.io.IOException;

public class LoginTest extends Base {

    @Test
    public void loginTest() throws IOException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.clickLogin(userName, password);
//       if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
//           Assert.assertTrue(true);
//       } else {
//           Assert.assertTrue(false);
//           captureScreen(driver,"loginTest");
//       }

        /*  Data Driven Test: when trying different sets of username and password, alert is present when
        invalid username or password */
        if(isAlertPresent() == true) {
            driver.switchTo().alert().accept(); // close the alert
            driver.switchTo().defaultContent(); // switch to main page
            Assert.assertTrue(false);  // the test is not passed
        } else {
            Assert.assertTrue(true);
            homePage.clickLogout();
            driver.switchTo().alert().accept(); //close logout alert
            driver.switchTo().defaultContent();
        }
    }
}
