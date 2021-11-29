package programmers;

//두 정수 사이의 합
class BetweenIntSum {
	private long solution(int a, int b) {
        int start = 0, end = 0;
        long sum = 0;
        
        if (a == b) {	//분기 처리 if문 인자값으로 받은 a와 b가 같다면
            return a;	//a를 반환
        } else if (a < b) {	//b가 a보다 크다면
            start = a;		//시작은 a
            end = b;		//끝은 b
        } else if (b < a) {	//b가 a보다 작다면
            start = b;		//시작은 b
            end = a;		//끝은 a
        }
        
        for (int i = start; i <= end; i++) {	//start 부터 end까지 1씩 증가하면서
            sum += i;	//sum에 반복되는 대상을 저장한다.
        }
        
        return sum;	//sum을 반환
    }
}
