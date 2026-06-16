package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().minimize();

        driver.get("https://practice.expandtesting.com/tooltips");

        WebElement choosefile=driver.findElement(By.id("btn3"));

        // Step 1: Hover
        Actions action=new Actions(driver);
        action.moveToElement(choosefile).perform();
        
        // Step 2: Tooltip locate
        WebElement label=driver.findElement(By.xpath("//button[text()='Tooltip on bottom']"));

        // Step 3: Get text
        String text=label.getText();
        System.out.println(text);

    }
}
