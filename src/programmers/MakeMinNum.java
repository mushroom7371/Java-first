package programmers;

import java.util.ArrayList;
import java.util.Collections;

//최솟값 만들기
class MakeMinNum {
	private int solution(int [] A, int [] B){
		int answer = 0;
		ArrayList<Integer> ala = new ArrayList();	//정렬을 위해 데이터를 저장할 ArrayList 객체 생성
		ArrayList<Integer> alb = new ArrayList();
		
		for(int i = 0; i < A.length; i++) {	//ArrayList 객체에 인자값으로 주어진 참조변수가 가리키는 배열의 데이터를 추가하여 준다.
			ala.add(A[i]);
		}
		
		for(int i = 0; i < B.length; i++) {
			alb.add(B[i]);
		}
		
		//각 번지의 데이터를 곱하여 더한 결과가 최솟값이 되기 위해서는 가장큰 수는 가장 작은수랑 곱하고, 두번째로 큰수와 두번째로 작은수랑 곱하여야 된다.
		//이를 위한 정렬 작업
		Collections.sort(ala);
		Collections.sort(alb, Collections.reverseOrder());
		
		for(int i = 0; i < ala.size(); i++) {	//큰수와 작은수를 더하여 answer에 더하여 준다.
			answer += ala.get(i) * alb.get(i);
		}

		return answer;
    }
}
