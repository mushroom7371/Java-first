package programmers;

//�ζ��� �ְ� ������ ���� ����
class LottoMaximumLowest {
	private int [] solution(int [] lottos, int [] win_nums) {
        int [] answer = {};
        int hide = 0;	//������ ����
        int lowest = 7;	//���� ���
        
        for(int i = 0; i < lottos.length; i++) {	//�ζ� �迭�� ���̸�ŭ 1�� �����ϸ� �ݺ�
        	
        	if(lottos[i] == 0) {	//�ش� ������ ���� 0�̶�� ������ ������ ī��Ʈ�� �þ��.
        		hide++;
        	}
        	
        	for(int j = 0; j < win_nums.length; j++) {	//��÷ �迭�� ���̸�ŭ 1�� �����ϸ� �ݺ�
        		if(lottos[i] == win_nums[j]) {	//������ �ζ� ��ȣ�� �����̶��
        			lowest--;	//����� 1�� ��������.
        		}
        	}
        }
        
        if(lowest == 7) {	//lowest ������ 7�� �����Ͽ��⿡, �ϳ��� ��ġ���� �ʴ� ��쿡 ���� ����� 6������ ����
        	lowest = 6;
        }
        
        if(hide == 0) {	//������ ��ȣ�� ���ٸ�,
        	answer = new int [] {lowest, lowest};	//��ġ�ϴ� ��ȣ�� �ְ�,���� ����� �ȴ�.
        }else if(hide >= 6) {	//��� ���ڰ� �������ٸ�
        	answer = new int [] {1, 6};	//�ְ�,���� ����� 1 �� 6�̴�.
        }else {	//������ ��ȣ�� 1~5�� ���̶��
        	answer = new int [] {lowest - hide, lowest};	//�ְ� ����� ������ ���ڸ� �� ���� �ȴ�. ������ ����
        }

        return answer;
    }
}
