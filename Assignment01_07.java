package com.company;

import java.util.Scanner;

import static java.lang.Math.sqrt;

import java.text.DecimalFormat;

public class Compute{

    public static void main(String[] args)
    {
        //side 1 code
        System.out.print("Enter the length of side 1: ");
        Scanner input = new Scanner(System.in);
        double sideA = input.nextDouble();
        System.out.println();

        //side 2 code
        System.out.print("Enter the length of side 2: ");
        input = new Scanner(System.in);
        double sideB = input.nextDouble();
        System.out.println();

        //side 3 code
        System.out.print("Enter the length of side 3: ");
        input = new Scanner(System.in);
        double sideC = input.nextDouble();
        System.out.println();

        //Calculation for Area
        double perimeter = sideA + sideB + sideC;
        double s = perimeter/2;
        double area = sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));

        //Calculation for volume and surface area and height and radius
        double radius = 1 + (Math.random() * 20);
        double height = 1 + (Math.random() * 20);
        double volume = 3.14 * (radius * radius) * height;
        double surfaceArea = 2 * 3.14 * radius * height;

        //Print out findings
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Area: " + area);
        System.out.println("Radius: " + radius);
        System.out.println("Height:" + height);
        System.out.println("Volume:" + df.format(volume));
        System.out.println("Surface Area:" + df.format(surfaceArea));
    }
}
