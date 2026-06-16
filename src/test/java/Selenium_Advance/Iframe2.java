package Selenium_Advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Iframe2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        List<WebElement> count = driver.findElements(By.tagName("iframe"));
        System.out.println("Total frames: " + count.size());

        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for iframe and switch
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iframe1"));

        // Now inside iframe: click on "Home" link
        WebElement homeLink = driver.findElement(By.linkText("What is Selenium?"));
        homeLink.click();

        // Switch back to main page
        driver.switchTo().defaultContent();

        System.out.println("✅ Clicked on What is Selenium? inside iframe successfully.");

        driver.quit();


    }
}
