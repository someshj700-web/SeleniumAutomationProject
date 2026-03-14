package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    Properties prop;

    public ConfigReader() throws Exception {

        String env = System.getProperty("env");

        if (env == null) {
            env = "qa";   // default environment
        }


        FileInputStream fis = new FileInputStream(
                "src/test/resources/config-" + env + ".properties");

        prop = new Properties();
        prop.load(fis);
    }

    public String getBaseURL() {
        return prop.getProperty("baseURL");
    }
}
