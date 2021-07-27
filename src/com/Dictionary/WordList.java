package com.Dictionary;

public class WordList {
    private WordMeaningNode list;

    public WordList(){
        this.list = null;
    }

    public String toString(){
        String result = "";
        WordMeaningNode current = this.list;

        while (current != null){
            result += current.getWord().getWordName() + " - " + current.getWord().getMeaning();
            current = current.next;
        }
        return result;
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
