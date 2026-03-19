package Tests;

import Base_Folder.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends BaseClass  {

    @Test
    public void VerifyGetTitle(){
        String actualtitle=driver.getTitle();
        Assert.assertEquals(actualtitle,"omayo (QAFox.com)", "Page title mismatch!");
        System.out.println("Test 1");
        System.out.println("Test 2");
    }


}
