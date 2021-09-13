package com.cybertek.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsPracticeUsingXPath {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        String titlebeforeLogInActRes = driver.getTitle();
        String titleBeforeLogInExRes = "Swag Labs";
        if (titlebeforeLogInActRes.equals(titleBeforeLogInExRes) ){
            System.out.println("Expected and Actual results match. \nTest Passed.");
            System.out.println("titleExRes = " + titleBeforeLogInExRes);
            System.out.println("titleActRes = " + titlebeforeLogInActRes);
        }else {
            System.out.println("Expected and Actual results don't match. \nTest Failed.");
            System.out.println("titleExRes = " + titleBeforeLogInExRes);
            System.out.println("titleActRes = " + titlebeforeLogInActRes);
        }

        Thread.sleep(2000);
        System.out.println("----------------------------------------------------------------------------");

        WebElement userNameBox = driver.findElement(By.xpath("//div[@class='login-box']//input[@id='user-name']"));
        userNameBox.sendKeys("standard_user");
        Thread.sleep(2000);

        WebElement passwordBox = driver.findElement(By.xpath("//input[@id='password']"));
        passwordBox.sendKeys("secret_sauce");
        Thread.sleep(2000);

        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginBtn.submit();
        Thread.sleep(2000);
        System.out.println("-------------------------------------------------------------------------------");


        WebElement item1 = driver.findElement(By.xpath("//a/div[text()='Sauce Labs Backpack']"));
        item1.click();
        Thread.sleep(3000);

        WebElement descriptionItem1 = driver.findElement(By.xpath("//div[@class='inventory_details_desc large_size']"));
        System.out.println("descriptionItem1 = " + descriptionItem1.getText());
        WebElement priceItem1 = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
        System.out.println("priceItem1 = " + priceItem1.getText());

        WebElement addItem1Btn = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addItem1Btn.click();
        Thread.sleep(3000);

        WebElement backToProductBtn1 = driver.findElement(By.xpath("//div[@class='left_component']/button[@id='back-to-products']"));
        backToProductBtn1.click();
        Thread.sleep(3000);
        System.out.println("-----------------------------------------------------------------------------");


        WebElement item2 = driver.findElement(By.xpath("//a[@id='item_0_title_link']/div[text()='Sauce Labs Bike Light']"));
        item2.click();
        Thread.sleep(3000);

        WebElement descriptionItem2 = driver.findElement(By.xpath("//div[@class='inventory_details_desc large_size']"));
        System.out.println("descriptionItem2 = " + descriptionItem2.getText());
        WebElement priceItem2 = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
        System.out.println("priceItem2 = " + priceItem2.getText());

        WebElement addItem2Btn = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light' or @name='add-to-cart-sauce-labs-bike-light']"));
        addItem2Btn.click();
        Thread.sleep(3000);

        WebElement backToProductBtn2 = driver.findElement(By.xpath("//div[@class='left_component']/button[@id='back-to-products']"));
        backToProductBtn2.click();
        Thread.sleep(3000);
        System.out.println("----------------------------------------------------------------------------");


        WebElement item3 = driver.findElement(By.xpath("//div[@class='inventory_item_name' and text()='Sauce Labs Bolt T-Shirt']"));
        item3.click();
        Thread.sleep(3000);

        WebElement descriptionItem3 = driver.findElement(By.xpath("//div[@class='inventory_details_desc large_size']"));
        System.out.println("descriptionItem3 = " + descriptionItem3.getText());
        WebElement priceItem3 = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
        System.out.println("priceItem3 = " + priceItem3.getText());

        WebElement addItem3Btn = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addItem3Btn.click();
        Thread.sleep(3000);

        WebElement backToProductBtn3 = driver.findElement(By.xpath("//div[@class='left_component']/button[@id='back-to-products']"));
        backToProductBtn3.click();
        Thread.sleep(3000);
        System.out.println("--------------------------------------------------------------------------------");


        WebElement item4 = driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']"));
        item4.click();
        Thread.sleep(3000);

        WebElement descriptionItem4 = driver.findElement(By.xpath("//div[@class='inventory_details_desc large_size']"));
        System.out.println("descriptionItem4 = " + descriptionItem4.getText());
        WebElement priceItem4 = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
        System.out.println("priceItem4 = " + priceItem4.getText());

        WebElement addItem4Btn = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket' or @data-test='add-to-cart-sauce-labs-fleece-jacket']"));
        addItem4Btn.click();
        Thread.sleep(3000);

        WebElement backToProductBtn4 = driver.findElement(By.xpath("//div[@class='left_component']/button[@id='back-to-products']"));
        backToProductBtn4.click();
        Thread.sleep(3000);
        System.out.println("---------------------------------------------------------------------------------");


        WebElement item5 = driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']"));
        item5.click();
        Thread.sleep(3000);

        WebElement descriptionItem5 = driver.findElement(By.xpath("//div[@class='inventory_details_desc large_size']"));
        System.out.println("descriptionItem5 = " + descriptionItem5.getText());
        WebElement priceItem5 = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
        System.out.println("priceItem5 = " + priceItem5.getText());

        WebElement addItem5Btn = driver.findElement(By.xpath("//div/button[@id='add-to-cart-sauce-labs-onesie']"));
        addItem5Btn.click();
        Thread.sleep(3000);

        WebElement backToProductBtn5 = driver.findElement(By.xpath("//div[@class='left_component']/button[@id='back-to-products']"));
        backToProductBtn5.click();
        Thread.sleep(3000);
        System.out.println("---------------------------------------------------------------------------------");

        WebElement item6 = driver.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']"));
        item6.click();
        Thread.sleep(3000);

        WebElement descriptionItem6 = driver.findElement(By.xpath("//div[@class='inventory_details_desc_container']/div[@class='inventory_details_desc large_size']"));
        System.out.println("descriptionItem6 = " + descriptionItem6.getText());
        WebElement priceItem6 = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
        System.out.println("priceItem6 = " + priceItem6.getText());

        WebElement addItem6Btn = driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
        addItem6Btn.click();
        Thread.sleep(3000);

        WebElement backToProductBtn6 = driver.findElement(By.xpath("//div[@class='left_component']/button[@id='back-to-products']"));
        backToProductBtn6.click();
        Thread.sleep(3000);
        System.out.println("---------------------------------------------------------------------------------");

        WebElement shoppingCartIcon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']/span[@class='shopping_cart_badge']"));
        shoppingCartIcon.click();
        Thread.sleep(3000);

        WebElement removeItem2 = driver.findElement(By.xpath("//div/button[@id='remove-sauce-labs-bike-light']"));
        removeItem2.click();
        Thread.sleep(3000);

        WebElement checkOutBtn = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkOutBtn.click();
        Thread.sleep(3000);
        System.out.println("---------------------------------------------------------------------------------");

        WebElement firstNameBox = driver.findElement(By.xpath("//div[@class='checkout_info']//div//input[@id='first-name']"));
        firstNameBox.sendKeys("Ivana");
        Thread.sleep(2000);

        WebElement lastNameBox = driver.findElement(By.xpath("//div[@class='checkout_info']//div//input[@id='last-name']"));
        lastNameBox.sendKeys("Veljkovic");
        Thread.sleep(2000);

        WebElement zipCodeBox = driver.findElement(By.xpath("//div[@class='checkout_info']//div//input[@id='postal-code']"));
        zipCodeBox.sendKeys("22314");
        Thread.sleep(2000);

        WebElement continueBtn1 = driver.findElement(By.xpath("//input[@id='continue']"));
        continueBtn1.click();
        Thread.sleep(3000);

        WebElement shippingInfo = driver.findElement(By.xpath("//div[@class='summary_info']/div[text()='FREE PONY EXPRESS DELIVERY!']"));
        String shippingInformation = shippingInfo.getText();
        System.out.println("shippingInformation = " + shippingInformation);

        if(shippingInformation.contains("FREE")){
            System.out.println("Congratulation!!! \nYou got - Free Shipping");
        }else {
            System.out.println("Sorry, you didn't get Free Shipping");
        }
        System.out.println("-------------------------------------------------------------------------");

        WebElement itemTotalPrice = driver.findElement(By.xpath("//div[@class='summary_info']/div[@class='summary_subtotal_label']"));
        System.out.println(itemTotalPrice.getText());
        WebElement tax = driver.findElement(By.xpath("//div[@class='summary_info']/div[@class='summary_tax_label']"));
        System.out.println(tax.getText());
        WebElement totalPrice = driver.findElement(By.xpath("//div[@class='summary_info']/div[@class='summary_total_label']"));
        System.out.println(totalPrice.getText());

        WebElement finishBtn = driver.findElement(By.xpath("//button[@id='finish']"));
        finishBtn.click();
        Thread.sleep(3000);
        System.out.println("--------------------------------------------------------------------------------");

        WebElement orderMessage = driver.findElement(By.xpath("//span[text()='Checkout: Complete!']"));
        String orderMessageActRes = orderMessage.getText();
        String orderMessageExpRes = "CHECKOUT: COMPLETE!";

        if(orderMessageExpRes.equals(orderMessageActRes)){
            System.out.println("Test Passed! \nActual and Expected results match!");
            System.out.println("orderMessageExpRes = " + orderMessageExpRes);
            System.out.println("orderMessageActRes = " + orderMessageActRes);
        }else {
            System.out.println("Test Failed! \nActual and Expected results don't match!!!");
            System.out.println("orderMessageExpRes = " + orderMessageExpRes);
            System.out.println("orderMessageActRes = " + orderMessageActRes);
        }
        Thread.sleep(3000);

        WebElement fannyMessage1 = driver.findElement(By.xpath("//h2[@class='complete-header']"));
        String fannyMsg1 = fannyMessage1.getText();
        WebElement fannyMessage2 = driver.findElement(By.xpath("//div[@class='complete-text']"));
        String fannyMsg2 = fannyMessage2.getText();
        System.out.println("Hold your horses: " + fannyMsg1 + "\n"+fannyMsg2);

        WebElement backHomeBtn = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        backHomeBtn.click();
        Thread.sleep(3000);
        System.out.println("-----------------------------------------------------------------");


        WebElement menuIcon = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
        menuIcon.click();
        Thread.sleep(3000);


        WebElement logOutBtn = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
        logOutBtn.click();
        Thread.sleep(3000);
        String titleAfterLogOut = driver.getTitle();

        if(titleBeforeLogInExRes.equals(titleAfterLogOut)){
            System.out.println("Test Passed");
            System.out.println("User successfully logout");
        }else {
            System.out.println("Test Failed!!!");
        }


        driver.quit();

    }

}
