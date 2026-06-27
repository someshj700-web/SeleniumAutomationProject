package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.AlertUtility;

public class alertinterface {

    @Test
    public void verifyAlert() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.get("https://omayo.blogspot.com/");

        WebElement clicks = driver.findElement(By.id("alert1"));
        clicks.click();

        Thread.sleep(2000);

        // Now handle the alert
        Alert ale = driver.switchTo().alert(); // ✅ Works after correct import

        Assert.assertTrue(ale.getText().contains("Hello"));
        System.out.println("Test is pass:"+ale.getText());



        driver.quit();
    }
}
