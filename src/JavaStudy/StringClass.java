package JavaStudy;

public class StringClass {
	public static void main(String args []) {
		String str1 = "Hello";	//String Ŭ������ ���� �ν��Ͻ��� ������ ���� new ��ɾ �ʿ����.
		String str2 = "Hello";
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		if(str1 == str2) {
			System.out.println("str1 �� str2�� �����ϴ�.");
			//Hello�� ����� ����Ǵ� ����? �� �����Ǵ� �迭�̰� str1���� ������� �迭�� �����Ƿ�
			//srt2�� �̹� ������� �迭�� �ּҰ��� �����ϰ� �Ǿ� ���� �ּҰ��� �����Ƿ� ���ǹ��� ���� �ȴ�.
		}
		
		if(str1 == str3) {
			System.out.println("str1 �� str3�� �����ϴ�.");
			//�������? �� ������� �ν��Ͻ��� str3�� ���Ͽ� ���� ������ �ν��Ͻ��� ��� ���� ���ڿ��� ������ ������
			//�ּҰ� �ٸ��� ������ �� ���� ���ǹ����� ������ �ȴ�.
		}
		
		if(str3 == str4) {
			System.out.println("str3 �� str4�� �����ϴ�.");
			//���������� str3�� str4�� ���� Ŭ������ String���� ������ �ν��Ͻ�����
			//���� �ٸ� �ּҰ��� ������ �ν��Ͻ��̹Ƿ� ���� �ʴ�.
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3 �� str4�� ���ڴ� ���� �����ϴ�.");
			//���� ���ÿʹ� �ٸ��� ���ǽ� ���� ������ String Ŭ������ ���� ������� �ν��Ͻ��� ����� �ϳ���
			//equals �޼��带 ȣ���Ͽ� �ܼ��ϰ� ����� ������ ���� �������� Ȯ���ϱ⿡ ���� �ȴ�.
		}
	}
}
