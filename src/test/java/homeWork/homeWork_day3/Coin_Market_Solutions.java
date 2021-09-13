package homeWork.homeWork_day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coin_Market_Solutions {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate to https://coinmarketsolutions.com/
        driver.get("https://coinmarketsolutions.com/");

        WebElement pageTitle = driver.findElement(By.linkText("Coin Market Solutions"));
        System.out.println("pageTitle.getText = " + pageTitle.getText());


    }
}
