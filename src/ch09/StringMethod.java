package ch09;

class StringMethod {

	public static void main(String[] args) {
		char [] c = {'h', 'e', 'l', 'l', 'o'};
		String s = new String(c);
		System.out.println(c);
		//char Ÿ���� �迭�� ���ڿ� �ν��Ͻ��� ���� �� �ִ�.
		
		char c1 = s.charAt(4);
		System.out.println(c1);
		//������ ��ġ(������)�� �ִ� ���ڸ� �˷��ش�.
		
		String s1 = s.concat(" world");
		System.out.println(s1);
		//���ڿ��� �ڿ� ��������.
		
		boolean b = s.equals("hello");
		System.out.println(b);
		//�Ű������� ���� ���ڿ��� String�ν��Ͻ��� ���ڿ��� ���Ѵ�. ���̸� true�� ��ȯ
		
		int idx = s.indexOf("e");
		int idx1 = s.indexOf("ell");
		System.out.println(idx);
		System.out.println(idx1);
		//�־��� ���ڰ� ���ڿ��� �����ϴ��� Ȯ���Ͽ� ��ġ�� �˷��ش�. ���ٸ� -1�� ��ȯ
		
		int length = s.length();
		System.out.println(length);
		//���ڿ��� ���̸� ��ȯ �迭���� ���� �����
		
		String ab = s.replaceAll("ll", "LL");
		System.out.println(ab);
		//���ڿ��߿��� ������ ���ڿ��� ��ġ�ϴ� ���� ���ο� ���ڿ��� �����Ѵ�.
		
		String animals = "dog,cat,cow";
		String [] arr = animals.split(",");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//���ڿ��� ������ �и��ڷ� ���� ���ڿ��� ��� ��ȯ�Ѵ�.
		
		String sub = "123.abc.ABC";
		String sub1 = sub.substring(8);
		String sub2 = sub.substring(0, 3);
		System.out.println(sub1);
		System.out.println(sub2);
		//�־��� ���� ��ġ���� �� ������ ���Ե� ���ڿ��� ��´�. �̶� �� ��ġ�� ���ڴ� ���Ե��� �ʴ´�.
		
		String lower = s.toLowerCase();
		String upper = s.toUpperCase();
		System.out.println(lower);
		System.out.println(upper);
		//�ش� ���ڿ��� ��� �ҹ��� �Ǵ� �빮�ڷ� ��ȯ�Ͽ� ��ȯ�Ѵ�.
		
		String trim = "   Trim   Ex     ";
		String trimResult = trim.trim();
		System.out.println(trimResult);
		//���ڿ��� ���� ����, �������� ������ �����Ѵ�. �߰� ������ �������� �ʴ´�.
		
	}

}
