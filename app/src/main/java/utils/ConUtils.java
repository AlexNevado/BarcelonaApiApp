package utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

public class ConUtils implements IConUtils {

    @Override
    public JsonObject connect(String direction) throws IOException {
        /*try {
            JSONObject json = new JSONObject(IOUtils.toString(new URL(direction), Charset.forName("UTF-8")));
            if(json != null) return json;
        } catch (JSONException e) {
            //TODO log4java
            e.printStackTrace();
        }
        return null;*/
        String sURL = "http://freegeoip.net/json/"; //just a string

        // Connect to the URL using java's native library
        URL url = new URL(sURL);
        URLConnection request = url.openConnection();
        request.connect();

        // Convert to a JSON object to print data
        JsonParser jp = new JsonParser(); //from gson
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
        JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
        String zipcode = rootobj.get("0").getAsString(); //just grab the zipcode
        System.out.println(zipcode);
        return rootobj;
    }

    @Override
    public boolean openTransaction() {
        return false;
    }

    @Override
    public boolean closeTransaction() {
        return false;
    }

    @Override
    public boolean disconnect() {
        return false;
    }
}
