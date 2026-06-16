package Selenium;

import Base_Folder.BaseTestproperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsDisplay extends BaseTestproperties {

    @Test
    public  void verifyvisibilty () {

        WebElement Testcase=driver.findElement(By.id("input-email"));

        Assert.assertTrue(Testcase.isDisplayed());
        System.out.println("Test passed");


        driver.quit();
    }
}
