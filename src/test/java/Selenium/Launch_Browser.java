package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Launch_Browser {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver();

        ChromeDriver driver=new ChromeDriver(); // Initialize driver
        driver.manage().window().maximize();  //Maximize window

        driver.get("https://omayo.blogspot.com/");  //Navigate to URL
        driver.manage().window().setSize(new Dimension(800, 600));
        driver.manage().window().fullscreen();
        driver.manage().window().getSize();
        driver.manage().getCookies();
        //driver.quit();  //close the tab
        List<WebElement> links=driver.findElements(By.tagName("a"));

        for(WebElement link:links){

            String allLinks=link.getAttribute("href");



            HttpURLConnection conn=(HttpURLConnection) new URL(allLinks).openConnection();

            conn.setRequestMethod("HEAD");

            conn.connect();


            int statuscode=conn.getResponseCode();

            if(statuscode>=400){
                System.out.println("broken links");

            }else{
                System.out.println("valid links");
            }

        }
    }
}
