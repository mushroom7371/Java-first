package programmers;

//�ڿ��� ������ �迭�� �����
class ReverseIntDigit {
	private int [] solution(long n) {
		int [] arr = new int [(int)(Math.log10(n)+1)];
		//���ڰ����� ���� ������ �ڸ����� ���ϰ�, int Ÿ������ ����ȯ �Ѵ�.
        long num = n;
        
        int remainder = 0;	//������ ���� �������� ���� �� ����
        for(int i = 0; i < (int)(Math.log10(n)+1); i++){	//0���� �ڸ��� ��ŭ 1�� �����鼭 �ݺ��Ѵ�.
            remainder = (int)(num % 10);	//10���� ������ ���� �������� ������ ���,
            arr[i] = remainder;				//�迭�� i������ �ش��ϴ� �ڸ��� �����͸� ������
            num = num / 10;					//10���� ���� ������ ���� ������. ���� Ÿ������ �������� ��������.
        }
        return arr;
    }
}
