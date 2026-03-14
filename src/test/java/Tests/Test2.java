package Tests;

import Base_Folder.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 extends BaseClass {


    @Test
    public void VerifyGetUrl(){
        String actualurl=driver.getCurrentUrl();
        Assert.assertEquals(actualurl,"https://omayo.blogspot.com/", "Page url mismatch!");
    }


}
