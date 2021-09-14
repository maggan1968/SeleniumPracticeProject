package com.cybertek.tests.day6_junit_practice_unity_methods;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SlowElementTest extends TestBase {



    @Test
    public void testWait() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // we can instruct WebDriver to wait maximum amount of time
        //before throwing NoSuchElement Exception by using implicit wait
        //if element is not available , it will wait foe maximum of 10 second
        //if element is not fund before 10s. for exp. 1 second ==>It will move  on to next step

        driver.navigate().to("http://practice.cybertekschool.com/dynamic_controls");
        driver.findElement(By.xpath("//button[ .='Remove']")).click();

        Thread.sleep(5000);

        WebElement itsGoneElm = driver.findElement(By.id("message"));
        System.out.println("itsGoneElm.getText() = " + itsGoneElm.getText());
        System.out.println("THE END");
    }
}
