package programmers;

//�Ҽ� �����
class PrimePlus {
	private int solution(int[] nums) {
		int answer = 0;
        
		//nums�� ��� ���� 3���� ���ϱ�
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; i < nums.length; j++) {
				for(int k = j + 1; k < nums.length; k++) {
					int n = nums[i] + nums[j] + nums[k];
					if(PrimeNum(n)){	//���� ���� �Ҽ� ������ �Ͽ� ���̶��
						answer++;		//������ ���� ��Ų��.
					}
				}
			}
		}

		return answer;
	}
 
	 private boolean PrimeNum(int num) {	//�Ҽ� �Ǻ� �޼���
		for(int i = 2; i < num; i++) {		//�Ҽ��� 1�� �ڱ��ڽ��� ���� �� ���� ������ ����
			if(num % i == 0) {	//������ ������ ��ȯ
				return false;			
			}
		}
	 	return true;
	}
 
}
