package com.cybertek.day02_locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByPartianText_GetText_Method {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        //identify the link using partial link text then get the full text out

        //using partial link text then get the full text out using new method getText

        WebElement myLink = driver.findElement(By.partialLinkText("Disappearing"));
       // System.out.println("myLink.getText() = " + myLink.getText());//soutv

        String fullLinkText= myLink.getText();
        System.out.println("fullLinkText = " + fullLinkText);

        //what if I just provide partial link as letter A
        //it will just return very first that match the criteria
        WebElement aLink = driver.findElement(By.partialLinkText("A"));// we get the first match
        System.out.println("aLink.getText() = " + aLink.getText());


        //close browser
        driver.quit();

    }
}
