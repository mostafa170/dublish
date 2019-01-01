package com.example.mostaf170.co_dublish.grammer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.mostaf170.co_dublish.R;
import com.example.mostaf170.co_dublish.grammer.Gramática.ImperationActivity;
import com.example.mostaf170.co_dublish.grammer.Gramática.IndicativoActivity;
import com.example.mostaf170.co_dublish.grammer.Gramática.ModeCondicional;
import com.example.mostaf170.co_dublish.grammer.Gramática.SubjuntivoActivity;

public class GramáticaActivity extends AppCompatActivity

    {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gramatica);
        ImageButton indicativo;
        ImageButton conficional;
        ImageButton subjuntivoñ;
        ImageButton imperativo;

        indicativo = (ImageButton) findViewById(R.id.indicativo);
        indicativo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GramáticaActivity.this, IndicativoActivity.class);
                startActivity(intent);
            }
        });

            conficional = (ImageButton) findViewById(R.id.condicional);
            conficional.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(GramáticaActivity.this, ModeCondicional.class);
                    startActivity(intent);
                }
            });

            subjuntivoñ = (ImageButton) findViewById(R.id.subjuntivo);
            subjuntivoñ.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(GramáticaActivity.this, SubjuntivoActivity.class);
                    startActivity(intent);
                }
            });

            imperativo = (ImageButton) findViewById(R.id.imperativo);
            imperativo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(GramáticaActivity.this, ImperationActivity.class);
                    startActivity(intent);
                }
            });
    }
    }
