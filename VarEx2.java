package ch02;

/*
 * �� ������ ���� ��ȯ�ϱ� ���ؼ� �ӽ÷� ������ ������ ������
 */

class VarEx2	{
	public static void main(String[] args)	{
		int x = 10, y = 20;
		int tmp = 10;
		
		System.out.println("x:"+ x + " y:" + y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x:"+ x + " y" + y);
		

	}

}
