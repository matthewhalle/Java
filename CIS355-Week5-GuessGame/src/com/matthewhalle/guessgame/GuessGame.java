/***********************************************************************
Program Name: GuessGame.java
Programmer's Name: Matthew Halle
Program Description: Create a program to select a random number from 1-1000 and allow the user to try and guess.

 ***********************************************************************/
package com.matthewhalle.guessgame;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*; 
import java.util.Random;
public class GuessGame extends JFrame
{   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton newGameButton;
    private JButton enterButton;
    private JButton exitButton;
    private JTextField guessBox;
    private JLabel initialTextLabel;
    private JLabel enterLabel;
    private JLabel userMessageLabel;
    private short randomNumber;
    private short userGuess;
    private short counter = 0;
    private short lastGuess = 0;
    public GuessGame()
    {
        super("Guessing Game");
        newGameButton = new JButton("New Game");
        exitButton = new JButton("Exit Game");
        enterButton = new JButton("Enter");
        guessBox = new JTextField(4);
        initialTextLabel = new JLabel("I have a number between 1 and 1000 can you guess my number?");
        enterLabel = new JLabel("Please enter your guess.");
        userMessageLabel = new JLabel("");
        randomNumber = (short) (new Random().nextInt(1000) + 1);
        
        this.getContentPane().setBackground(Color.gray);
        //set the layout manager
        setLayout(new FlowLayout());
        //add components
        add(initialTextLabel);
        add(userMessageLabel);
        add(enterLabel);
        add(guessBox);
        add(enterButton);
        add(newGameButton);        
        add(exitButton);
        //create accelerator keys        
        newGameButton.setMnemonic('N');
        exitButton.setMnemonic('x');
        enterButton.setMnemonic('E');
        //set default frame size
        setSize(500, 125);
        //define and register windows event handler
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        //create and register the button event handlers
        newGameButtonHandler nghandler = new newGameButtonHandler();
        newGameButton.addActionListener(nghandler); //register the value
        ExitButtonHandler exithandler = new ExitButtonHandler();
        exitButton.addActionListener(exithandler);
        enterButtonHandler enterhandler = new enterButtonHandler();
        enterButton.addActionListener(enterhandler);
    }
    //newGameButtonHandler class
    class newGameButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
        	counter =0;
        	userMessageLabel.setText("");
        	guessBox.setEditable(true);
        	getContentPane().setBackground(Color.gray);
            guessBox.setText("");
            randomNumber = (short) (new Random().nextInt(1000) + 1);
        }
    }
    class ExitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
    class enterButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {        	
            userGuess = Short.parseShort(guessBox.getText());
            compareGuess(userGuess, randomNumber);
            guessBox.setText("");
        }
    }
    public void compareGuess(short userGuess, short randomNumber)
    {
        counter++;
        if (userGuess == randomNumber)
            {
                userMessageLabel.setText("You are correct, it took you: " + counter + " guess(es)");
                getContentPane().setBackground(Color.GREEN);
                guessBox.setEditable(false);
            }
        else if (userGuess > randomNumber)
            {
                userMessageLabel.setText("Too high");
            }
        else if (userGuess < randomNumber)
            {
                userMessageLabel.setText("Too Low");
            }
        if (counter > 1)
        {
            if ((randomNumber - userGuess) > (randomNumber - lastGuess))
                {
            		getContentPane().setBackground(Color.RED);
                }
            else if ((randomNumber - userGuess) < (randomNumber - lastGuess))
                {
            	getContentPane().setBackground(Color.BLUE);
                }
            else
                {
            	getContentPane().setBackground(Color.GRAY);
                }
        }
        lastGuess = userGuess;
    }
    public static void main(String[] args)
    {
        GuessGame myGuessGame = new GuessGame(); //instantiate a GUI object
        myGuessGame.setVisible(true);
    }
}


