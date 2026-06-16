package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngPractice {

    @Test
    public void Login(){
        String str="12345";
        Assert.assertEquals(str,"12345");
        Assert.assertFalse(str.isEmpty());
        Assert.assertTrue(str.contains("123"));
        Assert.assertNotNull(str);
        Assert.assertEquals(str.length(),5);
    }

    @Test
    public void Dashboard(){
        System.out.println("Dashboard navigate successfully");
    }
}
