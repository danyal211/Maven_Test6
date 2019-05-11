package mypkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.InputStream;
import java.util.Properties;


public class testngclass2 {

    @Test

   //  public static void main(String[] args) {
            public void testclass() {


        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Selenium_Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();

        obj.get("https://acceptanceweb.unation.com/");

    }

/*
        @Test
    public void setup5(){
        System.out.println("Welcome to maven testng project");
    }

    @Test
    public void setup6(){
        System.out.println("Welcome to maven testng project");
    }

    @Test
    public void setup7() { System.out.println("Welcome to maven testng project"); }
*/
}
