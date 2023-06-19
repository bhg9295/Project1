package comnopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
        // Launch the ChromeBrowser
        WebDriver driver = new ChromeDriver();
        // Open the Browser
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
        String title = driver.getTitle();
        System.out.println(" Page title " + title);
        //Get the Print Url
        System.out.println("Current url " + driver.getCurrentUrl());
        // Get the page souce
        System.out.println("Page Sourse" + driver.getPageSource());
        //Enter the Email Filed
        WebElement emailfiled = driver.findElement(By.id("Email"));
        // get the email filed
        emailfiled.sendKeys("bhg929@gmail.com");
        //get the password into password filed
        driver.findElement(By.id("Password")).sendKeys("1234bhg");
        //close the  Browser
        driver.close();


    }
}
