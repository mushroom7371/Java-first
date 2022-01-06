package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//k��° ��
class KthNum {
	private int [] solution(int [] array, int [][] commands) {
		int [] answer = {};
		answer = new int [commands.length];	//������ ��� �迭, ũ��� 2���� �迭�� ù��° �迭�� ũ�⸸ŭ�̴�.
		
		for(int i = 0; i < commands.length; i++) {	//�������� commands �� ����Ű�� ù��° �迭�� ũ�⸸ŭ �ݺ�.
			List<Integer> list = new ArrayList();	//������ ���� ������ ArrayList ��ü
			
			for(int j = commands[i][0]-1; j < commands[i][1]; j++) {
				//ù��° �迭�� i������ ����Ű�� �ι�° �迭�� 0����, �� ù��° ���������� �ȴ�. �迭�� 0�������� �����ϴ� -1�� ���ش�.
				//���������� �� ������ �ι�° �迭�� 1������ �Ǹ� ���� �۴ٴ� �������� �״�� ����Ͽ���.
				list.add(array[j]);	//array�迭�� j������ �ڸ� �κ��� �ȴ�.
			}
		Collections.sort(list);	//����
		answer[i] = list.get(commands[i][2] - 1);	//k��° �� ���� �迭�� 0�������� �����ϹǷ� -1�� ���ش�.
			
		}
		return answer;
	}
}
