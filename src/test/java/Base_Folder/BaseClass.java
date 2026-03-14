package Base_Folder;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.ConfigReader;

import java.time.Duration;

public class BaseClass {

    public WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {

       WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        ConfigReader config = new ConfigReader();
        driver.get(config.getBaseURL());
    }

@AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
