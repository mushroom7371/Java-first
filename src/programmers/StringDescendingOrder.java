package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//문자열 내림차순으로 배치하기
class StringDescendingOrder {
	private String solution(String s) {
		String answer = "";
		List<Integer> upCase = new ArrayList<Integer>();	//대문자에 대한 숫자코드가 담길 객체
		List<Integer> downCase = new ArrayList<Integer>();	//소문자에 대한 숫자코드가 담길 객체
		
		for(int i = 0; i < s.length(); i++) {	//주어진 문자열의 길이만큼 반복
			if((int)s.charAt(i) > 90) {	//소문자라면
				downCase.add((int)s.charAt(i));	//해당 문자를 코드로 바꾸어 저장
			}else {	//대문자라면
				upCase.add((int)s.charAt(i));	//해당 문자를 코드로 바꾸어 저장
			}
		}
		
		Collections.sort(upCase, Collections.reverseOrder());	//역순으로 정렬
		Collections.sort(downCase, Collections.reverseOrder());	//역순으로 정렬
		
		for(int i = 0; i < downCase.size(); i++	) {	//소문자를 담음 객체의 크기 만큼 반복
			answer += Character.toString(downCase.get(i));	//정답에 하나씩 저장
		}
		
		for(int i = 0; i < upCase.size(); i++) {
			answer += Character.toString(upCase.get(i));
		}

		return answer;
	}
}
