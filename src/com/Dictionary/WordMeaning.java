package com.Dictionary;

public class WordMeaning {
    private String word = "";
    private String meaning = "";

    public WordMeaning(String word, String meaning){
        this.word = word;
        this.meaning = meaning;
    }

    public String getWord(){
        return this.word;
    }

    public String getMeaning(){
        return this.meaning;
    }
}
