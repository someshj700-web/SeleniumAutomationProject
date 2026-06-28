package utilities;

import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenLinkUtility {

    public int getResponseCode(String url) throws Exception {

        URL link = new URL(url);

        HttpURLConnection connection = (HttpURLConnection) link.openConnection();

        connection.setRequestMethod("HEAD");

        connection.connect();

        return connection.getResponseCode();
    }
}