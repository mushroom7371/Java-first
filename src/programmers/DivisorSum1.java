package programmers;

//약수의 합
class DivisorSum1 {
	private int solution(int n) {
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {	//1부터 n까지 1씩 증가하면서 반복
			if(n % i == 0) {	//n을 i로 나눈 나머지가 0이면 약수
				answer += i;	//정답에 더하고 반복 진행
			}
		}

		return answer;
	}
}
