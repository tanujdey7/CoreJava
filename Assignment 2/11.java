class demo {
	static int num=10;
	static void display() {
		System.out.println("Static method");
	}
	public static void main(String[] args) {
		demo d1=new demo();
		d1.display();
		System.out.print("Static variable: "+num);
	}
}