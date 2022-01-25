package programmers;

import java.util.Arrays;

//예산
class Budget {
	private int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        Arrays.sort(d);	//부서의 신청금 정렬
        
        for(int i = 0; i < d.length; i++) {
        	sum += d[i];	//최소 신청금부터 차곡차곡 더한다.
        	
        	if(sum > budget) {	//예산보다 부서의 신청금의 합이 크다면
        		answer = i;	//해당 번지수를 저장 후 반복 마무리
        		break;
        	}
        }
        
        if(sum <= budget) {	//예산 보다 신청금의 합이 적다면
        	answer = d.length;	//배열의 길이만큼의 부서에 지원가능
        }
        
        return answer;
    }
}
