package programmers;

//없는 숫자 구하기
class SumNotExistNum {
	//인자 값으로 참조변수가 들어오며 int 값을 가지는 1차원 배열을 가리킨다.
	private int solution(int [] numbers) {
		int answer = 45;	//0~9까지의 숫자의 총 합은 45
		
		for(int number : numbers) {	//향상된 for 문을 이용하여 배열에 담긴 요소들을 int 타입 변수 number에 담아
			answer = answer - number;	//반복마다 총합인 answer에서 number의 값을 제거 한다.
		}
		
		return answer;
	}
}
