package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GetText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       WebElement Testcase=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")));

       //WebElement Testcase=driver.findElement(By.id("input-email"));
        String gettext=Testcase.getText();
        System.out.println("GetText:" +gettext);

        driver.quit();
    }
}
