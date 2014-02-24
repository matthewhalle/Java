/***********************************************************************
Program Name: Date.java
Programmer's Name: Matthew Halle
Program Description: Have the user enter month, day, and year and display an increment of that date.
In the date.java create validation for the date and allow methods to increment.
 ***********************************************************************/
package com.matthewhalle.date;

public class Date
{
	int month, day, year;

	public Date(int m, int d, int y)
	{
		// Initialize variables
		month = checkMonth(m);
		day = checkDay(d);
		year = checkYear(y);

	}
	// check to see if check year
	private int checkYear(int testYear) 
	{
		if ( testYear > 0 )
			return testYear;
		else {
			System.out.printf("Invalid year (%d) set to 1.\n", testYear );
			return 1;
		}
	}
	// check month
	private int checkMonth( int testMonth ) 
	{
		if ( testMonth > 0 && testMonth <= 12 )
			return testMonth;
		else 
		{
			System.out.printf("Invalid month (%d) set to 1.\n", testMonth );
			return 1;
		}
	}
	// check day
	private int checkDay( int testDay ) 
	{
		int daysPerMonth[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
			return testDay;

		if ( month == 2 && testDay == 29 && ( year % 400 == 0 ||
				( year % 4 == 0 && year % 100 != 0 ) ) )
			return testDay;

		System.out.printf( "Invalid day (%d) set to 1.\n", testDay );

		return 1;
	}

	// increment day
	public void nextDay()
	{
		int testDay = day + 1;
		if ( checkDay( testDay ) == testDay )
			day = testDay;
		else 
		{
			day = 1;
			nextMonth();
		}
	}
	// increment month
	public void nextMonth() 
	{
		if ( 12 == month )
			year++;
		month = month % 12 + 1;
	}
	public String toString() {
		return String.format( "%d/%d/%d", month, day, year );
	}



}
