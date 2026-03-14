package Selenium_Advance;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class ScreenshotOnFailure {
    WebDriver driver;

    @Test
    public void testExample() {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        // This will fail
        driver.findElement(By.id("nonExistingElement")).click();
    }

    @AfterMethod
    public void captureScreenshot(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(src, new File("./Screenshot/" + result.getName() + ".jpg"));
                System.out.println("Screenshot taken for failed test: " + result.getName());
            } catch (IOException e) {
                System.out.println("Error saving screenshot: " + e.getMessage());
            }
        }
        driver.quit();
    }
}

