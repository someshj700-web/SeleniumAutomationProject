package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/tool-tips");

        // Locate the hover button
        WebElement hoverButton = driver.findElement(By.id("toolTipButton"));

        // Perform mouse hover using Actions class
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverButton).perform();

        // Wait until tooltip appears
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement tooltip = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".tooltip-inner"))
        );

        // Print tooltip text
        System.out.println("Tooltip text: " + tooltip.getText());

        driver.quit();
    }
}
