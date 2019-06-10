/*Write an interface called Numbers with a method int process(int x,int y). Write a
class called Sum in which the process() method finds the sum of two numbers
and returns an int value. Write another class called Average in which the
process() method finds the average of the two numbers and returns an int value.*/
interface numbers {
	void process (int x, int y);
}
class sum implements numbers {
	int a=0,b=0;
	public void process(int x,int y) {
		a=x;
		b=y;	
		int sum=a+b;
		System.out.println(sum);
	}
}
class average implements numbers {
	int a=0,b=0;
	public void process(int x,int y) {
		a=x;
		b=y;	
		int sum=(a+b)/2;
		System.out.println(sum);
	}	
}
class demo {
	public static void main(String[] args) {
		sum s1=new sum();
		s1.process(10,20);
		average a1=new average();
		a1.process(10,20);
	}
}