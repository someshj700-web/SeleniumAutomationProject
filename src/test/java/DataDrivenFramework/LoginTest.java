package DataDrivenFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

    @Test(dataProvider = "excelData")
    public void loginTest(String username, String password) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.quit();
    }

    @DataProvider(name = "excelData")
    public Object[][] getData() {
        return ExcelUtil.getExcelData(
                "C:\\Users\\somes\\IdeaProjects\\Testing\\src\\test\\resourse\\LoginData.xlsx",
                "LoginData"

        );
    }
}

