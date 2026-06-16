package Base_Folder;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    public WebDriver driver;

    @BeforeMethod
    public void setup()  {

       WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().window().minimize();

        driver.get("https://omayo.blogspot.com/");
    }

@AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
