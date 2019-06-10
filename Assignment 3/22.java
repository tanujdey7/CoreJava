import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		int []arr1[] = new int[3][3];
		int []arr2[] = new int[3][3];
		int []arr3[] = new int[3][3];
		Scanner input=new Scanner(System.in);
		System.out.print("Enter values of matrix one:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++){
				arr1[i][j]=input.nextInt();
			}
		}
		System.out.print("Enter values of matrix two:");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++){
				arr2[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3.length;j++){
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("Sum of matrix is:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.print(" + ");
			for(int j=0;j<3;j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.print(" = ");
			for(int j=0;j<3;j++){
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}