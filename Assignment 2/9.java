import java.util.Scanner;
class box {
	int l,b;
	int ans;
	void getdata() {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Length: ");
		l=input.nextInt();
		System.out.print("Enter Breath: ");
		b=input.nextInt();
	}
	void area() {
		ans=l*b;
	}
	void display() {
		System.out.print("Area is: "+ans);
	}
}
class demo {
	public static void main(String[] args) {
		box b1=new box();
		b1.getdata();
		b1.area();
		b1.display();
	}
}