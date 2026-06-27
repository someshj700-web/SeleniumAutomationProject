package utilities;

import java.util.Set;
import org.openqa.selenium.WebDriver;

public class WindowUtility {

    WebDriver driver;

    public WindowUtility(WebDriver driver) {
        this.driver = driver;
    }

    public String getParentWindow() {
        return driver.getWindowHandle();
    }

    public Set<String> getAllWindows() {
        return driver.getWindowHandles();
    }

    public void switchToWindow(String windowId) {
        driver.switchTo().window(windowId);
    }
}
