/*Consider an employee class, which contains fields such as name and
designation. And a subclass, which contains a field salary. Write a program for
inheriting this relation.*/
class employee {
	String name="Tanuj",designation="CEO";
}
class salary extends employee {
	Double salary =1000000d;
	void display() {
		System.out.println("Name of Employee is: "+name);
		System.out.println("Designation of Employee is: "+designation);
		System.out.println("Salary of Employee is (in $): "+salary);
	}
	public static void main(String[] args) {
		salary s1=new salary();
		s1.display();
	}
}