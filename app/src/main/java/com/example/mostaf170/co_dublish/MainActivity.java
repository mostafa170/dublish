package com.example.mostaf170.co_dublish;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.multidex.MultiDex;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;


public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2500;


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().hide();

        this.setContentView(R.layout.activity_main);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent homeIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
