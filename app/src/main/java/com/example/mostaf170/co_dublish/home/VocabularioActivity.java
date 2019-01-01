package com.example.mostaf170.co_dublish.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mostaf170.co_dublish.R;
import com.example.mostaf170.co_dublish.home.voc.ColorActivity;
import com.example.mostaf170.co_dublish.home.voc.DescribiendoGenteActivity;
import com.example.mostaf170.co_dublish.home.voc.NumberActivity;
import com.example.mostaf170.co_dublish.home.voc.PhraseActivity;

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
                Intent numbersIntent = new Intent(VocabularioActivity.this, NumberActivity.class);

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
                Intent colorsIntent = new Intent(VocabularioActivity.this, ColorActivity.class);

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
                Intent phrasesIntent = new Intent(VocabularioActivity.this, PhraseActivity.class);

                // Start the new activity
                startActivity(phrasesIntent);
            }
        });
    }
}