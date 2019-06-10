/*Describe abstract class called Shape which has three subclasses say Triangle,
Rectangle, Circle. Define one method area() in the abstract class and override
this area() in these three subclasses to calculate for specific object i.e. area() of
Triangle subclass should calculate area of triangle etc. Same for Rectangle and
Circle*/
abstract class Shape {
	abstract void area();
}
class Triangle extends Shape {
	void area() {
		System.out.println("Area of Triangle: "+0.5*2*3);
	}
}
class Rectangle extends Shape {
	void area() {
		System.out.println("Area of Rectangle: "+2*3);
	}
}
class Circle extends Shape {
	void area() {
		System.out.println("Area of Circle: "+3.14*2*2);
	}
}
class demo {
	public static void main(String[] args) {
		Triangle t1=new Triangle();
		Rectangle r1=new Rectangle();
		Circle c1=new Circle();
		t1.area();
		r1.area();
		c1.area();

	}
}