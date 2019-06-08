import java.util.Scanner;
class box{
	public static void main(String[] args) {
		int a,b;
		Scanner input =new Scanner(System.in);
		System.out.print("Enter Two values: ");
		a=input.nextInt();
		b=input.nextInt();
		if(a==b)
			System.out.print("Equal value");
		else
			System.out.print("Different value");
	}
}