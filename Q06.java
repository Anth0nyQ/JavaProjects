package com.company;

import java.math.BigInteger;

public class Q06
{
    public static void main(String[] args) {

        int count = 0;

        BigInteger n = new BigInteger(String.valueOf(Long.MAX_VALUE));

        BigInteger three = new BigInteger("3");

        BigInteger five = new BigInteger("5");

        BigInteger zero = new BigInteger("0");


        System.out.println("\nFirst 25 numbers greater than Long.MAX_VALUE" +

                " that are divisible by 3 and 5:");

        while (count < 25) {

            n = n.add(new BigInteger("1"));

            if ((n.remainder(three)).compareTo(zero) == 0 &&

                    (n.remainder(five)).compareTo(zero) == 0) {

                System.out.println(n);

                count++;

            }

        }
    }
}
