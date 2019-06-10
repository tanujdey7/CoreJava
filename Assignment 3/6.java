/*Define a class MotorVehicle as modelName, modelNumber, modelPrice, and a
method display() to display these details. Create another class Car which
inherits the class MotorVehicle and has the member discountRate and having
display() method to display details. Test this class with suitable constructor.*/
class MotorVehicle {
	String modelName;
	float modelNumber;
	int modelPrice;
	MotorVehicle() {
		modelName="Jaguar F-Type";
		modelPrice=280;
		modelNumber=2.0f;
	}
	void display() {
		System.out.println("Model Name: "+modelName);
		System.out.println("Model Number: "+modelNumber);
		System.out.println("Model Price (in lacs): "+modelPrice);
	}
}
class Car extends MotorVehicle {
	int discountRate;
	Car() {
		discountRate=10;
	}
	void display() {
		System.out.println("Discounted Rate (in percentage): "+discountRate);
	}
}
class demo {
	public static void main(String[] args) {
		MotorVehicle m1=new MotorVehicle();
		m1.display();
		Car c1=new Car();
		c1.display();
	}
}