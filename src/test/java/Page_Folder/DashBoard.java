package Page_Folder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {
    WebDriver driver;//class level variable like driver

    public DashBoard(WebDriver driver){
        this.driver=driver;//local variable
        PageFactory.initElements(driver,this);
    }
    @FindBy (id="but2")
    WebElement submitbutton;

    @FindBy (id="ta1")
    WebElement textbox;

    public void clickSubmitButton(){
        submitbutton.click();
    }


    public void enterText(String text){
        textbox.sendKeys(text);
    }

    public String getenterText(){
        return textbox.getAttribute("value");
   }

}
