package programmers;

import java.util.Arrays;

//�������� ���� ���� ã��
class NotCompletion {
	private String solution(String [] participant, String [] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		//�����ڿ� �������� ������ ��� �迭�� ���� ������� ���� �Ѵ�.
		
		String answer = null;
		//�������� ���� ����� ��� ����
		
		int i = 0;	//�迭�� 0�������� �����ϹǷ�
		while(i < completion.length) {	//�������� ������ ��� �迭�� ���� ������ �ݺ�
			if(!participant[i].equals(completion[i])) {	//�����ڿ� �����ڰ� ���� �ʴٸ�
				answer = participant[i];	//�����ڴ� �������� ���� �ο��̹Ƿ� �̸� ��ȯ
				return answer;
			}
			i++;
		}	//�ش��ϴ� �ݺ����� ���ǿ� �´� �ο��� ������ ��� ����
		
		return participant[i];
	}
}
