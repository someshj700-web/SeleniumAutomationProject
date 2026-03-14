package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertinterface {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        WebElement clicks = driver.findElement(By.id("alert1"));
        clicks.click();

        // Now handle the alert
        Alert ale = driver.switchTo().alert(); // ✅ Works after correct import
        System.out.println("Alert text: " + ale.getText());
        ale.accept();

        driver.quit();
    }
}
