package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility {

    WebDriver driver;
    Actions actions;

    public ActionsUtility(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
    }

    public void clickElement(WebElement element) {
        actions.click(element).perform();
    }

    public void mouseHover(WebElement element) {
        actions.moveToElement(element).perform();
    }

    public void rightClick(WebElement element) {
        actions.contextClick(element).perform();
    }
}
