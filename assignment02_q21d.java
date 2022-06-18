package com.company;

public class assignment02_q21d
{
    public static void main(String[] args) {
        for (int i = 6; i >= 1; i--)
        {
            for (int j = 2*(6 - i); j >= 1; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
