package homeWork.homeWork_day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class NextBaseCRInvalidLigin_NegativeScenario {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();   //set up chrome driver
        WebDriver driver = new ChromeDriver();    //create chromeDriver object

        driver.get("https://login.nextbasecrm.com/stream/");

        WebElement userNameBox=driver.findElement(By.name("USER_LOGIN"));

        userNameBox.sendKeys("helpdesk999@cybertekschool.com");

        WebElement passwordBox=driver.findElement(By.name("USER_PASSWORD"));

        passwordBox.sendKeys("user1234");

        WebElement loginButton=driver.findElement(By.className("login-btn"));

        loginButton.click();

        driver.quit();

    }
}



/*
As a user from a HelpDesk I should be able to login to the NextBaseCRM.

negative scenario

 */