package AlgorithmStudy;

public class FactorialTest {
	static long factorial(int n) {	//static 메서드로 메모리에 클래스가 적재될때 생성됨 객체 생성없이 사용가능
		if(n <= 0 || n > 20)
			return -1;
		//매개변수의 유효성 검사를 위해 작성한 if문
		if(n <= 1)
			return 1;
		//재귀호출 시 매개변수 n-1 로 인하여 매개변수가 1이 될시 반환값을 1로 고정
		
		return n * factorial(n-1);
		//재귀 호출
	}
	
	public static void main(String[] args) {
		int n = 21;
		long result = 0;
		
		for(int i = 1; i <= n; i++) {
			result = factorial(i);
			
			if(result == -1) {
				System.out.printf("유효하지 않은 값입니다. (0 < n <= 20) : %d%n", n);
				break;
			}
			//매개변수 유효성 검사로 부적합 할 시 안내문구 출력 후 break로 반복문을 빠져 나옴
			
			System.out.printf("%2d!=%20d%n", i, result);
		}
	}
}
