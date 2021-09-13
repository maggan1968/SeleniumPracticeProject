package homeWork.homeWork_day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWork1 {
    private static List<WebElement> Links;

    public static void main(String[] args) {
        /*
        1.	navigate to https://google.com
        2.	search for selenium
        3.	click google search button
        4.	identify the div that hold the search result count on next page About 95,900,000 results (0.58 seconds)
        5.	get the text of that element
        6.	Optionally , if you want some java practice , go ahead and extract the number of result and save it into long variable OPTIONALLy
        7.	get all the link that contain text selenium into a List
        8.	get the count
        9.	get the first one text
        10.	get the last one text
        11.	iterate over the list and print the text of each link
        12.	watch the short to learn more about findElement(By.tagName("tag here"))
        13.	watch the short to learn more about element.getAttribute("attribute goes here")

         */


        WebDriverManager.chromedriver().setup();   //set up chrome driver

        WebDriver driver = new ChromeDriver();    //create chromeDriver object

        driver.navigate().to("https://google.com/");  //Navigate to https://google.com

        //search for `selenium`
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");

        //get tag name

        System.out.println("searchBox.getTagName() = " + searchBox.getTagName());

        //get attributes

        System.out.println("searchBox.getAttribute(\"name\") = " + searchBox.getAttribute("name"));

        // click google search button

        searchBox.submit();

        // identify the div that hold the search result count on next page `About 95,900,000 results (0.58 seconds)`

        WebElement searchResult=driver.findElement(By.id("result-stats"));


        //get the text of that element

        System.out.println("searchResult.getText() = " + searchResult.getText());

        // Optionally , if you want some java practice , go ahead and extract the number of result and save it into long variable OPTIONALLy

        System.out.println(String.valueOf(searchResult.getText().substring(6,16)));


        // get all the link that contain text `selenium` into a List<WebElement>
        List<WebElement> allSelenium=driver.findElements(By.partialLinkText("Selenium"));


        // get the count
        System.out.println("All selenium text size is:"+allSelenium.size());
        //get the first one text

        System.out.println(allSelenium.get(0).getText());
        // get the last one text

        System.out.println(allSelenium.get(allSelenium.size() - 1).getText());

        // iterate over the list and print the text of each link

        for (WebElement eachSelenium : allSelenium) {
            System.out.println(eachSelenium.getText());
        }

        //navigate go back google homepage

        driver.navigate().back();

        // watch the short to learn more about `findElement(By.tagName("tag here"))`

        List <WebElement> aTagList=driver.findElements(By.tagName("a"));
        for (WebElement eachaTag : aTagList) {
            System.out.println(eachaTag.getText());
        }
        System.out.println("aTagList.size() = " + aTagList.size());




        driver.quit();
    }
}