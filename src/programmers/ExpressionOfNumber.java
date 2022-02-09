package programmers;

//숫자의 표현
public class ExpressionOfNumber {
	private int solution(int n) {
		int answer = 0;
		int sum = 0;
		
		//연속된 숫자의 합이 주어진 숫자 n이 되는 경우 카운트를 늘려준다.
		//연속된 숫자의 합이므로 n의 절반 이후의 합은 n보다 크게 된다.
		for(int i = 1; i <= n/2 + 1; i++) {	//주어진 숫자의 절반까지 1부터 1씩 증가하면서 반복
			for(int j = i; j <= n/2 + 1; j++) {	//반복마다 숫자 i 이후를 더해야 하므로 j=i 부터 시작
				sum += j;
				if(sum == n) {	//연속된 합이 n이 된다면
					answer++;	//카운트를 늘리고
					sum = 0;	//재 반복을 위해 초기화 후
					break;		//반복을 빠져 나간다.
				}else if(sum > n) {	//n보다 크다면
					sum = 0;	//초기화 후
					break;		//반복을 빠져 나간다.
				}
			}
		}
		
		answer++;	//반복 대상을 절반으로 하였기에, 1개 인 경우를 포합하기 위해 1 증가 한다.(n=15 라면 15도 연속된 숫자로 취급하기에...)
		
		return answer;
	}
}
