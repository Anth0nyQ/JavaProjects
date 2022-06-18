package com.company;

import java.util.Scanner;

public class Vowels
{
    public static void main(String[] args)
    {
        //initialize
        Scanner scan = new Scanner(System.in);

        //variables
        String completeString = "";
        char Characters;
        int aCount = 0;
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;
        int normChar = 0;
        int i = 0; //string position counter

        //string reading
        System.out.println("Enter a string of characters: ");
        completeString = scan.nextLine();

        //while loop
        while(i < completeString.length())
        {
            Characters = completeString.charAt(i);
            if (Characters == 'a')
            {
                aCount++;
            }
            else if(Characters == 'e')
            {
                eCount++;
            }
            else if(Characters == 'i')
            {
                iCount++;
            }
            else if(Characters == 'o')
            {
                oCount++;
            }
            else if(Characters == 'u')
            {
                uCount++;
            }
            else if(Characters != 'a' && Characters != 'e' && Characters != 'i' && Characters != 'o' && Characters != 'u')
            {
                normChar++;
            }
            i++;
        }
        System.out.println("Number of each lowercase Vowels in a string: ");
        System.out.println("a: " + aCount);
        System.out.println("e: " + eCount);
        System.out.println("i: " + iCount);
        System.out.println("o: " + oCount);
        System.out.println("u: " + uCount);
        System.out.println("normal characters: " + normChar);
    }
}
