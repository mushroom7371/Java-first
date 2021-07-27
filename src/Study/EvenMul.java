package Study;

public class EvenMul {
	public static void main(String[] args) {
		long mul = 1;
		
		for(long i = 1; i <= 20; i++) {
			if(i % 2 == 0) {
				mul = mul * i;
				System.out.println(mul);
			}
		}
		
		System.out.println(mul);
	}
}
