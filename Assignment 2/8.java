/*Write a java program to find student grade, percentage, total of given any three five
subject marks.*/
import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Physics: ");
		int num1=input.nextInt();
		System.out.print("Enter Chemistry: ");
		int num2=input.nextInt();
		System.out.print("Enter Maths: ");
		int num3=input.nextInt();
		int total=num1+num2+num3;
		int per=total/3;
		System.out.println("Total is: "+total);
		System.out.println("Percentage is: "+per);
		switch((int)per/10) {
			case 9:
				System.out.print("Grade A+");
				break;
			case 8:
				System.out.print("Grade A");
				break;
			case 7:
				System.out.print("Grade B");
				break;
			case 6:
				System.out.print("Grade C");
				break;
			case 5:
				System.out.print("Grade D");
				break;
			case 4:
				System.out.print("Pass Class");
				break;
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.print("Fail");
				break;
		} 
	}
}