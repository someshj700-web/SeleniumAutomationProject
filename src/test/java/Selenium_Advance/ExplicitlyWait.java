package Selenium_Advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitlyWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(35));
        WebElement helloText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("drop1")));



        Select drop=new Select(helloText);
        drop.selectByVisibleText("doc 1");

        WebElement select=drop.getFirstSelectedOption();
        System.out.println("Selected option :" +select.getText());

        driver.close();
    }
}
