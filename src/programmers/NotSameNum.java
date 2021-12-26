package programmers;

import java.util.ArrayList;

//같은 숫자는 싫어
class NotSameNum {
	public int [] solution(int [] arr) {
		int [] answer = {};
		ArrayList<Integer> al = new ArrayList();	//정답을 담을 ArrayList객체 생성 제너릭을 통해 타입 안정성을 갖춘다.
		int num = 10;	//중복되는 숫자를 저장하기 위한 변수
		
		for(int i = 0; i < arr.length; i++) {	//문제 배열의 길이만큼 1씩 증가면서 반복
			if(arr[i] != num) {	//첫 실행시는 무조건 들어가게 되어있음
				al.add(arr[i]);	//arr배열의 i 번지의 데이터가 추가된다.
				num = arr[i];	//조건문에서 거르기 위해 중복되는 데이터를 num으로 설정한다.
			}
		}
		
		answer = new int[al.size()];	//배열의 길이를 재설정
		for(int i = 0; i < al.size(); i++) {
			answer[i] = al.get(i);	//정답을 배열로 옮긴다.
		}
		
		return answer;
    }
}
