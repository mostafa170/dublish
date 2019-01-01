package com.example.mostaf170.co_dublish.home;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mostaf170.co_dublish.R;

public class VideosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
    }
    public void aprendervocabulario (View view){
        Intent browserInent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=dyZAgwjW-oI"));
        startActivity(browserInent);
    }

    public void aprendersubjuntivo (View view){
        Intent browserInent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=2k77y16Jkso"));
        startActivity(browserInent);
    }

    public void queesdificilhablarespañol (View view){
        Intent browserInent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=eyGFz-zIjHE"));
        startActivity(browserInent);
    }

    public void aprendesobrelacomida (View view){
        Intent browserInent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=LzEB48aarqU"));
        startActivity(browserInent);
    }

    public void aprendesobrelacasa (View view){
    Intent browserInent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=wBZXyMjdjf8&t=33s"));
    startActivity(browserInent);
    }

    public void aprenderindicativo (View view){
    Intent browserInent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=mTsXjiB1t8A"));
    startActivity(browserInent);

    }
}
