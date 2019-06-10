import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		int num1,num2;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		num1=input.nextInt();
		System.out.print("Enter Number 2: ");
		num2=input.nextInt();
		System.out.print("Enter 1 for Addition\nEnter 2 for Subtraction\nEnter 3 for Multiplication\nEnter 4 for Division");
		int c=input.nextInt();
		switch(c){
			case 1:
				System.out.println();
				System.out.print("Addition is: "+(num1+num2));
				break;
			case 2:
					System.out.println();
				System.out.print("Subtraction is: "+(num1-num2));
				break;
			case 3:
				System.out.println();
				System.out.print("Multiplication is: "+(num1*num2));
				break;
			case 4:
				System.out.println();
				System.out.print("Division is: "+(num1/num2));
				break;
			default:
				System.out.print("Invalid");
				break;
			
		}
	}
}