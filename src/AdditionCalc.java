import javax.swing.*;

public class AdditionCalc {
	private static JFrame popFrame;
	private static JPanel popPanel;
	private static JLabel popLabel;
	
	public static void AddNumbers(JTextField tfNum1, JTextField tfNum2, JTextField tfResult){
	
		try{
	Double num1 = Double.parseDouble(tfNum1.getText());
	Double num2 = Double.parseDouble(tfNum2.getText());
	Double Sum = num1 + num2;
	tfResult.setText(String.valueOf(Sum));
	}
	catch(Exception ex) {
		popFrame = new JFrame("Error");
		popPanel = new JPanel();
		String num1 = tfNum1.getText();
		String num2 = tfNum2.getText();
		
		char numchar1[] = num1.toCharArray();
		char numchar2[] = num2.toCharArray();
		
		if (FindIfString.ifString(numchar1)||FindIfString.ifString(numchar2)|| (!num1.isEmpty() && !num2.isEmpty())){
			popLabel = new JLabel("Num1 or Num2 should be an integer", JLabel.NORTH_EAST);
		}
		else if (num1.equals(null) || num2.equals(null) || num1.isEmpty() || num2.isEmpty()){
			popLabel = new JLabel("Num1 or Num2 cannot be null or empty", JLabel.NORTH_EAST);
		}
			popPanel.add(popLabel);
			popFrame.add(popPanel);
			popFrame.setSize(300, 100);
			popFrame.setLocationByPlatform(true);
			popFrame.setVisible(true);
		}

	}
		
}

