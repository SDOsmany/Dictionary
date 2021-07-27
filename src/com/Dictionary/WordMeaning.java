package com.Dictionary;

public class WordMeaning {
    private String wordName = "";
    private String meaning = "";

    public WordMeaning(String word, String meaning){
        this.wordName = word;
        this.meaning = meaning;
    }

    public String getWordName(){
        return this.wordName;
    }

    public String getMeaning(){
        return this.meaning;
    }
}
