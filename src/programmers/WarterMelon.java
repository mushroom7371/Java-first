package programmers;

//���ڼ��ڼ��ڼ�
class WarterMelon {
	private String solution(int n) {
		String answer = "";
		
		for(int i = 0; i < n; i++) {	//���ڰ����� ���� ���� ���� 1�� �����ϸ鼭 �ݺ�
			if(i % 2 == 0) {	//¦���� ���
				answer = answer + "��";	//answer �� "��" �� ���Ѵ�.
			}
			
			if(i % 2 == 1) {	//Ȧ���� ���
				answer = answer + "��";	//answer �� "��" �� ���Ѵ�.
			}
		}
		
		return answer;
	}
}
