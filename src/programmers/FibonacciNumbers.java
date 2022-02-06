package programmers;

//피보나치 수
class FibonacciNumbers {
	static int solution(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		
		int answer = 0;
		int num1 = 1;
		int num2 = 1;
		
		for(int i = 3; i <= n; i++) {	//밀어내기 식으로 피보나치 항을 구한다.
			answer = num1 + num2;
			answer = answer % 1234567;
			num1 = num2;
			num2 = answer;
		}
		
		return answer;
	}
	
//	static int fibo(int n) {	//재귀함수는 메모리를 많이 차지해서 연산결과가 느려짐
//		if(n == 0) {
//			return 0;
//		}else if(n == 1) {
//			return 1;
//		}else {
//			return fibo(n-1) + fibo(n-2);
//		}
//	}
}
