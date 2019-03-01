package com.coolweather.android;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.coolweather.android.gson.Weather;
import com.coolweather.android.util.Utility;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (prefs != null){
            String weatherString = prefs.getString("weather",null);
            if (weatherString != null){
                //weatherString不为空才跳转到前一次查询
                Intent intent = new Intent(this,WeatherActivity.class);
                startActivity(intent);
                finish();
            }

        }

    }
}
