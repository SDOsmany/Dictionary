package com.Dictionary;

public class Dictionary {

    public static void main(String[] args) {
        String word = "waiting";
        String definition = "let time pass";

        WordList wordList = new WordList();

        wordList.insert( new WordMeaning(word,definition));

        System.out.println(wordList.toString());

        String newWord = "Love";
        String newMeaning = "care for someone";


        wordList.insert( new WordMeaning(newWord,newMeaning));

        System.out.println(wordList.toString());

        wordList.remove(word);
        System.out.println(wordList.toString());
    }
}
