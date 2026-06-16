package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class AllElements {

    @Test
    public void verifyAlloptions(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        WebElement all=driver.findElement(By.xpath("//a[text()='Page One' or @id='link1]"));
        System.out.println(all.getText());

    }
}
