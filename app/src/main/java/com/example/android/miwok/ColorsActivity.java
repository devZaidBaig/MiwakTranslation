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

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        final ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("red","weṭeṭṭi",R.mipmap.color_red,R.raw.color_red));
        colors.add(new Word("green","chokokki",R.mipmap.color_green,R.raw.color_green));
        colors.add(new Word("brown","ṭakaakki",R.mipmap.color_brown,R.raw.color_brown));
        colors.add(new Word("gray","ṭopoppi",R.mipmap.color_gray,R.raw.color_gray));
        colors.add(new Word("black","kululli",R.mipmap.color_black,R.raw.color_black));
        colors.add(new Word("white","kelelli",R.mipmap.color_white,R.raw.color_white));
        colors.add(new Word("dusty yellow","ṭopiisә",R.mipmap.color_dusty_yellow,R.raw.color_dusty_yellow));
        colors.add(new Word("mustard yellow","chiwiiṭә",R.mipmap.color_mustard_yellow,R.raw.color_mustard_yellow));

        WordAdapter itemsAdapter =
                new WordAdapter(this, colors,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list_color);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = colors.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(ColorsActivity.this,word.getAudio());
                mediaPlayer.start();
            }
        });
    }


}
