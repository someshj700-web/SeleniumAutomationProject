package Page_Folder;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    WebDriver driver;

    public AccountPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//a[text()='Qafox.com']")
    WebElement title;

    @FindBy(xpath="//a[text()='Qafox.com']")
    WebElement logoClick;

    @FindBy(xpath="//input[@name='search']")
    WebElement enterTextSearchbox;

    @FindBy(xpath="//button[@class='btn btn-default btn-lg']")
    WebElement ClickTextSearchbox;

    @FindBy (xpath = "//div[@class='caption']")
    WebElement TextMobile;

    @FindBy (xpath = "(//img[@class='img-responsive'])[1]")
    WebElement ImageProduct;

    @FindBy (xpath = "(//div[@class='caption'])[1]//a[1]")
    WebElement ProductName;

    @FindBy (id="button-cart")
    WebElement ClickAddtocart;

    @FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement clicksuccessmessage;



    public String getPageTitleextract() {
        return title.getText();
    }
    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }

    public void clicklogo(){
        logoClick.click();
    }

    public void searchText(String text){
        enterTextSearchbox.sendKeys(text);
    }

    public void clickSearchbox(){
        ClickTextSearchbox.click();
    }

    public String verifyMobilepage(){
       return TextMobile.getText();
    }

    public boolean isProductImageButtonEnabled() {
        return ImageProduct.isEnabled();
    }

    public void clickclickProductName(){
        ProductName.click();
    }

    public void ClickAddtocartbutton(){
        ClickAddtocart.click();
    }

    public String Successmessage(){
        return clicksuccessmessage.getText();
    }
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
    }

}
