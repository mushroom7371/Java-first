package ch02;

/*
 * ���� ����� �ʱ�ȭ ���� ����
 */
class VarEx1 {
	public static void main(String[] args)	{
		int year = 0;	//year ���� ���� �� �ʱ�ȭ
		int age	= 14;	//age ���� ���� �� �ʱ�ȭ
		
		System.out.println(year);   
		System.out.println(age);	
		
		year = age + 2000;  //���� age�� 2000�� ���ؼ� ���� year�� ����
		age = age + 1;	//���� age�� ����� ���� 1 ���ϱ�
		
		System.out.println(year);
		System.out.println(age);
		
	}	
	}