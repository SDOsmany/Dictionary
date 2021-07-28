package com.Dictionary;

import javax.swing.JOptionPane;

public class GetData {

    //Used to get the input from the user with a message
    public static String getString(String s){
        return JOptionPane.showInputDialog(s);
    }

    public static int getInt(String s){
        return Integer.parseInt(getString(s));
    }

    public static double getDouble(String s){
        return Double.parseDouble(getString(s));
    }
}
