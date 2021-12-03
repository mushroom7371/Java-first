package programmers;

import java.util.ArrayList;
import java.util.List;

//���� ���� �� �����ϱ�
class MinNumDelete {
	 private int [] solution(int [] arr) {
	        int [] answer = {};
	        List<Integer> list = new ArrayList<Integer>();
	        //�迭�� ������ �ٲٰ� ���� �ʾƼ� ArrayList�� ������.
	        
	        if(arr.length < 2) {	//�迭�� ��� ��Ұ� 1�� �����϶��� -1�� ��ȯ�Ѵ�.
	        	answer = new int[] {-1};
	        	return answer;
	        }
	        
	        for(int i = 0; i <arr.length; i++) {	//list�� ����Ű�� ArrayList ��ü�� arr�� ����Ű�� �迭�� ��Ҹ� ���������� ��´�.
	        	list.add(arr[i]);
	        }
	        
	        int min = arr[0];	//�ּҰ��� ���ϱ����� ����
	        int idx = 0;	//�� �ּҰ��� ������ ��ġ�� ���� ����
	        
	        for(int i = 0; i < arr.length; i++) {
        		if(min > arr[i]) {	//min�� ���� �迭�� i���� ������ ũ�ٸ�
        			min = arr[i];	//min�� ���� �ٽ� �����ϰ�
        			idx = i;		//�ش��ϴ� ������ ���� idx ������ ��´�.
        		}
        	}
        	
        	list.remove(idx);	//ArrayList ��ü�� ���� ����� �ش� �ε����� ���� �����Ѵ�.
        	answer = new int[list.size()];	//�������� answer�� �������� ���ŵ� ArrayList�� ũ��� int Ÿ�� �迭�� �����Ͽ� ����Ű�� �ϰ�
        	
        	for(int j = 0; j < list.size(); j++) {
        		answer[j] = list.get(j);	//�ݺ��ϸ� ��ҵ��� ä���ش�.
        	}
	        	
	        return answer;
	 }
}
