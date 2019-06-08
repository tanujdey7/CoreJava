import java.util.Scanner;
class demo{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Metres: ");
		int m=input.nextInt();
		double k;
		k=m/1000;
		System.out.print("Kilometers is: "+k);
	}
}