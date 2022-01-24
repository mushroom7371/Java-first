package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DivisorNum {
	private int [] solution(int [] arr, int divisor) {
		int [] answer = {};
		List<Integer> list = new ArrayList<Integer>();	//나누어 떨어지는 수를 담을 ArrayList 객체
		
		for(int i = 0; i < arr.length; i++) {	//주어진 배열의 크기만큼 1씩 증가하면서 반복
			if(arr[i] % divisor == 0) {	//해당 번지에 있는 데이터가 divisor로 나눠 떨어진다면
				list.add(arr[i]);	//해당 데이터를 ArrayList에 담는다
			}
		}
		
		Collections.sort(list);	//정렬
		
		if(list.size() == 0) {	//list에 데이터가 담겨있지 않다면,
			answer = new int []	{-1};	//int 배열에 -1을 담아 반환
		}else {	//데이터가 담겨있다면,
			answer = new int [list.size()];	//참조변수 answer는 새로 생성한 list의 크기와 같은 배열을 가리키도록 하고,
			for(int i = 0; i < list.size(); i++) {	//그 배열에 list에 담긴 데이터를 순차적으로 저장한다.
				answer[i] = list.get(i);
			}
		}
		
		return answer;
	}
}
