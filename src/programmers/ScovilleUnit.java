package programmers;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//�� �ʰ�
class ScovilleUnit {
	private int solution(int [] scoville, int K) {
		int answer = 0;
		List<Integer> queue = new LinkedList();	//Integer Ÿ�Ը� ���� ������ ListŸ���� ���������� �����ϰ� LinkedList ��ü �����Ͽ� �� �ּҸ� ����Ű�� ��.
		
		for(int i=0; i<scoville.length; i++){	//�Ű������� ���� int �迭�� �����ϱ� ���� �ݺ�
			queue.add(scoville[i]);
		}
		
		Collections.sort(queue);	//����
		
		while(queue.get(0) < K){	//�ݺ� Ƚ���� �𸣱� ������ while�� �ݺ�, ���� ���� ���ں������� k���� ������
			if(queue.size() < 2) {	//���� ������ ���ٸ�, �� �ռ��� �Ͽ��� ���ں������� k���� �������
				return -1;
			}
			int f1 = queue.remove(0);	//���� �ȸſ� ������ ������ f1���� ����
			int f2 = queue.remove(0);	//�ι�°�� �ȸſ� ������ ������ f2�� ����
			int newFood = f1 + (f2 * 2);	//������ ���� ���� ���� ���� ���ں������� ����
			queue.add(newFood);	//LinkedList��ü�� �߰�
			answer++;	//���� Ƚ�� ����
			Collections.sort(queue);	//�� ����
		}

		return answer;
	}
}
