//identity matrix
import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i<j) {
					arr[i][j]=0;
				}
				else if(i>j) {
					arr[i][j]=0;
				}
				else if(i==j) {
					arr[i][j]=1;
				}
			}
		}
		System.out.println("Identity matrix");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}