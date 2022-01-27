package programmers;

//콜라츠 추측
class CollatzConjecture {
	private int solution(int num) {
		int answer = 0;
		long number = num;	//홀수의 경우 3을 곱하고 1을 더하므로 int형의 범위를 벗어날 수 있기 때문에 long 타입으로 선언
		
		while(number != 1) {	//반복 횟수를 모르므로 while문으로 1이 아니면 반복을 실시한다.
			
			if(number % 2 == 0) {	//짝수면
				number = number / 2;	//2를 나눠준다.
			}else {	//홀수면
				number = (number * 3) + 1; //3을 곱하고 1을 더한다.
			}
			
			answer++;	//반복 횟수를 1 증가한다.
			
			if(answer == 500) {	//500번이 되어도 1이 되지 않으면
				answer = -1;	//-1로 고정하고 반복문을 빠져 나온다.
				break;
			}
		}
				
		return answer;
    }
}
