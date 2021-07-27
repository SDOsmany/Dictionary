package com.Dictionary;

public class WordMeaningNode {
    WordMeaning word;
    WordMeaningNode next;

    public WordMeaningNode(WordMeaning word){
        this.word = word;
        this.next = null;
    }

    public WordMeaning getWord(){
        return this.word;
    }
}
