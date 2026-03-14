package Selenium_Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GetOptionsExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");


        WebElement dropdownElement = driver.findElement(By.id("drop1"));
        Select dropdown = new Select(dropdownElement);

        List<WebElement> options = dropdown.getOptions();

        System.out.println("Dropdown options:");
//        for(datatype var1:var2){
//            System.out.println(var1);
//        }
        for (WebElement option: options) {
            System.out.println(option.getText());
        }

        driver.quit();
    }
    }

