package programmers;

import java.util.HashMap;
import java.util.Map;

//전화번호 목록
class PhoneNumListHashMap {
	private boolean solution(String [] phone_book) {
		boolean answer = true;
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < phone_book.length; i++) {	//String 배열의 데이터를 key 값으로 저장
			map.put(phone_book[i], i);
		}
		
		for(int i = 0; i < phone_book.length; i++) {	//주어진 배열의 길이만큼 반복
			for(int j = 0; j < phone_book[i].length(); j++) {	//해당 배열의 i번지의 길이까지 반복
				if(map.containsKey(phone_book[i].substring(0, j))){	//hashmap에 담긴 키값과 일치하는 데이터가 있으면
					answer = false;	//정답으로 설정
				}
			}
		}

		return answer;
	}
}
