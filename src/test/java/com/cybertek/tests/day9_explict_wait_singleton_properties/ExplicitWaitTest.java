package com.cybertek.tests.day9_explict_wait_singleton_properties;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class ExplicitWaitTest extends TestBase {

    @Test
    public void testWaitForTitle() {

        //1. navigate to http://practice.cybertekschool.com/dynamic_loading
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        //2. Click on Example 7
        driver.findElement(By.partialLinkText("Example 7")).click();

        //3. The title will show loading... until certain time ,
        // we want to wait until the title value become "Dynamic title"
        // this is how we create WebDriverWait object with driver and max time to wait
        WebDriverWait wait = new WebDriverWait(driver, 6);
        // then we use until method that accept expected conditions
        // ExpectedConditions helper class has a lot of pre-written conditions
        // for common scenarios, so we don't have to build our own
        // in this case we are checking for title equal Dynamic title
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //try different  condition as below
        //wait until the spongebob image  visible on screen
        //visibilityOfElementLocated accept locator as parameter
        //so this means wait 6 second max until the element located by tagName("img")
        //is visible on the screen

        wait.until(visibilityOfElementLocated(By.tagName("img")));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='square pants']")) ) ;
        // we did static import as below so pur code can be shorter
        // import static org.openqa.selenium.support.ui.ExpectedConditions.*;
        wait.until(visibilityOfElementLocated(By.xpath("//img[@alt='square pants']")));


        //the warning area initially hastext of this page is slow wait for 5 seconds
        //after it load the text of that

        System.out.println("END");

    }
    @Test
    public void testByTextToBe(){

        //1. navigate to http://practice.cybertekschool.com/dynamic_loading
        driver.get(" http://practice.cybertekschool.com/dynamic_loading");
        //2. Click on Example 7
        driver.findElement(By.partialLinkText("Example 7")).click();

        WebElement alertArea = driver.findElement(By.id("alert"));
        System.out.println("alertArea.getText() = " + alertArea.getText());

        WebDriverWait wait = new WebDriverWait(driver, 6);
        // wait for the image show up
        wait.until( visibilityOfElementLocated(By.xpath("//img[@alt='square pants']")) ) ;
// here we have to re- locate the element because the attributes has changed (color And stuff)
        //driver can not
        // element is not  in the
        alertArea = driver.findElement(By.id("alert"));

        System.out.println("alertArea.getText() = " + alertArea.getText());
        // the warning area initially has text of this page is slow wait for 5 seconds..
        // after it load the text of that area become Done!
        // This is one of the ExpectedConditions we can use for waiting

    }
    }

