final class hello {
	int a=10;
	void display() {
		System.out.print(a);
	}
}
class box extends hello {      //we cant inherit final class
	int a=20;
	void display(){
		System.out.print(a);
	}
}
class demo{
	public static void main(String[] args) {
		box b1=new box();
		b1.display();
		hello h1=new hello();
		h1.display();
	}
}