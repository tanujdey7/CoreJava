import java.util.Scanner;
class demo {
	void array() {
		String arr[] = {"TANUJ","Hello"};
		for (int i=0;i<arr.length;i++) {
			System.out.println("Before: "+arr[i]);
		}
		passarray(arr);
		for (int i=0;i<arr.length;i++) {
			System.out.println("After: "+arr[i]);
		}
	}
	void passarray(String array[]){
		for (int i=0;i<array.length/2;i++) {
			String temp=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
		}
	}
	public static void main(String[] args) {
		demo d1=new demo();
		d1.array();
	}
}