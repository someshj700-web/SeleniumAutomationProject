package Page_Folder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {
    WebDriver driver;

    public DashBoard(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy (id="but2")
    WebElement submitbutton;

    @FindBy (id="ta1")
    WebElement textbox;

    public void clickbutton(){
        submitbutton.click();
    }

    public void Textbox(String text){
        textbox.sendKeys(text);
    }


}
