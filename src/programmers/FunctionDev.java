package programmers;

//��� ����
class FunctionDev {
	public int [] solution(int [] progresses, int [] speeds) {
		int [] tmp = new int[100];	//�۾��� ������ 100 �����̹Ƿ�
		int day = 0;	//tmp�� ������ ������ ��
		
		for(int i = 0; i < progresses.length; i++) {	//progresses�� ����Ű�� �迭�� ũ�⸸ŭ 1�� �����ϸ� �ݺ�
			while(progresses[i] + (speeds[i] * day) < 100) {	//�ش� ���μ����� ���డ 100�� �������� day�� ����
				day++;	//�ϼ��� �þ��.
			}
			
			tmp[day]++;	//day ������ �����͸� 1 ���� ��Ų��. (day������ ������ ������ ���μ����� �þ��.)
		}
		
		int count = 0;
		
		//tmp�� �� �迭�� ���̸� ���ϱ� ���� �ڵ�
		//tmp�� �ʱ⿡ 0���� ���� �Ǿ� �����Ƿ� 0�� �ƴ� ���� ����
		for(int n : tmp) {
			if(n != 0) {
				count++;	//n�� 0�� �ƴ϶�� �ش� day�� ������ ������ �۾��� �����Ƿ� count�� �����Ѵ�.
			}
		}
		
		int [] answer = new int[count];	//������ ������ day ��ŭ�� ���̸� ���� �迭�� ����
		
		count = 0;	//�ʱ�ȭ
		for(int n : tmp) {
			if(n != 0) {
				answer[count++] = n;	//tmp���� ������ ������ ���μ����� ���� ����ִ�. �̸� answer�� �ִ´�.
			}
		}
		
		return answer;
	}
}
