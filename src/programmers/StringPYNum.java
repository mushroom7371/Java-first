package programmers;

//���ڿ� �� p�� y�� ����
class StringPYNum {
	boolean solution(String s) {
        boolean answer = true;
        
        //������ ������ ������ ���� ����
        int p = 0;
        int y = 0;
        
        for(int i = 0; i < s.length(); i++) {	//s�� ���̸�ŭ 1�� �����ϸ鼭 �ݺ�
        	if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){	//�ش� ������ ���ڰ� p �Ǵ� P ��� ���� p�� ���� 1���� ��Ŵ
        		p++;
        	}
        	
        	if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {	//�ش� ������ ���ڰ� y �Ǵ� Y ��� ���� y�� ���� 1���� ��Ŵ
        		y++;
        	}
        }
        
        if(p == y) {	//ī��Ʈ ���ڰ� ��ġ�ϴٸ�
        	answer = true;
        }else {			//�ƴ϶��
        	answer = false;
        }
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("Hello Java");

        return answer;
    }
}
