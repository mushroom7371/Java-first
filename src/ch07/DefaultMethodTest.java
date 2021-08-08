package ch07;

interface MyInterface{
	//default �޼��� �ۼ� �߻�޼���ʹ� �ٸ��� ����{}�� ���� ������ �ش�.
	//���������ڴ� public�̳� ���� �����ϴ�.
	//default �޼��� �ۼ������� �ϼ��� �������̽����� �߻�޼��带 �߰��� �� �̸� ������ ��� Ŭ�������� �߻�޼��带 �����ؾ� �Ǳ� ������
	//�̸� �����ϰ��� ����� ����. �߻�޼��尡 �ƴϹǷ� �������̽��� ������ Ŭ������ �������� �ʾƵ� �ȴ�.
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	//static �޼��� ���� ���������ڴ� public �̳� ���������ϴ�.
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2{
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}

class Parent1{
	//method2() �޼���� ���� �������̽��� ������ �θ�Ŭ������ �޼����̴�.
	public void method2() {
		System.out.println("method2() in Parent");
	}
}

class Child1 extends Parent1 implements MyInterface, MyInterface2{
	//Parent1 Ŭ������ ��ӹް� �ΰ��� �������̽��� �����Ͽ���.
	//method1() �޼���� �������̽��� ���ǵǾ� ������, �������̵� �� ���̹Ƿ� ��ü ������ �޼��� ȣ��� �Ʒ��� ���� ��� �޽����� ��µȴ�.
	public void method1() {
		System.out.println("method1() in Child");
	}
}

public class DefaultMethodTest {
	public static void main(String [] args) {
		Child1 c = new Child1();
		c.method1();
		//c �� ����Ű�� ��ü���� �������̽��� �����Ͽ��� �߻�޼����� method1() �޼��带 �������̵� �Ͽ� �ش� ������ ��µȴ�.
		c.method2();
		//c �� ����Ű�� ��ü���� �θ� Ŭ������ ���� ��ӹ��� �޼��带 ȣ���ϰ� �ȴ�.
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
		//�������̽��� ������ ���� �ʾ������� �ұ��ϰ�(��ü������ �ȵǾ���.) static���� ����� �޼��尡 ȣ��Ǿ� �ش� ������ ��µȴ�.
	}
}
