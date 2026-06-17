package Tests;

import Base_Folder.BaseClass;
import Page_Folder.DashBoard;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4 extends BaseClass {
    private static final Logger logger =
            LogManager.getLogger(Test4.class);


    @Test
    public void verifySubmitButtonClickable(){
        DashBoard db=new DashBoard(driver);
        db.enterText("IndiaPakstan");

        logger.info("Entered text successfully");
        String actual=db.getenterText();

        logger.info(actual);



    }




}
