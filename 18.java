import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		double f;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Fahrenheit: ");
		f=input.nextInt();
		f=((f-32)*5)/9;
		System.out.print("Temperature in Celcius is: "+f);
	}
}