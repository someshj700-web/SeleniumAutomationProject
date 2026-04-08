package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgAsserations  {
    @Test
    public void verifyCellNumber(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://tutorialsninja.com/demo/");

        WebElement cellnumber=driver.findElement(By.xpath("//span[text()='123456789']"));

        String cellN=cellnumber.getText();

        Assert.assertTrue(cellN.matches("[0-9]+"),"cellnumber shouldnt match");
        System.out.println("Test is passed:cellnumber should be number "+cellN);

        Assert.assertFalse(cellN.matches("[a-zA-Z]+"),"cellnumber should match");
        System.out.println("Test is passed:cellnumber shouldnot be character "+cellN);

        Assert.assertFalse(cellN.matches("[^a-zA-Z0-9]+"),"cellnumber should match");
        System.out.println("Test is passed:cellnumber shouldnot be specialcharacter "+cellN);

        Assert.assertFalse(cellN.matches("[a-zA-Z ]+"),"cellnumber should match");
        System.out.println("Test is passed:cellnumber shouldnot be space "+cellN);

        Assert.assertFalse(cellN.isEmpty(),"cellnumber should match");
        System.out.println("Test is passed:cellnumber shouldnot be Empty "+cellN);
    }
}
