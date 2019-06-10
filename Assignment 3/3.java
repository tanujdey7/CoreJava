import java.util.Scanner;
class Student {
	public static void main(String[] args) {
		int sid[]=new int[5];
		String sname[]=new String[5];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<sid.length;i++) {
			System.out.print("Enter Rollno of "+(i+1)+" Student: ");
			sid[i]=input.nextInt();
			System.out.print("Enter Name of "+(i+1)+" Student: ");
			sname[i]=input.next();
		}
		for(int i=0;i<sid.length;i++) {
			System.out.println("Roll no is: "+sid[i]+"\nName is: "+sname[i]);
		}
	}
}