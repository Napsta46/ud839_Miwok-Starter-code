package com.example.android.miwok;

import java.security.PrivateKey;

/**
 *{@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a deafault translation and a Miwok transalation for that word.
 */

public class Word {

    //Default translation for the word
    private String mDefaultTranslation;

    // miwok translation for the wo  rd
    private String mMiwokTranslation;

    //Drawable resource ID
    private int mImageResourceId;

    public Word(String defaultTransaction, String miwokTranslation, int mImageResourceId){
        mDefaultTranslation = defaultTransaction;
        mMiwokTranslation = miwokTranslation;
     //         mImageResourceId = imageResourceId;
    }

    /**
     *Get the default translation of the word.
     */
    public String getDefaultTranslation(){

        return mDefaultTranslation;
    }
    /**
     * Get the Miwok translation of the word.
     */
    public String getmMiwokTranslation(){

        return mMiwokTranslation;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId(){

        return mImageResourceId;
    }
}
