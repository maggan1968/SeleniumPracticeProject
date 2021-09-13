package homeWork.homeWork_day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextBaseCRMValidLogin_PositiveScenario {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://login.nextbasecrm.com/stream/");

        WebElement userNameBox=driver.findElement(By.name("USER_LOGIN"));

        userNameBox.sendKeys("helpdesk8@cybertekschool.com");

        WebElement passwordBox=driver.findElement(By.name("USER_PASSWORD"));

        passwordBox.sendKeys("UserUser");

        WebElement loginButton=driver.findElement(By.className("login-btn"));

        loginButton.click();

        driver.quit();

    }
}
