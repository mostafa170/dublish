package com.example.mostaf170.co_dublish;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.mostaf170.co_dublish.grammer.GramáticaActivity;
import com.example.mostaf170.co_dublish.home.OtrosProyectosActivity;
import com.example.mostaf170.co_dublish.home.QuizMainActivity;
import com.example.mostaf170.co_dublish.home.TrabajoActivity;
import com.example.mostaf170.co_dublish.home.VideosActivity;
import com.example.mostaf170.co_dublish.home.VocabularioActivity;
import com.example.mostaf170.co_dublish.home.chat.ChatActivty;

public class HomeActivity extends AppCompatActivity {

    Button personal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        personal=findViewById(R.id.whatsapp);
        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWhatsApp();
            }
        });

        Button button = (Button)findViewById(R.id.mail);
        // Show toast message when button is clicked
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "dublish.app@gmail.com",Toast.LENGTH_LONG).show();// Set your own toast  message
            }
        });
        button = (Button) findViewById(R.id.call);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:00201027964584"));
                startActivity(intent);
            }
        });

        ImageButton grammer;
        grammer = (ImageButton) findViewById(R.id.grammer);
        grammer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, GramáticaActivity.class);
                startActivity(intent);
            }
        });

        ImageButton vocabulary;
        vocabulary = (ImageButton) findViewById(R.id.vocabulary);
        vocabulary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, VocabularioActivity.class);
                startActivity(intent);
            }
        });

        ImageButton chat;
        chat = (ImageButton) findViewById(R.id.chat);
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ChatActivty.class);
                startActivity(intent);
            }
        });


        ImageButton work;
        work = (ImageButton) findViewById(R.id.word);
        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, OtrosProyectosActivity.class);
                startActivity(intent);
            }
        });

        ImageButton test;
        test = (ImageButton) findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, QuizMainActivity.class);
                startActivity(intent);
            }
        });

        ImageButton find;
        find = (ImageButton) findViewById(R.id.find);
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, TrabajoActivity.class);
                startActivity(intent);
            }
        });

        ImageButton videos;
        videos = (ImageButton) findViewById(R.id.videos);
        videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, VideosActivity.class);
                startActivity(intent);
            }
        });

        final Button share;
        share=(Button)findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody="Your body here";
                String shareSub="Your Subject here";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(myIntent.createChooser(myIntent,"Share Using"));
            }
        });

    }

    public void facebook (View view){
        Intent browserInent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/CoDublish/?eid=ARAikzfIrSJIvcwD8Q0yLhuAjP5R5qFa9-VXvLPsaZ5W5pJ66ZF0OYgdrgjRvs0z-edTz5Goa_q5bI-5&timeline_context_item_type=intro_card_work&timeline_context_item_source=100004065635529&fref=tag"));
        startActivity(browserInent);
    }

    public void instagram (View view){
        Intent browserInent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/co_dublish/"));
        startActivity(browserInent);
    }

    public void twitter (View view){
        Intent browserInent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/dublish0"));
        startActivity(browserInent);
    }

    public void location (View view){
        Intent browserInent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/CO+Dublish/@30.0376071,31.2113914,17z/data=!3m1!4b1!4m5!3m4!1s0x1458479c1369845b:0xd5c08157b1256c29!8m2!3d30.0376071!4d31.2092027?hl=ar"));
        startActivity(browserInent);
    }

    public void event (View view){
        Intent browserInent =new Intent(Intent.ACTION_VIEW, Uri.parse("https://localendar.com/public/mostafa170"));
        startActivity(browserInent);
    }

    public void openWhatsApp(){
        try {
            String text = "Hola, Co Enseñanza";// Replace with your message.

            String toNumber = "+201027964584"; // Replace with mobile phone number without +Sign or leading zeros.


            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+toNumber +"&text="+text));
            startActivity(intent);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
