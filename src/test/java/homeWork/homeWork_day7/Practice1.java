package homeWork.homeWork_day7;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Practice1  extends TestBase {
    /*
    1. Navigate to https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default_default
    2. Verify Header on the right with Text `This is a Heading` is Displayed
    3. Verify paragraph right under above element with Text `This is a paragraph` is Displayed
    4. Click on `Run` Button on menu bar
     */

    @Test
    public void practice1(){

        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default_default");
        driver.switchTo().frame("iframeResult");
        String expectedHeader ="This is a Heading";
        String actualHeader = driver.findElement(By.xpath("//h1")).getText();
        Assertions.assertEquals(expectedHeader,actualHeader);

        driver.switchTo().defaultContent();

        String expected_text1 = "This is a paragraph.";
        String actual_text1 = driver.findElement(By.xpath("//span[.='This is a paragraph.']")).getText();
        Assertions.assertEquals(actual_text1,actual_text1);

        System.out.println("driver.findElement(By.id(\"runbtn\")).isEnabled() = " + driver.findElement(By.id("runbtn")).isEnabled());

        driver.findElement(By.id("runbtn")).click();


    }




}
