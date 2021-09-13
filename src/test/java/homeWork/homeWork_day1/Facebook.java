package homeWork.homeWork_day1;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();   //set up chrome driver

        WebDriver driver = new ChromeDriver();    //create chromeDriver object

        driver.navigate().to ("https://facebook.com/");  //Navigate to https://facebook.com

       // driver.get(" https://facebook.com");

        WebElement userNameBox = driver.findElement(By.id("email"));  //Enter username `invalid username` into username box
        userNameBox.sendKeys("lolafredzia1$$");

        WebElement passwordNameBox= driver.findElement(By.id("pass")); //Enter password `some password` password box
        passwordNameBox.sendKeys("margie");

        WebElement loginBtn = driver.findElement(By.name("login"));//Click on the Login button and wait few seconds until error comes back
        loginBtn.click();

        Thread.sleep(5000);

        WebElement forgetPassword = driver.findElement(By.linkText("Forgot Password?"));//Click on `forget password` link
        forgetPassword.click();

        WebElement mobileNumber = driver.findElement(By.id("identify_email"));//Enter `something` into Mobile number text box `123456789`
        mobileNumber.sendKeys(("123456789"));

        WebElement search = driver.findElement(By.id("did_submit"));//Click on the search button
        search.click();

        WebElement cancel = driver.findElement(By.linkText("cancel"));//Click on the cancel button
        cancel.click();

        driver.quit();//Quit the browser

    }
}
/*
1. Open Chrome and Navigate to https://facebook.com
2. Enter username `invalid username` into username box
3. Enter password `some password` password box
4. Click on the Login button and wait few seconds until error comes back
5. Navigate back to login screen
6. Click on `forget password` link
7. Enter `something` into Mobile number text box `123456789`
8. Click on the search button
9. Click on the cancel button
10. Quit the browser
 */