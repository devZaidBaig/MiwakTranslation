package com.example.android.miwok;

/**
 * Created by welcome on 9/28/2016.
 */
public class Word {

    private String mDefaultTranslation,mMiwokTranslation;

    public Word(String defaulttranslation,String miwoktranslation){
        mDefaultTranslation = defaulttranslation;
        mMiwokTranslation = miwoktranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

}
