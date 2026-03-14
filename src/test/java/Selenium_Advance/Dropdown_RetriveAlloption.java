package Selenium_Advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown_RetriveAlloption {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");

        WebElement dropdown=driver.findElement(By.id("drop1"));

        Select select=new Select(dropdown);

        List<WebElement> allOption = select.getOptions();

        //Iterate through for each loop

        for (WebElement option:allOption){
            System.out.println(option.getText());
        }

        driver.quit();


    }
}
