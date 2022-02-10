package programmers;

class NationOf124 {
	public String solution(int n) {
		String [] numbers = {"4", "1", "2"};	//1,2,4의 숫자밖에 없으므로 미리 배열에 저장해 놓는다.
		String answer = "";

		int num = n;

		while(num > 0){	//반복횟수를 모르므로 n이 양수면 반복
			int remainder = num % 3;
			//3으로 나눈 나머지가 1이면 124나라의 1
			//3으로 나눈 나머지가 2이면 124나라의 2
			//3으로 나눈 나머지가 0이면 124나라의 4
			
			num /= 3;	//num을 3으로 나누어 다시 저장

			if(remainder == 0){
				num--;
			}

			answer = numbers[remainder] + answer;
		}

		return answer;
    }
}
