package AlgorithmStudy;

public class DynamicProgramming {
	
	//기존의 피보나치 수열을 구하기 위한 메서드
	public static int fibonacci(int n) {	//static 메서드로 클래스가 메모리에 적재될때 객체 없이 사용가능
        if(n == 0) 
            return 0;
        else if(n == 1) 
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
        //위의 제약조건이 아닐시 자기 자신의 메서드를 호출하되(재귀) 매개변수를 수정하여 준다.
    }
	
	public static int fibonacci_dp(int n) {
        int[] fib = new int[n > 2 ? n + 1 : 3];
        //삼항 연산자를 통하여 배열의 크기를 n>2 일때 n+1만큼, 아닐시 3의 크기로 생성한다
        //만약 10의 값이 매개변수로 입력되면 배열의 크기는 11이 됨
        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 1;
        //0,1,2 번지의 값을 각각의 숫자로 초기화 한다
        
        for(int i = 2; i <= n; i++) {
        	//i의 값이 2부터 시작하여 매개변수로 입력된 값까지 반복을 실행한다. (그 전 번지수의 값은 미리 선언하였음)
            fib[i] = fib[i - 1] + fib[i - 2];
            //i번지의 데이터는 (i-1번지의 데이터) + (1-2번지의 데이터)로 저장된다.
            //이는 피보나치 수열과 동일한 로직임
        }
        
        return fib[n];
        //매개변수로 들어온 n의 값에 해당하는 결과값을 반환한다.
        //피보나치 수열의 특성으로 인하여 0,1,2 번지의 수는 강제로 초기화된 데이터로 반환
    }
	
	public static void main(String[] args) {
		int result1 = 0;
		int result2 = 0;
		
		result1 = fibonacci(10);
		result2 = fibonacci_dp(10);
		
		System.out.println(result1);
		System.out.println(result2);
		
	}
}
