package com.example.mostaf170.co_dublish.home.voc;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.mostaf170.co_dublish.R;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // Create and setup the {@link AudioManager} to request audio focus
        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("red", "weṭeṭṭi"));
        words.add(new word("green", "chokokki"));
        words.add(new word("brown", "ṭakaakki"));
        words.add(new word("gray", "ṭopoppi"));
        words.add(new word("black", "kululli"));
        words.add(new word("dusty yellow", "ṭopiisә"));
        words.add(new word("white", "kelelli"));
        words.add(new word("mustard yellow", "chiwiiṭә"));

        // Display words
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);
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
