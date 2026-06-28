package Page_Folder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v132.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.WaitUtility;

import java.util.List;

public class CameraPage {
    WebDriver driver;
    WaitUtility wait;

    public CameraPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait = new WaitUtility(driver);
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

    @FindBy (xpath = "//a[text()='Desktops']")
    WebElement desktopmenu;

    @FindBy(tagName = "a")
    List<WebElement> allLinks;

    public void clickCameraLink(){
        wait.waitForClickable(CameraLink);
         CameraLink.click();
    }

    public void selectsortByDropdown(String sortBy){
        wait.waitForClickable(sortByDropdown);
        Select select=new Select(sortByDropdown);
        select.selectByVisibleText(sortBy);

    }
    public String getSelectedsortByDropdown() {
        wait.waitForVisibility(sortByDropdown);
        Select select = new Select(sortByDropdown);
        return select.getFirstSelectedOption().getText();
    }

    public List<WebElement> getAllsortByDropdownOptions() {
        wait.waitForClickable(sortByDropdown);
        Select select = new Select(sortByDropdown);
        return select.getOptions();
    }

    public String getcameraNikonD300Text(){
        wait.waitForVisibility(cameraNikonD300);
       return cameraNikonD300.getText();
    }

    public void clickNikonD300(){
        wait.waitForClickable(NikonD300);
        NikonD300.click();
    }

    public void clickReviewsLink(){
        wait.waitForClickable(reviewslink);
        reviewslink.click();
    }

    public void selectgood1radio(){
        wait.waitForClickable(good1radio);
        good1radio.click();
    }

    public void selectgood2radio(){
        wait.waitForClickable(good2radio);
        good2radio.click();
    }

    public boolean isGood1Selected() {
        wait.waitForClickable(good1radio);
        return good1radio.isSelected();
    }

    public boolean isGood2Selected() {
        wait.waitForClickable(good2radio);
        return good2radio.isSelected();
    }

    public WebElement getDesktopMenu() {
        wait.waitForVisibility(desktopmenu);
        return desktopmenu;
    }

    public List<WebElement> getAllLinks() {

        return allLinks;
    }

}
