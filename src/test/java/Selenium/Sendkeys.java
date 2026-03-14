package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");
        WebElement textfield=driver.findElement(By.id("ta1"));
        textfield.sendKeys("Hello this is somesh jadhav");

        //String text=textfield.getAttribute("value");
        System.out.println(textfield.getAttribute("value"));


        driver.quit();

    }
}
