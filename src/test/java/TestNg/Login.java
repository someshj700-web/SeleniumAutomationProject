package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {

@Test
    public void verifyErrorMessage(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

        driver.findElement(By.xpath("//input[@value='Login']")).click();

        WebElement error=driver.findElement(By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']"));

        Assert.assertEquals(error.getText(),"Warning: No match for E-Mail Address and/or Password.","Error message shouldnot be matched");
        System.out.println("Test is passed : Error message matched "+error.getText());


      WebElement  emailid=driver.findElement(By.id("input-email"));
      String placeholder=emailid.getAttribute("placeholder");

      Assert.assertEquals(placeholder,"E-Mail Address","placeholder mismatched");
      System.out.println("Test is passed: Placeholder matched "+placeholder);
        driver.quit();
    }
}
