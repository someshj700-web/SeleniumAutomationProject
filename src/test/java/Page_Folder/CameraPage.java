package Page_Folder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v132.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CameraPage {
    WebDriver driver;

    public CameraPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//a[text()='Cameras']")
    WebElement CameraLink;

    @FindBy (id = "input-sort")
    WebElement sortByDropdown;

    @FindBy (xpath = "//div[@class='caption']")
    WebElement cameraNikonD300;

    @FindBy (xpath = "//a[text()='Nikon D300']")
    WebElement NikonD300;

    @FindBy(xpath = "//a[text()='Reviews (0)']")
   WebElement reviewslink;
    @FindBy (xpath = "//div[@class='col-sm-12']/input[2]")
    WebElement good1radio;

    @FindBy (xpath = "//div[@class='col-sm-12']/input[3]")
    WebElement good2radio;

    public void clickCameraLink(){
        CameraLink.click();
    }

    public void selectsortByDropdown(String sortBy){
        Select select=new Select(sortByDropdown);
        select.selectByVisibleText(sortBy);

    }
    public String getSelectedsortByDropdown() {
        Select select = new Select(sortByDropdown);
        return select.getFirstSelectedOption().getText();
    }

    public List<WebElement> getAllsortByDropdownOptions() {
        Select select = new Select(sortByDropdown);
        return select.getOptions();
    }

    public String getcameraNikonD300Text(){
       return cameraNikonD300.getText();
    }

    public void clickNikonD300(){
        NikonD300.click();
    }

    public void clickReviewsLink(){
        reviewslink.click();
    }



    public void selectgood1radio(){
        good1radio.click();
    }

    public void selectgood2radio(){
        good2radio.click();
    }

    public boolean isGood1Selected() {
        return good1radio.isSelected();
    }

    public boolean isGood2Selected() {
        return good2radio.isSelected();
    }

}
