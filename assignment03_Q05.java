package com.company;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Time
{

    long hour;
    long minutes;
    long seconds;

    //current time
    public Time()
    {
        this.hour = Calendar.HOUR_OF_DAY;
        this.minutes = Calendar.MINUTE;
        this.seconds = Calendar.SECOND;
    }

    //elapsed time
    public Time(long milliseconds)
    {
        this.hour = TimeUnit.MILLISECONDS.toHours(milliseconds);
        this.minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds)
                - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(milliseconds));
        this.seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds)
                - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(milliseconds));
    }

    //input time
    public Time(long h, long m, long s)
    {
        this.hour = h;
        this.minutes = m;
        this.seconds = s;
    }

    public Time(String s)
    {
        //1970 millisecond constructor
        this(System.currentTimeMillis());
    }

    public void display()
    {
        //display section
        System.out.println("HH:MM:SS " + this.hour + ":" +
                this.seconds + ":" + this.minutes);
    }

    public static void main(String args[])
    {
        Time obj = new Time();
        obj.display();
        obj = new Time(555550000);
        obj.display();
        obj = new Time(5,23,55);
        obj.display();
    }
}
