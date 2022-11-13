package work;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;  


public class finance {
	
	JFrame newFrame;
	Container newCon;
	JPanel titleNamePanel, learnPanel, nPanel;
	JLabel titleNameLabel;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 80);
	Font learnFont = new Font("Times New Roman", Font.PLAIN, 40);
	JButton learnButton;
	tHandler tHand = new tHandler();
	LCHandler lcHand = new LCHandler();
	SCHandler scHand = new SCHandler();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new finance();
		

	}//end of main
	
	
	
	public finance() {
		newFrame = new JFrame("FinanceYouWell");
		newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newFrame.setSize(800,600);
		newFrame.setResizable(false);
		newFrame.setLocationRelativeTo(null);
		newFrame.getContentPane().setBackground(Color.BLACK);
		newFrame.setLayout(null);
		
		newCon = newFrame.getContentPane();
		
		titleNamePanel = new JPanel();
		titleNameLabel = new JLabel("FinanceYouWell");
		titleNameLabel.setForeground(Color.WHITE);
		titleNameLabel.setFont(titleFont);
		titleNamePanel.add(titleNameLabel);
		titleNamePanel.setBounds(100,100,600,150);
		titleNamePanel.setBackground(Color.BLACK);
		
		learnPanel = new JPanel();
		learnButton = new JButton("LEARN");
		learnButton.setBackground(Color.WHITE);
		learnButton.setForeground(Color.BLACK);
		learnButton.setFont(learnFont);
		learnButton.addActionListener(tHand);
		
		learnPanel.setBounds(300,250,200,100);
		learnPanel.setBackground(Color.BLACK);
		learnPanel.add(learnButton);
		
		newCon.add(learnPanel);
		
		
		newCon.add(titleNamePanel);	
		newFrame.setVisible(true);
	}//end of finance constructor
	
	public void nextPanel() {
		titleNamePanel.setVisible(false);
		learnPanel.setVisible(false);
		nPanel = new JPanel();
		nPanel.setLayout(new GridLayout(5,5));
		JButton lcCalc = new JButton("Loan Calculator");
		JButton scCalc = new JButton("Savings Calculator");
		JButton bcCalc = new JButton("Budget Calculator");
		JButton cc = new JButton("Currency Converter");
		
		nPanel.add(scCalc);
		nPanel.add(bcCalc);
		nPanel.add(cc);
		
		lcCalc.addActionListener(lcHand);
		scCalc.addActionListener(scHand);
		
		nPanel.setBounds(0,0,800,600);
		nPanel.setBackground(Color.BLACK);
		nPanel.add(lcCalc);
		
		
		
		
		
		nPanel.setVisible(true);
		newFrame.add(nPanel);
		//newCon.add(nPanel);
		
		}
	public void savingsCalculator() {
		titleNamePanel.setVisible(false);
		learnPanel.setVisible(false);
		saveCalc s = new saveCalc();
	}
	public void loanCalclator() {
		titleNamePanel.setVisible(false);
		learnPanel.setVisible(false);
		loanCalc s = new loanCalc();
		
	}
	public class SCHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			savingsCalculator();
		}
	}
	public class LCHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			loanCalclator();
		}
	}

	public class tHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			nextPanel();
		}
	}
	
}//end of class
