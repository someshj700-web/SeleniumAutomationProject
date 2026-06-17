package TestNg2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Account_Number {


    @Test
    public void validateAccountNumber() {
        String actualAccNo = "1234567890";
        String expectedAccNo ="1234567890";//client input


        // 1. Exact match
        Assert.assertEquals(actualAccNo, expectedAccNo, "Account number mismatch");

        // 2. Not null
        Assert.assertNotNull(actualAccNo);

        // 3. Not empty
        Assert.assertFalse(actualAccNo.isEmpty(), "Account number is empty");

        // 4. Length check
        Assert.assertEquals(actualAccNo.length(), 10, "Invalid account number length");

        // 5. Only digits
        Assert.assertTrue(actualAccNo.matches("\\d+"), "Account number should contain only digits");
    }



}
