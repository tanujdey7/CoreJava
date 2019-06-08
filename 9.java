import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int a=input.nextInt();
		System.out.print("Enter Number 2: ");
		int b=input.nextInt();
		System.out.print("Enter Number 3: ");
		int c=input.nextInt();
		double avg;
		avg=(a+b+c)/3;
		System.out.print("Average is: "+avg);
	}
}