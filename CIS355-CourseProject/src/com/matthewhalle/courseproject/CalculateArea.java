package com.matthewhalle.courseproject;

import java.text.DecimalFormat;

public class CalculateArea 
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
    public double area()
    {
        return (length*width);
    }
   public String toString()
   {
        DecimalFormat num = new DecimalFormat(",###.##");
        String s = num.format(area());
        return s;
    }
}
