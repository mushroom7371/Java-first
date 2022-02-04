package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//최댓값과 최솟값
class MaxMin {
	private String solution(String s) {
		String answer = "";
		List<Integer> al = new ArrayList<Integer>();	//자른 숫자를 저장할 ArrayList 객체
		String [] strArr = s.split(" ");	//공백을 기준으로 문자를 자르고 각각의 데이터를 배열에 저장한다.
		
		for(int i = 0; i < strArr.length; i++) {
			al.add(Integer.parseInt(strArr[i]));	//String 타입을 가른것이므로 int타입으로 바꿔 ArrayList에 저장한다.
		}
		
		Collections.sort(al);	//정렬
		
		answer = al.get(0) + " " + al.get(al.size()-1);	//정렬로 인하여 최솟값은 0번지 데이터, 최댓값은 마지막 번지의 데이터가 된다.
		
		return answer;
	}
}
