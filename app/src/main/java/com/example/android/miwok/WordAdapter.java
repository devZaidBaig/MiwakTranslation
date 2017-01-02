package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by welcome on 9/29/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    int mcolorResouce;

    public WordAdapter(Activity context,ArrayList<Word> words,int colorResouce){
        super(context,0,words);
        mcolorResouce = colorResouce;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        final MediaPlayer mediaPlayer = null;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord = getItem(position);

        TextView textObj = (TextView)listItemView.findViewById(R.id.english_view); // text view for english
        textObj.setText(currentWord.getDefaultTranslation());

        TextView textObj1 = (TextView)listItemView.findViewById(R.id.translate_view); // text view for miwok
        textObj1.setText(currentWord.getmMiwokTranslation());

        ImageView imageObj = (ImageView)listItemView.findViewById(R.id.imageView);
        if (currentWord.checkImage()) {
            imageObj.setImageResource(currentWord.getImage()); // setting the image
        }
        else{
            imageObj.setVisibility(View.GONE);  // removing the image view
        }

        View textContainer = listItemView.findViewById(R.id.text_layout);  //initialization of layout object

        int color = ContextCompat.getColor(getContext(),mcolorResouce);  //taking the color info
        textContainer.setBackgroundColor(color); // displaying the required color

        return listItemView;
    }
}
