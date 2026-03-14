package Selenium_Advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement dropdown=driver.findElement(By.id("drop1"));

        Select drop=new Select(dropdown);
        drop.selectByVisibleText("doc 1");

        WebElement select=drop.getFirstSelectedOption();
        System.out.println("Selected option :" +select.getText());

        driver.close();

    }
}
