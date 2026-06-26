package TestNg2;

import Base_Folder.BaseMethod;
import Page_Folder.AccountPage;

import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountTest extends BaseMethod {
    AccountPage homepage;

    @BeforeMethod
    public void init() {

        homepage = new AccountPage(driver);
    }

    @Test(priority = 1)
    public void verifyTitle() throws InterruptedException {
        Thread.sleep(3000);

        String actualTitle=homepage.getPageTitleextract();

        Assert.assertEquals(actualTitle, "Qafox.com","Test is failed");
        System.out.println("Testcases passed");
    }

    @Test(priority = 2)
    public void verifyUrl() throws InterruptedException {
        Thread.sleep(3000);

        String actualUrl=homepage.getCurrentPageUrl();

        Assert.assertEquals(actualUrl, "https://tutorialsninja.com/demo/index.php?route=account/account","Test is failed");
        System.out.println("Testcases passed");
    }

    @Test(priority = 3)
    public void verifyLogo() throws InterruptedException {

        homepage.clicklogo();
        Thread.sleep(2000);
        Assert.assertEquals(homepage.getPageTitle(),"Your Store","Test cases failed");
        System.out.println("Testcases passed");
    }
     @Test(priority = 4)
    public void verifySerachBox() {
        homepage.searchText("iPhone");
        homepage.clickSearchbox();

        Assert.assertEquals(homepage.verifyMobilepage(),"iPhone\n" +
                "iPhone is a revolutionary new mobile phone that allows you to make a call by simply tapping a name o..\n" +
                "$123.20\n" +
                "Ex Tax:$101.00");
    }

    @Test
    public void verifyaddtocartProduct() throws InterruptedException {
        homepage.clicklogo();
        Thread.sleep(2000);

        homepage.searchText("MacBook");
        Thread.sleep(2000);
        homepage.clickSearchbox();
        Thread.sleep(2000);

        Assert.assertEquals(homepage.verifyMobilepage(),"MacBook\n" +
                "Intel Core 2 Duo processor Powered by an Intel Core 2 Duo processor at speeds up to 2.16GHz, t..\n" +
                "$602.00\n" +
                "Ex Tax:$500.00");
        Thread.sleep(3000);

       Assert.assertTrue(homepage.isProductImageButtonEnabled(),"Test failed");

       homepage.scrollDown();
        Thread.sleep(3000);
        homepage.clickclickProductName();

        Assert.assertEquals(homepage.getPageTitle(),"MacBook","Test failed");
        Thread.sleep(3000);
        homepage.ClickAddtocartbutton();

        Thread.sleep(3000);
        Assert.assertEquals(homepage.Successmessage(),"Success: You have added MacBook to your shopping cart!\n" +
                "×","Test is failed");

    }



}
