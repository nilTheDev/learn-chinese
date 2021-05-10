package com.example.miwork;

public class Word {
    private final String  miwokWord;
    private final String englishWord;
    private final int imageId;
    private final int audioId;


    public Word(String miwokWord, String englishWord, int audioId){
        this(miwokWord, englishWord, audioId, -1 );
    }

    public Word(String miwokWord, String englishWord, int audioId, int imageId){
        this.miwokWord = miwokWord;
        this.englishWord = englishWord;
        this.imageId = imageId;
        this.audioId = audioId;
    }
    public String getMiwokWord(){
        return this.miwokWord;
    }
    public String getEnglishWord(){
        return this.englishWord;
    }
    public int getImageId(){
        return this.imageId;
    }
    public int getAudioId(){
        return this.audioId;
    }

}
