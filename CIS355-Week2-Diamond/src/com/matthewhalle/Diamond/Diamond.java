/***********************************************************************
Program Name: Diamond.java
Programmer's Name: Matthew Halle
Program Description: Program that displays a diamond (the row number of a diamond must be odd) of asterisks whose row is 
specified in an integer parameter row. For example, if the user enters a 7, then the diamond will have seven rows and 
the method will display the pattern of asterisks. Below is an example of the diamond displayed when 7 is entered.  

 ***********************************************************************/
package com.matthewhalle.Diamond;
import javax.swing.JOptionPane;
public class Diamond
{		
	public static void main(String[] args)
	{				
		int rows = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rows to disply\n this must be an odd number"));
		if (rows % 2 == 1)// || rows <= 1)
		{
			diamondOfAsterisks(rows);
		}
		else
		{
			rows = Integer.parseInt(JOptionPane.showInputDialog("Error Please Enter the number of rows to disply\n this must be an odd number"));
			diamondOfAsterisks(rows);
		}
		System.exit(0);

	}
	public static void diamondOfAsterisks(int row)
	{		    
		JOptionPane.showMessageDialog(null, "Total number of rows: "+row,"Diamond", JOptionPane.PLAIN_MESSAGE);
		//System.out.println("Total number of rows: " + rows);
		String display = "";
		for (int r = 1; r < row; r += 2)
		{
			for (int c = 0; c <= (row / 2) - (r / 2); c++)
			{
				display += " ";
			}

			for (int j = 0; j < r; j++)
			{
				display += "*";
			}

			System.out.println(display);
			display = "";
		}		    

		for (int r = row; r > 0; r -= 2) 
		{
			for (int c = 0; c < (row / 2) - (r / 2); c++)
			{
				display += " ";
			}

			System.out.print(" ");

			for (int c = 0; c < r; c++)
			{
				display += "*";
			}

			System.out.println(display);
			display = "";		    
		}		    
	}
}
