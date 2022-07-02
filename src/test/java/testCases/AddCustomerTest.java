package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import pages.AddCustomerPage;
import pages.HomePage;
import pages.LoginPage;

public class AddCustomerTest extends Base{
    @Test
    public void addNew() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        AddCustomerPage addCustomerPage = new AddCustomerPage(driver);

        loginPage.clickLogin(userName, password);

        homePage.clickAddNew();

    }

    public String randomString() {
        String generatedString = RandomStringUtils.randomAlphabetic(8);
        return generatedString;
    }
}
