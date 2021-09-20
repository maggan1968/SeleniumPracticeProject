package com.cybertek.tests.day8_upload_actions_window_wait_js;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ActionsClassTest extends TestBase {

    @Test
    public void testHoverAction() {

/**
 * //img[1]
 * //div[@class='figure']/img[1]
 *
 */

        driver.get("http://practice.cybertekschool.com/hovers");

        // locate first image and hover over to the image and verify User profile 1 displayed
        WebElement img1Elm = driver.findElement(By.xpath("(//div[@class= 'figure']/img)[1]"));

        // Create instance of Actions class by passing driver object
        // its coming from here import org.openqa.selenium.interactions.Actions;
        Actions actions = new Actions(driver);
        actions.moveToElement(img1Elm).perform();


        BrowserUtil.waitFor(3);

        //verify User profile 1 displayed with text "name:user1"
        WebElement firstProfileElm = driver.findElement(By.xpath("//h5[.='name: user1']"));
        assertTrue(firstProfileElm.isDisplayed());

        // locate second image and hover over to the image
        WebElement img2Elm = driver.findElement(By.xpath("(//div[@class= 'figure']/img)[2]"));
        actions.moveToElement(img2Elm).perform();

        BrowserUtil.waitFor(3);


        //prform these action i this sequence
        //, hover  to 1st image, pause 2 second, then second image pause 2 second,
        //then hover over  to 1st image again, pause 2 second then second image pause 2 second
        //PERFORM THE ACTION!!!

        actions.moveToElement(img1Elm).pause(2000)
                .moveToElement(img2Elm).pause(2000)
                .moveToElement(img1Elm).pause(2000)
                .moveToElement(img2Elm).pause(2000).perform();

        //TODO :
      //  get a List<WebElement> containing those 3 images , Iterate over the list to hover  over and

    }


    }

