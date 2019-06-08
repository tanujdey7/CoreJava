import java.util.Scanner;
class demo{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Birth Year: ");
		int year=input.nextInt();
		System.out.print("Enter Birth Month: ");
		int month=input.nextInt();
		if(month<=2){
			int age=2019-year;
			System.out.print("Age is: "+age);
		}
		else{
			int age=2018-year;
			System.out.print("Age is: "+age);
		}
	}
}