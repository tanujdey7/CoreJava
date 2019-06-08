import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		double pi=3.14d;
		int r;
		System.out.print("Enter Radius: ");
		r=input.nextInt();
		double ans;
		ans=r*r*pi;
		System.out.print("Area of Circle is: "+ans);
	}
}