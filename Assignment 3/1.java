import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.print("Enter 10 Number:");
		Scanner input =new Scanner(System.in);
		for(int i=0;i<10;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<10;i++) {
			if(arr[i]%2==0)
				System.out.println("Even Numbers: "+arr[i]);
		}
		System.out.println();
		for(int i=0;i<10;i++) {
			if(arr[i]%2==0)
				continue;
			else
				System.out.println("Odd Numbers: "+arr[i]);
		}
	}
}