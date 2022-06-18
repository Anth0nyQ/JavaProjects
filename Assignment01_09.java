package com.company;

import java.util.Scanner;

import java.util.regex.*;

public class SocialSecurity
{
    public static void main(String[] args)
    {
        //Scanner
        Scanner input = new Scanner(System.in);

        //variables
        String ssn;
        String digitCheck;

        //SSN acquisition
        System.out.println("Enter the social security number: ");
        ssn = input.nextLine();

        //checking logic
        if ((ssn.length() == 11) && (ssn.charAt(3) == '-') && (ssn.charAt(6) == '-'))
        {
            digitCheck = ssn.replaceAll("-", "");
            if(Pattern.matches("[0-9]+", digitCheck))
            {
                System.out.println("Input is valid.");
            }
            else
            {
                System.out.println("Input is invalid.");
            }
        }
        else
        {
            System.out.println("Input is invalid.");
        }
    }
}
