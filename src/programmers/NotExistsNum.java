package programmers;

//존재하지 않는 숫자 더하기
class NotExistsNum {
	private int solution(int [] numbers) {
		int answer = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
		}
		
		answer = 45 - answer;	//0~9까지의 합은 45로 고정되어있기 때문
		
		return answer;
	}
}
