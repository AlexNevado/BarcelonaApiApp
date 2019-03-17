package utils;

import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

public interface IConUtils {
    /**
     * Given a http direction returns a valid JSON
     * @param direction
     * @return JSON if ok, null if not
     * @throws MalformedURLException
     */
    public JsonObject connect(String direction) throws IOException;

    public boolean openTransaction();

    public boolean closeTransaction();

    public boolean disconnect();


}
