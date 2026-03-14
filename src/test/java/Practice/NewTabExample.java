package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class NewTabExample {

    @Test(priority = 1)
    public void verifyTitle() {
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.get("https://omayo.blogspot.com/");

        String actual_title=driver.getTitle();


        Assert.assertEquals(actual_title, "omayo (QAFox.com)","Title is mismatached");
        System.out.println("Testcases is passed:Title should be matched");

        driver.quit();
    }



    @Test(priority = 2)
    public void verifyTitleConatinsString(){
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.get("https://omayo.blogspot.com/");

        WebElement actual_title=driver.findElement(By.xpath("//a[text()='Page One']"));

        Assert.assertTrue(actual_title.getText().matches("[a-zA-Z ]+"), "Title contains numbers");
        System.out.println("Testcases is passed:Title should be String only");

        driver.quit();
    }
    @Test(priority = 3)
    public void verifyTitleNotEmpty(){
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.get("https://omayo.blogspot.com/");

        WebElement actual_title=driver.findElement(By.xpath("//a[text()='Page One']"));

        Assert.assertFalse(actual_title.getText().isEmpty(), "Title contains numbers");
        System.out.println("Testcases is passed:Title should be String only");

        driver.quit();
    }
}
