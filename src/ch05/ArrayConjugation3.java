package ch05;

import java.util.Arrays;

public class ArrayConjugation3 {
	public static void main(String[] args) {
		int [] bubbleSort = new int[10];
		int temp;
		
		for(int i = 0; i < bubbleSort.length; i++) {
			bubbleSort[i] = (int)(Math.random() * 10 + 1);
		}
		
		for(int i = 0; i < bubbleSort.length-1; i++) {	//정렬 특성상 마지막 번지수는 실행되면 안되기때문에 -1을 붙혀줌
			boolean flag = false;
			//반복을 끝내기위한 논리형 변수
			
			for(int j = 0; j < bubbleSort.length-1-i; j++) {
				//0번지부터 시작하되 마지막 값은 비교할 필요가 없음 선 정렬로 인하여 마지막 번지의 데이터는 최대값이기 때문
				if(bubbleSort[j] > bubbleSort[j+1]) {
					temp = bubbleSort[j];
					bubbleSort[j] = bubbleSort[j+1];
					bubbleSort[j+1] = temp;
					flag = true;
				}
			}
			
			if(!flag) {	//반복마다 flag 값을 true로 변경하기 때문에 ture면 자리바꿈이 일어난 것이므로 조건문이 참이 되어 다시 반복을 실시함
						//하지만 자리바꿈이 일어나지 않았다면 flag 값이 false이므로 참이 아니기에 반복을 종료한다.
				break;
			}
		}
		
		System.out.println(Arrays.toString(bubbleSort));
		
		int [] sort = new int[10];
		
		for(int i = 0; i < sort.length; i++) {
			sort[i] = (int)(Math.random() * 10 + 1);
		}
		
		Arrays.sort(sort);
		//Arrays 클래스에서 제공하는 sort() 메서드를 사용하면 위의 절차 없이 정렬이 완료된다.
		//BubbleSort는 매번 반복하고 확인하기 때문에 시간복잡도가 높다.
		System.out.println(Arrays.toString(sort));
	}
}
