package programmers;

import java.util.HashMap;
import java.util.Map.Entry;

class NotCompletionHash {
	private String solution(String [] participant, String [] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		//참가자, 완주자의 정보를 담을 HashMap을 선언하여 준다
		
		//참가자 배열의 모든 값을 해시 맵에 넣어준다.
		for(String part : participant) {
			//key = 문자열, value = 현재 맵에 저장된 문자열의 갯수 +1
			map.put(part, map.getOrDefault(part, 0) + 1);
			//getOrDefalut()는 map에서 찾는 key가 없다면 defaultValue를 리턴
		}
		
		//완주자 배열의 모든 값을 해시 맵에 넣어준다.
		for(String comp : completion) {
			//같은 문자열을 찾아 value의 값을 -1
			map.put(comp, map.get(comp) -1);
		}
		
//		for (Entry<String, Integer> entry : map.entrySet()) {
//			if (entry.getValue() > 0) {
//				answer = entry.getKey();
//				break;
//			}
//		}
		
		for (String key : map.keySet()) {	//반복문을 통하여 map에 담김 key 값을 반환한다.
			if (map.get(key) != 0) {	//해당 key의 value 값이 0이 아니면 완주하지 못한 인원이다.
				answer = key;
			}
		}
		
		return answer;
	}
}
