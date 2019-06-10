/*Write a program to calculate arithmetic mean in the superclass and standard
deviation in the subclass*/
import java.util.Scanner;
class arithmeticmean {
	double num,i,sum=0d,loop,mean=0d,am;
	Scanner input=new Scanner(System.in);
	void get() {
		System.out.print("How many numbers you want to add? ");
		loop=input.nextInt();
		System.out.print("Enter Numbers: ");
		for(i=0;i<loop;i++) {
			num=input.nextInt();
			sum=sum+num;
		}
		am=sum/loop;
		System.out.println("Arithmetic Mean is: "+am);
	}
}
class standarddeviation extends arithmeticmean {
	void get1() {
		for(i=0;i<loop;i++) {
			mean=mean+Math.pow(num-am,2);				//sigma=sqrt(E(x-x')/n)
		}
		double sd=Math.sqrt(mean/loop);
		System.out.print("Arithmetic Mean is: "+sd);
	}
}
class demo {
	public static void main(String[] args) {
		standarddeviation a1=new standarddeviation();
		a1.get();
		a1.get1();
	}
}