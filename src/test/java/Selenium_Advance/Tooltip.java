package Selenium_Advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(); // Initialize driver
        driver.manage().window().maximize();  //Maximize window

        driver.get("https://formstone.dev/components/tooltip/");

        WebElement infoBtn = driver.findElement(By.xpath("//div[@data-title='Left Tooltip']"));

// Use Actions class to hover
        Actions actions = new Actions(driver);
        actions.moveToElement(infoBtn).perform();

// Now get tooltip element text
        //WebElement tooltip = driver.findElement(By.cssSelector(".Tooltip on top"));
        String tooltipText = infoBtn.getText();

        System.out.println("Tooltip text is: " + tooltipText);


        driver.quit();
    }
}
