package utils;

import android.os.AsyncTask;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import POJOs.Chargepoint;
import POJOs.Parking;

public class RetrieveFeedTask extends AsyncTask<String, Void, Chargepoint> {
    private Exception exception;

    protected Chargepoint doInBackground(String... urls) {
        URL url = null;
        try {
            url = new URL("https://api.bsmsa.eu/ext/api/bsm/chargepoints/v1/chargepoints");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Chargepoint Chargepoint = null;
        try (InputStream in = url.openStream(); BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"))) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String test = gson.toJson(reader);
            System.out.println(test);
            Chargepoint = gson.fromJson(reader, Chargepoint.class);

            System.out.println("hola he llegado");
            System.out.println(Chargepoint.toString());

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Chargepoint;
    }

    protected void onPostExecute(Parking feed) {
        // TODO: check this.exception
        // TODO: do something with the feed
    }
}
