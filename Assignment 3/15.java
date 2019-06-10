/*Write a program in Java in which a subclass constructor invokes the constructor
of the super class and instantiate the values*/
class superclass {
	int num;
	superclass() {
		num=10;
	}
}
class subclass extends superclass {
	subclass() {
		num=20;
	}
	void display(){
		System.out.print(super.num);
	}
}
class demo{
	public static void main(String[] args) {
		subclass s1=new subclass();
		s1.display();
	}
}