/***********************************************************************
Program Name: Index.java
Programmer's Name: Matthew Halle
Program Description: Create an application to use three arrays to take 
values and then use those values to multiply to fill a third array. Then
use values in array to display entered values into arrays.
***********************************************************************/
package com.matthewhalle.threearraylists;
import java.util.ArrayList;

public class ThreeArrayLists 
{

	public static void main(String[] args) 
	{
		ArrayList priceList = new ArrayList();
		ArrayList quantityList = new ArrayList();
		ArrayList amountList = new ArrayList();
		//PRICE lIST
		priceList.add(new Double(10.62));
		priceList.add(new Double(14.89));
		priceList.add(new Double(13.21));
		priceList.add(new Double(16.55));
		priceList.add(new Double(18.62));
		priceList.add(new Double(9.47));
		priceList.add(new Double(6.58));
		priceList.add(new Double(18.32));
		priceList.add(new Double(12.15));
		priceList.add(new Double(3.98));
		//QUANTITY LIST   
		quantityList.add(new Double(4.0));
		quantityList.add(new Double(8.5));
		quantityList.add(new Double(6.0));
		quantityList.add(new Double(7.35));
		quantityList.add(new Double(9.0));

		quantityList.add(new Double(15.3));
		quantityList.add(new Double(3));
		quantityList.add(new Double(5.4));
		quantityList.add(new Double(2.9));
		quantityList.add(new Double(4.8));

		extend(amountList, quantityList, priceList);
		displayList(quantityList, priceList, amountList);
	}
	private static void displayList(ArrayList quantityList, ArrayList priceList, ArrayList amountList)  
	{
		for (int i = 0; i < 10; i++) 				
		{
			System.out.format("%d)  %.2f * %.2f = %.2f \n",i+1, Double.valueOf(priceList.get(i).toString()), Double.valueOf(quantityList.get(i).toString()), Double.valueOf(amountList.get(i).toString()));
		}
	}
	private static void extend(ArrayList amountList, ArrayList quantityList, ArrayList priceList) 
	{
		for (int i = 0; i < 10; i++) 
		{
			amountList.add((Double.valueOf(priceList.get(i).toString())) * (Double.valueOf(quantityList.get(i).toString())));
		}
	}
}
