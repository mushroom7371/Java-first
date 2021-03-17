package ch07;

public class InterfaceTest {
	public static void main(String [] args) {
		A a = new A();
		a.autoPlay(new B());	//B�� �޼��带 ����ϱ����� ��ü�� �������־�ߵ�
		a.autoPlay(new C());
	}
}

class A {
	void autoPlay(I i) {	//�������̽� I Ÿ���� i�� �Ű������� ������
		i.play();
	}
}

interface I{	//�������̽� ����
	public abstract void play(); //�������� ����� �߻�޼���
}

class B implements I{
	public void play() {
		System.out.println("Play in B class"); //�������̽� I�� ������ BŬ�������� ����� play �޼���
	}
}

class C implements I{
	public void play() {
		System.out.println("Play in C class"); //�������̽� I�� ������ CŬ�������� ����� play �޼���
	}
}
