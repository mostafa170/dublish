package com.example.mostaf170.co_dublish.home;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mostaf170.co_dublish.R;

public class OtrosProyectosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otros_proyectos);
    }
    public void dublish (View view){
        Intent browserInent =new Intent(Intent.ACTION_VIEW, Uri.parse(
                "https://www.facebook.com/dublish.organization/?ref=br_rs"));
        startActivity(browserInent);
    }

    public void cd (View view){
        Intent browserInent =new Intent(Intent.ACTION_VIEW, Uri.parse(
                "https://www.facebook.com/CoDublish/?ref=br_rs"));
        startActivity(browserInent);
    }

    public void traveldublish (View view){
        Intent browserInent =new Intent(Intent.ACTION_VIEW, Uri.parse(
                "https://www.facebook.com/Dublish-Travel-1945039399123579/?ref=br_rs"));
        startActivity(browserInent);
    }

}
