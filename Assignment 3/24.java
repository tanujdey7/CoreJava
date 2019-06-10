//UT matrix
import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		int []arr[] = new int[3][3];
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 3x3 numbers: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=input.nextInt();
				if(i>j) {
					arr[i][j]=0;
				}
			}
		}
		System.out.println("UpperTriangular Matrix");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}