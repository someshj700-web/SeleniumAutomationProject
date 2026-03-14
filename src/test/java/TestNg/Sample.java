package TestNg;

import Tests.Test5;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {

    private static final Logger logger =
            LogManager.getLogger(Sample.class);
    @Test
    void cvi() {

        System.out.println("1");
        logger.info("Test started");
    }

    @Test
    void bavi() {
        System.out.println("2");
        logger.info("Test completed");
    }



    @Test
    void avi() {
        System.out.println("5");
    }
}
