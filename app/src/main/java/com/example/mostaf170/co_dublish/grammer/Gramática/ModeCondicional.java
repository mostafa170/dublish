package com.example.mostaf170.co_dublish.grammer.Gramática;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import com.example.mostaf170.co_dublish.R;
import com.example.mostaf170.co_dublish.grammer.Gramática.ModeConficional.CondicionalCompuestoActivity;
import com.example.mostaf170.co_dublish.grammer.Gramática.ModeConficional.ConficionalSIMPLEActivity;

public class ModeCondicional extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conificional);

        ImageButton commenzar = (ImageButton) findViewById(R.id.CONDICIONAL_SIMPLE);
        commenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModeCondicional.this, ConficionalSIMPLEActivity.class);
                startActivity(intent);
            }
        });

        ImageButton commenzar1 = (ImageButton) findViewById(R.id.CONDICIONAL_COMPUESTO);
        commenzar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModeCondicional.this, CondicionalCompuestoActivity.class);
                startActivity(intent);
            }
        });
    }
}
