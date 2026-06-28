package TestNg2;

import Base_Folder.BaseMethod;
import Page_Folder.CameraPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.ActionsUtility;
import utilities.BrokenLinkUtility;
import utilities.WaitUtility;

import java.util.List;

public class CameraTest extends BaseMethod {

    CameraPage page;
    ActionsUtility action;
    BrokenLinkUtility utility;


    @BeforeMethod
    public void init() {
        page = new CameraPage(driver);
        action = new ActionsUtility(driver);
        utility = new BrokenLinkUtility();
    }

    @Test
    public void verify_sort_dropdown() {

        page.clickCameraLink();

        page.selectsortByDropdown("Name (Z - A)");

        Assert.assertEquals(page.getSelectedsortByDropdown(), "Name (Z - A)");

        System.out.println(page.getSelectedsortByDropdown());

        List<WebElement> item = page.getAllsortByDropdownOptions();
        System.out.println(item);

        Assert.assertEquals(page.getcameraNikonD300Text(), "Nikon D300\n" +
                "Engineered with pro-level features and performance, the 12.3-effective-megapixel D300 combines brand..\n" +
                "$98.00\n" +
                "Ex Tax:$80.00", "Test failed");

    }

    @Test
    public void verifyRatingRadio() {

        page.clickCameraLink();


        page.selectsortByDropdown("Name (Z - A)");


        page.clickNikonD300();


        page.clickReviewsLink();


        page.selectgood1radio();

        Assert.assertTrue(page.isGood1Selected());
        page.selectgood2radio();

        Assert.assertTrue(page.isGood2Selected());



    }

    @Test
    public void verifyDesktopMenu() throws InterruptedException {

        page.clickCameraLink();


        action.mouseHover(page.getDesktopMenu());



        driver.quit();
    }

    @Test
    public void verifygetalllinks() throws Exception {

        page.clickCameraLink();


        List<WebElement> links = page.getAllLinks();

        for (WebElement link : links) {

            String url = link.getAttribute("href");

            int statusCode = utility.getResponseCode(url);

            if (statusCode >= 400) {
                System.out.println("Broken Link : " + url);
            } else {
                System.out.println("Valid Link : " + url);
            }
        }
    }
}