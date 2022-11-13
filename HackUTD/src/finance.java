import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class finance {
	
	JFrame newFrame;
	Container newCon;
	JPanel titleNamePanelOutline;
	JPanel titleNamePanelInner;
	JLabel titleNameLabel;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new finance();
		

	}//end of main
	
	
	
	public finance() {
		newFrame = new JFrame("FinanceYouWell");
		newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newFrame.setSize(800,600);
		newFrame.setLocationRelativeTo(null);
		newFrame.getContentPane().setBackground(Color.WHITE);
		newFrame.setLayout(null);
		newCon = newFrame.getContentPane();
		newCon = newFrame.getContentPane();
		titleNamePanelOutline = new JPanel();
		titleNameLabel = new JLabel();
		titleNamePanelOutline.setBounds(100,100,600,150);
		titleNamePanelOutline.setBackground(Color.BLACK);
		
		newCon.add(titleNamePanelOutline);
		
		
		
		
		
		newFrame.setVisible(true);
	}//end of finance constructor

}//end of class
