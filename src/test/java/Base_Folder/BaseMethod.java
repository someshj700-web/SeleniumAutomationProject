package Base_Folder;

import Page_Folder.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseMethod {
    public WebDriver driver;
    LoginPage login;

    @BeforeMethod
    public void setup() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        //driver.manage().window().minimize();

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        Thread.sleep(3000);
        login = new LoginPage(driver);

        login.login(
                "somesh123@yopmail.com",
                "Somesh@123");

        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

