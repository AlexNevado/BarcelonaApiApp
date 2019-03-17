package com.example.barcelonaapimore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import POJOs.Parking;
import utils.ConUtils;
import utils.RetrieveFeedTask;

public class MainActivity extends AppCompatActivity {

    ConUtils conUtils = new ConUtils();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new RetrieveFeedTask().execute("a");
        setContentView(R.layout.activity_main);
    }
}
