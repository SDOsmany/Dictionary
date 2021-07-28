package com.Dictionary;

import javax.swing.*;

public class Dictionary {

    public static void main(String[] args) {
        WordList dictionary = new WordList();
        WordList deletedWords = new WordList();
        String word = "";
        String meaning = "";
        boolean done = false;

        String menu = "1. Add a word to the dictionary\n" +
                    "2. Update a word's meaning\n" +
                    "3. Remove a word from the dictionary\n" +
                    "4. View dictionary\n" +
                    "5. View deleted words\n" +
                    "6. Quit";

            while(!done){
                int choice = GetData.getInt(menu);

                switch (choice){
                    case 1:
                        word = GetData.getString("Insert the new word");
                        meaning = GetData.getString("Insert the word's meaning");
                        dictionary.insert(new WordMeaning(word,meaning));
                        break;
                    case 2:
                        word = GetData.getString("What word would you like to upgrade?");
                        meaning = GetData.getString("What meaning would you like to add to the word?");
                        dictionary.update(word,meaning);
                        break;
                    case 3:
                        word = GetData.getString("What word would you like to delete");
                        dictionary.remove(word);
                        if(dictionary.wasDeleted()){
                            deletedWords.insert(dictionary.getDeletedWord());
                        }
                        break;
                    case 4:
                        JTextArea text = new JTextArea(dictionary.toString(), 10, 50);
                        JScrollPane pane = new JScrollPane(text);
                        JOptionPane.showMessageDialog(null,pane,"Dictionary",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 5:
                        text = new JTextArea(deletedWords.deletedWords(), 10, 50);
                        pane = new JScrollPane(text);
                        JOptionPane.showMessageDialog(null,pane,"Dictionary",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        done = true;
                        break;
                    default:
                        display("That option is not defined, please selected an option from 1 to 6");
                        break;
                }
            }

    }

    public static void display(String s){
        JOptionPane.showMessageDialog(null,s,"Error",JOptionPane.ERROR_MESSAGE);
    }
}
