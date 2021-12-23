package programmers;

import java.util.HashMap;
import java.util.Map;

//체육복 (테스트 케이스가 추가되었는데 문제 수정이 안되어 통과가 안됨)
class GymSuit {
	 private int solution(int n, int [] lost, int [] reserve) {
		int answer = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(n);	//체육복 현황을 저장할 HashMap
		
		for(int i = 1; i <= n; i++) {	//1번 학생부터 n번째 학생까지 1씩 증가하면서 반복
			map.put(i, 1);	//초기 세팅은 전부 체육복이 있는 상태
			
			for(int j = 0; j < lost.length; j++ ) {	//체육복을 잃어버린 학생의 정보가 담긴 배열만큼 반복
				if(lost[j] == i) {	//잃어버린 학생이 i번 학생이라면
					map.replace(i , 0);	//그 학생의 value 값을 체육복이 있는 1 상태에서 잃어버린 0 상태로 변경
				}				
			}
			
			for(int k = 0; k < reserve.length; k++) {	//체육복 여분이 있는 학생의 정보가 담긴 배열만큼 반복
				if(reserve[k] == i) {	//여분이 있는 학생이 i번 학생이라면
					map.put(i, map.get(i) + 1);	//체육복 수량을 + 1 한다.
				}
			}			
		}
		
		for(int j = 1; j <= n; j++) {	//1번부터 n번째 학생까지 1씩 증가하면서 반복
			if(map.get(j) == 0) {	//j번 학생이 체육복을 잃어버렸다면
				if( j != n && map.get(j + 1) == 2) {	//잃어버린 학생이 마지막 학생이 아니고, 다음 학생이 여유분이 있다면
					map.put(j, 1);	//잃어버린 학생은 체육복을 빌려 1 상태로 설정
					map.put(j + 1, 1);	//빌려준 학생 또한 여유분이 없는 1 상태로 설정
				}else if(j != 1 && map.get(j - 1) == 2 ) {	//잃어버린 학생이 첫번째 학생이 아니고, 이전 학생이 여유분이 있다면
					map.put(j, 1);	//위와 마찬가지
					map.put(j - 1, 1);	//위와 마찬가지
				}
			}
		}
		
		for(int k = 1; k <= n; k++) {	//1번 학생부터 n번째 학생까지 1씩 증가하면서 반복
			if(map.get(k) > 0) {	//체육복이 있는 상태라면
				answer++;	//수업에 참여 가능한 학생의 수가 늘어난다
			}
		}
		
		return answer;
	 }
}
