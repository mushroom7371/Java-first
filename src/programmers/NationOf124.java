package programmers;

class NationOf124 {
	public String solution(int n) {
		String answer = "";
		int countNum = n;

        while(countNum > 0){ //�־��� ������ ����� ��츸 �ݺ�
            if (countNum % 3 == 0){	//3���� �������� �������� 0�̶��
                answer = "4" + answer;	//���信 �տ� 4�� ���Ѵ�.
            }else if(countNum % 3 == 1){	//�������� 1�̶��
                answer = "1" + answer;
            }else{	//�������� 2���
                answer = "2" + answer;
            }
            countNum /=3;
        }
		
		
		return answer;
    }
}
