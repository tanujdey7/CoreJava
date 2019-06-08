//17. Write a program to calculate earnings using a dialog box to take inputs and to display the result.
import javax.swing.*;
class demo {
	public static void main(String[] args) {
		int num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Monthly expenses "));
		int num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Monthly Petrol expenses "));
		int num3=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Monthly Electricity Bill "));
		int num4=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Monthly Gas Bill "));
		int num5=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Monthly Medicinal Cost "));
		int num6=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Monthly Savings"));
		int ans=num1+num2+num3+num4+num5+num6;
		System.out.println("Monthly Salary is: "+ans);
		System.out.print("Approximate Annual Income is: "+ans*12);
	}
}