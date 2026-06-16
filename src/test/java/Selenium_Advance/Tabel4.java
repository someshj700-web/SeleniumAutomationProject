package Selenium_Advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Tabel4 {

    @Test
    public void verifyNeattabelstruture(){
        WebDriverManager.chromedriver();

        WebDriver driver = new ChromeDriver(); // Initialize driver
        driver.manage().window().maximize();  //Maximize window

        driver.get("https://practice.expandtesting.com/tables");

        WebElement table = driver.findElement(By.id("table1"));

        List<WebElement> rows=table.findElements(By.tagName("tr"));

        for(WebElement row:rows){

            List<WebElement> cols = row.findElements(By.tagName("td"));

            for (WebElement col : cols) {
                System.out.print(col.getText() + " | ");
            }

            System.out.println();

        }
    }
}
