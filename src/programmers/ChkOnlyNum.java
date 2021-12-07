package programmers;

//���ڿ� �ٷ�� �⺻
class ChkOnlyNum {
	 private boolean solution(String s) {
	        boolean answer = true;
	        //String Ÿ���� ���� s�� ��� ���������̸� String ��ü�� �ּҸ� ����Ų��. �� ��ü�� char ���ڰ� �迭�� ����Ǿ��ִ�.
	        
	        if(s.length() != 4 && s.length() != 6) {	//���ڿ� s�� ���̰� 4 �׸��� 6�� �ƴ϶��
	        	return false;
	        }
	        
	        for(int i = 0; i < s.length(); i++) {	//���ڿ��� ���̸�ŭ 1�� ���� �ϸ鼭 �ݺ��Ѵ�.
	        	if(s.charAt(i) < '0' || s.charAt(i) > '9') {
	        		//String ��ü�� char�� �����̹Ƿ� charAt() �޼��带 ���Ͽ� �ش� ������(�ε���)�� ������ ���ڸ� Ȯ���Ѵ�.
	        		//�ش� �ε����� ���� '0' �̸� �Ǵ� '9' �ʰ���� ���� ���ڰ� �ƴ϶�� �ǹ��̴�.
	        		return false;
	        	}
	        }
	        
	        return answer;
	    }
}
