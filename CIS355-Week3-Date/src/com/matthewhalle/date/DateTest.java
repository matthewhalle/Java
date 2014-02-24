package com.matthewhalle.date;

import javax.swing.JOptionPane;

public class DateTest
{

	public static void main(String[] args)
	{
		
		int month = Integer.parseInt(JOptionPane.showInputDialog("Enter the month as a Number"));
		int day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day as a Number"));
		int year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year as a Number"));
		int increment = Integer.parseInt(JOptionPane.showInputDialog("How many time do you want to increment the date"));
		Date testDate = new Date( month, day, year );
		
		System.out.println( "Checking increment" );
		

		for ( int counter = 0; counter < increment; counter++ ) 
		{
			testDate.nextDay();
			System.out.printf( "Incremented Date: %s\n", testDate.toString() );
		}

	}

}
