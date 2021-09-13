package com.cybertek.day03_locate_by_tag_class_getatt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementByClassName {

    public static void main(String[] args) {

        // set up chrome driver and open chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        // identify this element using its class attribute
        //<span class="h1y">Test Automation Practice</span>

        WebElement elm1 = driver.findElement(By.className("h1y"));
        System.out.println("elm1.getText() = " + elm1.getText());

        //<li class="list-group-item"><a href="/abtest">A/B Testing</a></li>
        WebElement firstLiItm = driver.findElement(By.className("list-group-item"));
        System.out.println("firstLiItm.getText() = " + firstLiItm.getText());

        // identify all li elements with class name list-group-item
        List<WebElement> allLiTagElements = driver.findElements(By.className("list-group-item"));
        // get the size of all the elements
        System.out.println("allLiTagElements.size() = " + allLiTagElements.size());

        // iterate over all the elements and get the text of each element
        for (WebElement eachLiElement : allLiTagElements) {
            System.out.println("eachLiElement.getText() = " + eachLiElement.getText());
        }


        driver.quit();
    }}
