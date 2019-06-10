class demo {
	static int sum(int a, int... marks) {
		int total = 0;
		for (int i : marks) {
			total = total + i;
		}
		return total;
	}

	public static void main(String[] args) {
		System.out.println(sum(0, 2,88));
		int arr[] = {2,3}; 				//using array
		System.out.println(sum(0, arr));
	}
}