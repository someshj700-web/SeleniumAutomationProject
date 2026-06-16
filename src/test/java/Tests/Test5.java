package Tests;

import Base_Folder.BaseClass;


import Page_Folder.DashBoard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test5 extends BaseClass {

    private static final Logger logger =
            LogManager.getLogger(Test5.class);

    @Test
    public void verifyTextboxAccept(){
        DashBoard db=new DashBoard(driver);
        db.enterText("someshjadahv");

    logger.info("Entered text successfully");
       String actual=db.getenterText();

       logger.info(actual);

    }


}
