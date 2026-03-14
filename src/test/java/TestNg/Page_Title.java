package TestNg;

import Base_Folder.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Page_Title extends BaseClass {


    @Test
        public void testLoginTitle()  {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "omayo (QAFox.com)", "Title does not match!");

    }

    }

