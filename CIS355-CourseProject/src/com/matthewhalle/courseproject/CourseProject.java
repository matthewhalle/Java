/***********************************************************************
Program Name: CourseProject.java
Programmer's Name: Matthew Halle
Program Description: Create a GUI application that allows a user to calculate 
pool equations and save customers informations.
***********************************************************************/
package com.matthewhalle.courseproject;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;

class MyCustomFilter extends FileFilter 
{
	@Override
	public boolean accept(File file) 
	{
		// Allow only directories, or files with ".txt" extension
		return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
	}
	@Override
	public String getDescription() 
	{
		// This description will be displayed in the dialog,

		return "Text documents (*.txt)";
	}
} 
public class CourseProject extends JFrame 
{
	public CourseProject() 
	{
		initComponents();
	}
	
	@SuppressWarnings("unchecked")
	
	private void initComponents() 
	{

		tabPane = new JTabbedPane();
		pCustInfo = new JPanel();
		lblFName = new JLabel();
		lblLName = new JLabel();
		lblStreet = new JLabel();
		lblCity = new JLabel();
		lblState = new JLabel();
		lblZip = new JLabel();
		txtFName = new JTextField();
		txtLName = new JTextField();
		txtStreet = new JTextField();
		txtCity = new JTextField();
		txtState = new JTextField();
		txtZip = new JTextField();
		btnNewCustomer = new JButton();
		btnRecallCustomer = new JButton();
		btnSaveCustomer = new JButton();
		btnCustClear = new JButton();
		btnCustExit = new JButton();
		lblCustError = new JLabel();
		pCalc = new JPanel();
		lblLength = new JLabel();
		lblWidth = new JLabel();
		lblMinDepth = new JLabel();
		lblMaxDepth = new JLabel();
		lblPerimeter = new JLabel();
		lblVolume = new JLabel();
		lblArea = new JLabel();
		txtLength = new JTextField();
		txtWidth = new JTextField();
		txtMinDepth = new JTextField();
		txtMaxDepth = new JTextField();
		txtArea = new JTextField();
		txtVolume = new JTextField();
		txtPerimeter = new JTextField();
		lblCustomer = new JLabel();
		lblFt = new JLabel();
		lblFt2 = new JLabel();
		lblFt3 = new JLabel();
		lblFt4 = new JLabel();
		lblSqFt = new JLabel();
		lblCuFt = new JLabel();
		lblFt5 = new JLabel();
		btnCalculate = new JButton();
		lblError = new JLabel();
		btnCalcClear = new JButton();
		btnCalcExit = new JButton();
		btnSave = new JButton();
		txtCustomer = new JTextArea();
		pFile = new JPanel();
		fileChooser = new JFileChooser();
		btnPCOpen = new JButton();
		btnPCExit = new JButton();
		btnPCRefresh = new JButton();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Pool, Spa, Hot Tub Calculator");
		setBackground(new java.awt.Color(255, 255, 255));
		setResizable(false);

		tabPane.setBackground(new Color(255, 255, 255));
		tabPane.setTabPlacement(JTabbedPane.BOTTOM);
		tabPane.setToolTipText(null);
		tabPane.setName("tabPane");
		tabPane.setOpaque(true);

		pCustInfo.setToolTipText(null);

		lblFName.setLabelFor(txtFName);
		lblFName.setText("First Name:");
		lblFName.setFocusable(false);

		lblLName.setText("Last Name:");
		lblLName.setFocusable(false);

		lblStreet.setText("Street:");
		lblStreet.setFocusable(false);

		lblCity.setText("City:");
		lblCity.setFocusable(false);

		lblState.setText("State:");
		lblState.setFocusable(false);

		lblZip.setText("Zip:");
		lblZip.setFocusable(false);

		btnNewCustomer.setMnemonic('N');
		btnNewCustomer.setText("New Customer");
		btnNewCustomer.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				btnNewCustomerActionPerformed(evt);
			}
		});

		btnRecallCustomer.setMnemonic('R');
		btnRecallCustomer.setText("Recall Customer");
		btnRecallCustomer.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				btnRecallCustomerActionPerformed(evt);
			}
		});

		btnSaveCustomer.setMnemonic('S');
		btnSaveCustomer.setText("Save Customer");
		btnSaveCustomer.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent evt) 
			{
				btnSaveCustomerActionPerformed(evt);
			}
			
		});

		btnCustClear.setMnemonic('l');
		btnCustClear.setText("Clear");
		btnCustClear.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				btnCustClearActionPerformed(evt);
			}
		});

		btnCustExit.setMnemonic('x');
		btnCustExit.setText("Exit");
		btnCustExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				btnCustExitActionPerformed(evt);
			}
		});

		lblCustError.setFont(new Font("Tahoma", 1, 11)); // NOI18N
		lblCustError.setForeground(new Color(255, 0, 0));

		GroupLayout pCustInfoLayout = new GroupLayout(pCustInfo);
		pCustInfo.setLayout(pCustInfoLayout);
		pCustInfoLayout.setHorizontalGroup(
				pCustInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING, pCustInfoLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(pCustInfoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addGroup(GroupLayout.Alignment.LEADING, pCustInfoLayout.createSequentialGroup()
										.addGroup(pCustInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addGroup(pCustInfoLayout.createSequentialGroup()
														.addGroup(pCustInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(lblLName)
																.addComponent(lblFName, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(lblStreet)
																.addComponent(lblCity)
																.addComponent(lblZip))
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(pCustInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																		.addGroup(pCustInfoLayout.createSequentialGroup()
																				.addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addGap(20, 20, 20)
																				.addComponent(lblState)
																				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(txtState))
																				.addComponent(txtLName, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
																				.addComponent(txtFName)
																				.addComponent(txtStreet)
																				.addGroup(pCustInfoLayout.createSequentialGroup()
																						.addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																						.addComponent(lblCustError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
																						.addGroup(pCustInfoLayout.createSequentialGroup()
																								.addGroup(pCustInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
																										.addComponent(btnCustClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGroup(javax.swing.GroupLayout.Alignment.LEADING, pCustInfoLayout.createSequentialGroup()
																												.addComponent(btnNewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addGap(18, 18, 18)
																												.addComponent(btnRecallCustomer)))
																												.addGap(23, 23, 23)
																												.addComponent(btnCustExit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
																												.addGap(0, 0, Short.MAX_VALUE))
																												.addGroup(pCustInfoLayout.createSequentialGroup()
																														.addGap(0, 0, Short.MAX_VALUE)
																														.addComponent(btnSaveCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
																														.addContainerGap(18, javax.swing.GroupLayout.PREFERRED_SIZE))
				);
		pCustInfoLayout.setVerticalGroup(
				pCustInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pCustInfoLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(pCustInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblFName)
								.addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(pCustInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(lblLName))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(pCustInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lblStreet)
												.addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(pCustInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblCity)
														.addComponent(lblState)
														.addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addGroup(pCustInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(lblZip)
																.addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(lblCustError, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(9, 9, 9)
																.addGroup(pCustInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(btnNewCustomer)
																		.addComponent(btnRecallCustomer)
																		.addComponent(btnSaveCustomer))
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(pCustInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(btnCustExit)
																				.addComponent(btnCustClear))
																				.addGap(0, 57, Short.MAX_VALUE))
				);

		tabPane.addTab("Customer Information", null, pCustInfo, "Customer Information");

		lblLength.setText("Length:");
		lblLength.setFocusable(false);
		lblLength.setMaximumSize(new Dimension(56, 14));
		lblLength.setMinimumSize(new Dimension(56, 14));
		lblLength.setPreferredSize(new Dimension(56, 14));

		lblWidth.setText("Width:");
		lblWidth.setFocusable(false);
		lblWidth.setMaximumSize(new Dimension(56, 14));
		lblWidth.setMinimumSize(new Dimension(56, 14));
		lblWidth.setPreferredSize(new Dimension(56, 14));

		lblMinDepth.setText("Min Depth:");
		lblMinDepth.setFocusable(false);
		lblMinDepth.setMaximumSize(new Dimension(56, 14));
		lblMinDepth.setMinimumSize(new Dimension(56, 14));
		lblMinDepth.setPreferredSize(new Dimension(56, 14));

		lblMaxDepth.setText("Max Depth:");
		lblMaxDepth.setFocusable(false);

		lblPerimeter.setText("Perimeter:");
		lblPerimeter.setFocusable(false);
		lblPerimeter.setMaximumSize(new Dimension(56, 14));
		lblPerimeter.setMinimumSize(new Dimension(56, 14));
		lblPerimeter.setPreferredSize(new Dimension(56, 14));

		lblVolume.setText("Volume:");
		lblVolume.setFocusable(false);
		lblVolume.setMaximumSize(new Dimension(56, 14));
		lblVolume.setMinimumSize(new Dimension(56, 14));
		lblVolume.setPreferredSize(new Dimension(56, 14));

		lblArea.setText("Area:");
		lblArea.setFocusable(false);
		lblArea.setMaximumSize(new Dimension(56, 14));
		lblArea.setMinimumSize(new Dimension(56, 14));
		lblArea.setPreferredSize(new Dimension(56, 14));

		txtArea.setBackground(new java.awt.Color(255, 255, 255));
		txtArea.setEditable(false);
		txtArea.setFocusable(false);
		txtArea.setRequestFocusEnabled(false);

		txtVolume.setBackground(new java.awt.Color(255, 255, 255));
		txtVolume.setEditable(false);
		txtVolume.setFocusable(false);
		txtVolume.setRequestFocusEnabled(false);

		txtPerimeter.setBackground(new java.awt.Color(255, 255, 255));
		txtPerimeter.setEditable(false);
		txtPerimeter.setFocusable(false);
		txtPerimeter.setRequestFocusEnabled(false);

		lblCustomer.setText("Customer:");
		lblCustomer.setFocusable(false);

		lblFt.setText("ft.");

		lblFt2.setText("ft.");

		lblFt3.setText("ft.");

		lblFt4.setText("ft.");

		lblSqFt.setText("sq.ft.");

		lblCuFt.setText("cu.ft.");

		lblFt5.setText("ft.");

		btnCalculate.setMnemonic('C');
		btnCalculate.setText("Calculate");
		btnCalculate.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				btnCalculateActionPerformed(evt);
			}
		});

		lblError.setFont(new java.awt.Font("Tahoma", 1, 11)); 
		lblError.setForeground(new java.awt.Color(255, 0, 0));
		lblError.setFocusable(false);

		btnCalcClear.setMnemonic('l');
		btnCalcClear.setText("Clear");
		btnCalcClear.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				btnCalcClearActionPerformed(evt);
			}
		});

		btnCalcExit.setMnemonic('x');
		btnCalcExit.setText("Exit");
		btnCalcExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				btnCalcExitActionPerformed(evt);
			}
		});

		btnSave.setMnemonic('s');
		btnSave.setText("Save");
		btnSave.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				btnSaveActionPerformed(evt);
			}
		});

		txtCustomer.setColumns(20);
		txtCustomer.setEditable(false);
		txtCustomer.setLineWrap(true);
		txtCustomer.setRows(3);
		txtCustomer.setWrapStyleWord(true);
		txtCustomer.setAutoscrolls(false);
		txtCustomer.setFocusable(false);
		txtCustomer.setRequestFocusEnabled(false);

		javax.swing.GroupLayout pCalcLayout = new javax.swing.GroupLayout(pCalc);
		pCalc.setLayout(pCalcLayout);
		pCalcLayout.setHorizontalGroup(
				pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pCalcLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(lblArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblPerimeter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblMaxDepth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblMinDepth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addComponent(lblWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(txtPerimeter)
												.addComponent(txtVolume)
												.addComponent(txtArea)
												.addComponent(txtMaxDepth)
												.addComponent(txtMinDepth)
												.addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(txtLength))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(pCalcLayout.createSequentialGroup()
																		.addComponent(lblFt)
																		.addGap(18, 18, 18)
																		.addComponent(lblCustomer))
																		.addComponent(lblFt3)
																		.addComponent(lblFt4)
																		.addComponent(lblSqFt)
																		.addComponent(lblCuFt)
																		.addComponent(lblFt5))
																		.addComponent(lblFt2))
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(btnCalculate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
																				.addComponent(lblError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																				.addComponent(btnCalcExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																				.addGroup(pCalcLayout.createSequentialGroup()
																						.addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGap(0, 0, Short.MAX_VALUE))
																						.addGroup(pCalcLayout.createSequentialGroup()
																								.addComponent(btnCalcClear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(18, 18, 18)
																								.addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
																								.addContainerGap())
				);
		pCalcLayout.setVerticalGroup(
				pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pCalcLayout.createSequentialGroup()
						.addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(pCalcLayout.createSequentialGroup()
										.addContainerGap()
										.addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(pCalcLayout.createSequentialGroup()
														.addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(lblLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(lblWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(lblFt2))
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(lblMinDepth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(txtMinDepth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(lblFt3)))
																				.addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(pCalcLayout.createSequentialGroup()
																								.addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(btnCalculate)
																								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																										.addComponent(btnCalcClear)
																										.addComponent(btnSave))
																										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(btnCalcExit))
																										.addGroup(pCalcLayout.createSequentialGroup()
																												.addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																														.addComponent(lblMaxDepth)
																														.addComponent(txtMaxDepth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(lblFt4))
																														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																														.addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																																.addComponent(lblArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																																.addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																																.addComponent(lblSqFt))
																																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																																		.addComponent(lblVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addComponent(txtVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addComponent(lblCuFt))
																																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																																				.addComponent(lblPerimeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																																				.addComponent(txtPerimeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																																				.addComponent(lblFt5)))))
																																				.addGroup(pCalcLayout.createSequentialGroup()
																																						.addGap(14, 14, 14)
																																						.addGroup(pCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
																																								.addComponent(lblFt)
																																								.addComponent(lblCustomer))))
																																								.addContainerGap(52, Short.MAX_VALUE))
				);

		pCalcLayout.linkSize(SwingConstants.VERTICAL, new Component[] {txtArea, txtLength, txtMaxDepth, txtMinDepth, txtPerimeter, txtVolume, txtWidth});

		tabPane.addTab("Calculator", pCalc);

		fileChooser.setAcceptAllFileFilterUsed(false);
		fileChooser.setControlButtonsAreShown(false);
		fileChooser.setCurrentDirectory(null);
		fileChooser.setFileFilter(new MyCustomFilter());
		fileChooser.setFileHidingEnabled(true);
		fileChooser.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

		btnPCOpen.setMnemonic('o');
		btnPCOpen.setText("Open");
		btnPCOpen.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				btnPCOpenActionPerformed(evt);
			}
		});

		btnPCExit.setMnemonic('x');
		btnPCExit.setText("Exit");
		btnPCExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				btnPCExitActionPerformed(evt);
			}
		});

		btnPCRefresh.setMnemonic('r');
		btnPCRefresh.setText("Refresh");
		btnPCRefresh.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				btnPCRefreshActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout pFileLayout = new javax.swing.GroupLayout(pFile);
		pFile.setLayout(pFileLayout);
		pFileLayout.setHorizontalGroup(
				pFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFileLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(btnPCRefresh)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
						.addComponent(btnPCOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(btnPCExit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				);
		pFileLayout.setVerticalGroup(
				pFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pFileLayout.createSequentialGroup()
						.addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(pFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnPCOpen)
								.addComponent(btnPCExit)
								.addComponent(btnPCRefresh))
								.addContainerGap())
				);

		tabPane.addTab("Previous Calculations", pFile);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(tabPane, javax.swing.GroupLayout.Alignment.TRAILING)
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				);

		tabPane.getAccessibleContext().setAccessibleName("");
		tabPane.getAccessibleContext().setAccessibleDescription("");

		pack();
		Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dialogSize = getSize();
		setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
	}

	private void btnCalculateActionPerformed(ActionEvent evt) 
	{
		calculate();
	}

	private void calculate()
	{
		CalculateArea cA = new CalculateArea();
		CalculateVolume cV = new CalculateVolume();
		CalculatePerimeter cP = new CalculatePerimeter();
		if (calcValues() == true){
			btnSave.requestFocusInWindow();
			double avgDepth = ((Double.parseDouble(txtMinDepth.getText())+Double.parseDouble(txtMaxDepth.getText()))/2);
			cV.setDepth(avgDepth);
			cA.setWidth(Double.parseDouble(txtWidth.getText()));
			cV.setWidth(Double.parseDouble(txtWidth.getText()));
			cP.setWidth(Double.parseDouble(txtWidth.getText()));
			cA.setLength(Double.parseDouble(txtLength.getText()));
			cV.setLength(Double.parseDouble(txtLength.getText()));
			cP.setLength(Double.parseDouble(txtLength.getText()));
			txtArea.setText(cA.toString());
			txtVolume.setText(cV.toString());
			txtPerimeter.setText(cP.toString());
		}
	}
	private boolean calcValues()
	{
		boolean r;  
		if ((isNum(txtLength.getText())==false)||(txtLength.getText().trim().isEmpty()==true))
		{
			clearError();
			lblLength.setForeground(Color.red);
			lblError.setText("Error: Length");
			txtLength.requestFocusInWindow();
			r=false;
		} 
		else if ((isNum(txtWidth.getText())==false)||(txtWidth.getText().trim().isEmpty()==true))
		{
			clearError();
			lblWidth.setForeground(Color.red);
			lblError.setText("Error: Width");
			txtWidth.requestFocusInWindow();
			r=false;
		}
		else if ((isNum(txtMinDepth.getText())==false)||(txtMinDepth.getText().trim().isEmpty()==true))
		{
			clearError();
			lblMinDepth.setForeground(Color.red);
			lblError.setText("Error: Min Depth");
			txtMinDepth.requestFocusInWindow();
			r=false;
		}
		else if ((isNum(txtMaxDepth.getText())==false)||(txtMaxDepth.getText().trim().isEmpty()==true))
		{
			clearError();
			lblMaxDepth.setForeground(Color.red);
			lblError.setText("Error: Max Depth");
			txtMaxDepth.requestFocusInWindow();
			r=false;
		}    
		else{
			clearError();
			r=true;
		}
		return r;
	}
	private void btnCalcClearActionPerformed(ActionEvent evt) 
	{
		clearError();
		clearCalc();
	}
	private void btnCalcExitActionPerformed(ActionEvent evt) 
	{
		System.exit(0);
	}
	private void btnCustExitActionPerformed(ActionEvent evt) 
	{
		System.exit(0);
	}
	private void btnCustClearActionPerformed(ActionEvent evt)
	{
		clearError();
		clearCustomer();
	}
	private void btnRecallCustomerActionPerformed(ActionEvent evt) 
	{
		tabPane.setSelectedIndex(2); 
		fileChooser.rescanCurrentDirectory();
	}
	private void btnNewCustomerActionPerformed(ActionEvent evt) 
	{
		clearCustomer();
		clearCalc();
		clearError();
	}
	private void btnSaveCustomerActionPerformed(ActionEvent evt) 
	{
		if (custTxtField()==true)
		{
			setTxtCustomer();
			FileWriter fw = null;
			try {
				fw = new FileWriter(""+txtFName.getText()+txtLName.getText()+".txt");
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(custString());
				bw.close();
			} catch (IOException ex) 
			{
				Logger.getLogger(CourseProject.class.getName()).log(Level.SEVERE, null, ex);
			} 
			finally 
			{
				try {
					fw.close();
				} 
				
				catch (IOException ex) 
				{
					Logger.getLogger(CourseProject.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
			tabPane.setSelectedIndex(1);
		}
	}
	private void btnPCExitActionPerformed(ActionEvent evt)
	{
		System.exit(0);
	}
	private void btnPCOpenActionPerformed(ActionEvent evt) 
	{
		try {
			Scanner sc = new Scanner(fileChooser.getSelectedFile()).useDelimiter(",");
			clearCustomer();
			clearCalc();
			txtFName.setText(sc.next());
			txtLName.setText(sc.next());
			txtStreet.setText(sc.next());
			txtCity.setText(sc.next());
			txtState.setText(sc.next());
			txtZip.setText(sc.next());
			setTxtCustomer();
			if (sc.hasNext()==true)
			{
				txtLength.setText(sc.next());
				txtWidth.setText(sc.next());
				txtMinDepth.setText(sc.next());
				txtMaxDepth.setText(sc.next());
				txtArea.setText(sc.next());
				txtVolume.setText(sc.next());
				txtPerimeter.setText(sc.next());
				}
			tabPane.setSelectedIndex(1); 
		} 
		catch (FileNotFoundException ex) 
		{
			Logger.getLogger(CourseProject.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	private void btnSaveActionPerformed(ActionEvent evt) 
	{
		if (custTxtField() == false)
		{
			lblError.setText("Please enter customer!");
		}
		else if (calcValues() == true)
		{
			calculate();
			setTxtCustomer();
			String s = ""+custString()+","+calcString();
			FileWriter fw = null;
			try 
			{
				fw = new FileWriter(""+txtFName.getText()+txtLName.getText()+".txt");
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(s);
				bw.close();
			} 
			catch (IOException ex) 
			{
				Logger.getLogger(CourseProject.class.getName()).log(Level.SEVERE, null, ex);
			} 
			finally 
			{
				try 
				{
					fw.close();
				} 
				catch (IOException ex) 
				{
					Logger.getLogger(CourseProject.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
			tabPane.setSelectedIndex(2);
			fileChooser.rescanCurrentDirectory();
		}
	}

	private void btnPCRefreshActionPerformed(ActionEvent evt) 
	{
		fileChooser.rescanCurrentDirectory();
	}
	private boolean custTxtField()
	{
		boolean r;
		if (txtFName.getText().trim().isEmpty()==true)
		{
			lblFName.setForeground(Color.red);
			lblCustError.setText("Please enter a first name.");
			txtFName.requestFocusInWindow();
			r=false;
		}
		else if (txtLName.getText().trim().isEmpty()==true)
		{
			clearError();
			lblLName.setForeground(Color.red);
			lblCustError.setText("Please enter a last name.");
			txtLName.requestFocusInWindow();
			r=false;
		}
		else if (txtStreet.getText().trim().isEmpty()==true)
		{
			clearError();
			lblStreet.setForeground(Color.red);
			lblCustError.setText("Please enter a street address.");
			txtStreet.requestFocusInWindow();
			r=false;
		}
		else if (txtCity.getText().trim().isEmpty()==true)
		{
			clearError();
			lblCity.setForeground(Color.red);
			lblCustError.setText("Please enter a city.");
			txtCity.requestFocusInWindow();
			r=false;
		}
		else if (txtState.getText().trim().isEmpty()==true)
		{
			clearError();
			lblState.setForeground(Color.red);
			lblCustError.setText("Please enter a state.");
			txtState.requestFocusInWindow();
			r=false;
		}
		else if (txtZip.getText().trim().isEmpty()==true)
		{
			clearError();
			lblZip.setForeground(Color.red);
			lblCustError.setText("Please enter a zip code.");
			txtZip.requestFocusInWindow();
			r=false;
		}
		else
		{
			clearError();
			r=true;
		}
		return r;
	}
	private void setTxtCustomer()
	{
		txtCustomer.setText(""+txtFName.getText()+" "+txtLName.getText()+"\n"
				+txtStreet.getText()+"\n"+txtCity.getText()+", "+txtState.getText()+" "+txtZip.getText());
	}
	public String custString()
	{
		String s = ""+txtFName.getText()+","+txtLName.getText()+","+txtStreet.getText()+","+txtCity.getText()+","+txtState.getText()+","
				+txtZip.getText();
		return s;
	}

	public String calcString()
	{
		String s =""+txtLength.getText()+","+txtWidth.getText()+","+txtMinDepth.getText()+","+txtMaxDepth.getText()+","+txtArea.getText()+","+txtVolume.getText()+","+txtPerimeter.getText();
		return s;
	}
	private void clearCustomer()
	{
		txtFName.setText(null);
		txtLName.setText(null);
		txtStreet.setText(null);
		txtCity.setText(null);
		txtZip.setText(null);
		txtState.setText(null);  
		txtCustomer.setText(null);
	}
	private void clearCalc()
	{
		txtLength.setText(null);
		txtWidth.setText(null);
		txtMaxDepth.setText(null);
		txtMinDepth.setText(null);
		txtArea.setText(null);
		txtVolume.setText(null);
		txtPerimeter.setText(null);
	}
	private void clearError()
	{
		lblError.setText(null);
		lblCustError.setText(null);
		lblFName.setForeground(Color.black);
		lblLName.setForeground(Color.black);
		lblState.setForeground(Color.black);
		lblCity.setForeground(Color.black);
		lblZip.setForeground(Color.black);
		lblLength.setForeground(Color.black);
		lblWidth.setForeground(Color.black);
		lblMaxDepth.setForeground(Color.black);
		lblMinDepth.setForeground(Color.black);
	}
	public static boolean isNum(String s)    
	{
		try 
		{
			Double.parseDouble(s);
		}
		catch (NumberFormatException nfe) 
		{
			return false;
		}
		return true;
	}
	public static void main(String args[]) 
	{
		
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) 
			{
				if ("Nimbus".equals(info.getName())) 
				{
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} 
		catch (ClassNotFoundException ex) 
		{
			Logger.getLogger(CourseProject.class.getName()).log(Level.SEVERE, null, ex);
		} 
		catch (InstantiationException ex) 
		{
			Logger.getLogger(CourseProject.class.getName()).log(Level.SEVERE, null, ex);
		} 
		catch (IllegalAccessException ex) 
		{
			Logger.getLogger(CourseProject.class.getName()).log(Level.SEVERE, null, ex);
		} 
		catch (UnsupportedLookAndFeelException ex) 
		{
			Logger.getLogger(CourseProject.class.getName()).log(Level.SEVERE, null, ex);
		}
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				new CourseProject().setVisible(true);
			}
		});
	}
	// Variables declaration
	private JButton btnCalcClear;
	private JButton btnCalcExit;
	private JButton btnCalculate;
	private JButton btnCustClear;
	private JButton btnCustExit;
	private JButton btnNewCustomer;
	private JButton btnPCExit;
	private JButton btnPCOpen;
	private JButton btnPCRefresh;
	private JButton btnRecallCustomer;
	private JButton btnSave;
	private JButton btnSaveCustomer;
	private JFileChooser fileChooser;
	private JLabel lblArea;
	private JLabel lblCity;
	private JLabel lblCuFt;
	private JLabel lblCustError;
	private JLabel lblCustomer;
	private JLabel lblError;
	private JLabel lblFName;
	private JLabel lblFt;
	private JLabel lblFt2;
	private JLabel lblFt3;
	private JLabel lblFt4;
	private JLabel lblFt5;
	private JLabel lblLName;
	private JLabel lblLength;
	private JLabel lblMaxDepth;
	private JLabel lblMinDepth;
	private JLabel lblPerimeter;
	private JLabel lblSqFt;
	private JLabel lblState;
	private JLabel lblStreet;
	private JLabel lblVolume;
	private JLabel lblWidth;
	private JLabel lblZip;
	private JPanel pCalc;
	private JPanel pCustInfo;
	private JPanel pFile;
	private javax.swing.JTabbedPane tabPane;
	private JTextField txtArea;
	private JTextField txtCity;
	private JTextArea txtCustomer;
	private JTextField txtFName;
	private JTextField txtLName;
	private JTextField txtLength;
	private JTextField txtMaxDepth;
	private JTextField txtMinDepth;
	private JTextField txtPerimeter;
	private JTextField txtState;
	private JTextField txtStreet;
	private JTextField txtVolume;
	private JTextField txtWidth;
	private JTextField txtZip;
	// End of variables declaration
}