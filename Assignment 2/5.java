class test {
	private int l,b,h;
	test() {
		l=1;
		b=2;
		h=3;
	}
	test(int l, int b, int h) {
		this.l=l;
		this.b=b;
		this.h=h;
	}
	void display() {
		System.out.print(l+" "+b+" "+h+"\n");
	}
}
class demo {
	public static void main(String[] args) {   //It can access private members of the class
		test t1= new test();
		t1.display();
		test t2= new test(10,20,30);
		t2.display();
	}
}