package Selenium_Advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;


public class OR {

    @Test
    public void verifyFormfield(){
        WebDriverManager.chromedriver();

        WebDriver driver = new ChromeDriver(); // Initialize driver
        driver.manage().window().maximize();  //Maximize window

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

        List<WebElement> alltext=driver.findElements(By.xpath("//input[@type='text' or @class='form-control']"));

        String[] data = {"Pune", "India"};

        for (int i =0; i < data.length; i++) {
            
            //alltext.get(i).sendKeys(data[i]);
        }

    }
}
