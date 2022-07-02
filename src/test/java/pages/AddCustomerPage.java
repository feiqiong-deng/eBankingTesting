package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
    WebDriver driver;

    public AddCustomerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "name")
    WebElement name;

    @FindBy(how = How.NAME, using = "rad1")
    WebElement gender;

    @FindBy(how = How.ID_OR_NAME, using = "dob")
    WebElement dob;

    @FindBy(how = How.NAME, using = "pinno")
    WebElement pin;

    @FindBy(how = How.NAME, using = "addr")
    WebElement address;

    @FindBy(how = How.NAME, using = "city")
    WebElement city;

    @FindBy(how = How.NAME, using = "state")
    WebElement state;

    @FindBy(how = How.NAME, using = "telephoneno")
    WebElement telephone;

    @FindBy(how = How.NAME, using = "emailid")
    WebElement email;

    @FindBy(how = How.NAME, using = "sub")
    WebElement submit;

    public void enterName(String newName) {
        name.sendKeys(newName);
    }

    public void enterGender(String txtGender) {
        gender.click();
    }

    public void custDob(String mm, String dd, String yy) {
        dob.sendKeys(mm);
        dob.sendKeys(dd);
        dob.sendKeys(yy);
    }

    public void enterAdd(String newAdd) {
        address.sendKeys(newAdd);
    }

    public void enterCity(String newCity) {
        city.sendKeys(newCity);
    }

    public void enterState(String newState) {
        state.sendKeys(newState);
    }

    public void enterPin(String newPin) {
        pin.sendKeys(newPin);
    }

    public void enterTel(String newTel) {
        telephone.sendKeys(newTel);
    }

    public void enterEmail(String newEmail) {
        email.sendKeys(newEmail);
    }

    public void clickSubmit() {
        submit.click();
    }
}
