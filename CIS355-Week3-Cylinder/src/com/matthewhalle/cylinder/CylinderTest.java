package com.matthewhalle.cylinder;

import javax.swing.JOptionPane;

public class CylinderTest
{
	 public static void main(String[] args) 
	    {
	        // Calling Cylinder class and creating new Cylinder object & setting
	        // height & radius values.
		 	double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius"));
		 	double height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height"));
		 	Cylinder[] cylArray = new Cylinder[3];
		 	cylArray[0] = new Cylinder(radius, height);
		 	radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius"));
		 	height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height"));
		 	cylArray[1] = new Cylinder(radius, height);
		 	radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius"));
		 	height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height"));		 	
		 	cylArray[2] = new Cylinder(radius, height);
		 	
		 	for(Cylinder c: cylArray)
		 	{
		 		System.out.println("*******");
		 		System.out.println("Radius = " + c.getRadius());
		        System.out.println("Height = " + c.getHeight());
		        System.out.println("Volume = " + c.volume());
		        System.out.println("*******");
		 	}
		 	
		 	// note this was my test before moving to store values into an array
	        /*Cylinder cylinder = new Cylinder(radius,height);
	        
	        System.out.println("Radius = " + cylinder.getRadius());
	        System.out.println("Height = " + cylinder.getHeight());
	        System.out.println("Volume = " + cylinder.volume());
	        
	        
	        cylinder.setRadius(4);
	        cylinder.setHeight(5);
	        
	        System.out.println("New radius = " + cylinder.getRadius());
	        System.out.println("New height = " + cylinder.getHeight());
	        System.out.println("Volume = " + cylinder.volume());  
	        */
	    }
	 
	 	

}
