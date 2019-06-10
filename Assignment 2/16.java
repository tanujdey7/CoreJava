class test {
	int l,b,h;
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
	public static void main(String[] args) {   
		test t1= new test(10,20,30);
		t1.display();
	}
}