package programmers;

import java.util.Arrays;

//����
class Budget {
	private int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        Arrays.sort(d);	//�μ��� ��û�� ����
        
        for(int i = 0; i < d.length; i++) {
        	sum += d[i];	//�ּ� ��û�ݺ��� �������� ���Ѵ�.
        	
        	if(sum > budget) {	//���꺸�� �μ��� ��û���� ���� ũ�ٸ�
        		answer = i;	//�ش� �������� ���� �� �ݺ� ������
        		break;
        	}
        }
        
        if(sum <= budget) {	//���� ���� ��û���� ���� ���ٸ�
        	answer = d.length;	//�迭�� ���̸�ŭ�� �μ��� ��������
        }
        
        return answer;
    }
}
