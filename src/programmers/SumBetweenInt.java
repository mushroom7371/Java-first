package programmers;

//두 정수 사이의 합
class SumBetweenInt {
	public long solution(int a, int b) {
		long answer = 0;
		
		if(a == b) {	//주어진 수가 같으면 둘 중 아무거나 반환
			answer = a;
		}else if(a > b){	//대소 관계를 가려서 작은수를 시작으로 끝 수까지 1씩 증가하면서 반복
			for(int i = b; i <= a; i++) {
				answer += i;	//정답에 해당 숫자를 더해준다.
			}
		}else {
			for(int i = a; i <= b; i++) {
				answer += i;
			}
		}
		
		return answer;
    }
}
