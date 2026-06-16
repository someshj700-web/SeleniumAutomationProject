package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Sample_Testing {

    @Test
    public void verifylink() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        driver.findElement(By.xpath("'//a[text()='Page One']")).click();//invalid loctors

        //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iframe1"));

        driver.quit();
        }

}
