/*21. Write a program that takes length and width of a room in feet. Compute and display the floor
space of the room in square feet.*/
import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int l,w;
		System.out.print("Enter Length (in ft): ");
		l=input.nextInt();
		System.out.print("Enter Width (in ft): ");
		w=input.nextInt();
		int area=l*w;
		System.out.print("Space of the room is (in sq.ft): "+area);
	}
}