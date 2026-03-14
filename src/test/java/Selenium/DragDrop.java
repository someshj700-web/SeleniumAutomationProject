package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        WebElement sourse=driver.findElement(By.xpath("//ul[@id='gallery']/child::li[1]"));
        WebElement target=driver.findElement(By.id("trash"));
        Actions action=new Actions(driver);
        action.dragAndDrop(sourse,target).perform();
        Thread.sleep(2000);

        // Optional: verify if dropped successfully
        String text = target.getText();
        if (text.equals("Dropped!")) {
            System.out.println("Drag and drop successful.");
        } else {
            System.out.println("Drag and drop failed.");
        }

        driver.close();


    }
}
