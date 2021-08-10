package ch09;

class HashCodeEx1 {
	public static void main(String[] args) {
		String str1 = new String("123");
		String str2 = new String("123");
		//�⺻������ String Ÿ���� ��ü�� ���� �����̸� ���� ��ü�� ����Ų��.
		
		System.out.println(str1.equals(str2));
		//equals()�޼��带 ���Ͽ� ���� ��ü���� Ȯ�� �� ���ִ�.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//hashCode()�޼���� �ؽ� ����� ���Ǵ� �ؽ��Լ��� ������ ������
		//�ؽ��Լ��� ã���� �ϴ� ���� �Է��ϸ� �� ���� ����� ��ġ�� �˷��ִ� �ؽ��ڵ带 ��ȯ�Ѵ�.
		//���� ��� ���� ��ü�� ����Ű�� ����� ��ġ�� �����Ƿ� ��°��� �����ϴ�.
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		//System.identityHashCode() �޼���� ���� hashCode() �޼��� ó�� ��ü�� �ּҰ��� ������ �ؽ��ڵ带 �����ϱ� ������
		//��� ��ü�� ���ؼ� �׻� �ٸ� �ؽ��ڵ尪�� ��ȯ�ϰ� �ȴ�.
		//str1�� str2�� �ؽ��ڵ�� ������, �� ���� ���� �ٸ� ��ü�̴�.
	}
}
