package ch07;

class Outer{
	
	int value = 10;	// Outer.this.value Outer Ŭ������ �������
	
	class Inner{
		int value = 20; //	this.value ���� Ŭ������ Inner Ŭ������ �������
		
		void method1() {	//���� Ŭ������ �޼���
			int value = 30;
			System.out.println("value = " + value);
			System.out.println("this.value = " + this.value);
			System.out.println("Outer.this.value = " + Outer.this.value);
		}
	}
}

public class InnerEx5 {
	public static void main(String [] agrs) {
		Outer outer = new Outer();	//Outer Ŭ�����κ��� �ν��Ͻ� ����
		Outer.Inner inner = outer.new Inner();	//Outer Ŭ������ ���� Ŭ������ ���� �ν��Ͻ� ����
		
		inner.method1();	//���� Ŭ������ �޼��� ȣ��
	}
}
