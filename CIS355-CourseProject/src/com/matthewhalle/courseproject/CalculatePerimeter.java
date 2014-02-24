package com.matthewhalle.courseproject;

import java.text.DecimalFormat;


public class CalculatePerimeter 
{
    private double length,width;
    
    public double getLength()    
    {
        return length;
    }
    public double getWidth()    
    {
        return width;
    }
    public void setLength(double l)
    {
        this.length = l;
    }
    public void setWidth(double w)
    {
        this.width = w;
    }
    public double perimeter()
    {
        return ((2*length)+(2*width));
    }
    public String toString()
    {
        DecimalFormat num = new DecimalFormat(",###.##");
        String s = num.format(perimeter());
        return s;
    }
}
