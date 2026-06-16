package Selenium_Advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Tabel2 {

    @Test
    public  void verifyAllTabel(){
        WebDriverManager.chromedriver();

        WebDriver driver = new ChromeDriver(); // Initialize driver
        driver.manage().window().maximize();  //Maximize window

        driver.get("https://practice.expandtesting.com/tables");

        WebElement table = driver.findElement(By.id("table1"));

        List<WebElement> rows=table.findElements(By.tagName("tr"));
        System.out.println(rows.size());
        for(WebElement row:rows){

                System.out.println(row.getText());

        }

    driver.quit();
    }
}
