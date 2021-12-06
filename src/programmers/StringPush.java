package programmers;

class StringPush {
	private String solution(String s, int n) {
		String answer = "";
		 
        for(int i = 0; i < s.length(); i++){	//s�� ���̸�ŭ 1�� �����ϸ� �ݺ�
        	char ch = s.charAt(i);
            
        	if(Character.isLowerCase(ch)){		//�ҹ����� ���
        		ch = (char)((ch-'a'+n)%26 + 'a');
        	}
        	else if(Character.isUpperCase(ch)){ //�빮���� ���
        		ch = (char)((ch-'A'+n)%26 + 'A');
        	
        	} answer += ch;
        }
        
        return answer;
    }
	
}
