package utilities;

import org.openqa.selenium.WebDriver;

public class FrameUtility {

    WebDriver driver;

    public FrameUtility(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToFrame(String frameId) {
        driver.switchTo().frame(frameId);
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    public void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }
}
