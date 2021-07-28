package com.Dictionary;

import javax.swing.*;

public class WordList {
    private WordMeaningNode list;

    public WordList(){
        this.list = null;
    }

    public String toString(){
        String result = "";
        WordMeaningNode current = this.list;

        while (current != null){
            result += current.getWord().getWordName() + " - " + current.getWord().getMeaning() + "\n";
            current = current.next;
        }
        return result;
    }

    public String deletedWords(){
        String result = "";
        WordMeaningNode current = this.list;

        while (current != null){
            result += current.getWord().getWordName() + "\n";
            current = current.next;
        }
        return result;
    }


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
                current.getWord().addMeaning("\n\t-"+meaning);
            }else{
                JOptionPane.showMessageDialog(null,"That word is not in the dictionary, try a different word");
            }
        }
    }

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
            }
            else {
                if(found){
                    back.next = current.next;
                }else{
                    JOptionPane.showMessageDialog(null,"That word is not in the dictionary, try a different word");
                }
            }
        }
    }


    public void insert(WordMeaning word){
        WordMeaningNode temp = new WordMeaningNode(word);

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
