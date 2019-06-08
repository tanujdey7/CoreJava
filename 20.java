import java.util.Scanner;
class box{
	int m1,m2,m3,total;
	double per;
	void getdata(){
		Scanner input =new Scanner(System.in);
		System.out.print("Enter Physics: ");
		m1=input.nextInt();
		System.out.print("Enter Chemistry: ");
		m2=input.nextInt();
		System.out.print("Enter Maths: ");
		m3=input.nextInt();
	}
	void total(){
		total=m1+m2+m3;
		System.out.println("Total Marks: "+total);
	}
	void per(){
		per=(total*100)/300;
		System.out.print("Percentage: "+per);
	}
}
class demo{
	public static void main(String[] args) {
		box b1=new box();
		b1.getdata();
		b1.total();
		b1.per();
	}
}