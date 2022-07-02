package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT, using = "Log out")
    WebElement logoutLink;

    @FindBy(how = How.LINK_TEXT, using = "New Customer")
    WebElement addNewCustomer;

    public void clickLogout() {
        logoutLink.click();
    }

    public void clickAddNew() {addNewCustomer.click();}
}
