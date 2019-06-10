import java.util.Scanner;
class area {
	int l,b,h;
	void get() {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter Length: ");
		l=input.nextInt();
		System.out.print("Enter Breadth: ");
		b=input.nextInt();
		System.out.print("Enter Height: ");
		h=input.nextInt();
	}
	void area() {
		int area=l*b;
		System.out.println("Area is: "+area);
	}
}
class volume extends area {
	void volume() {
		int volume=l*b*h;
		System.out.print("Volume is: "+volume);
	}
}
class demo {
	public static void main(String[] args) {
		volume v1 =new volume();
		v1.get();
		v1.area();
		v1.volume();
	}
}