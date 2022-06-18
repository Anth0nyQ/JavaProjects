package com.company;
import java.util.*;

public class MyInteger
{
    int value;

    public MyInteger(int newValue)
    {
        value = newValue;
    }

    public int getValue()
    {
        return value;
    }

    public boolean isEven()
    {

        if(value % 2 ==0)
        {
            return true;
        }
        return false;
    }

    public boolean isOdd()
    {
        if(value % 2 != 0)
            return true;
        return false;
    }

    public boolean isPrime()
    {
        int i = 0;
        for(i = 2; i <= value / 2; i++)
        {
            if(value % i != 0)
            {
                return true;
            }
        }
        return false;
    }

    public boolean isEven(int value)
    {
        if(value % 2 == 0)
        {
            return true;
        }
        return false;
    }

    public boolean isOdd(int value)
    {
        if(value % 2 != 0)
        {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int value)
    {
        return isPrime(value);
    }

    public static boolean isEven(MyInteger myInteger)
    {
        return myInteger.isEven(myInteger.getValue());
    }

    public static boolean isOdd(MyInteger myInteger)
    {
        return myInteger.isOdd(myInteger.getValue());
    }

    public static boolean isPrime(MyInteger myInteger)
    {
        return myInteger.isPrime(myInteger.getValue());
    }

    public boolean equals(int intValue)
    {
        return value == intValue;
    }

    public boolean equals(MyInteger myInteger)
    {
        return equals(myInteger.getValue());
    }

    public static int parseInt(String s)
    {
        return Integer.parseInt(s);
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int myInt = input.nextInt();

        MyInteger myInteger1 = new MyInteger(myInt);
        MyInteger myInteger2 = new MyInteger(MyInteger.parseInt("11"));
        MyInteger myInteger3 = new MyInteger(2);
        MyInteger myInteger4 = new MyInteger(3);

        System.out.println("integer1: "+myInteger1.getValue());
        System.out.println("integer2: "+myInteger2.getValue());
        System.out.println("integer3: "+myInteger3.getValue());
        System.out.println("integer4: "+myInteger4.getValue());

        System.out.println("\nThe statement integer1 is even is: " + myInteger1.isEven());
        System.out.println("The statement integer2 is even is: " + myInteger2.isEven());
        System.out.println("The statement integer3 is even is: " + myInteger3.isEven());
        System.out.println("The statement integer4 is even is: " + myInteger4.isEven());

        System.out.println("\nThe statement integer1 is odd is: " + myInteger1.isOdd());
        System.out.println("The statement integer2 is odd is: " + myInteger2.isOdd());
        System.out.println("The statement integer3 is odd is: " + myInteger3.isOdd());
        System.out.println("The statement integer4 is odd is: " + myInteger4.isOdd());

        System.out.println("\nThe statement integer1 is prime is: " + myInteger1.isPrime());
        System.out.println("The statement integer2 is prime is: " + myInteger2.isPrime());
        System.out.println("The statement integer3 is prime is: " + myInteger3.isPrime());
        System.out.println("The statement integer4 is prime is: " + myInteger4.isPrime());

        System.out.println("\nThe statement integer1 is even is: " + MyInteger.isEven(myInteger1));
        System.out.println("The statement integer2 is even is: " + MyInteger.isEven(myInteger2));
        System.out.println("The statement integer3 is even is: " + MyInteger.isEven(myInteger3));
        System.out.println("The statement integer4 is even is: " + MyInteger.isEven(myInteger4));

        System.out.println("\nThe statement integer1 is odd is: " + MyInteger.isOdd(myInteger1));
        System.out.println("The statement integer2 is odd is: " + MyInteger.isOdd(myInteger2));
        System.out.println("The statement integer3 is odd is: " + MyInteger.isOdd(myInteger3));
        System.out.println("The statement integer4 is odd is: " + MyInteger.isOdd(myInteger4));

        System.out.println("\nThe statement integer1 is prime is: " + MyInteger.isPrime(myInteger1));
        System.out.println("The statement integer2 is prime is: " + MyInteger.isPrime(myInteger2));
        System.out.println("The statement integer3 is prime is: " + MyInteger.isPrime(myInteger3));
        System.out.println("The statement integer4 is prime is: " + MyInteger.isPrime(myInteger4));

        System.out.println("\nThe statement integer1 equals integer2 is: " + myInteger1.equals(myInteger2));
        System.out.println("The statement integer1 equals integer3 is: " + myInteger1.equals(myInteger3));
        System.out.println("The statement integer1 equals integer4 is: " + myInteger1.equals(myInteger4));
    }
}
