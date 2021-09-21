package com.cybertek.tests.day8_upload_actions_window_wait_js;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import java.security.Key;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActionsClassTest2 extends TestBase {




    @Test
    public void testDragAndDrop() {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        BrowserUtil.waitFor(2);

        WebElement smallCircle = driver.findElement(By.id("draggable"));
        WebElement biggerCircle = driver.findElement(By.id("droptarget"));
//dragAndDrop method of Actions class, accept 2 webelement and drop first on into second
        Actions actions = new Actions(driver);
        actions.dragAndDrop(smallCircle, biggerCircle).perform();

        BrowserUtil.waitFor(2);

        //verift th ebig circle text has changed to You did great!
        assertEquals("You did great!", biggerCircle.getText());


    }

    @Test
    public void testKeybordAction() {

        // navigate to https://www.google.com
        // hold down to shift enter text "i love selenium"
        // release the shift
        // enter text "i love selenium"
        // hold down to command on mac control on windows and enter "A"
        // release the command or control key
        // then hit backspace to delete
        driver.get(" https://www.google.com");
        // locate searchBox using name value q
        WebElement searchBox = driver.findElement(By.name("q"));
        // create Actions class instance
        Actions actions = new Actions(driver);
        // keyDown method for holding down to certain modifier key like Control , SHIFT and so on
        // keyUp method for releasing what you are holding down to
        // sendKeys method of Actions class is for pressing key that provided
        // pause method of Actions class is for pausing in between actions in milliseconds


        // this is way more than enough
//            actions.keyDown(Keys.SHIFT).sendKeys("i love selenium")
//                    .pause(2000).keyUp(Keys.SHIFT)
//                    .sendKeys("i love selenium").pause(2000)
//                    .keyDown(Keys.COMMAND).sendKeys("A") // command+a on mac will select all text
//                    .perform();



        // this is way way way way way more than enough to demonstrate you can take any keyboard action
        actions.keyDown(Keys.SHIFT).sendKeys("i love selenium")
                .pause(2000).keyUp(Keys.SHIFT)
                .sendKeys("i love selenium").pause(2000)
                .keyDown(Keys.COMMAND).sendKeys("A") // command+a on mac will select all text
                // .keyDown(Keys.CONTROL).sendKeys("A") // control+a on windows will select all text
                .keyUp(Keys.COMMAND).pause(2000)
                .sendKeys(Keys.BACK_SPACE)
                .perform();




    }


    @Test
    public void testDoubleClick(){
        // navigate here
        //https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick
        // double-click on paragraph with text "Double-click this paragraph to trigger a function.
        // then assert the new paragraph with text "Hello world" displayed right under
        // both of the elements are under iframe with id iframeResult
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
        BrowserUtil.waitFor(2);
        // both elements are under the frame , so switch into it first
        driver.switchTo().frame("iframeResult");
        WebElement pElm1 =
                driver.findElement(By.xpath("//p[.='Double-click this paragraph to trigger a function.']"));
        // in order to double-click we will use actions class
        Actions actions = new Actions(driver) ;
        actions.doubleClick(pElm1).perform(); // this is how we double click

        BrowserUtil.waitFor(2);
        // TODO : go ahead and assert the Hello world showed up

    }



    @Test   // right click is called context click
    public void testRightClick(){
        // navigate to below url
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_oncontextmenu");
        // locate the yellow area : css selector div[contextmenu='mymenu']
        // first switch to the iframe
        driver.switchTo().frame("iframeResult");
        WebElement yellowArea = driver.findElement(By.cssSelector("div[contextmenu='mymenu']"));

        // right-click on that area using Actions class method contextClick( pass the element here)
        Actions actions = new Actions(driver);
        actions.contextClick(yellowArea).perform();

        BrowserUtil.waitFor(1);
        // close the alert that showed up after
    }
}






