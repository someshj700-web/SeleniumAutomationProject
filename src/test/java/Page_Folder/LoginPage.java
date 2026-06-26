package Page_Folder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath="//input[@id='input-email']")
    WebElement username;

    @FindBy (xpath="//input[@id='input-password']")
    WebElement password;

    @FindBy (xpath="//input[@value='Login']")
    WebElement LoginBut;

    public void enterEmail(String user){
        username.sendKeys(user);
    }
    public void enterPassword(String pass){
        password.sendKeys(pass);
    }

    public void loginbutt(){
        LoginBut.click();
    }

    public void login(String email, String password){

        enterEmail(email);
        enterPassword(password);
        loginbutt();
    }


}
