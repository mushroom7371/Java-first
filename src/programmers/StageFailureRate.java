package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//������
class StageFailureRate {
	private int [] solution(int N, int [] stages) {
		Map<Integer, Double> mp = new HashMap<Integer, Double>();	//�ش� ���������� Ű������, �������� ��������� �����ϱ� ���� ����
		int cnt = 0;	//Ŭ���� ���� ���� �ο���
		int player = stages.length;	//�� �ο���
		
		for(int i = 1; i <= N; i++) {	//���������� 1���� N���� 1�� �����ϸ鼭 ����.
			for(int j = 0; j < stages.length; j++) {	//�� �ο��߿� �ش� ���������� Ŭ���� �� �ο��� ���ϱ� ���� �ݺ�
				if(stages[j] == i) {	//�ش� �ο��� ������ ���������� ���� �ݺ����� ���������� ���ٸ�
					cnt++;	//Ŭ���� ���� ���� �ο����� �����Ѵ�.
				}
			}
			
			if(cnt == 0) {	//���������� ��� ����ߴٸ�
				mp.put(i, 0.0);	//�ش� ���������� �������� 0�̴�.
			}else {
				mp.put(i, cnt/(double)player);	//�������� ���Ѵ�.
				player -= cnt;	//�� �ο������� Ŭ���� ���� ���� �ο��� �����Ѵ�.
			}
			cnt = 0;
		}

		List<Entry<Integer, Double>> entryList = new ArrayList<Entry<Integer, Double>>(mp.entrySet());	//EntryŸ���� ���� ArrayList�� �����ϰ�, ������ ������ key, value�� ������ �����Ѵ�.
		entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));	//����(sort)�ϵ�, ������� ��������(comparingByValue) ��������(reverseOrder)���� �Ѵ�.
		
		int [] answer = new int [N];	//�������� ���� �������� ���� ��� �迭
		
		for(int i = 0; i < entryList.size(); i++) {	//entryList�� ũ�⸸ŭ 1�� �����ϸ鼭 �ݺ�
			answer[i] = entryList.get(i).getKey();	//�ش� ������ �����͸� entryList�� Key������ �����Ѵ�.
		}
		
		return answer;
	}
	
}
