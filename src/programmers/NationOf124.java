package programmers;

class NationOf124 {
	public String solution(int n) {
		String answer = "";
		int countNum = n;

        while(countNum > 0){ //주어진 변수가 양수일 경우만 반복
            if (countNum % 3 == 0){	//3으로 나눴을때 나머지가 0이라면
                answer = "4" + answer;	//정답에 앞에 4를 더한다.
            }else if(countNum % 3 == 1){	//나머지가 1이라면
                answer = "1" + answer;
            }else{	//나머지가 2라면
                answer = "2" + answer;
            }
            countNum /=3;
        }
		
		
		return answer;
    }
}
