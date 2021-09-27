package com.cybertek.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * This class is meant to be super class
 * to provide driver set up and closing browser
 * for it's subclasses
 *
 * NOW yoy can try to replace driver  with Driver.getDriver() sp  it can be same drive
 */
public abstract class TestBase {

    protected WebDriver driver ;
    // setting up all driver stuff here directly in @BeforeEach method
    @BeforeEach
    public void setupWebDriver(){

//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver = WebDriverFactory.getDriver("chrome");

        // This is how we can set maximum timeout for finding element
        // in this example it will wait for 10 seconds
        // if element is found in 1 second ,it will just move on without finishing 10 seconds
        // Thread.sleep(100000) will always wait for 10 seconds no matter what.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }


}
