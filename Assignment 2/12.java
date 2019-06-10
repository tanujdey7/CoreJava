class box {
	int num1,num2;
	box() {
		num1=10;
		num2=20;
	}
	box(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	void display() {
		System.out.println("Total is: "+(num1+num2));
	}
}
class demo {
	public static void main(String[] args) {
		box b1=new box();
		b1.display();
		box b2=new box(11,22);
		b2.display();
	}
}