import javax.swing.JOptionPane;
class demo {
	public static void main(String[] args) {
		String str=JOptionPane.showInputDialog(null,"Enter vowel");
		switch (str) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.print("Vowel");
				break;
			default:
				System.out.print("Consonent");
		}
	}
}