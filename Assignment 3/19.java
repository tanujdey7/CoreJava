interface inter {
	float pie=3.14f;
	void process (float x, float y);
}
class area implements inter {
	float ans,r,r1;
	public void process(float x,float y) {
		r1=x;
		r=y;	
		ans=pie*(float)(Math.pow(r,2));
		System.out.println("Area of Circle 1:" +ans);
		ans=pie*(float)(Math.pow(r1,2));
		System.out.println("Area of Circle 2:" +ans);
	}
}
class demo {
	public static void main(String[] args) {
		inter a1=new area();
		a1.process((float)3.14,2);
	}
}