package Selenium_Advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(); // Initialize driver
        driver.manage().window().maximize();  //Maximize window

        driver.get("https://omayo.blogspot.com/");

//        List<WebElement> checkboxes = driver.findElements(By.xpath("//input [@name='accessories']"));
//
//
//        for (WebElement checkbox : checkboxes) {
//            if (!checkbox.isSelected()) {
//                checkbox.click();
//                System.out.println("Selected checkbox value: " + checkbox.getAttribute("value"));
//            }
//        }


        List<WebElement> checkboxes = driver.findElements(By.xpath("//input [@name='accessories']"));

        for (WebElement checkbox : checkboxes) {
            String value = checkbox.getAttribute("value");

            // Select only Java and Selenium checkboxes
            if (value.equals("Pen") || value.equals("Bag")) {
                checkbox.click();
                System.out.println("Selected checkbox value: " + checkbox.getAttribute("value"));
            }
        }


        Thread.sleep(3000);
        driver.quit();
    }
}
