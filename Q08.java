package com.company;

public class MyStringBuilder2
{
    char[] array;
    int size;
    int capacity;

    public MyStringBuilder2(String s)
    {
        capacity = 2*s.length();
        size = s.length();
        array = new char[size];
        for(int i = 0; i < size; i++)
        {
            array[i] = s.charAt(i);
        }
    }

    public MyStringBuilder2 append(MyStringBuilder2 s)
    {
        if(s.size + size > capacity)
        {
            capacity = s.size + size;
        }

        char[] temp = new char[capacity];
        for(int i = 0; i < capacity; i++)
        {
            if(i < size)
            {
                temp[i] = array[i];
            }
            else
            {
                temp[i] = s.array[size - i];
            }
        }

        size += s.size;
        array = temp;

        return this;
    }

    public MyStringBuilder2 substring(int begin, int end)
    {
        String substr = "";
        for(int i = begin; i <= end; i++)
        {
            substr += array[i];
        }

        MyStringBuilder2 temp = new MyStringBuilder2(substr);
        return temp;
    }

    public String getString()
    {
        String s = "";
        for(int i = 0; i < size; i++)
        {
            s += array[i];
        }
        return s;
    }

    public int getSize()
    {
        return size;
    }

    public int getCapacity()
    {
        return capacity;
    }
}