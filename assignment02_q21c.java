package com.company;

public class assignment02_q21c
{
    public static void main(String[] args)
    {
        for (int i = 1; i < 7; i++)
        {
            for (int j = 2*(6 - i); j >= 1; j--)
            {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
