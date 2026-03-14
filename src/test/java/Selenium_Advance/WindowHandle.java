package Selenium_Advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");


        // Click on link that opens a new window
        WebElement link = driver.findElement(By.id("selenium143"));
        link.click();

        // Get the current window handle (parent)
        String mainwindow = driver.getWindowHandle();

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(mainwindow)) {
                // Switch to child window
                driver.switchTo().window(window);
                System.out.println("Child Window Title: " + driver.getTitle());

                // Do something in child window
                driver.close(); // Close child window
            }
        }

        // Switch back to parent window
        driver.switchTo().window(mainwindow);
        System.out.println("Back to Parent Window: " + driver.getTitle());

        driver.quit();
    }
}
