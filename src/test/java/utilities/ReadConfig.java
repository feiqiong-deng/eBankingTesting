package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties pro;

    //Load the configuration file
    public ReadConfig() {
        File src = new File("./src/configuration/config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e) {
            System.out.println("Exception in reading configuration file.");
            e.getStackTrace();
        }
    }

    public String getLoginUrl() {
        return pro.getProperty("url");
    }

    public String getUserName() {
        return pro.getProperty("userName");
    }

    public String getPassword() {
        return pro.getProperty("password");
    }

    public String getChromePath() {
        return pro.getProperty("chromepath");
    }

}
