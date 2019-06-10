import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int per;
		System.out.print("Enter Percentage: ");
		per=input.nextInt();
		if(per>=91 && per<=100) {
			System.out.print("A");
		}
		else if(per>=81 && per<=90) {
			System.out.print("B");
		}
		else if(per>=71 && per<=80) {
			System.out.print("C");
		}
		else if(per>=61 && per<=70) {
			System.out.print("D");
		}
		else if(per>=51 && per<=60) {
			System.out.print("E");
		}
		else {
			System.out.print("Pass");
		}
	}
}