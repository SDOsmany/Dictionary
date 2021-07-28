package com.Dictionary;

public class Dictionary {

    public static void main(String[] args) {
//        String word = "waiting";
//        String definition = "let time pass";
//
//        WordList wordList = new WordList();
//
//        wordList.insert( new WordMeaning(word,definition));
//
//        System.out.println(wordList.toString());
//
//        String newWord = "Love";
//        String newMeaning = "care for someone";
//
//
//        wordList.insert( new WordMeaning(newWord,newMeaning));
//
//        System.out.println(wordList.toString());

//        wordList.remove("vacation");
//        System.out.println(wordList.toString());
//        wordList.update("Love","world of warcraft");
//        System.out.println(wordList.toString());
        WordList dictionary = new WordList();
        WordList deletedWords = new WordList();


        String menu = "1. Add a word to the dictionary\n" +
                    "2. Update a word's meaning\n" +
                    "3. Remove a word from the dictionary\n" +
                    "4. View dictionary\n" +
                    "5. View deleted words\n" +
                    "6. Quit";

        int choice = GetData.getInt(menu);

    }
}
