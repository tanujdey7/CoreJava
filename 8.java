import java.util.Scanner;
class demo{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int l,b,area;
		System.out.print("Enter Length: ");
		l=input.nextInt();
		System.out.print("Enter Breath: ");
		b=input.nextInt();
		area=l*b;
		System.out.print("Area of rectangle is: "+area);
	}
}