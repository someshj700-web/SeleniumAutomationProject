package Selenium_Advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class NoSuchElementException {
    public static void main(String[] args) {

        WebDriverManager.chromedriver();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        element.sendKeys("test");


//        List<WebElement> elements = driver.findElements(By.id("username"));
//        if (elements.size() > 0) {
//            elements.get(0).sendKeys("test");
//        } else {
//            System.out.println("Element not found.");
//        }

//        try {
//            WebElement element = driver.findElement(By.id("username"));
//            element.sendKeys("test");
//        } catch (org.openqa.selenium.NoSuchElementException e) {
//            System.out.println("⚠️ Element not found: " + e.getMessage());
//        }


        driver.quit();

    }
}
