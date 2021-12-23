package programmers;

import java.util.HashMap;
import java.util.Map;

//ü���� (�׽�Ʈ ���̽��� �߰��Ǿ��µ� ���� ������ �ȵǾ� ����� �ȵ�)
class GymSuit {
	 private int solution(int n, int [] lost, int [] reserve) {
		int answer = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(n);	//ü���� ��Ȳ�� ������ HashMap
		
		for(int i = 1; i <= n; i++) {	//1�� �л����� n��° �л����� 1�� �����ϸ鼭 �ݺ�
			map.put(i, 1);	//�ʱ� ������ ���� ü������ �ִ� ����
			
			for(int j = 0; j < lost.length; j++ ) {	//ü������ �Ҿ���� �л��� ������ ��� �迭��ŭ �ݺ�
				if(lost[j] == i) {	//�Ҿ���� �л��� i�� �л��̶��
					map.replace(i , 0);	//�� �л��� value ���� ü������ �ִ� 1 ���¿��� �Ҿ���� 0 ���·� ����
				}				
			}
			
			for(int k = 0; k < reserve.length; k++) {	//ü���� ������ �ִ� �л��� ������ ��� �迭��ŭ �ݺ�
				if(reserve[k] == i) {	//������ �ִ� �л��� i�� �л��̶��
					map.put(i, map.get(i) + 1);	//ü���� ������ + 1 �Ѵ�.
				}
			}			
		}
		
		for(int j = 1; j <= n; j++) {	//1������ n��° �л����� 1�� �����ϸ鼭 �ݺ�
			if(map.get(j) == 0) {	//j�� �л��� ü������ �Ҿ���ȴٸ�
				if( j != n && map.get(j + 1) == 2) {	//�Ҿ���� �л��� ������ �л��� �ƴϰ�, ���� �л��� �������� �ִٸ�
					map.put(j, 1);	//�Ҿ���� �л��� ü������ ���� 1 ���·� ����
					map.put(j + 1, 1);	//������ �л� ���� �������� ���� 1 ���·� ����
				}else if(j != 1 && map.get(j - 1) == 2 ) {	//�Ҿ���� �л��� ù��° �л��� �ƴϰ�, ���� �л��� �������� �ִٸ�
					map.put(j, 1);	//���� ��������
					map.put(j - 1, 1);	//���� ��������
				}
			}
		}
		
		for(int k = 1; k <= n; k++) {	//1�� �л����� n��° �л����� 1�� �����ϸ鼭 �ݺ�
			if(map.get(k) > 0) {	//ü������ �ִ� ���¶��
				answer++;	//������ ���� ������ �л��� ���� �þ��
			}
		}
		
		return answer;
	 }
}
