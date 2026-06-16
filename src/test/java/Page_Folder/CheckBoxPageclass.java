package Page_Folder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckBoxPageclass {
    WebDriver driver;

    public CheckBoxPageclass(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//input[@name='accessories']")
    List<WebElement> selectCheckbox;

    public void checkboesx(){
        for(WebElement selectCheckboxes:selectCheckbox ){
            selectCheckboxes.click();
        }
    }

}
