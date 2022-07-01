package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "uid")
    @CacheLookup
    public WebElement user;

    @FindBy(name = "password")
    @CacheLookup
    public WebElement password;

    @FindBy(name = "btnLogin")
    @CacheLookup
    public WebElement btnLogin;

    public void clickLogin(String userName, String pass) {
        user.sendKeys(userName);
        password.sendKeys(pass);
        btnLogin.submit();
    }
}
