package Selenium_Advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class And {

    @Test
    public void verifycheckbox(){
        WebDriverManager.chromedriver();

        WebDriver driver = new ChromeDriver(); // Initialize driver
        driver.manage().window().maximize();  //Maximize window

        driver.get("https://omayo.blogspot.com/");


         List<WebElement> check=driver.findElements(By.xpath("//input[@type='checkbox' and @name='accessories']"));
         for(WebElement checks:check){
             checks.click();
             System.out.println(checks.getAttribute("value"));
         }
    }
}
