class demo {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		if(a>5 || a<15)
			System.out.println("A lies between 5-10");
		else
			System.out.println("A out of bound");
		if(b==10 && a==20 )
			System.out.println("A and B are correct");
		else
			System.out.println("A and B are not correct");
		if(a!=b) 
			System.out.println("A and B are not equal");
		else
			System.out.println("A and B are equal");
	}
}