import javax.swing.JOptionPane;
class demo {
	public static void main(String[] args) {
		int num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number 1: "));
		int num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number 2: "));
		if(num1>num2)
			JOptionPane.showMessageDialog(null,"Number 1 is greater","Answer",JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,"Number 2 is greater","Answer",JOptionPane.INFORMATION_MESSAGE);
	}
}