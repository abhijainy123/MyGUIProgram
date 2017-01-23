import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EMICalc {
	
	// this classs will calculate the EMI Amount for the input of Loan Amount, Interest & Loan Tenure
	
	private Double loanAmount;
	private Double interestRate;
	private Double loantenure;
	private Double emi;	
	private JFrame popFrame;
	private JPanel popPanel;
	private JLabel popLabel;
	
	popFrame = new JFrame("Error");
	popPanel = new JPanel();
	
  public void emiCalc(JTextField tfNum1, JTextField tfNum2, JTextField tfNum3, JTextField tfResult) {
	  
	  if (interestRate>0 && loanAmount>0 && loantenure>0){
		  interestRate = interestRate/(12*100);
	  double emiFactor =Math.pow( (1 + interestRate), loantenure)/((Math.pow( (1 + interestRate), loantenure)) -1);
	  
	  emi = loanAmount * interestRate * emiFactor;
	  }
	  else{
		  syso
	  }
	  
  }
}

