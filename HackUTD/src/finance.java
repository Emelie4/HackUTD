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
	JTextArea nArea;
	

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
		nPanel.setBounds(100, 100, 600, 250);
		nPanel.setBackground(Color.BLUE);
		newCon.add(nPanel);
		
		nArea = new JTextArea();
		
		nArea.setBounds(100,100,100,100);
		nArea.setBackground(Color.RED);
		
		}

	public class tHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			nextPanel();
		}
	}
	
}//end of class
