package programmers;

//���� ������ �Ǻ�
class SquareRoot {
	private long solution(int n) {
		Double sqrt = Math.sqrt(n);
		//���ڰ����� ���� ���� Math.sqrt()�޼��带 ���Ͽ� �������� ���Ѵ�.
		//�������� ������ �������� ���� ��찡 �����Ƿ� Ÿ���� Double�� ����
	      
	     if(sqrt == sqrt.intValue()){	//������ ���� ������ �������ٸ�,
	    	 //parseInt()�� intValue()�� ��������
	    	 //parseInt()�� ��� static �޼���� ��ä ���� ���� parameter�� �־��ָ� ��� �����ϸ� string�� ��ü���� int�� ���� �̾� ����.
	    	 //intValue()�� ��� static �� �ƴ϶� Integer ��ü���� int�� ���� �̾Ƴ���.
	    	 
	        return (long)Math.pow(sqrt + 1, 2);
	        //pow()�޼���� ������ ���Ͽ� �ִ� �޼���� ��ȯ���� double Ÿ���̴�. �޼��� ���ϰ��� ���� long Ÿ������ ����ȯ �Ͽ� ��ȯ�Ѵ�.
	        
	     } else return -1;
	}
}
