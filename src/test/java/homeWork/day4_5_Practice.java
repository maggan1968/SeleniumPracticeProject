package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4_5_Practice {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();


        //2. Create  webdriver instance using Chrome Driver Object to open browser
        WebDriver driver = new ChromeDriver();


        //3. Navigate to https://google.com
        driver.navigate().to("https://google.com");

        WebElement element = driver.findElement(By.className("MV3Tnb"));

        Thread.sleep(2000);



        driver.quit();
    }
}
