package com.example.mostaf170.co_dublish.home.chat;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.mostaf170.co_dublish.R;

public class ChatActivty extends AppCompatActivity {

    ImageButton personalA1;
    ImageButton personalA2;
    ImageButton personalB1;
    ImageButton personalB2;
    ImageButton personalC1;
    ImageButton personalC2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_activty);

        personalA1=findViewById(R.id.chatA1);
        personalA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWhatsAppA1();
            }
        });

        personalA2=findViewById(R.id.chatA2);
        personalA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWhatsAppA2();
            }
        });

        personalB1=findViewById(R.id.chatB1);
        personalB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWhatsAppB1();
            }
        });

        personalB2=findViewById(R.id.chatB2);
        personalB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWhatsAppB2();
            }
        });

        personalC1=findViewById(R.id.chatC1);
        personalC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWhatsAppC1();
            }
        });

        personalC2=findViewById(R.id.chatC2);
        personalC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWhatsAppC2();
            }
        });

    }
    public void openWhatsAppA1(){
        try {
            String text = "A1";// Replace with your message.

            String toNumber = "+201027964584"; // Replace with mobile phone number without +Sign or leading zeros.


            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+toNumber +"&text="+text));
            startActivity(intent);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void openWhatsAppA2(){
        try {
            String text = "A2";// Replace with your message.

            String toNumber = "+201027964584"; // Replace with mobile phone number without +Sign or leading zeros.


            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+toNumber +"&text="+text));
            startActivity(intent);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void openWhatsAppB1(){
        try {
            String text = "B1";// Replace with your message.

            String toNumber = "+201027964584"; // Replace with mobile phone number without +Sign or leading zeros.


            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+toNumber +"&text="+text));
            startActivity(intent);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void openWhatsAppB2(){
        try {
            String text = "B2";// Replace with your message.

            String toNumber = "+201027964584"; // Replace with mobile phone number without +Sign or leading zeros.


            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+toNumber +"&text="+text));
            startActivity(intent);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void openWhatsAppC1(){
        try {
            String text = "C1";// Replace with your message.

            String toNumber = "+201027964584"; // Replace with mobile phone number without +Sign or leading zeros.


            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+toNumber +"&text="+text));
            startActivity(intent);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void openWhatsAppC2(){
        try {
            String text = "C2";// Replace with your message.

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
