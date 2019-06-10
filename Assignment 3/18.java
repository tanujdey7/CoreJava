/*Write a Java Program to create a simple class to find out the Area and perimeter
of rectangle and box using super and this keyword.*/
class box {
	int a,b;
	box() {
		a=10;
		b=20;
	}
}
class demo extends box {
	demo() {
		super();
	}
	void rectangle(){
		System.out.println("Area of rectangle: "+(a*b));
	}
	void box(int a) {
		System.out.print("Area of Box: "+(Math.pow(this.a,3)));	
	}
	public static void main(String[] args) {
		demo d1=new demo();
		d1.rectangle();
		d1.box(10);
	}
}