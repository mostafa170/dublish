package com.example.mostaf170.co_dublish.grammer.Gramática;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.mostaf170.co_dublish.R;
import com.example.mostaf170.co_dublish.grammer.Indicativo.FuturoActivity;
import com.example.mostaf170.co_dublish.grammer.Indicativo.FuturoCompuestoActivity;
import com.example.mostaf170.co_dublish.grammer.Indicativo.PresenteDeIndicativoActivity;
import com.example.mostaf170.co_dublish.grammer.Indicativo.PretéritoImperfectoActivity;
import com.example.mostaf170.co_dublish.grammer.Indicativo.PretéritoIndefinidoActivity;
import com.example.mostaf170.co_dublish.grammer.Indicativo.PretéritoPerfectoActivity;
import com.example.mostaf170.co_dublish.grammer.Indicativo.PretéritoPluscuamperfectoActivity;

public class IndicativoActivity extends AppCompatActivity

{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indicativo);

        ImageButton deindicativo;
        deindicativo = (ImageButton) findViewById(R.id.presentindicativo);
        deindicativo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndicativoActivity.this, PresenteDeIndicativoActivity.class);
                startActivity(intent);
            }
        });

        ImageButton perfecto;
        perfecto = (ImageButton) findViewById(R.id.Pretérito_perfecto);
        perfecto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndicativoActivity.this, PretéritoPerfectoActivity.class);
                startActivity(intent);
            }
        });

        ImageButton indicativo;
        indicativo = (ImageButton) findViewById(R.id.Pretérito_indefinido);
        indicativo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndicativoActivity.this, PretéritoIndefinidoActivity.class);
                startActivity(intent);
            }
        });

        ImageButton Pretérito_imperfecto;
        Pretérito_imperfecto = (ImageButton) findViewById(R.id.Pretérito_imperfecto);
        Pretérito_imperfecto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndicativoActivity.this, PretéritoImperfectoActivity.class);
                startActivity(intent);
            }
        });

        ImageButton Pretérito_pluscuamperfecto;
        Pretérito_pluscuamperfecto = (ImageButton) findViewById(R.id.Pretérito_pluscuamperfecto);
        Pretérito_pluscuamperfecto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndicativoActivity.this, PretéritoPluscuamperfectoActivity.class);
                startActivity(intent);
            }
        });

        ImageButton Futuro;
        Futuro = (ImageButton) findViewById(R.id.Futurosimple);
        Futuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndicativoActivity.this, FuturoActivity.class);
                startActivity(intent);
            }
        });

        ImageButton FuturoCompuesto;
        FuturoCompuesto = (ImageButton) findViewById(R.id.Futurocompuesto);
        FuturoCompuesto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndicativoActivity.this, FuturoCompuestoActivity.class);
                startActivity(intent);
            }
        });

    }
}