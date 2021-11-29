package programmers;

//�� ���� ������ ��
class BetweenIntSum {
	private long solution(int a, int b) {
        int start = 0, end = 0;
        long sum = 0;
        
        if (a == b) {	//�б� ó�� if�� ���ڰ����� ���� a�� b�� ���ٸ�
            return a;	//a�� ��ȯ
        } else if (a < b) {	//b�� a���� ũ�ٸ�
            start = a;		//������ a
            end = b;		//���� b
        } else if (b < a) {	//b�� a���� �۴ٸ�
            start = b;		//������ b
            end = a;		//���� a
        }
        
        for (int i = start; i <= end; i++) {	//start ���� end���� 1�� �����ϸ鼭
            sum += i;	//sum�� �ݺ��Ǵ� ����� �����Ѵ�.
        }
        
        return sum;	//sum�� ��ȯ
    }
}
