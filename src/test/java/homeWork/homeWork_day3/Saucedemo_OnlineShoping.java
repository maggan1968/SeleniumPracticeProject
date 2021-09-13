package homeWork.homeWork_day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Saucedemo_OnlineShoping {

    public static void main(String[] args) {

        // setup chromeDrive and Open chrome Browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        //navigate to https://saucedemo.com
        driver.get("https://saucedemo.com");

        //print out the page title
        WebElement pageTitle = driver.findElement(By.className("login_logo"));
        System.out.println("pageTitle.getText() = " + pageTitle.getText());

        //enter username provided: standard_user
        WebElement userNameBox = driver.findElement(By.id("user-name"));
        userNameBox.sendKeys("standard_user");

        //enter password provided: secret_sauce
        WebElement passwordNameBox = driver.findElement(By.id("password"));
        passwordNameBox.sendKeys("secret_sauce");

        //click on Login button to Log in
         WebElement loginBtn = driver.findElement(By.id("login-button"));
         loginBtn.click();

        //get the name and price of first product
        WebElement firstProduct= driver.findElement(By.id("item_4_title_link"));
        System.out.println("firstProduct.getText() = " + firstProduct.getText());

        WebElement firstProductPrice= driver.findElement(By.className("inventory_item_price"));
        System.out.println("firstProductPrice.getText() = " + firstProductPrice.getText());

        //get all product names into List<WebElement>
        List<WebElement>allProductNameElements = driver.findElements(By.className("inventory_item_name"));
        //get the count
        System.out.println("allProductNameElements.size() = " + allProductNameElements.size());
        //print out the text of all products:
         for (WebElement eachElement : allProductNameElements){
             System.out.println("eachElement.getText() = " + eachElement.getText());

    }

        //click on the shopping cart link top right corner
WebElement shoppingCart = driver.findElement(By.id("shopping_cart_container"));
shoppingCart.click();
       // click on continue to shop button to come back to product page

WebElement continueShopping =driver.findElement(By.id("continue-shopping"));
        continueShopping.click();
        //quit the browser
        driver.quit();
    }
}
