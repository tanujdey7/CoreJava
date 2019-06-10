interface i1 {
	int a=10;
}
interface i2 {
	int b=20;
}
interface i3 {
	int c=30;
}
class box implements i1,i2,i3 {
	void display() {
		int ans=a+b+c;
		System.out.print(ans);
	}
}
class demo {
	public static void main(String[] args) {
		box b1=new box();
		b1.display();
	}
}