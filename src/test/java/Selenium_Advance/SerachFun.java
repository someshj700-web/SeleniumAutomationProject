package Selenium_Advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SerachFun {

    @Test
    public void verifySearchFunctResult() throws InterruptedException {
        WebDriverManager.chromedriver();

        WebDriver driver = new ChromeDriver(); // Initialize driver
        driver.manage().window().maximize();  //Maximize window

        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");

        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.sendKeys("iPhone");

        // Step 2: Click search button
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();

        // Wait for results (temporary - better use WebDriverWait)
        Thread.sleep(3000);

        // Step 3: Capture all results
        List<WebElement> results = driver.findElements(By.xpath("//div[@class='col-sm-12']"));

        // Step 4: Print results
        for (WebElement ele : results) {
            System.out.println(ele.getText());
        }


        driver.quit();
    }
}
