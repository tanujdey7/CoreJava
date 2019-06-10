import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter num 1: ");
		int num1=input.nextInt();
		System.out.print("Enter num 2: ");
		int num2=input.nextInt();
		System.out.print("Enter num 3: ");
		int num3=input.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.print("Num 1 is greater than Num 2 & Num 3");
		}
		if(num2>num1 && num2>num3) {
			System.out.print("Num 2 is greater than Num 1 & Num 3");
		}
		if(num3>num1 && num3>num2) {
			System.out.print("Num 3 is greater than Num 1 & Num 2");
		}
	}
}