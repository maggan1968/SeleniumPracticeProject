package homeWork.homeWork_day8;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Practice extends TestBase {


    @Test
    public void homework(){
        //1. navigate to http://practice.cybertekschool.com/dropdown and save current window handle into a variable.
        driver.get("http://practice.cybertekschool.com/dropdown");
        String mainWindowHandle = driver.getWindowHandle();

        //2. Click on last "dropdown" to show all "options" (not a select dropdown keep in mind)
        WebElement lastDropdrown = driver.findElement(By.id("dropdownMenuLink"));
        lastDropdrown.click();

        //3. Hold down to (COMMAND on mac CONTROL on windows) and Click on Google Link then release it.
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.COMMAND)
                .moveToElement(driver.findElement(By.xpath("//a[.='Google']")))
                .click().perform();
        BrowserUtil.waitFor(3);

        //5. Click on the Dropdown Link again to open it.
        lastDropdrown.click();
        actions.keyDown(Keys.COMMAND)
                .moveToElement(driver.findElement(By.xpath("//a[.='Amazon']")))
                .click().perform();
        BrowserUtil.waitFor(3);

        //8
        lastDropdrown.click();
        actions.keyDown(Keys.COMMAND)
                .moveToElement(driver.findElement(By.xpath("//a[.='Facebook']")))
                .click().perform();
        BrowserUtil.waitFor(3);
        lastDropdrown.click();

        //optional etsy
        actions.keyDown(Keys.COMMAND)
                .moveToElement(driver.findElement(By.xpath("//a[.='Etsy']")))
                .click().perform();
        BrowserUtil.waitFor(3);


        //9. Now you have 4 "window"s , Loop through them using their handle, and print out the title.
        Set<String> allHandles = driver.getWindowHandles();
        for (String eachHandle : allHandles) {
            driver.switchTo().window(eachHandle);
            System.out.println("driver.getTitle() = " + driver.getTitle());
            if (driver.getTitle().contains("Facebook")) {
                driver.close();
                driver.switchTo().window(mainWindowHandle);
            }
            //11. Optionally, if the title contains Amazon , Hover over to Prime from menu option (in between Best Sellers and Customer Service), it will show
            //"Try Prime" link , Verify it isDisplayed.
            if (driver.getTitle().contains("Amazon")) {
                actions.moveToElement(driver.findElement(By.id("nav-link-prime"))).perform();
                BrowserUtil.waitFor(2);
                ////a[@href='/gp/prime/?ref=nav_menu_greenbg_rocketman_unrec_cta']
                WebElement tryPrime = driver.findElement(By.xpath("//a[@href='/gp/prime/?ref=nav_menu_greenbg_rocketman_unrec_cta']"));
                assertTrue(tryPrime.isDisplayed());
            }
            if (driver.getTitle().contains("Etsy")){
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                WebElement email = driver.findElement(By.id("email-list-signup-email-input"));
                jse.executeScript("arguments[0].scrollIntoView(true)",email );
                BrowserUtil.waitFor(3);
            }

        }



    }

}
/*
1. navigate to http://practice.cybertekschool.com/dropdown and save current window handle into a variable.
2. Click on last "dropdown" to show all "options" (not a select dropdown keep in mind)
3. Hold down to (COMMAND on mac CONTROL on windows) and Click on Google Link then release it.
4. It will open the link in new tab
5. Click on the Dropdown Link again to open it.
6. Now Hold down to (COMMAND on mac CONTROL on windows) and Click on Amazon Link then release it.
7. It will open the link in another windows.
8. Repeat the same process for Facebook
9. Now you have 4 "window"s , Loop through them using their handle, and print out the title.
10. Optionally , if the title contains Facebook, Close the window|tab.
11. Optionally, if the title contains Amazon , Hover over to Prime from menu option (in between Best Sellers and Customer Service), it will show
"Try Prime" link , Verify it isDisplayed.
12. Optionally, if the title contains Etsy , Scroll until the Enter Your Email input box is in the view.
13. These exercise can be done separately instead of switching to the window, do your best judgement to do them together or separately.
 */