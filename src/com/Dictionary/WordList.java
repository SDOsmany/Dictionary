package com.Dictionary;

import javax.swing.*;

public class WordList {
    private WordMeaningNode list;
    private WordMeaning deletedWord = null;
    private boolean deleted = false;

    public WordList(){
        this.list = null;
    }

    public WordMeaning getDeletedWord(){
        return this.deletedWord;
    }

    public boolean wasDeleted(){
        return this.deleted;
    }

    /**
     * A method to return all the words and their meanings from the list
     * @return returns words and their meanings
     */
    public String toString(){
        String result = "";
        WordMeaningNode current = this.list;

        while (current != null){
            result += current.getWord().getWordName() + " - " + current.getWord().getMeaning() + "\n";
            current = current.next;
        }
        return result;
    }

    /**
     * A method to return all the words that were deleted from the list
     * @return returns the deleted words
     */
    public String deletedWords(){
        String result = "";
        WordMeaningNode current = this.list;

        while (current != null){
            result += current.getWord().getWordName() + "\n";
            current = current.next;
        }
        return result;
    }

    /**
     * Used to add another meaning to a specific word
     * @param word the word to update
     * @param meaning the new meaning to add to the word
     */
    public void update(String word, String meaning) {
        if (this.list == null) {
            JOptionPane.showMessageDialog(null,"There are no words in the dictionary");
        } else {
            WordMeaningNode back = null;
            WordMeaningNode current = this.list;
            boolean found = false;

            while (current != null && !found) {
                if (word.equalsIgnoreCase(current.getWord().getWordName())) {
                    found = true;
                } else {
                    back = current;
                    current = current.next;
                }
            }
            if(found){
                current.getWord().addMeaning("\n        -"+meaning);
            }else{
                JOptionPane.showMessageDialog(null,"That word is not in the dictionary, try a different word");
            }
        }
    }

    /**
     * Used to remove a word from the linked list
     * @param word the word to remove from the list
     */
    public void remove(String word) {
        if (this.list == null) {
            JOptionPane.showMessageDialog(null,"There are no words in the dictionary");
        } else {
            WordMeaningNode back = null;
            WordMeaningNode current = this.list;
            boolean found = false;

            while (current != null && !found) {
                if (word.equalsIgnoreCase(current.getWord().getWordName())) {
                    found = true;
                } else {
                    back = current;
                    current = current.next;
                }
            }
            if(back == null) {
                list = list.next;
                if(found){
                    this.deleted = true;
                    this.deletedWord = current.getWord();
                }else
                    this.deleted = false;
            }
            else {
                if(found){
                    back.next = current.next;
                    this.deletedWord = current.getWord();
                    this.deleted = true;
                }else{
                    this.deleted = false;
                    JOptionPane.showMessageDialog(null,"That word is not in the dictionary, try a different word");
                }
            }
        }
    }

    /**
     * Used to insert nodes in lexicographical order inside of the linked list
     * @param word a WordMeaning object that contains the words and its meaning as fields
     */
    public void insert(WordMeaning word){
        WordMeaningNode temp = new WordMeaningNode(word);

        //if there are no words in the list we set list to the new words
        if(this.list == null){
            this.list = temp;
        }
        else
        {
            WordMeaningNode back = null;
            WordMeaningNode current = this.list;
            boolean found = false;

            while(current != null && !found)
            {
                if(temp.getWord().getWordName().compareTo(current.getWord().getWordName()) < 0){
                    found = true;
                }
                else
                {
                    back = current;
                    current = current.next;
                }
            }
            temp.next = current;
            if(back == null){
                this.list = temp;
            }
            else
            {
                back.next = temp;
            }

        }
    }
}
