package programmers;

//�������� �ʴ� ���� ���ϱ�
class NotExistsNum {
	private int solution(int [] numbers) {
		int answer = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
		}
		
		answer = 45 - answer;	//0~9������ ���� 45�� �����Ǿ��ֱ� ����
		
		return answer;
	}
}
