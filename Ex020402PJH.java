package ch03;

class Ex020402PJH	{
	public static void main(String[] args)	{
		
		/*
		���� : �ڹ��� ���� p98 ǥ3-6 ����
		��� : printf�� x%y �Է½� ������ ����� ����
		*/
		
		double f1 = 10.0d;   //���Ѽ�
		double f2 = 0.0d;    //���Ѽ� 

		System.out.printf("x=%.1f y=%.1f x/y=%f x(������ ������)y=%f%n", f1, f2, f1/f2, f1%f2);
		
		double a1 = 10.0d;  // ���Ѽ�
		double a2 = 1/0d;   // infinity
		
		System.out.printf("x=%.1f y=%f x/y=%.1f x(������ ������)y=%.1f%n", a1, a2, a1/a2, a1%a2);
		
		double b1 = 1/0d;   // infiniy
		double b2 = 10.0d;  // ���Ѽ�
		
		System.out.printf("x=%f y=%.1f x/y=%f x(������ ������)y=%f%n", b1, b2, b1/b2, b1%b2);
		
		double c1 = 1/0d;   //infinity
		double c2 = 1/0d;   //infinity
		System.out.printf("x=%f y=%f x/y=%f x(������ ������)y=%f%n", c1, c2, c1/c2, c1%c2);
		
	}
}