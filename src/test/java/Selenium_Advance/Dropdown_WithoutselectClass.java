package Selenium_Advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Dropdown_WithoutselectClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");
        driver.findElement(By.id("dropdownMenu")).click();

// Capture all options
        List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@id='countryList']/li"));

// Loop and select the option you want
        for (WebElement option : allOptions) {
            if (option.getText().equals("USA")) {
                option.click();
                break;
            }
        }

    }
}
