package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

        WebElement Testcase=driver.findElement(By.id("input-email"));

        if(Testcase.isEnabled()){
            System.out.println("Testcases button is Enabled");
        }
        else {
            System.out.println("Testcase button is not Enabled");
        }


        driver.quit();
    }
}
