package programmers;

//기능 개발
class FunctionDev {
	public int [] solution(int [] progresses, int [] speeds) {
		int [] tmp = new int[100];	//작업의 갯수가 100 이하이므로
		int day = 0;	//tmp에 적용할 배포일 수
		
		for(int i = 0; i < progresses.length; i++) {	//progresses가 가리키는 배열의 크기만큼 1씩 증가하며 반복
			while(progresses[i] + (speeds[i] * day) < 100) {	//작업 진행도가 100보다 작다면
				day++;	//일수가 늘어난다.
			}
			
			tmp[day]++;
		}
		
		int count = 0;
		
		for(int n : tmp) {
			if(n != 0) {
				count++;
			}
		}
		
		int [] answer = new int[count];
		
		count = 0;
		for(int n : tmp) {
			if(n != 0) {
				answer[count++] = n;
			}
		}
		
		return answer;
	}
}
