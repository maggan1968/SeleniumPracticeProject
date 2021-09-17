package com.cybertek.officeHours.day2_Practice;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class P2_ImplicitWaits extends TestBase {

    @Test
    public void implicitWaits() {

        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");
        String text = driver.findElement(By.cssSelector("#finish")).getText();
        System.out.println("text = " + text);

    }

}
