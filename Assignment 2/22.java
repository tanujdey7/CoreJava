import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num1,num2,num3;
		System.out.print("Enter Number 1: ");
		num1=input.nextInt();
		System.out.print("Enter Number 2: ");
		num2=input.nextInt();
		System.out.print("Enter Number 3: ");
		num3=input.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.print("Number 1 is greatest");
		}
		else if(num2>num1 && num2>num3) {
			System.out.print("Number 2 is greatest");
		}
		else {
			System.out.print("Number 3 is greatest");
		}
	}
}