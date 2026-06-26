package Page_Folder;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage_HomePage {
    WebDriver driver;

    public AccountPage_HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//a[text()='Qafox.com']")
    WebElement title;

    @FindBy(xpath="//a[text()='Qafox.com']")
    WebElement QaFoxcomLogo;

    @FindBy(xpath="//input[@name='search']")
    WebElement Searchbox;

    @FindBy(xpath="//button[@class='btn btn-default btn-lg']")
    WebElement SearchButton;

    @FindBy (xpath = "//div[@class='caption']")
    WebElement MobileText;

    @FindBy (xpath = "(//img[@class='img-responsive'])[1]")
    WebElement ImageProduct;

    @FindBy (xpath = "(//div[@class='caption'])[1]//a[1]")
    WebElement ProductName;

    @FindBy (id="button-cart")
    WebElement AddtocartButton;

    @FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessage;



    public String getPageTitleExtract() {
        return title.getText();
    }
    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }

    public void clickQaFoxcomLogo(){
        QaFoxcomLogo.click();
    }

    public void enterTextInSearchBox(String text){
        Searchbox.sendKeys(text);
    }

    public void clickSearchButton(){
        SearchButton.click();
    }

    public String getMobileText(){
       return MobileText.getText();
    }

    public boolean isProductImageButtonEnabled() {
        return ImageProduct.isEnabled();
    }

    public void clickProductName(){
        ProductName.click();
    }

    public void ClickAddToCartButton(){
        AddtocartButton.click();
    }

    public String getSuccessMessage(){
        return successMessage.getText();
    }
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
    }

}
