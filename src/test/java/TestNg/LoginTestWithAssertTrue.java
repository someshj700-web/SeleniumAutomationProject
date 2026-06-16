package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTestWithAssertTrue {
    WebDriver driver;

    @BeforeClass
    public void Setup() {
        WebDriverManager.chromedriver();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void loginTest() {
        // Step 1: Navigate to login page
        driver.get("https://omayo.blogspot.com/");



        // Step 3: Check if Welcome message is displayed
        WebElement welcomeMsg = driver.findElement(By.id("selenium143"));
        //boolean isDis = welcomeMsg.isDisplayed();

        // ✅ Assertion
        Assert.assertTrue(welcomeMsg.isDisplayed(), "Message is displayed");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Closing browser...");
        driver.quit();
    }
}

