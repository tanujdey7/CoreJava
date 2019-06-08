/*Write a program that takes hourly rate of pay and the number of hours those are worked.
Display gross pay, withholding tax(15% of gross pay) and net pa (gross pay withholding).*/
import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		int rate,hour;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Hourly Rate of Pay: ");
		rate=input.nextInt();
		System.out.print("Enter Hours of work: ");
		hour=input.nextInt();
		int gross=rate*hour;
		System.out.println("Gross pay is: "+gross);
		int tax=(gross*15)/100;
		System.out.println("Withholding tax (15%) "+tax);
		tax=gross-(gross*15)/100;
		System.out.println("Net Pay after tax deduction: "+tax);
	}
}