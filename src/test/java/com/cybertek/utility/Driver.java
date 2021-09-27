package com.cybertek.utility;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver obj;

    private Driver() {
    }

    public static WebDriver getDriver() {
        if (obj == null) {


            WebDriverManager.chromedriver().setup();
            obj = new ChromeDriver();

            System.out.println("");
            return obj;
        } else {
            return obj;
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