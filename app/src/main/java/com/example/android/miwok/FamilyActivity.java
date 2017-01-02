package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final ArrayList<Word> family = new ArrayList<Word>();
        family.add(new Word("Father","әpә",R.mipmap.family_father,R.raw.family_father));
        family.add(new Word("Mother","әṭa",R.mipmap.family_mother,R.raw.family_mother));
        family.add(new Word("Son","angsi",R.mipmap.family_son,R.raw.family_son));
        family.add(new Word("Daughter","tune",R.mipmap.family_daughter,R.raw.family_daughter));
        family.add(new Word("Older brother","taachi",R.mipmap.family_older_brother,R.raw.family_older_brother));
        family.add(new Word("Younger brother","chalitti",R.mipmap.family_younger_brother,R.raw.family_younger_brother));
        family.add(new Word("Older sister","teṭe",R.mipmap.family_older_sister,R.raw.family_older_sister));
        family.add(new Word("Younger sister","kolliti",R.mipmap.family_younger_sister,R.raw.family_younger_sister));
        family.add(new Word("Grandmother","ama",R.mipmap.family_grandmother,R.raw.family_grandmother));
        family.add(new Word("Grandfather","paapa",R.mipmap.family_grandfather,R.raw.family_grandfather));

        WordAdapter itemsAdapter =
                new WordAdapter(this, family,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list_family);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = family.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(FamilyActivity.this,word.getAudio());
                mediaPlayer.start();
            }
        });
    }
}
