package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Get_Current_Page_Title {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2");

        String title=driver.getTitle();
        System.out.println("Get_Current_Page_Title:" +title);
        driver.navigate().refresh();

        Thread.sleep(5000);
        driver.quit();
    }
}
