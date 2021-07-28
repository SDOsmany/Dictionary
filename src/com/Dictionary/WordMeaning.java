package com.Dictionary;

/**
 * Class to store the words and their meanings
 */
public class WordMeaning {
    private String wordName = "";
    private String meaning = "";

    public WordMeaning(String word, String meaning){
        this.wordName = word;
        this.meaning = meaning;
    }

    //Accessor method for the word
    public String getWordName(){
        return this.wordName;
    }

    //Accessor method for the meaning of the word
    public String getMeaning(){
        return this.meaning;
    }

    //Method to add more meanings to the word
    public void addMeaning(String meaning){
        this.meaning += meaning;
    }
}
