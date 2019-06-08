/*WAP which takes input from the scanner class and find the sum and average of numbers taken
by the user.*/
import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		int a,b,c;
		Scanner input=new Scanner(System.in); 	
		System.out.print("Enter Number 1: ");
		a=input.nextInt();
		System.out.print("Enter Number 2: ");
		b=input.nextInt();
		System.out.print("Enter Number 3: ");
		c=input.nextInt();
		int sum=a+b+c;
		int avg=(a+b+c)/3;
		System.out.println("Sum: "+sum);
		System.out.print("Average: "+avg);
	}
}