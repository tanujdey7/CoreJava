import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		int per;
		System.out.print("Enter Percentage: ");
		Scanner input=new Scanner(System.in);
		per=input.nextInt();
		switch((int)per/10) {
			case 10:
			case 9:
				System.out.print("A");
				break;
			case 8:
			case 7:
				System.out.print("B");
				break;
			case 6:
			case 5:
				System.out.print("C");
				break;
			case 4:
				System.out.print("Pass");
				break;
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.print("Fail");
		}
	}
}