package mypkg;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class testproperty {

    Properties property;
    FileInputStream fs;

    @Test
    public void testProperty() throws IOException {

        fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");

        property = new Properties();
        property.load(fs);

        System.out.println(property.getProperty("name"));


    }
}

