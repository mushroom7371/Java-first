package programmers;

//������ �ݾ� ����ϱ�
class LackOfMoney {
	private long solution(int price, int money, int count) {
        long answer = -1;
        long realPrice = 0;	//N��° �̿� �ݾ׿� ������ ����
        long moneys = 0;	//�ܰ� ������ ����
        
        for(int i = 1; i <= count; i++) {	//1���� count���� 1�� �����ϸ� �ݺ�
        	realPrice += price*i;			//�̿�ݾ� ����
        }
        
        moneys = money - realPrice;	//�ܰ� ���
        
        if(moneys >= 0) {	//�ܰ� 0�̻��̸� �ݾ��� �������� �ʴ�.
        	return 0;
        }else {
        	answer = Math.abs(moneys);	//������� �ش� ����ŭ ������ �ݾ��� ���밪���� ��ȯ
        	return answer;
        }
    }
}
