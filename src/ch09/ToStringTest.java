package ch09;

import java.util.Date;

class ToStringTest {
	public static void main(String[] args) {
		String str = new String("KOREA");
		Date today = new Date();
		
		System.out.println(str);
		System.out.println(str.toString());
		//String Ŭ���������� toString() �޼���� Object Ŭ������ toString() �޼��带 �������̵�(������) �Ͽ���.
		System.out.println(today);
		System.out.println(today.toString());
		//���������� Date Ŭ���� ���� toString() �޼��带 ������ �Ͽ���.
	}
}
