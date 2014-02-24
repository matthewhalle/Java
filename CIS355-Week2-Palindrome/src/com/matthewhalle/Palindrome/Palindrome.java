/***********************************************************************
Program Name: Palindrome.java
Programmer's Name: Matthew Halle
Program Description: Program that asks for input of a 5 digit value then determines whether it is a palindrome  or not.  

***********************************************************************/
package com.matthewhalle.Palindrome;
import javax.swing.JOptionPane;

public class Palindrome
{	
	public static void main(String[] args)
	{
		String inputValue = retrieveInput();
		display(check(inputValue), inputValue);		
		System.exit(0);
	}
	public static String retrieveInput()
    {
		String value = JOptionPane.showInputDialog("Enter a 5 digit Value");
		if (value.length() > 5 || value.length() < 5 )
		{
			value = JOptionPane.showInputDialog("Number entered was not 5 digits \n Please enter 5 digits");
			return value;
		}
		else 		
			return value;
    }
	 public static boolean check(String word)
	    {		
	     int end_iterator = word.length();
	     for(int start_iterator = 0 ; start_iterator < end_iterator; start_iterator = start_iterator + 1, end_iterator = end_iterator - 1)
	        {
	            if(word.charAt(start_iterator) != word.charAt(end_iterator-1))
	            {	            	
	                return false;
	            }
	        }
	        return true;
	    }
	 public static void display(boolean value, String imputValue)
	 {
		 if(value == true)
			 JOptionPane.showMessageDialog(null, "This is indeed a palindrome! "+imputValue,"Palindrome", JOptionPane.PLAIN_MESSAGE);
		 else
			 JOptionPane.showMessageDialog(null, "This is not a palindrome! "+imputValue,"Palindrome", JOptionPane.PLAIN_MESSAGE); 		 
	 }	
}
