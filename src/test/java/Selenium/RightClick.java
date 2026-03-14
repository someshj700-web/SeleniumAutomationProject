package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");
        WebElement RightClick=driver.findElement(By.className("titlewrapper"));
        Actions action=new Actions(driver);
        action.contextClick(RightClick).perform();

        if (RightClick.isDisplayed()) {
            System.out.println("RightClick on the screen");
        }else{
            System.out.println("RightClick is not done");
        }

        driver.close();
    }
}
