package TestNg2;

import Base_Folder.BaseMethod;
import Page_Folder.CameraPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class CameraTest extends BaseMethod {
    CameraPage page;

    @BeforeMethod
    public void init(){
        page=new CameraPage(driver);
    }

    @Test
    public void verify_sort_dropdown() throws InterruptedException {
     Thread.sleep(3000);
     page.clickCameraLink();
     Thread.sleep(2000);

     page.selectsortByDropdown("Name (Z - A)");
        Thread.sleep(2000);
        Assert.assertEquals(page.getSelectedsortByDropdown(),"Name (Z - A)");
        Thread.sleep(2000);
        System.out.println(page.getSelectedsortByDropdown());

        List<WebElement> item=page.getAllsortByDropdownOptions();
        System.out.println(item);

        Assert.assertEquals(page.getcameraNikonD300Text(),"Nikon D300\n" +
                "Engineered with pro-level features and performance, the 12.3-effective-megapixel D300 combines brand..\n" +
                "$98.00\n" +
                "Ex Tax:$80.00","Test failed");
        Thread.sleep(2000);
    }

    @Test
    public void verifyRatingRadio() throws InterruptedException {
        Thread.sleep(3000);
        page.clickCameraLink();
        Thread.sleep(2000);

        page.selectsortByDropdown("Name (Z - A)");
        Thread.sleep(2000);

        page.clickNikonD300();
        Thread.sleep(2000);

        page.clickReviewsLink();
        Thread.sleep(2000);

        page.selectgood1radio();
        Thread.sleep(2000);
        Assert.assertTrue(page.isGood1Selected());
        page.selectgood2radio();
        Thread.sleep(2000);
        Assert.assertTrue(page.isGood2Selected());
        Thread.sleep(2000);
        driver.quit();

    }

}
