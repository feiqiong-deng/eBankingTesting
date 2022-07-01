package testCases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public String url = "https://demo.guru99.com/V1/index.php";
    public String userName = "mngr266311";
    public String password = "YvuzYtY";
    public static WebDriver driver;
    public static String homeDir = System.getProperty("user.dir");

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", homeDir + "/src/main/resources/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
