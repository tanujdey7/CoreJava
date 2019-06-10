import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter num 1: ");
		int num=input.nextInt();
		int rev=0,rem=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.print("Reverse number is: "+rev);
	}
}