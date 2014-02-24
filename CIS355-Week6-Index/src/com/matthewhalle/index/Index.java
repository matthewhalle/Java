/***********************************************************************
Program Name: Index.java
Programmer's Name: Matthew Halle
Program Description: Create a GUI application that inputs text and counts
the number a character is used.
***********************************************************************/
package com.matthewhalle.index;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class Index extends Frame implements KeyListener 
{
	TextField a, b;
	TextArea toIndex;
	Button btn;
	public Index() 
	{
		//draw the GUI
		super("Index");
		setSize(650, 300);
		setLayout(new FlowLayout());
		add(new Label("Enter text to be searched:"));
		toIndex = new TextArea();
		add(toIndex);
		add(new Label("Enter a character:"));
		a = new TextField("", 4);
		add(a);
		
		a.addKeyListener(this);
		
		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e) 
			{
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) 
	{
		//create a new instance of the GUI
		Index app = new Index();
		app.setVisible(true);
	}
	public void keyTyped(KeyEvent e) 
	{
	}
	//when the user types in the bottom text box, grab the key and count the number of occurrences
	public void keyPressed(KeyEvent e) 
	{
		String myString = toIndex.getText();
		String toFind = "" + e.getKeyChar();
		int count = 0, pos = -1;
		//use indexOf to find each occurrence of the typed letter
		while ((pos = myString.indexOf(toFind, pos + 1)) >= 0) 
		{
			System.out.println(pos);
			count++;
		}
		JOptionPane.showMessageDialog(null, "Number of " + toFind + "'s: " + count);
	}
	public void keyReleased(KeyEvent e) 
	{
	}
}