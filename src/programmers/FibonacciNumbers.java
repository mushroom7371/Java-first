package programmers;

//�Ǻ���ġ ��
class FibonacciNumbers {
	static int solution(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		
		int answer = 0;
		int num1 = 1;
		int num2 = 1;
		
		for(int i = 3; i <= n; i++) {	//�о�� ������ �Ǻ���ġ ���� ���Ѵ�.
			answer = num1 + num2;
			answer = answer % 1234567;
			num1 = num2;
			num2 = answer;
		}
		
		return answer;
	}
	
//	static int fibo(int n) {	//����Լ��� �޸𸮸� ���� �����ؼ� �������� ������
//		if(n == 0) {
//			return 0;
//		}else if(n == 1) {
//			return 1;
//		}else {
//			return fibo(n-1) + fibo(n-2);
//		}
//	}
}
