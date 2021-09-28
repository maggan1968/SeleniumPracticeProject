package com.cybertek.tests.day10_driver_method_practice_properties;

import com.cybertek.utility.ConfigReader;
import com.cybertek.utility.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReadTest {

    @Test
    public void testRead() throws IOException {
        //Create a FileInputStream by opening a connection to an actual file in that path
        FileInputStream in = new FileInputStream("config.properties");
        //Create a Properties object, so we can load key value pair and access it easily
        Properties properties = new Properties();
        //Load the key-value pair into Properties object
        properties.load(in);
        // close the connection to the file since we already loaded the content
        in.close();
        // OPTIONALLY :  this is how we can easily print out all key value pair
        properties.list(System.out);
        // This is how we access individual value according to the key provided
        String helloValue = properties.getProperty("hello") ;
        System.out.println("helloValue = " + helloValue);
    }

    @Test
    public void testReadTryCatch(){
        // moving Properties' declaration here, so it can be accessible outside try catch
        Properties properties = new Properties();
        try {
            FileInputStream in = new FileInputStream("config.properties");
            properties.load(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String helloValue = properties.getProperty("hello") ;
        System.out.println("helloValue = " + helloValue);
    }

    @Test
    public void testUsingConfigReaderUtility(){
        String webOrderUrl = ConfigReader.read("weborder_url");
        String username = ConfigReader.read("weborder_username");
        String password = ConfigReader.read("weborder_password");
        Driver.getDriver().get( webOrderUrl );
        // you can use login function with param and use above username passwords
    }

    /**
     * Reading Java System Properties compiled by JVM at runtime
     * It is not stored into a file , it's gathered at run time
     */
    @Test
    public void testReadingSystemProperties(){
        // java home path
        System.out.println("System.getProperty(\"java.home\") = "
                + System.getProperty("java.home"));
        // User working directory
        System.out.println("System.getProperty(\"user.dir\") = "
                + System.getProperty("user.dir"));
        // Operating system name
        System.out.println("System.getProperty(\"os.name\") = "
                + System.getProperty("os.name"));
        // User account name
        System.out.println("System.getProperty(\"user.name\") = "
                + System.getProperty("user.name"));
        // User's home directory
        System.out.println("System.getProperty(\"user.home\") = "
                + System.getProperty("user.home"));
    }


}

