package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);


        final ArrayList<Word> phrases = new ArrayList<Word>();
        phrases.add(new Word("Where are you going?","lutti",R.raw.phrase_where_are_you_going));
        phrases.add(new Word("What is your name?","otiko",R.raw.phrase_what_is_your_name));
        phrases.add(new Word("My name is...","tolookosu",R.raw.phrase_my_name_is));
        phrases.add(new Word("How are you feling","oyyisa",R.raw.phrase_how_are_you_feeling));
        phrases.add(new Word("I'm good","massokka",R.raw.phrase_im_feeling_good));
        phrases.add(new Word("Are you coming","temmokka",R.raw.phrase_are_you_coming));
        phrases.add(new Word("Yes I'm coming","kenekaku",R.raw.phrase_yes_im_coming));
        phrases.add(new Word("I'm coming","kawinta",R.raw.phrase_im_coming));
        phrases.add(new Word("Let's go","wo'e",R.raw.phrase_lets_go));
        phrases.add(new Word("Come here","na'aacha",R.raw.phrase_come_here));

        WordAdapter itemsAdapter =
                new WordAdapter(this, phrases,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list_phases);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = phrases.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(PhrasesActivity.this,word.getAudio());
                mediaPlayer.start();
            }
        });


    }




}
