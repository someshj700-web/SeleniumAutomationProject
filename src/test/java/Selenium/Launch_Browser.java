package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();

        ChromeDriver driver=new ChromeDriver(); // Initialize driver
        driver.manage().window().maximize();  //Maximize window

        driver.get("https://omayo.blogspot.com/");  //Navigate to URL


        driver.quit();  //close the tab
    }
}
