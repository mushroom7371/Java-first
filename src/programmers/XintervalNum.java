package programmers;

//x��ŭ ������ �ִ� n���� ����
class XintervalNum {
	public long [] solution(int x, int n) {	//���ڷ� int ���� �ް� ��ȯ�� long Ÿ������ ��ȯ
		long [] answer = new long [n];	//n���� �����͸� ������ ���̹Ƿ� ũ��� n�� �ȴ�.
		
		for(long i = 1; i <= n; i++) {	//1���� n���� 1�� �����ϸ鼭 �ݺ�
			answer[(int)i-1] = i*x;	//�迭�� ������ int������ �ޱ⿡ long Ÿ���� ����ȯ �Ѵ�.
		}		
		
		return answer;
	}
}
