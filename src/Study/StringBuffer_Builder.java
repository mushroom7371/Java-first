package Study;

public class StringBuffer_Builder {
	public static void main(String[] args) {
		String str = "hello";
		str = str + " world";
		System.out.println(str);
		//String Ŭ������ �������� str�� ����Ű�� ���� ����� "hello"�� "world"�� ������ ��ó�� ��������
		//����� str�� ������ "hello"�� �ƴ� ���ο� ������ ������ "hello world"�� ����Ű�� �ȴ�
		//���� ������ "hello"�� �������� �����ִٰ� �������÷��ͷ� ���� ������� ��.
		//�̴� String Ŭ������ �Һ� �Ӽ��� ������ �ֱ� ����
		//�̶����� ���ԵȰ��� String_Buffer/Builder
		
		StringBuffer sb = new StringBuffer("hello");
		sb.append(" world");
		System.out.println(sb);
		//���ۿ� ������ �������� ������ ������ append() delete() ��� ���� �޼���� ���� ��ü������ ���ڿ��� �����ϴ� ���� �����ϴ�.
		
	}
}
