package Selenium_Advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");

        WebElement dropdown=driver.findElement(By.id("drop1"));

        Select select=new Select(dropdown);

        select.selectByVisibleText("doc 1");
//        Thread.sleep(5000);
//        WebElement News=select.getFirstSelectedOption();
//        System.out.println("Selecetd Option :" +News.getText());

//        select.selectByIndex(2);
//        Thread.sleep(5000);
//        WebElement News2=select.getFirstSelectedOption();
//        System.out.println("Selecetd Option :" +News2.getText());

//        select.selectByValue("mno");
//        Thread.sleep(5000);
//        WebElement News3 =select.getFirstSelectedOption();
//        System.out.println("Selecetd option :" +News3.getText());

        driver.close();

    }
}
