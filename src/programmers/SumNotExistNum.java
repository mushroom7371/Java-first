package programmers;

//���� ���� ���ϱ�
class SumNotExistNum {
	//���� ������ ���������� ������ int ���� ������ 1���� �迭�� ����Ų��.
	private int solution(int [] numbers) {
		int answer = 45;	//0~9������ ������ �� ���� 45
		
		for(int number : numbers) {	//���� for ���� �̿��Ͽ� �迭�� ��� ��ҵ��� int Ÿ�� ���� number�� ���
			answer = answer - number;	//�ݺ����� ������ answer���� number�� ���� ���� �Ѵ�.
		}
		
		return answer;
	}
}
