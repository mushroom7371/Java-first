package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//k번째 수
class KthNum {
	private int [] solution(int [] array, int [][] commands) {
		int [] answer = {};
		answer = new int [commands.length];	//정답이 담길 배열, 크기는 2차원 배열의 첫번째 배열의 크기만큼이다.
		
		for(int i = 0; i < commands.length; i++) {	//참조변수 commands 가 가리키는 첫번째 배열의 크기만큼 반복.
			List<Integer> list = new ArrayList();	//정렬을 위해 생성한 ArrayList 객체
			
			for(int j = commands[i][0]-1; j < commands[i][1]; j++) {
				//첫번째 배열의 i번지가 가리키는 두번째 배열의 0번지, 즉 첫번째 시작지점이 된다. 배열은 0번지부터 시작하니 -1을 해준다.
				//마찬가지로 끝 지점은 두번째 배열의 1번지가 되며 보다 작다는 조건으로 그대로 사용하였다.
				list.add(array[j]);	//array배열의 j번지는 자른 부분이 된다.
			}
		Collections.sort(list);	//정렬
		answer[i] = list.get(commands[i][2] - 1);	//k번째 수 또한 배열이 0번지부터 시작하므로 -1을 해준다.
			
		}
		return answer;
	}
}
