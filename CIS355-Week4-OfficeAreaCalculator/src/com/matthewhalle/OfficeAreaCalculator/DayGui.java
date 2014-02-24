/***********************************************************************
Program Name: DayGui.java
Programmer's Name: Matthew Halle
Program Description: Create a user interface with tabs, buttons, labels, and colors that when clicked have actions.

 ***********************************************************************/
package com.matthewhalle.OfficeAreaCalculator;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class DayGui extends JPanel 
{	
	private static final long serialVersionUID = 1L;
	private JFrame mainFrame;
	private JButton cmdGood;
	private JButton cmdBad;


	public DayGui() // constructor
	{
		
		
		
		mainFrame = new JFrame("Messages");
		// create the button objects;
		cmdGood = new JButton("Good");
		cmdBad = new JButton("Bad");
		// get the content pane and specify layout manager
		//Container c = mainFrame.getContentPane();
		
		setLayout(new FlowLayout());
		// add the button to the contentPane
		add(cmdGood);
		
		add(cmdBad);
		
		
		// create accelerator keys
		cmdGood.setMnemonic('G');
		cmdBad.setMnemonic('B');
		mainFrame.setSize(300,100);
		// define and register window event handler
		mainFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
		//create and register an single button event handler
		ButtonsHandler bhandler = new ButtonsHandler(); // instantiates a handler
		cmdGood.addActionListener(bhandler); // register the handler
		cmdBad.addActionListener(bhandler); // register the handler
		this.setVisible(true);
		
	}
	
	class ButtonsHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			mainFrame.setBackground(Color.DARK_GRAY);
			if (e.getSource() == cmdGood)
			{
				JOptionPane.showMessageDialog(null, "Today is a very good day!",
						"Event Handler Message",JOptionPane.INFORMATION_MESSAGE);
				cmdGood.setBackground(Color.BLUE);
				mainFrame.getContentPane().setBackground(Color.DARK_GRAY);
			}
			else if (e.getSource() == cmdBad)
			{
				JOptionPane.showMessageDialog(null, "I'm having a bad day today!",
						"Event Handler Message",JOptionPane.INFORMATION_MESSAGE);
				cmdBad.setBackground(Color.GREEN);
				mainFrame.getContentPane().setBackground(Color.DARK_GRAY);
			}
		}
	} 
	public static void main(String args[])
	{		
		DayGui app = new DayGui(); // instantiate a GUI object
	}
}
