package ch03;

public class Exercise3_8 {

	/*
	������ : 20210204
	���� : ��������
	������ : ����ȭ
	*/
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a + b;
		
		char ch = 'a';
		ch = (char)(ch + 2);
		
		float f = 3 / 2f;
		long l = 3000 * 3000 * 3000l;
		
		float f2 = 0.1f;
		double d = (float)0.1;
		
		boolean result = d==f2;
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);

	}

}
