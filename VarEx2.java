package ch02;

/*
 * 두 변수의 값을 교환하기 위해서 임시로 저장할 변수를 선언함
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
