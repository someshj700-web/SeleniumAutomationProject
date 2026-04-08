package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();

        ChromeDriver driver=new ChromeDriver(); // Initialize driver
        driver.manage().window().maximize();  //Maximize window

        driver.get("https://omayo.blogspot.com/");  //Navigate to URL
        driver.manage().window().setSize(new Dimension(800, 600));
        driver.manage().window().fullscreen();
        driver.manage().window().getSize();
        driver.manage().getCookies();
        //driver.quit();  //close the tab
    }
}
