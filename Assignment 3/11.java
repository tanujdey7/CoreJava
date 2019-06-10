interface area {
	public int area=10;
	void display();
}
class rectangle implements area {
	public void display () {
		System.out.print("Area of rectangle: "+area);
	}
	public static void main(String[] args) {
		rectangle r1=new rectangle();
		r1.display();
	}
}