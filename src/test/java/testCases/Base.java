package testCases;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import utilities.ReadConfig;

public class Base {
    public ReadConfig readConfig = new ReadConfig();
    public String url = readConfig.getLoginUrl();
    public String userName = readConfig.getUserName();
    public String password = readConfig.getPassword();
    public WebDriver driver;
    public String homeDir = System.getProperty("user.dir");

    @Parameters("browser")
    @Before
    public void setUp(String br) {
        if(br.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", homeDir + readConfig.getChromePath());
            driver = new ChromeDriver();
        } else if(br.equals("firefox")) {
            System.setProperty("webdriver.chrome.driver", homeDir + readConfig.getChromePath());
            driver = new FirefoxDriver();
        } else if(br.equals("safari")) {
            driver = new SafariDriver();
        }
        driver.get(url);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
