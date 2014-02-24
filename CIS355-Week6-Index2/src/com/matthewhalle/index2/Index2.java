/***********************************************************************
Program Name: Index2.java
Programmer's Name: Matthew Halle
Program Description: Create an application which the user inputs text
and then click a button to calculate the number each letter is used.
***********************************************************************/
package com.matthewhalle.index2;
import java.awt.event.ActionEvent;

import javax.swing.*;
import java.awt.*;

public class Index2 extends JFrame 
{
    private JTextArea jtxContent;
    private JButton btnSearch;
    private JLabel textLabel;
    private JTextArea resultList;
    JPanel cntrlPanel;
    JScrollPane resScrol;
    JScrollPane jScrollPane1;

    public Index2() 
    {
        jtxContent = new JTextArea();
        resultList = new JTextArea("click on search                                 ");
        resScrol = new JScrollPane(resultList);
        textLabel = new JLabel("Enter some text: ");
        jScrollPane1 = new JScrollPane(jtxContent);
        
        jtxContent.setLineWrap(true);
        jtxContent.setWrapStyleWord(true);
        
        
        Action searchAction = new AbstractAction("Count Occurences of Each Letter") 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String source = jtxContent.getText().toUpperCase();
                resultList.setText("");
                for (int i = 0; i < 26; i++) 
                {
                	resultList.append(String.valueOf((char) (i + 65)) +": "+String.valueOf( getNumOfOccurrences(source, String.valueOf((char) (i + 65))))+ "\n");                    
                }
            }
        };        
        btnSearch = new JButton(searchAction);
        jtxContent.setColumns(20);
        jtxContent.setRows(5);
        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(resScrol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSearch))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(textLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resScrol, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public int getNumOfOccurrences(String source, String search) 
    {
        int count = -1;
        int prevIndex = 0, curIndex = 0;
        if (source.length() > 0) 
        {
            while (curIndex >= 0) 
            {
                curIndex = source.indexOf(search, prevIndex);
                prevIndex = curIndex + 1;
                count++;
            }
        } else 
        {
            count = 0;
        }
        return count;
    }

    public static void main(String[] args) 
    {
        Index2 index2 = new Index2();

    }
}
/* this use case is for trying to use gridlayout to provide the GUI layout 
public class Index2 extends JFrame 
{
    private JTextArea jtxContent;
    private JButton btnSearch;
    private JLabel textLabel;
    private JTextArea resultList;
    JPanel cntrlPanel;
    JScrollPane resScrol;

    public Index2() 
    {
        jtxContent = new JTextArea();
        resultList = new JTextArea("click on search");
        resScrol = new JScrollPane(resultList);
        textLabel = new JLabel("Enter some text: ");
        jtxContent.setLineWrap(true);
        jtxContent.setWrapStyleWord(true);
        
        
        Action searchAction = new AbstractAction("Count Occurences of Each Letter") 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String source = jtxContent.getText().toUpperCase();
                resultList.setText("");
                for (int i = 0; i < 26; i++) 
                {
                	resultList.append(String.valueOf((char) (i + 65)) +": "+String.valueOf( getNumOfOccurrences(source, String.valueOf((char) (i + 65))))+ "\n");                    
                }
            }
        };
        
        getContentPane().setLayout(new GridLayout(2, 1));
        btnSearch = new JButton(searchAction);

        cntrlPanel = new JPanel(new GridLayout(4, 1));// 5, 5));
        textLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        cntrlPanel.add(textLabel);
        cntrlPanel.add(jtxContent);
       

        cntrlPanel.add(btnSearch);
        
        getContentPane().add(cntrlPanel);
        getContentPane().add(resScrol);
        setBounds(20, 20, 350, 1000);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public int getNumOfOccurrences(String source, String search) 
    {
        int count = -1;
        int prevIndex = 0, curIndex = 0;
        if (source.length() > 0) 
        {
            while (curIndex >= 0) 
            {
                curIndex = source.indexOf(search, prevIndex);
                prevIndex = curIndex + 1;
                count++;
            }
        } else 
        {
            count = 0;
        }
        return count;
    }

    public static void main(String[] args) 
    {
        Index2 index2 = new Index2();

    }
}
*/