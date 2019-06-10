import java.util.Scanner;
class demo {
	public static void main(String[] args) {
		int []arr[] =new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("Enter "+i+"x"+j+" Matrix: ");
				Scanner input=new Scanner(System.in);
				arr[i][j]=input.nextInt();
			}
		}
		System.out.println();
		System.out.println("Original Matrix: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Transpose Matrix: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
}