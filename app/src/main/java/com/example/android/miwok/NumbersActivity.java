package com.example.android.miwok;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","lutti"));
        words.add(new Word("two","lutti"));
        words.add(new Word("three","lutti"));
        words.add(new Word("four","lutti"));
        words.add(new Word("five","lutti"));
        words.add(new Word("six","lutti"));
        words.add(new Word("seven","luttis"));
        words.add(new Word("eight","luttia"));
        words.add(new Word("nine","luttisd"));
        words.add(new Word("ten","luttis"));

        WordAdapter itemsAdapter =
                new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}