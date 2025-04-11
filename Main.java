package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;



public class Main {
    public static void main(String[] args) {
        // defining the options to run Chrome in headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        // initializing a Selenium WebDriver ChromeDriver instance
        // to run Chrome in headless mode
        WebDriver driver = new ChromeDriver(options);

        // connecting to the target web page
        driver.get("https://www.scrapingcourse.com/ecommerce/");
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
