package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserManagementTest {

    WebDriver driver;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com");

        // Login
        driver.findElement(By.name("username"))
                .sendKeys("Admin");

        driver.findElement(By.name("password"))
                .sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']"))
                .click();
    }

    @Test(priority = 1)
    public void openUserManagement() throws InterruptedException {

        driver.findElement(
                        By.xpath("//span[text()='Admin']"))
                .click();

        Thread.sleep(6000);

        Assert.assertTrue(
                driver.getCurrentUrl().contains("admin"));
    }

    @Test(priority = 2)
    public void verifyUserNameSorting() throws InterruptedException {

        Thread.sleep(6000);

        List<WebElement> userElements =
                driver.findElements(
                        By.xpath("//div[@role='row']/div[2]"));



        List<String> actualList = new ArrayList<>();

        for (WebElement user : userElements) {

            String text = user.getText().trim();

            if (!text.isEmpty()) {
                actualList.add(text);
            }
        }

        List<String> expectedList = new ArrayList<>(actualList);

        Collections.sort(expectedList);

        System.out.println("Actual List = " + actualList);
        System.out.println("Expected List = " + expectedList);

        Assert.assertEquals(actualList, expectedList,"Sorting validation failed");
    }

    @Test(priority = 3)
    public void searchUser() {

        String username = "Username";

        WebElement searchBox =
                driver.findElement(
                        By.xpath(
                                "(//input[contains(@class,'oxd-input')])[2]"));

        searchBox.clear();
        searchBox.sendKeys(username);

        driver.findElement(
                        By.xpath("//button[@type='submit']"))
                .click();

        Assert.assertTrue(true);
    }

    @AfterClass
    public void tearDown() {

        driver.quit();
    }
}

