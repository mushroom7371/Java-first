
class TestGuguMethod {

	public static void main(String[] args) {
		guguMethod();
	}

	static void guguMethod() {
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <=9; j++) 
				System.out.printf("%d X %d = %d%n", i, j, i*j);
		}
	}
}
