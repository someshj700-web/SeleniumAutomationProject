import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();

        // 3. Open login page
        driver.get("https://demo.peppercloud.com/login");

        // 4. Maximize browser window
        driver.manage().window().maximize();

        // 5. Enter username
        WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
        username.sendKeys("qa-tester@peppercloud.io");

        driver.findElement(By.xpath("//button[text()='Next']")).click();

        Thread.sleep(1000);
        // 6. Enter password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("PC*Admin@700");

        Thread.sleep(1000);
        // 7. Click Login button
        WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login']"));
        loginBtn.click();

        // 8. Wait for page to load
        Thread.sleep(5000);

        // 9. Validate successful login
        String expectedUrl = "Pepper Cloud CRM - Simple CRM for Smart People";
        String actualUrl = driver.getTitle();

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("✅ Login Successful - Test Passed");
        } else {
            System.out.println("❌ Login Failed - Test Failed");
        }

        // 10. Close browser
        driver.quit();
    }
}

