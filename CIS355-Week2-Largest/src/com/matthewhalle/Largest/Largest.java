/***********************************************************************
Program Name: Largest.java
Programmer's Name: Matthew Halle
Program Description: Describe here what this program will do
***********************************************************************/
package com.matthewhalle.Largest;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Largest
{
	public static void main(String[] args)
	{
		int counter, number, largest = 0;		
		for (counter = 1; counter <=10; counter++)
		{
			number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number from 0 to 9"));
			if (number > 9)
				number = Integer.parseInt(JOptionPane.showInputDialog("Number entered was not from 0 to 9 \n Please enter a number from 0 to 9"));
			else if (number >= largest)
			{
				largest = number;
			}
		}
		JOptionPane.showMessageDialog(null, "The largest number entered is "+largest,"Results", JOptionPane.PLAIN_MESSAGE);
		System.exit(0);
	}
}
