package ch09;

class StringEx1 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		//String Ŭ������ ���ڿ� ���ͷ��� �����Ͽ� �����ϴ� ���
		
		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");
		//�Ѵ� ��� ������ abc�� ����.
		
		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		//���ڿ� ���ͷ��� �����Ͽ��� ��� ���� �ٸ� ���������� �ٸ� ��ü�� ����Ű�� �� ������,
		//�����δ� �̹� ������ ���ͷ��� ����Ű�� �ִ�. ��, ���������� �ٸ��� ���� �ּҰ��� ����Ų��.
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		//�����ڸ� ���Ͽ� new �����ڷ� �����ϴ� ���
		
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");
		//���������� ���� ������ ����Ѵ�.
		
		System.out.println("str3 == str4 ? " + (str3 == str4));
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
		//String Ŭ������ equals()�޼���� ���Ͽ� ���Ͽ��� �ÿ��� �� ���ڿ��� ������ ���ϱ⿡ true ���� ��ȯ������,
		//�� ���������� �ּҸ� ��񱳿����� '==' �� �̿��Ͽ� ���Ͽ��� �ÿ���
		//new �����ڷ� ���Ͽ� �޸� �Ҵ��� �̷�� ���� ������ ���ο� �ν��Ͻ��� ������ ���̰� �ٸ� �ּҰ��� ����Ű�� �Ǿ�
		//�ּҰ��� ��ġ���� �ʴ´ٴ� ����� ������ �ȴ�.
		
	}
}
