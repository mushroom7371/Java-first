package programmers;

//n개의 최소공배수
class LeastCommonMultiple {
	public int solution(int [] arr) {
		//arr이 가리키는 배열의 가장 큰 값에 배수에 맞춰 나머지 배수를 확인
		int answer = 0;
		int count = 1;	//곱하기는 1부터 시작
		
		while(true) {	//반복 횟수를 모르므로 참이 될때 까지 반복
			int checkNum = arr[arr.length - 1] * count++;	//배열의 가장 큰 숫자 * count 후 count를 1증가 시킨다.
			int checkCount = 0;
			
			for(int i = 0; i < arr.length - 1; ++i) {	//가장 작은 수 부터 두번째로 큰 숫자까지 반복
				if(checkNum % arr[i] == 0) {	//가장 큰 수를 arr배열이 가리키는 데이터로 나눴을 때 0이라면
					++checkCount;	//1을 증가 시킨다.
				}
			}
			if(checkCount == arr.length - 1) {	//checkCount 가 배열에서 가장 큰 숫자를 제외한 나머지 수의 갯수와 같다면
				answer = checkNum;	//가장 큰 숫자의 배수가 최대공배수가 된다.
				break;	//조건에 맞다면 반복을 빠져나온다
			}
		}
		
		return answer;
	}
}
