package Tests;

import Base_Folder.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 extends  BaseClass {

    @Test
    public void RadioVerify(){

        WebElement male=driver.findElement(By.id("radio1"));
        male.click();

        Assert.assertEquals(male.isSelected(), true, "Male radio button should be selected");
    }


}
