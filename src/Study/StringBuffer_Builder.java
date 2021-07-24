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
		
		String s = "abcdefg";
        StringBuffer sb1 = new StringBuffer(s); // String -> StringBuffer
		
        System.out.println("ó�� ���� : " + sb1); //ó������ : abcdefg
        System.out.println("���ڿ� String ��ȯ : " + sb1.toString()); //String ��ȯ�ϱ�
        System.out.println("���ڿ� ���� : " + sb1.substring(2,4)); //���ڿ� �����ϱ�
        System.out.println("���ڿ� �߰� : " + sb1.insert(2,"�߰�")); //���ڿ� �߰��ϱ�
        System.out.println("���ڿ� ���� : " + sb1.delete(2,4)); //���ڿ� �����ϱ�
        System.out.println("���ڿ� ���� : " + sb1.append("hijk")); //���ڿ� ���̱�
        System.out.println("���ڿ��� ���� : " + sb1.length()); //���ڿ��� ���̱��ϱ�
        System.out.println("�뷮�� ũ�� : " + sb1.capacity()); //�뷮�� ũ�� ���ϱ�
        System.out.println("���ڿ� ���� ���� : " + sb1.reverse()); //���ڿ� ������
        System.out.println("������ ���� : " + sb1); //���������� : kjihgfedcba
        
        String s2 = "abcdefg";
        StringBuilder sb2 = new StringBuilder(s2); // String -> StringBuilder
		
        System.out.println("ó�� ���� : " + sb2); //ó������ : abcdefg
        System.out.println("���ڿ� String ��ȯ : " + sb2.toString()); //String ��ȯ�ϱ�
        System.out.println("���ڿ� ���� : " + sb2.substring(2,4)); //���ڿ� �����ϱ�
        System.out.println("���ڿ� �߰� : " + sb2.insert(2,"�߰�")); //���ڿ� �߰��ϱ�
        System.out.println("���ڿ� ���� : " + sb2.delete(2,4)); //���ڿ� �����ϱ�
        System.out.println("���ڿ� ���� : " + sb2.append("hijk")); //���ڿ� ���̱�
        System.out.println("���ڿ��� ���� : " + sb2.length()); //���ڿ��� ���̱��ϱ�
        System.out.println("�뷮�� ũ�� : " + sb2.capacity()); //�뷮�� ũ�� ���ϱ�
        System.out.println("���ڿ� ���� ���� : " + sb2.reverse()); //���ڿ� ������
        System.out.println("������ ���� : " + sb2); //���������� : kjihgfedcba
		
		
	}
}
