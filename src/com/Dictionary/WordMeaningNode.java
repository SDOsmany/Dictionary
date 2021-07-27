package com.Dictionary;

public class WordMeaningNode {
    WordMeaning word;
    WordMeaningNode next;

    public WordMeaningNode(WordMeaning word){
        this.word = word;
        this.next = null;
    }
}
