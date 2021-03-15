package ch07;

public class BindingTest {
	public static void main(String [] args) {
		Parent p = new Parent();
		Child c = new Child();

		System.out.println("p.x : " + p.x); // �������� p�� Parent Ŭ������ ���� �ν��Ͻ��� ����Ű�⿡ ���� x �� ���� 100�̴�. 
		p.method();
		
		System.out.println("c.x : " + c.x); // �������� c�� Parent�� ���� 100�� �ߺ��� x ���� ������ �ڽ�Ŭ������ ������ ����Ų��.
		c.method(); //���������� �ߺ��� �޼��尡 ������ �� ���� ������ �ڻ�Ŭ������ �޼��尡 ����ȴ�.
	}
}

class Parent{
	int x = 100;	// ��� ������ child �� �����̸��� ����.

	void method() {
		System.out.println("parent method");
	}
}

class Child extends Parent {
	int x = 200;

	void method() {
		System.out.println("child method");
	}
}