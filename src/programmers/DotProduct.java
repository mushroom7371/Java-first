package programmers;

//내적 구하기
class DotProduct {
	private int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i = 0; i < a.length; i++) {
        	answer += a[i]*b[i];
        }
        
        
        return answer;
    }
}
