class Gugu	{
	
	static void guguMethod() {
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <=9; j++) 
				guguOutput(i,j);
		}
	}
	
	static void guguOutput(int i, int j) {
		System.out.printf("%d X %d = %d%n", i, j, i*j);
	}
}


class TestGuguClass {

	public static void main(String[] args) {
		Gugu gugu = new Gugu();
		
		gugu.guguMethod();

	}
}