package programmers;

//��� ����
class FunctionDev {
	public int [] solution(int [] progresses, int [] speeds) {
		int [] tmp = new int[100];	//�۾��� ������ 100 �����̹Ƿ�
		int day = 0;	//tmp�� ������ ������ ��
		
		for(int i = 0; i < progresses.length; i++) {	//progresses�� ����Ű�� �迭�� ũ�⸸ŭ 1�� �����ϸ� �ݺ�
			while(progresses[i] + (speeds[i] * day) < 100) {	//�۾� ���൵�� 100���� �۴ٸ�
				day++;	//�ϼ��� �þ��.
			}
			
			tmp[day]++;
		}
		
		int count = 0;
		
		for(int n : tmp) {
			if(n != 0) {
				count++;
			}
		}
		
		int [] answer = new int[count];
		
		count = 0;
		for(int n : tmp) {
			if(n != 0) {
				answer[count++] = n;
			}
		}
		
		return answer;
	}
}
