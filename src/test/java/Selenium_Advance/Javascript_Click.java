package Selenium_Advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Click {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");


        Thread.sleep(2000);

        //Scroll into view using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement click=driver.findElement(By.id("alert1"));
        js.executeScript("arguments[0].click()",click);

        driver.quit();
    }
}
