package programmers;

import java.util.Arrays;

//����Ʈ
class Lifeboat {
	private int solution(int[] people, int limit) {
		int answer = 0;
		int min = 0;	//�����԰� ���� �������
		
		Arrays.sort(people);	//����
		
		for(int i = people.length -1; i >= min; i--) {	//���� ���ſ� ������� ���� ������ ������� �ݺ� �ǽ�
			if(people[i] + people[min] > limit) {	//���ſ� ����� ������ ����� ������ ���� ����Ʈ�� ���Ѻ��� ũ�ٸ�
				answer++;	//���� ���ſ� ����� ������.
			}else {	//�ƴ϶�� �θ��� ������.
				min++;	//�ݺ����� ������ ���� ����������� ����ȴ�.
				answer++;
			}
		}
		
		return answer;
	}
}
