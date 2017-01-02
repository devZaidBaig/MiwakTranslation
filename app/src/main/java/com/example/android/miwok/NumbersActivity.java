package com.example.android.miwok;

        import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","lutti",R.mipmap.number_one,R.raw.number_one));
        words.add(new Word("two","otiko",R.mipmap.number_two,R.raw.number_two));
        words.add(new Word("three","tolookosu",R.mipmap.number_three,R.raw.number_three));
        words.add(new Word("four","oyyisa",R.mipmap.number_four,R.raw.number_four));
        words.add(new Word("five","massokka",R.mipmap.number_five,R.raw.number_five));
        words.add(new Word("six","temmokka",R.mipmap.number_six,R.raw.number_six));
        words.add(new Word("seven","kenekaku",R.mipmap.number_seven,R.raw.number_seven));
        words.add(new Word("eight","kawinta",R.mipmap.number_eight,R.raw.number_eight));
        words.add(new Word("nine","wo'e",R.mipmap.number_nine,R.raw.number_nine));
        words.add(new Word("ten","na'aacha",R.mipmap.number_ten,R.raw.number_ten));

        WordAdapter itemsAdapter =
                new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(NumbersActivity.this,word.getAudio());
                mediaPlayer.start();
            }
        });
    }
}