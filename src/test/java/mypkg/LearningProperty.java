package mypkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class LearningProperty {

     private Properties property;
     FileInputStream fs;
     private WebDriver driver = null;

    @BeforeTest
    public void testProperty2() throws IOException {

        fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");

        property = new Properties();
        property.load(fs);

        if (property.getProperty("browser").equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", property.getProperty("chrome.driver"));
            driver = new ChromeDriver();
        }

        else if (property.getProperty("browser").equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", property.getProperty("gecko.driver"));
            driver =new FirefoxDriver();
        }

    }

        @Test
        public void login_success()

        {
            driver.navigate().to(property.getProperty("base_url"));
        }


//        System.out.println(property.getProperty("name"));

    }

