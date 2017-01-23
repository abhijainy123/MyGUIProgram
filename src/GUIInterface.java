

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.io.Closeable;
import java.io.File;

import javax.swing.*;
import javax.swing.border.Border;

public class GUIInterface extends JFrame implements ActionListener {
	private JLabel lblNum1;
	private JLabel lblNum2;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResult;
	private JButton btnSum;
	private JButton btnClear;
	private static JFrame frame;
	private JPanel panel;
	private JPanel panel1;
	private static JTabbedPane tabpane;
	private JTabbedPane emitab;
	private JButton btncalculateemi;
	private JLabel loanamountlabel;
	private JTextField loanamount;
	private JLabel loantenurelabel;
	private JTextField loantenure;
	private JLabel interestratelabel;
	private JTextField interestrate;
	private JLabel emilabel;
	private JTextField emi;

	public void Calculator()
	{
		panel = new JPanel();
		panel.setOpaque(true);
		panel.setBackground(Color.lightGray);
		panel.setSize(100,100);

		lblNum1 = new JLabel("Num1", JLabel.LEFT);
		lblNum1.setSize(10, 10);
		lblNum1.setLocation(10, 15);

		tfNum1 = new JTextField("0");
		tfNum1.setEditable(true);
		tfNum1.setPreferredSize(new Dimension(80,20));

		lblNum2 = new JLabel("Num2", JLabel.RIGHT);
		tfNum2 = new JTextField("0");
		tfNum2.setEditable(true);
		tfNum2.setPreferredSize(new Dimension(80,20));

		btnSum = new JButton("Sum");
		btnSum.setPreferredSize(new Dimension(80,20));
		btnSum.addActionListener(this);

		tfResult = new JTextField("0");
		tfResult.setEditable(false);
		tfResult.setPreferredSize(new Dimension(80,20));

		btnClear = new JButton("Clear");
		btnClear.addActionListener(this);

		panel.add(lblNum1);
		panel.add(tfNum1);
		panel.add(lblNum2);
		panel.add(tfNum2);
		panel.add(btnSum);
		panel.add(tfResult);
		panel.add(btnClear);

		tabpane.add("Calculator", panel);
		}

	public void EMICalculator() {
		panel1 = new JPanel();
		panel1.setOpaque(true);
		panel1.setBackground(Color.lightGray);
		panel1.setSize(100,100);

		loanamountlabel = new JLabel("Loan Amount");
		loanamount = new JTextField("0", 10);

		loantenurelabel = new JLabel("Loan Tenure (In Months)");
		loantenure = new JTextField("0", 10);

		interestratelabel = new JLabel("Interest Rate");
		interestrate = new JTextField("0", 10);

		btncalculateemi = new JButton("Calculate EMI");
		btncalculateemi.addActionListener(this);

		emilabel = new JLabel("EMI Per Month");
		//emilabel.setOpaque(true);
		emilabel.setPreferredSize(new Dimension(100, 20));
		emi = new JTextField("0", 10);

		panel1.add(loanamountlabel);
		panel1.add(loanamount);
		panel1.add(loantenurelabel);
		panel1.add(loantenure);
		panel1.add(interestratelabel);
		panel1.add(interestrate);
		panel1.add(btncalculateemi);
		panel1.add(emilabel);
		panel1.add(emi);

		tabpane.add("EMICalculator", panel1);
	}

	public static void main(String[] args) {
		frame = new JFrame("Financial Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		tabpane = new JTabbedPane();

		GUIInterface layout = new GUIInterface();
		layout.Calculator();
		layout.EMICalculator();


		frame.add(tabpane);
		frame.setSize(600, 200);
		frame.setLocationByPlatform(true);
		frame.setVisible(true);

		}

	public void actionPerformed(ActionEvent evt)
	{
				
		if(evt.getSource() == btnSum){
				
			AdditionCalc.AddNumbers(tfNum1,tfNum2,tfResult);
			}
		else if(evt.getSource()==btnClear){
			int i = 0;
			tfNum1.setText(String.valueOf(i));
			tfNum1.setText(String.valueOf(i));
			tfNum2.setText(String.valueOf(i));
			tfResult.setText(String.valueOf(i));
			}
		else if(evt.getSource() == btncalculateemi){
			//EMICalc.
		}


	}
}


