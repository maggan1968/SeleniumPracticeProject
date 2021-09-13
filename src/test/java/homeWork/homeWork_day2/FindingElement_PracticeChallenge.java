package homeWork.homeWork_day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingElement_PracticeChallenge {
    public static void main(String[] args) throws InterruptedException{


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        System.out.println("driver.getTitle() = " + driver.getTitle());

        WebElement usernameBox = driver.findElement(By.id("user-name"));
        usernameBox.sendKeys("standard_user");

        Thread.sleep(2000);

        WebElement passwordBox = driver.findElement(By.id("password"));
        passwordBox.sendKeys("secret_sauce");

        Thread.sleep(2000);

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.submit();

        Thread.sleep(2000);

        WebElement firstElement = driver.findElement(By.className("inventory_item_name"));


        WebElement item1Price = driver.findElement(By.className("inventory_item_price"));
        System.out.println("item1Price.getText() = " + item1Price.getText());

        List<WebElement> allList = driver.findElements(By.className("inventory_item_name"));
        System.out.println("allList.size() = " + allList.size());

        for (WebElement eachElement : allList) {
            System.out.println("eachElement = " + eachElement.getText());
        }

        WebElement cart = driver.findElement(By.id("shopping_cart_container"));
        cart.click();

        Thread.sleep(2000);

        WebElement continueShopping = driver.findElement(By.id("continue-shopping"));
        continueShopping.click();






        Thread.sleep(3000);
        driver.quit();










        Thread.sleep(2000);
        driver.quit();
    }
}


