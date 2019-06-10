import java.util.Scanner;
import java.util.Arrays;
class box{
	void sort() {
		int[] arr =new int[10];
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		for(int i=0;i<10;i++) {
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
	}
}
class demo{
	public static void main(String[] args) {
		box b1=new box();
		b1.sort();
	}	
}