//Write a java program to print first five even numbers using DO-WHILE loop and CONTINUE statement
class demo {
	public static void main(String[] args) {
		int num=1;
		do {
			if(num%2==0) {
				System.out.println(num);		
			}
			num++;
			continue;
		} while(num<=10);
	}
}
