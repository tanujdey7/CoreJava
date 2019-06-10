import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int total=0;
		int[] num= new int[5];
		for(int i=0;i<5;i++) {
			num[i]=input.nextInt();
			total=total+num[i];
		}
		double avg=total/5;
		System.out.print("Average is: "+avg);
	}
}