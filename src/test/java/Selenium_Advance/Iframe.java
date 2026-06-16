package Selenium_Advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://docs.oracle.com/javase/8/docs/api/");

        int count = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total frames: " + count);

        // Switch to iframe using id
        driver.switchTo().frame("classFrame");//passed the name locater

        // Now inside iframe: click on "Home" link
        WebElement homeLink = driver.findElement(By.linkText("Description"));
        homeLink.click();

        // Switch back to main page
        driver.switchTo().defaultContent();

        System.out.println("✅ Clicked on Home link inside iframe successfully.");

        driver.quit();
    }
}
