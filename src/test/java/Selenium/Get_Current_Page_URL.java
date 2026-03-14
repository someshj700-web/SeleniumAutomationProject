package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Current_Page_URL {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.automationexercise.com/");

        String URL=driver.getCurrentUrl();
        System.out.println("Get_Current_Page_Title:" +URL);

        driver.quit();
    }
}
