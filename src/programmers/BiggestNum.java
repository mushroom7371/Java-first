package programmers;

import java.util.ArrayList;
import java.util.Collections;

class BiggestNum {
	private String solution(int[] numbers) {
		String answer = "";
		ArrayList<String> strNum = new ArrayList();	//int 값을 String 값으로 저장할 ArrayList 객체 생성
		
		for(int i = 0; i < numbers.length; i++) {	//주어진 배열의 데이터를 변환하여 strNum이 가리키는 ArrayList 객체에 더한다.
			strNum.add(String.valueOf(numbers[i]));
		}
		
		Collections.sort(strNum, (a, b) -> (b + a).compareTo(a + b));	//람다식을 사용하여 데이터 내림차순 정렬
		
		if(strNum.get(0).startsWith("0")) {	//주어진 배열이 [0,0] 등으로 주어지면 "0"으로 반환
			return "0";			
		}
		
		for(int i = 0; i < strNum.size(); i++) {	//answer에 정렬된 데이터 저장하가
			answer += strNum.get(i);
		}
		
		return answer;
    }
}
