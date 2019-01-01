package com.example.mostaf170.co_dublish.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.mostaf170.co_dublish.R;
import com.example.mostaf170.co_dublish.testB2.B2.QuizActivityB2;

public class QuizMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_main);

        ImageButton B2;
        B2 = (ImageButton) findViewById(R.id.chatB2);
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizMainActivity.this, QuizActivityB2.class);
                startActivity(intent);
            }
        });
    }
}