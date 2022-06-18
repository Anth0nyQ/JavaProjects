package com.company;

public class MyString2 {
    private char[] data;

    public MyString2() {
        this.data = new char[0];
    }

    public MyString2(String s) {
        data = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
        {
            data[i] = s.charAt(i);
        }
    }

    public String getArray() {
        return new String(data);
    }

    public MyString2 substring(int begin) {
        char[] result = new char[data.length - begin];
        for (int i = begin; i < data.length; i++) {
            result[i - begin] = data[i];
        }
        MyString2 myString = new MyString2();
        myString.data = result;
        return myString;
    }

    public MyString2 toUpperCase() {
        char[] result = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = Character.toUpperCase(data[i]);
        }
        MyString2 myString = new MyString2();
        myString.data = result;
        return myString;
    }

    public static MyString2 valueOf(boolean b) {
        if (b) {
            return new MyString2("true");
        } else {
            return new MyString2("false");
        }
    }
}