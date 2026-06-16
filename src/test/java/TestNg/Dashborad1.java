package TestNg;

import Page_Folder.CheckBoxPageclass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dashborad1 {
    WebDriver driver;

    @Test
    public void verifyCheckboxes(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        CheckBoxPageclass boex=new CheckBoxPageclass(driver);
        boex.checkboesx();
    }
}
