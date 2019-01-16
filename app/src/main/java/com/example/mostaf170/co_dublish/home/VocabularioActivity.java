package com.example.mostaf170.co_dublish.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mostaf170.co_dublish.R;
import com.example.mostaf170.co_dublish.home.voc.CaracteresySentimientosActivity;
import com.example.mostaf170.co_dublish.home.voc.CortesíaYFuncionenSocialesActivity;
import com.example.mostaf170.co_dublish.home.voc.CuerpoActivity;
import com.example.mostaf170.co_dublish.home.voc.DatosPersonalesActivity;
import com.example.mostaf170.co_dublish.home.voc.FamiliaActivity;
import com.example.mostaf170.co_dublish.home.voc.DescribiendoGenteActivity;
import com.example.mostaf170.co_dublish.home.voc.SaludActivity;
import com.example.mostaf170.co_dublish.home.voc.MediosDeComunicaciónActivity;

public class VocabularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulario);
        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(VocabularioActivity.this, SaludActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the family category
        TextView family = (TextView) findViewById(R.id.family);

        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DescribiendoGenteActivity}
                Intent familyIntent = new Intent(VocabularioActivity.this, DescribiendoGenteActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });

        // Find the View that shows the colors category
        TextView colors = (TextView) findViewById(R.id.colors);

        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent colorsIntent = new Intent(VocabularioActivity.this, FamiliaActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);

        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent phrasesIntent = new Intent(VocabularioActivity.this, MediosDeComunicaciónActivity.class);

                // Start the new activity
                startActivity(phrasesIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView Caracteres = (TextView) findViewById(R.id.Caracteres);

        // Set a click listener on that View
        Caracteres.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent CaracteresIntent = new Intent(VocabularioActivity.this, CaracteresySentimientosActivity.class);

                // Start the new activity
                startActivity(CaracteresIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView Cuerpo = (TextView) findViewById(R.id.Cuerpo);

        // Set a click listener on that View
        Cuerpo.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent CuerpoIntent = new Intent(VocabularioActivity.this, CuerpoActivity.class);

                // Start the new activity
                startActivity(CuerpoIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView DatosPersonales = (TextView) findViewById(R.id.DatosPersonales);

        // Set a click listener on that View
        DatosPersonales.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent DatosPersonalesIntent = new Intent(VocabularioActivity.this, DatosPersonalesActivity.class);

                // Start the new activity
                startActivity(DatosPersonalesIntent);
            }
        });


        // Find the View that shows the phrases category
        TextView CortesíaYFuncionenSociales = (TextView) findViewById(R.id.CortesíaYFuncionenSociales);

        // Set a click listener on that View
        CortesíaYFuncionenSociales.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent CortesíaYFuncionenSocialesIntent = new Intent(VocabularioActivity.this, CortesíaYFuncionenSocialesActivity.class);

                // Start the new activity
                startActivity(CortesíaYFuncionenSocialesIntent);
            }
        });
    }
}