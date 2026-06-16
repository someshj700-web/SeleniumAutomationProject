package Tests;

import Base_Folder.BaseClass;
import Page_Folder.DashBoard;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4 extends BaseClass {

    private static final Logger logger =
            LogManager.getLogger(Test4.class);

    @Test
    public void verifySubmitButtonClickable(){
        DashBoard db=new DashBoard(driver);
        db.clickSubmitButton();

        logger.info("Button is clickabled");
    }

    @Test(dependsOnMethods = "verifySubmitButtonClickable")
    public void dummy(){
     logger.info("Test run 2");
    }


}
