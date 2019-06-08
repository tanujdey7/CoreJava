import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		int f=1;
		Scanner input =new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = input.nextInt();
		for(int i=1;i<=num;i++) {
			f=i*f;
		}
		System.out.print("Factorial is: "+f);
	}
}