package com.matthewhalle.courseproject;

import java.text.DecimalFormat;


public class CalculateVolume 
{
       private double length,width,depth;
       
    public double getLength()    
    {
        return length;
    }
    public double getWidth()   
    {
        return width;
    }
    public double getDepth()
    {
        return depth;
    }
    public void setLength(double l)
    {
        length = l;
    }
    public void setWidth(double w)
    {
        width = w;
    }
    public void setDepth(double d)
    {
        depth = d;
    }
    public double volume()
    {
        double v = length*width*depth;
        return v;
    }
  public String toString()
  {
        DecimalFormat num = new DecimalFormat(",###.##");
        String s = num.format(volume());
        return s;
    }
}