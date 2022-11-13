package work;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class saveCalc extends JFrame {

private JTextField jtfInvestmentAmount;
private JTextField jtfAnnualInterestRate;
private JTextField jtfNumberOfMonths;
private JTextField jtfFutureValue;
private JButton jbtCompute;
private JButton jbtReset;

public saveCalc() {
	
   
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
    setSize(800,600);
    setLocationRelativeTo(null);
    
    setLayout(new GridLayout(5,2,5,5));

    JLabel jlInvestmentAmount = new JLabel(" Savings Amount (per month)");
    JLabel jlNumberOfMonths = new JLabel(" Number of Months");
    JLabel jlFutureValue = new JLabel(" Future Value");

    jtfInvestmentAmount = new JTextField();
    jtfNumberOfMonths = new JTextField();
    jtfFutureValue = new JTextField();
    jtfFutureValue.setEditable(false);

    jbtCompute = new JButton("Compute");
    jbtReset = new JButton("Reset");

    add(jlInvestmentAmount);
    add (jtfInvestmentAmount);
    add (jlNumberOfMonths);
    add (jtfNumberOfMonths);
    add (jlFutureValue);
    add (jtfFutureValue);
    add (jbtCompute);
    add (jbtReset);

    ListenerClass listener = new ListenerClass();
    jbtCompute.addActionListener(listener);
    jbtReset.addActionListener(listener);

    setVisible(true);
}

public static void main(String[] args) {
    new saveCalc();
}

private void computeValue() {
    try {
        double annualInterestRate = Double.parseDouble(jtfAnnualInterestRate.getText());
        double monthlyInterestRate = annualInterestRate / 1200.0;
        int NumberOfYears = Integer.parseInt(jtfNumberOfMonths.getText());
        double investmentAmount = Double.parseDouble(jtfInvestmentAmount.getText());
        double futureValue = investmentAmount * Math.pow(1.0 + monthlyInterestRate, NumberOfYears * 12);
        jtfFutureValue.setText(String.format("%.2f", futureValue));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, " Please enter numeric values.");
    }
}

private void resetForm() {
    jtfInvestmentAmount.setText("");
    jtfAnnualInterestRate.setText("");
    jtfNumberOfMonths.setText("");
    jtfFutureValue.setText("");
}

private class ListenerClass implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtCompute) {
            computeValue();
        }
        if (e.getSource() == jbtReset) {
            resetForm();
        }
    }
  }
}