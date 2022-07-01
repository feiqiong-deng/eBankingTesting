package testCases;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import utilities.ReadConfig;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Base {
    public ReadConfig readConfig = new ReadConfig();
    public String url = readConfig.getLoginUrl();
    public String userName = readConfig.getUserName();
    public String password = readConfig.getPassword();
    public WebDriver driver;
    public String homeDir = System.getProperty("user.dir");

//    @Parameters("browser")
    @Before
    public void setUp() {
//        if(br.equals("chrome")) {
//            System.setProperty("webdriver.chrome.driver", homeDir + readConfig.getChromePath());
//            driver = new ChromeDriver();
//        } else if(br.equals("firefox")) {
//            System.setProperty("webdriver.chrome.driver", homeDir + readConfig.getChromePath());
//            driver = new FirefoxDriver();
//        } else if(br.equals("safari")) {
//            driver = new SafariDriver();
//        }
        System.setProperty("webdriver.chrome.driver", homeDir + readConfig.getChromePath());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public void captureScreen(WebDriver driver, String name) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(homeDir + "/Screenshots" + name + ".png");
        System.out.println("Screenshot taken");
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
