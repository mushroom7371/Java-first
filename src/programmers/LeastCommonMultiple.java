package programmers;

//n���� �ּҰ����
class LeastCommonMultiple {
	public int solution(int [] arr) {
		//arr�� ����Ű�� �迭�� ���� ū ���� ����� ���� ������ ����� Ȯ��
		int answer = 0;
		int count = 1;	//���ϱ�� 1���� ����
		
		while(true) {	//�ݺ� Ƚ���� �𸣹Ƿ� ���� �ɶ� ���� �ݺ�
			int checkNum = arr[arr.length - 1] * count++;	//�迭�� ���� ū ���� * count �� count�� 1���� ��Ų��.
			int checkCount = 0;
			
			for(int i = 0; i < arr.length - 1; ++i) {	//���� ���� �� ���� �ι�°�� ū ���ڱ��� �ݺ�
				if(checkNum % arr[i] == 0) {	//���� ū ���� arr�迭�� ����Ű�� �����ͷ� ������ �� 0�̶��
					++checkCount;	//1�� ���� ��Ų��.
				}
			}
			if(checkCount == arr.length - 1) {	//checkCount �� �迭���� ���� ū ���ڸ� ������ ������ ���� ������ ���ٸ�
				answer = checkNum;	//���� ū ������ ����� �ִ������� �ȴ�.
				break;	//���ǿ� �´ٸ� �ݺ��� �������´�
			}
		}
		
		return answer;
	}
}
