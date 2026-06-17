package TestNg2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Checkboxes {

    @Test(groups = "smoke")
    public void verifycheck() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        driver.findElement(By.id("checkbox1")).click();

        Thread.sleep(2000);

        List<WebElement> list = driver.findElements(
                By.xpath("//input[@id='checkbox1' or @id='checkbox2']"));

        System.out.println(list.size());
        for (WebElement cb : list) {
            if (!cb.isSelected()) {
                cb.click();
            }
        }
        driver.quit();
    }
}
