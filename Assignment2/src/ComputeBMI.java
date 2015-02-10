
//OK. Program looks correct. Choose your variable names more descriptive. Some examples below.
//Ayman Alghamdi
import javax.swing.JOptionPane;

public class ComputeBMI {
	public static void main(String[] args) {

		double BMI, WinK, WinP, HinM, HinI;
		
		//instead of WinP, you can use weight, instead of HinI, you can use height.

		WinP = Double.parseDouble(JOptionPane
				.showInputDialog("Enter your weight in pounds. "));

		HinI = Double.parseDouble(JOptionPane
				.showInputDialog("Enter your height in inches. "));

		WinK = WinP * 0.45359237;
		HinM = HinI * 0.0254;
		BMI = WinK / Math.pow(HinM, 2);

		JOptionPane.showMessageDialog(null, "Your Body Mass Index is " + BMI);
	}
}
