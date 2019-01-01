package com.example.mostaf170.co_dublish.home.voc;

//{@link word} represents a vocabulary word that the user wants to learn.
//        it contains a default translation and a miwok translation for that word.

public class word {
    // Default translation for the word
    private String mDefaultTranslation;

    //  Miwok translation for the word
    private String mMiwokTranslation;

    public word(String defaultTranslationId,String miwokTranslationID) {
        mDefaultTranslation=defaultTranslationId;
        mMiwokTranslation=miwokTranslationID;


    }

    // Get the default translation of the word
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Get the Miwok translation of the word
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
