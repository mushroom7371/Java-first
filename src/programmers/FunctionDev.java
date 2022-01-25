package programmers;

//기능 개발
class FunctionDev {
	public int [] solution(int [] progresses, int [] speeds) {
		int [] tmp = new int[100];	//작업의 갯수가 100 이하이므로
		int day = 0;	//tmp에 적용할 배포일 수
		
		for(int i = 0; i < progresses.length; i++) {	//progresses가 가리키는 배열의 크기만큼 1씩 증가하며 반복
			while(progresses[i] + (speeds[i] * day) < 100) {	//해당 프로세스의 진행가 100이 넘을때의 day를 구함
				day++;	//일수가 늘어난다.
			}
			
			tmp[day]++;	//day 번지의 데이터를 1 증가 시킨다. (day번지에 배포가 가능한 프로세스가 늘어난다.)
		}
		
		int count = 0;
		
		//tmp에 들어간 배열의 길이를 구하기 위한 코드
		//tmp는 초기에 0으로 선언 되어 있으므로 0이 아닌 값만 적용
		for(int n : tmp) {
			if(n != 0) {
				count++;	//n이 0이 아니라면 해당 day에 배포가 가능한 작업이 있으므로 count가 증가한다.
			}
		}
		
		int [] answer = new int[count];	//배포가 가능한 day 만큼의 길이를 가진 배열을 생성
		
		count = 0;	//초기화
		for(int n : tmp) {
			if(n != 0) {
				answer[count++] = n;	//tmp에는 배포가 가능한 프로세스의 수가 담겨있다. 이를 answer에 넣는다.
			}
		}
		
		return answer;
	}
}
