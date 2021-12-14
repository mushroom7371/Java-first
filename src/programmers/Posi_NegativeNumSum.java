package programmers;

//음양 더하기
class Posi_NegativeNumSum {
	private int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		for(int i = 0; i < absolutes.length; i++) {	//인자값으로 받은 배열의 길이는 동일하여 그 배열의 길이만큼 1씩 증가하며 반복
			if(signs[i] == true) {	//참조 변수 signs이 가리키는 배열의 i번지의 값이 참이라면
				answer += absolutes[i];	//양수이므로 더한다.
			}else {	//아니라면
				answer += -absolutes[i];	//뺀다.
			}
		}
		
		return answer;
	}
}
