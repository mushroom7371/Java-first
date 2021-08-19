package ch11;

import java.util.Vector;

class VectorEx1 {
	public static void main(String[] args) {
		Vector v = new Vector(5);	//�뷮(capacity)�� 5�� Vector ��ü�� �����Ѵ�.
		
		v.add("1");
		v.add("2");
		v.add("3");
		//������ ������ 3���� ��ü�� �����Ѵ�.
		print(v);
		
		v.trimToSize();
		//Vector ��ü�� �� ������ �����Ѵ�. (�뷮�� ũ�Ⱑ ��������)
		//�迭�� ũ�⸦ ���� �� �� ���� ������ �������� v�� ������ ��ü�� �ƴ� trimtoSize() �޼���� ������ ���ο� ��ü�� ����Ű�� �ȴ�.
		//���� ������ ��ü�� �������÷��Ϳ� ���� ���ŵȴ�.
		System.out.println("===After trimToSize()===");
		print(v);
		
		v.ensureCapacity(6);
		//��ü�� capacity�� �ּ� 6�� �ǵ��� �����Ѵ�. 6���� ũ�ٸ� �ƹ����� �Ͼ�� ������ �۴ٸ� ���ο� ��ü�� �����Ͽ� �����Ѵ�.
		System.out.println("===After ensureCapacity(6)===");
		print(v);
		
		v.setSize(7);
		//size�� 7�� �ǵ��� �Ѵ�. ���� capacity�� ����ϸ� �ƹ����� �Ͼ�� ������, ������ capacity�� 6 �̹Ƿ� ���� �ν��Ͻ��� �����Ѵ�.
		//Vector�� capacity�� ������ ��� �ڵ����� ������ ũ�⺸�� 2���� ũ��� ������Ų��.
		System.out.println("===After setSize(7)===");
		print(v);
		
		v.clear();
		//��� ��Ҹ� �����Ѵ�.
		System.out.println("===After clear()===");
		print(v);
	}
	
	public static void print(Vector v) {	//static �޼���� ��ü �������� �޸𸮿� Ŭ������ ����ɶ� ��밡����
		System.out.println(v);	//Vector ��ü�� ���빰�� Ȯ�� �Ѵ�
		System.out.println("size : " + v.size());	//��ü�� ũ�� Ȯ��
		System.out.println("capacity : " + v.capacity());	//��ü�� �뷮 Ȯ��
	}
}
