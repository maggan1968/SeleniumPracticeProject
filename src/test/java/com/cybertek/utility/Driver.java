package com.cybertek.utility;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * We wanted to have a class with that only return Single object
 * no matter how many time you asked for object
 * so we are creating this class with technic we learned from Singleton pattern
 */

public class Driver {
    private static WebDriver obj;

    private Driver() {
    }

    /**
     * Return obj with only one WebDriver instance
     *
     * @return same WebDriver if exists , new one if null
     */
    public static WebDriver getDriver() {
        //read the browser type you want to launch from properties file
        String browserName = ConfigReader.read("browser");

        if (obj == null) {

//according to browser type set up driver correctly
            switch (browserName.toLowerCase() ) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    obj = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    obj = new FirefoxDriver();
                    break;
                // other browsers omitted
                default:
                    obj = null;
                    System.out.println("UNKNOWN BROWSER TYPE!!! " + browserName);
            }

            return obj;
        } else {
//            System.out.println("You have it just use existing one");
            return obj;

        }

    }

    /**
     * Quitting the browser and setting the value of
     * WebDriver instance to null because you can re-use already quitted driver
     */
    public static void closeBrowser() {

        // check if we have WebDriver instance or not
        // basically checking if obj is null or not
        // if not null
        // quit the browser
        // make it null , because once quit it can not be used
        if (obj != null) {
            obj.quit();
            // so when ask for it again , it gives us not quited fresh driver
            obj = null;
        }

    }
}












/* create private no arg constructor

        2. create private static field with name obj
        Data type of variable should be WebDriver

        3. create public static method
        name : getDriver()
        return type :WebDriver
        param : none

        check if obj is null or not
        if yes - create ChromeDriver with all set up
        if no  -- return same obj

 */