package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by welcome on 9/29/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context,ArrayList<Word> words){
        super(context,0,words);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord = getItem(position);

        TextView textObj = (TextView)listItemView.findViewById(R.id.english_view);
        textObj.setText(currentWord.getDefaultTranslation());

        TextView textObj1 = (TextView)listItemView.findViewById(R.id.translate_view);
        textObj1.setText(currentWord.getmMiwokTranslation());

        return listItemView;
    }
}
