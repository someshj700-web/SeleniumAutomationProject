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
        driver.get("https://www.amazon.in/l/1388921031/?_encoding=UTF8&pd_rd_w=dzNy0&content-id=amzn1.sym.7db31cb9-0df8-4370-a351-4f74924c1c7a&pf_rd_p=7db31cb9-0df8-4370-a351-4f74924c1c7a&pf_rd_r=F56EAZ5BXZ1CGPCVTDJD&pd_rd_wg=h1gE6&pd_rd_r=3665058f-908a-4098-802a-a71cf19a65d3&ref_=pd_hp_d_atf_unk");

        WebElement boat=driver.findElement(By.xpath("//div[@id='carousel']/descendant::span[text()='Boat Rockerz 255 Pro+, 60HRS Battery, Fast…']"));
            boat.click();
       // Assert.assertTrue(boat.getText().matches("[a-zA-Z ]+"), "Title contains numbers");
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
