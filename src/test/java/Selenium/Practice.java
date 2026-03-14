package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.TaggedIOException;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Practice {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(); // Initialize driver
        driver.manage().window().maximize();  //Maximize window

        driver.get("https://www.imsindia.com/");
        driver.findElement(By.id("facebook-2")).click();
        driver.findElement(By.id("Ellipse_5")).click();


        Set<String> allWindows = driver.getWindowHandles();


        List<String> windowsList = new ArrayList<>(allWindows);


        driver.switchTo().window(windowsList.get(1));


        Thread.sleep(3000);


        driver.quit();

    }
}
