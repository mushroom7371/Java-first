package JavaStudy;

public class ExceptionEx2 {
	public static void main(String [] args) {
		int x = 10;
		int y = 0;
		
		try {
			int k = divide(x, y);
			//divide �޼��带 ȣ�� �ϰ� ���ϰ��� �����Ϸ� �ϴµ� ���ܰ� �߻��� �� �ִ� ����
		}catch(ArithmeticException a) {
			System.out.println("���� �߻�" + a.toString());
			//����ó���� ����ϵ� a.toString�� �̿��Ͽ� ��� ���ܰ� ��Ÿ������ ������ټ��ִ�.
		}
		
	}
	
	public static int divide(int x, int y) throws ArithmeticException {
		//����ó���� ���� �޼��� ArithmeticException�� �����ϱ� ������ �ǵ������� throws�� ����Ͽ���.
		int k = x / y;	//���� Ÿ���� ������ 0���� ������ �Ǵ� ��찡 ����� ����
		return k;
	}
}
