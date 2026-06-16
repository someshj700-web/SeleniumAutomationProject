package Base_Folder;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import utilities.ConfigReader;

public class BaseTestproperties {

    protected WebDriver driver;
    protected String baseUrl;

    @BeforeMethod
    public void setUp() {

        // 👉 Read from properties
        String browser = ConfigReader.get("browser");
        String env = ConfigReader.get("env");

        // 👉 Browser setup
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\somes\\Downloads\\edgedriver_win32\\msedgedriver.exe");
            driver = new EdgeDriver();
        }

        // 👉 Environment setup
        if (env.equalsIgnoreCase("qa")) {
            baseUrl = ConfigReader.get("qa.url");
        } else if (env.equalsIgnoreCase("prod")) {
            baseUrl = ConfigReader.get("prod.url");
        }

        // 👉 Open URL
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();


    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}
