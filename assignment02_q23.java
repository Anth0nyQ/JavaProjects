import java.util.*;

public class assignment02_q23
{
    public static void main(String[] args)
    {
        int months = 12;
        int [][]temperatures = new int[12][2];

        //acquire data from user
        getData(temperatures);

        //print data from user
        System.out.println("\n\n\tThe average high temperature for the year is  " + averageHigh(temperatures));
        System.out.println("\n\n\tThe average low temperature for the year is  " + averageLow(temperatures));

        // print the results to the user
        System.out.println("\n\n\tIndex of highest temp. for the year is  " + indexHighTemp(temperatures));
        System.out.println("\n\n\tIndex of lowest temperature for the year is  " + indexLowTemp(temperatures));
    }

    public static void getData(int[][] t)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 12; i++)
        {
            System.out.print( "Enter highest temp. for the month " + ( i + 1 ) + ": ");
            t[i][0] = input.nextInt();

            System.out.println("Enter lowest  temp. for the month "+ ( i + 1 ) + ": ");
            t[i][1] = input.nextInt();
        }
    }

    public static double averageHigh(int[][] t)
    {
        //sum
        double sum = 0;

        //compute sum
        for(int i = 0; i < 12; i++)
        {
            sum += t[i][0];
        }

        //return average of highest temps
        return (sum / 12);
    }

    public static double averageLow(int[][] t)
    {
        //sum
        int sum = 0;

        //compute sum
        for ( int i = 0; i < 12; i ++ )
        {
            sum += t[i][1];
        }

        // return average of lowest temperatures
        return (sum / 12);
    }

    // returns the index of highest of high temperatures
    public static int indexHighTemp(int[][] t)
    {
        int ind = 0;
        double highest = t[0][0];

        // search for the highest high temperature
        for ( int i = 1; i < 12; i++ )
        {
            if (t[i][0] > highest)
            {
                highest = t[i][0];
                ind = i;
            }
        }

        //return the index of highest temp
        return t[ind][0];
    }

    public static int indexLowTemp(int[][] t)
    {
        int ind = 0;
        double lowest = t[0][1];

        for ( int i = 1; i < 12; i++ )
        {
            if (t[i][1] < lowest)
            {
                lowest = t[i][1];
                ind = i;
            }
        }

        // return the index of lowest low temp.
        return t[ind][1];
    }
}
