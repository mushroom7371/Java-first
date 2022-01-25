package programmers;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//더 맵게
class ScovilleUnit {
	private int solution(int [] scoville, int K) {
		int answer = 0;
		List<Integer> queue = new LinkedList();	//Integer 타입만 저장 가능한 List타입의 참조변수를 선언하고 LinkedList 객체 생성하여 이 주소를 가리키게 함.
		
		for(int i=0; i<scoville.length; i++){	//매개변수로 받은 int 배열을 저장하기 위한 반복
			queue.add(scoville[i]);
		}
		
		Collections.sort(queue);	//정렬
		
		while(queue.get(0) < K){	//반복 횟수를 모르기 때문에 while문 반복, 제일 작은 스코빌지수가 k보다 작으면
			if(queue.size() < 2) {	//비교할 지수가 없다면, 즉 합성을 하여도 스코빌지수가 k보다 낮은경우
				return -1;
			}
			int f1 = queue.remove(0);	//제일 안매운 음식을 꺼내어 f1으로 대입
			int f2 = queue.remove(0);	//두번째로 안매운 음식을 꺼내어 f2로 대입
			int newFood = f1 + (f2 * 2);	//음식을 섞어 만든 보다 높은 스코빌지수를 저장
			queue.add(newFood);	//LinkedList객체에 추가
			answer++;	//섞은 횟수 증가
			Collections.sort(queue);	//재 정렬
		}

		return answer;
	}
}
