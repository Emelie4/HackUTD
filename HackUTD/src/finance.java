import java.awt.*;

import javax.swing.JFrame;

public class finance {
	
	JFrame newFrame;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new finance();
		

	}//end of main
	
	
	
	public finance() {
		newFrame = new JFrame("FinanceYouWell");
		newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newFrame.setSize(600,600);
		newFrame.setLocationRelativeTo(null);
		
		
		
		
		
		newFrame.setVisible(true);
	}//end of finance constructor

}//end of class
