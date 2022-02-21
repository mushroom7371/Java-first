package programmers;

import java.util.Arrays;

//완주하지 못한 선수 찾기
class NotCompletion {
	private String solution(String [] participant, String [] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		//참가자와 완주자의 정보가 담긴 배열을 같은 방식으로 정렬 한다.
		
		String answer = null;
		//완주하지 못한 사람이 담길 변수
		
		int i = 0;	//배열은 0번지부터 시작하므로
		while(i < completion.length) {	//완주자의 정보가 담긴 배열의 길이 전까지 반복
			if(!participant[i].equals(completion[i])) {	//참가자와 완주자가 같지 않다면
				answer = participant[i];	//참가자는 완주하지 못한 인원이므로 이를 반환
				return answer;
			}
			i++;
		}	//해당하는 반복에서 조건에 맞는 인원이 없으면 모두 완주
		
		return participant[i];
	}
}
