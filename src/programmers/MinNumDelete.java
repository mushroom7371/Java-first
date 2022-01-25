package programmers;

import java.util.ArrayList;
import java.util.List;

//제일 작은 수 제거하기
class MinNumDelete {
	 private int [] solution(int [] arr) {
	        int [] answer = {};
	        List<Integer> list = new ArrayList<Integer>();
	        //배열의 순서를 바꾸고 싶지 않아서 ArrayList를 생성함.
	        
	        if(arr.length < 2) {	//배열에 담긴 요소가 1개 이하일때는 -1을 반환한다.
	        	answer = new int[] {-1};
	        	return answer;
	        }
	        
	        for(int i = 0; i <arr.length; i++) {	//list가 가리키는 ArrayList 객체에 arr이 가리키는 배열의 요소를 순차적으로 담는다.
	        	list.add(arr[i]);
	        }
	        
	        int min = arr[0];	//최소값을 구하기위한 변수
	        int idx = 0;	//그 최소값을 가지는 위치를 담을 변수
	        
	        for(int i = 0; i < arr.length; i++) {
        		if(min > arr[i]) {	//min의 값이 배열의 i번지 값보다 크다면
        			min = arr[i];	//min의 값을 다시 설정하고
        			idx = i;		//해당하는 번지의 값을 idx 변수에 담는다.
        		}
        	}
        	
        	list.remove(idx);	//ArrayList 객체가 가진 요소중 해당 인덱스의 값을 제거한다.
        	answer = new int[list.size()];	//참조변수 answer를 작은수가 제거된 ArrayList의 크기로 int 타입 배열을 생성하여 가리키게 하고
        	
        	for(int j = 0; j < list.size(); j++) {
        		answer[j] = list.get(j);	//반복하며 요소들을 채워준다.
        	}
	        	
	        return answer;
	 }
}
