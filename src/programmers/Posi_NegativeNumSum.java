package programmers;

//���� ���ϱ�
class Posi_NegativeNumSum {
	private int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		for(int i = 0; i < absolutes.length; i++) {	//���ڰ����� ���� �迭�� ���̴� �����Ͽ� �� �迭�� ���̸�ŭ 1�� �����ϸ� �ݺ�
			if(signs[i] == true) {	//���� ���� signs�� ����Ű�� �迭�� i������ ���� ���̶��
				answer += absolutes[i];	//����̹Ƿ� ���Ѵ�.
			}else {	//�ƴ϶��
				answer += -absolutes[i];	//����.
			}
		}
		
		return answer;
	}
}
