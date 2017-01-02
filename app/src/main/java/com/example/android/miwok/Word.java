package com.example.android.miwok;

/**
 * Created by welcome on 9/28/2016.
 */
public class Word {

    private String mDefaultTranslation,mMiwokTranslation;
    private int mimage=No_IMAGE_PROVIDED;
    private static int No_IMAGE_PROVIDED=-1;
    private int mAudio;


    public Word(String defaulttranslation,String miwoktranslation,int menage, int audio){
        mDefaultTranslation = defaulttranslation;
        mMiwokTranslation = miwoktranslation;
        mimage=menage;
        mAudio=audio;
    }
    public Word(String DefaultTranslation,String MiwokTranslation,int audio){
        mDefaultTranslation= DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mAudio = audio;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImage(){
        return mimage;
    }

    public boolean checkImage(){
        return mimage != No_IMAGE_PROVIDED;
    }

    public int getAudio(){ return mAudio;}

}
