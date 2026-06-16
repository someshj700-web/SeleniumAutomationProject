package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Imageretrive {

    @Test
    public void verifyAllImageonapage(){
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.get("https://tutorialsninja.com/demo/");
        List<WebElement> allimage=driver.findElements(By.tagName("img"));
        System.out.println(allimage.size());
        System.out.println("ALlImages :"+allimage.size());
        driver.quit();
    }

    @Test
    public void verifyAlllinks(){
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.get("https://tutorialsninja.com/demo/");
        List<WebElement> alllinks=driver.findElements(By.tagName("a"));
        System.out.println("ALllinks :"+alllinks.size());


         driver.quit();
    }

}
