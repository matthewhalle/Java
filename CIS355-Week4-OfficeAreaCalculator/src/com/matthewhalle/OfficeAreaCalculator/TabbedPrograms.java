package com.matthewhalle.OfficeAreaCalculator;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;


public class TabbedPrograms extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TabbedPrograms()
	{
		setTitle("Week Four Lab Assignment");
		setLayout(new BorderLayout()); 
		JTabbedPane jtp = new JTabbedPane();
		getContentPane().add(jtp);
		
		jtp.addTab("Day GUI", new DayGui());
		jtp.addTab("Office Area Calculator", new OfficeAreaCalculator());
		
		
		setSize(310, 210);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		TabbedPrograms test = new TabbedPrograms();
		
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}