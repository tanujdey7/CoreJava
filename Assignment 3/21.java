interface sports {
	int sportmarks=99;
	void putweight();
}
class demo implements sports {
	public void putweight() {
		System.out.println("sportmarks is: "+sportmarks);
	}
	public static void main(String[] args) {
		demo d1=new demo();
		d1.putweight();
	}
}