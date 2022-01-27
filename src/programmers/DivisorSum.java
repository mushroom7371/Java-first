package programmers;

//약수의 개수와 덧셈
class DivisorSum {
	private int solution(int left, int right) {
		int answer = 0;
		int diviorNum = 0;
		
		for(int i = left; i <= right; i++) {	//left부터 right 까지 1씩 증가 하면서 반복
			
			for(int j = 1; j <= i; j++) {	//해당 수를 1부터 자기 자신까지 1씩 증가 히먄사 반복
				if(i % j == 0) {	//나누어 떨어지면
					diviorNum++;	//약수의 개수가 늘어난다.
				}
			}
		
			if(diviorNum % 2 == 0) {	//약수의 개수가 짝수라면
				answer += i;	//정답에 해당 숫자를 더하고
			}else {	//아니면
				answer += -i; //정담에 해당 숫자를 뺀다
			}
			
			diviorNum = 0; //약수의 개수 초기화
		}
		
		return answer;
    }
}
