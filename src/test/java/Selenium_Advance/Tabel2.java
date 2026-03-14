package Selenium_Advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tabel2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();

        WebDriver driver = new ChromeDriver(); // Initialize driver
        driver.manage().window().maximize();  //Maximize window

        driver.get("https://cosmocode.io/automation-practice-webtable/");

        WebElement table = driver.findElement(By.xpath("//div[@class='entry-content']"));

        List<WebElement> rows=table.findElements(By.tagName("tr"));

        for(WebElement row:rows){

                System.out.println(row.getText());

        }

    driver.quit();
    }
}
