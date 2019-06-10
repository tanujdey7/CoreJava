import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num,f=1;
		System.out.print("Enter Number: ");
		num=input.nextInt();
		for(int i=1;i<=num;i++) {
			f*=i;
		}		
		System.out.print(f);
	}
}