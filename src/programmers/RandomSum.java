package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//두 개 뽑아서 더하기
class RandomSum {
	private int [] solution(int [] numbers) {
		Set<Integer> hs = new HashSet<Integer>();	//중복값을 제외할 예정으로 순서가 없지만 중복허용을 하지 않는 HashSet객체 생성
		
		for(int i = 0; i < numbers.length; i++) {	//주어진 배열의 첫번째 데이터 부터 1씩 증가하면서 반복
			for(int j = i+1; j < numbers.length; j++) {	//i다음 데이터부터 1씩 증가하면서 반복
				hs.add(numbers[i] + numbers[j]);	//더한 데이터를 저장
			}
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>(hs);	//HashSet은 순서가 따로 없으므로 정렬을 위하여 ArrayList 객체를 생성
		Collections.sort(al);	//참조변수 al이 가리키는 ArrayList 객체의 데이터를 정렬
		
		int [] answer = new int[al.size()];	//정답을 반환 하기 위한 int 타입 배열 생성
		for(int i = 0; i < answer.length; i++) {
			answer[i] = al.get(i);	//저장
		}
		
        return answer;	//반환
    }
}
