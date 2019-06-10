/*Create a class result which implements sports interface having data member
total (stores total of three subject marks) and percentage (total + sportmarks).
Calculate the percentage and grade and display the same.*/
interface sports {
	int m1=67,m2=56,m3=78,sportmarks=89;
	final int total=m1+m2+m3+sportmarks;
	void display();
}
class box implements sports {
	int per=total/4;
	public void display() {
		System.out.println("Percentage is: "+per);
		switch((int)per/10) {
			case 10:
			case 9:
				System.out.print("A");
				break;
			case 8:
			case 7:
				System.out.print("B");
				break;
			case 6:
			case 5:
				System.out.print("C");
				break;
			case 4:
				System.out.print("Pass");
				break;
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.print("Fail");
		}
	}
}
class demo {
	public static void main(String[] args) {
			box d1=new box();
			d1.display();
		}
}
