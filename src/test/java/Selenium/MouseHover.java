package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MouseHover {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");
        WebElement BlogMenu=driver.findElement(By.id("blogsmenu"));
        Actions action=new Actions(driver);
        action.moveToElement(BlogMenu).perform();
        if (BlogMenu.isDisplayed()) {
            System.out.println("Mouse hover is on BlogMenu");
        }else{
            System.out.println("Mouse hover is not done");
        }

        driver.close();
    }
}
