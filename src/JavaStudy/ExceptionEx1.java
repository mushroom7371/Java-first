package JavaStudy;

public class ExceptionEx1 {
	public static void main(String args[]) {
		int arr[] = new int[10];	//int Ÿ���� �迭�� �����ϴ� �������� arr�� �����ϰ�
									//���� 10�� ���ο� �迭�� �����Ͽ� �� �ּҰ��� �����Ѵ�.
		
		try {	//���ܰ� �߻� �� ���ִ� �κ��� ���Ѵ�.
			arr[20] = 10;	//���̰� 10�� �迭�� 20������ ���� 10���� �ʱ�ȭ �Ϸ��� �ϱ⿡ ������ �߻�
		}catch(Exception e) {	//������ �߻� �Ͽ����� ����Ǵ� �κ� �����ھȿ��� ��Ȯ��
								//IndexOutOfBoundsException�� ���� �ǳ� Exception�� ��ӹ޴� Ŭ�����̹Ƿ� �������
			System.out.println("�����߻�!!");
		}finally {
			System.out.println("����� ���� �߻� ���ο� ������� ������ ����!");
			//finally ������ ��� ������ ������ ����ǳ� �����ص� �Ǵ� �����̴�
		}
	}
}
