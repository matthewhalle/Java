/***********************************************************************
Program Name: Cylinder.java
Programmer's Name: Matthew Halle
Program Description: Take input for height and radius to find the volume of a cylinder. 
Use cylinder.java  class to be run by the cylindertest.java which initiates the input from user to 
store the values into an array and display the results to validate the equation.

 ***********************************************************************/
package com.matthewhalle.cylinder;

public class Cylinder
{
	double radius;
	double height;

	//constructor
	public Cylinder(double r, double h)
	{
		radius = r;
		height = h;		
	}
	//set radius 
	public void setRadius(double r)
	{
		radius = r;
	}

	// set Height 
	public void setHeight(double h)
	{
		height = h;
	}

	// get Radius 
	public double getRadius()
	{
		return radius;
	}

	// get Height 
	public double getHeight()
	{
		return height;
	}


	public double volume()
	{

		return radius * radius *height* Math.PI;

	}

}
