package com.company;

class RegularPolygon {
    private int n;
    private double side, x, y;


    public RegularPolygon()
    {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }


    public RegularPolygon(int n, double side)
    {
        this.n = n;
        this.side = side;
        x = 0;
        y = 0;
    }


    public RegularPolygon(int n, double side, double x, double y)
    {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }


    public int getN()
    {
        return n;
    }

    public double getSide()
    {
        return side;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

//setter methods

    public void setN(int n)
    {
        this.n = n;
    }

    public void setSide(double side)
    {
        this.side = side;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double getPerimeter()
    {
        return n * side;
    }

    public double getArea()
    {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args)
    {

        RegularPolygon polygons[]=new RegularPolygon[3];

        polygons[0]=new RegularPolygon();

        polygons[1]=new RegularPolygon(6, 4);

        polygons[2]=new RegularPolygon(10, 4, 5.6, 7.8);

        for(int i=0; i<polygons.length; i++)

        {

            System.out.println("Perimeter of polygon "+(i+1)+": "+polygons[i].getPerimeter());

            System.out.println("Area of polygon "+(i+1)+": "+polygons[i].getArea());

        }

    }
}