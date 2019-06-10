import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		int num,flag=0,i;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number: ");
		num=input.nextInt();
		for(i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.print("Not Prime");
		}
		else {
			System.out.print("Prime");
		}
	}
}
