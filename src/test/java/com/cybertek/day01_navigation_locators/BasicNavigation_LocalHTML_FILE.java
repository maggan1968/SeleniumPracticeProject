package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation_LocalHTML_FILE {

    public static void main(String[] args) {


        //set up chrome driver
        WebDriverManager.chromedriver().setup();

        //create chromeDriver object
        WebDriver driver = new ChromeDriver();

      driver.get  ("file:///Users/maggan68/Desktop/HTML%20Class0/myfirsthtmlPage");

        //quit the browser
        driver.quit();
    }
}
