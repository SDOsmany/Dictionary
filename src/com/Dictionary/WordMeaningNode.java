package com.Dictionary;

//Class to create Nodes for each word
public class WordMeaningNode {
    WordMeaning word;
    WordMeaningNode next;

    public WordMeaningNode(WordMeaning word){
        this.word = word;
        this.next = null;
    }

    //Accessor method for the WordMeaning object
    public WordMeaning getWord(){
        return this.word;
    }
}
