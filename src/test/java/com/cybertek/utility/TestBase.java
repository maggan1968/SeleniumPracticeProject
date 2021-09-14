package com.cybertek.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class is meant to be super class
 * to provide drive set up and closing browser
 * for its subclass
 */

public class TestBase {
    WebDriver driver ;
    //setting up all driver stuff here directly in @BeforeEach method
    @BeforeEach
    public void setupWebDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }
}
