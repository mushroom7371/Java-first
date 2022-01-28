package programmers;

//나머지가 1이 되는 수 찾기
class RemainderIs1 {
	static int solution(int n) {
		int answer = 0;
		int quotient = 2;	//몫은 2부터 시작
		
		while(true) {	//반복 횟수를 모르므로 항상 반복
			if(n % quotient == 1) {	//n을 몫으로 나눴을때 나머지가 1이라면
				answer = quotient;	//정답은 몫이 된다.
				break;	//반복문을 빠져나옴
			}
			quotient++;	//나머지가 1이 아니면 몫을 1증가시켜 다시 반복을 실시한다.
		}
		
		return answer;
	}
}
