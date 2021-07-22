package AlgorithmStudy;

public class DynamicProgramming {
	
	//������ �Ǻ���ġ ������ ���ϱ� ���� �޼���
	public static int fibonacci(int n) {	//static �޼���� Ŭ������ �޸𸮿� ����ɶ� ��ü ���� ��밡��
        if(n == 0) 
            return 0;
        else if(n == 1) 
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
        //���� ���������� �ƴҽ� �ڱ� �ڽ��� �޼��带 ȣ���ϵ�(���) �Ű������� �����Ͽ� �ش�.
    }
	
	public static int fibonacci_dp(int n) {
        int[] fib = new int[n > 2 ? n + 1 : 3];
        //���� �����ڸ� ���Ͽ� �迭�� ũ�⸦ n>2 �϶� n+1��ŭ, �ƴҽ� 3�� ũ��� �����Ѵ�
        //���� 10�� ���� �Ű������� �ԷµǸ� �迭�� ũ��� 11�� ��
        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 1;
        //0,1,2 ������ ���� ������ ���ڷ� �ʱ�ȭ �Ѵ�
        
        for(int i = 2; i <= n; i++) {
        	//i�� ���� 2���� �����Ͽ� �Ű������� �Էµ� ������ �ݺ��� �����Ѵ�. (�� �� �������� ���� �̸� �����Ͽ���)
            fib[i] = fib[i - 1] + fib[i - 2];
            //i������ �����ʹ� (i-1������ ������) + (1-2������ ������)�� ����ȴ�.
            //�̴� �Ǻ���ġ ������ ������ ������
        }
        
        return fib[n];
        //�Ű������� ���� n�� ���� �ش��ϴ� ������� ��ȯ�Ѵ�.
        //�Ǻ���ġ ������ Ư������ ���Ͽ� 0,1,2 ������ ���� ������ �ʱ�ȭ�� �����ͷ� ��ȯ
    }
	
	public static void main(String[] args) {
		int result1 = 0;
		int result2 = 0;
		
		result1 = fibonacci(10);
		result2 = fibonacci_dp(10);
		
		System.out.println(result1);
		System.out.println(result2);
		
	}
}
