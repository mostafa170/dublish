package com.example.mostaf170.co_dublish.home.voc;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.example.mostaf170.co_dublish.R;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // Create and setup the {@link AudioManager} to request audio focus
        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("Where are you going?", "minto wuksus"));
        words.add(new word("What is your name?", "tinnә oyaase'nә"));
        words.add(new word("My name is...", "oyaaset..."));
        words.add(new word("How are you feeling?", "michәksәs?"));
        words.add(new word("I’m feeling good.", "kuchi achit"));
        words.add(new word("Are you coming?", "әәnәs'aa?"));
        words.add(new word("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new word("I’m coming.", "әәnәm"));
        words.add(new word("Let’s go.", "yoowutis"));
        words.add(new word("Come here.", "әnni'nem"));

        // Display words
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Word} object at the given position the user clicked on
                word word = words.get(position);
            }
        });
    }


}
