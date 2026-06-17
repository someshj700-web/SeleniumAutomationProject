package TestNg2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class sample3 {

    @Test(enabled = false)
    public void verifypage(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        driver.quit();

    }
    @Test
    public void verifytitle(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        WebElement word=driver.findElement(By.xpath("//div[@class='widget-content']/descendant::ol/li[text()='One']"));

        String words=word.getText();
        System.out.println(words);
        System.out.println("completed");

        driver.quit();

    }

}
