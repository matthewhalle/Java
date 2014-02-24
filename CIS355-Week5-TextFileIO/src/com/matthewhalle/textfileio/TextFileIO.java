/***********************************************************************
Program Name: TextFileIO.java
Programmer's Name: Matthew Halle
Program Description: Create a program that creates a file and open and closes the file to store data values.

 ***********************************************************************/
package com.matthewhalle.textfileio;
import java.io.*; 
public class TextFileIO
{
	public static void main(String args[]) 
	{
		//This declares a file to open.
		File outFile = new File("numbers.txt");//"numbers.dat"); //changed to txt for easy checking		
		try {			
			BufferedWriter writer = new BufferedWriter(new FileWriter(outFile, true));
			//This for loop handles adding all of the numbers together
			for(int i = 2; i <= 100; i += 2) 
			{				
				writer.write("" + i + ", ");
			}
			//adding a new line and closing the file
			writer.newLine();
			writer.close();
			//A buffered Reader is used for reading a new file.
			BufferedReader reader = new BufferedReader(new FileReader(outFile));
			String str1 ="";
			System.out.println("This is what is in the numbers.dat file now:");
			while ((str1 = reader.readLine()) != null)   
			{
				System.out.println(str1);
			}
			reader.close();
			BufferedWriter writer2 = new BufferedWriter(new FileWriter(outFile, true));
			//This for loop is identical to the previous one, except for odd numbers
			for(int i = 1; i < 100; i += 2) 
			{				
				writer2.write("" + i + ", ");
			}
			writer2.newLine();
			writer2.close();
			BufferedReader reader2 = new BufferedReader(new FileReader(outFile));
			String str2="";
			System.out.println("This is what is in the numbers.dat file now:");
			while ((str2 = reader2.readLine()) != null)   
			{
				System.out.println(str2);
			}
			reader2.close();
		}
		catch (Exception e) 
		{
			System.out.println(e.toString());
		}
	}
}
