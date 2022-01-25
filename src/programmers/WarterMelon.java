package programmers;

//수박수박수박수
class WarterMelon {
	private String solution(int n) {
		String answer = "";
		
		for(int i = 0; i < n; i++) {	//인자값으로 받은 정수 까지 1씩 증가하면서 반복
			if(i % 2 == 0) {	//짝수의 경우
				answer = answer + "수";	//answer 에 "수" 를 더한다.
			}
			
			if(i % 2 == 1) {	//홀수일 경우
				answer = answer + "박";	//answer 에 "박" 을 더한다.
			}
		}
		
		return answer;
	}
}
