package programmers;

//���￡�� �輭�� ã��
class FindKim {
	private String solution(String[] seoul) {
        String answer = "";
        
        for(int i = 0; i < seoul.length; i++) {	//�־��� �迭�� ���̸�ŭ �ݺ�
        	if(seoul[i].equals("Kim")) {
        		//==�� ���ϴ� ���� ��ü�� �ּҰ� ������ ���ϴ� ���̹Ƿ� �ؽ�Ʈ ������ ���ϱ� ���ؼ���
        		//equals()�޼���� Ȯ���ؾ� ��. ���÷� String a = new String("123")�� String b = new String("123")��
        		//���� 123������, ��ü�� �ٸ���.
        		answer = "�輭���� " + i + "�� �ִ�";
        		break;	//������ 1���̹Ƿ� ã���� �׸��д�.
        	}
        }
        
        return answer;
    }
}
