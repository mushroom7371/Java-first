package ch09;

class Point implements Cloneable{	//Cloneable �������̽��� ������ Ŭ���������� clone()�޼��� ȣ���� �����ϴ�.
	int x, y;
	
	Point(int x, int y){	//�����ڸ� ���Ͽ� ��ü ������ ��������� ���ڰ����� �ʱ�ȭ�Ѵ�.
		this.x = x;
		this.y = y;
	}
	
	public String toString() {	//Object Ŭ������ toString() �޼��带 �������̵���.
		return "x = " + x + ", y = " + y;
	}
	
	public Point clone() {	//����ȯ ��ȯŸ���� ����ؼ� Object Ŭ������ clone() �޼��带 �������̵� �Ͽ���. �ٸ� ���� Ŭ������ ������������ protected ���� public���� �����Ѵ�.
		Object obj = null;
		
		//clone() �޼��带 ���� �Ҷ��� �� try-catch�������� ����ó���� �ؾߵȴ�. 
		try {
			obj = super.clone();	//������ ������ �������� obj�� ����Ŭ������ clone()�޼��带 ȣ���Ͽ� ��ȯ�� ��ü�� �ּҸ� ����Ų��.
		}catch(CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		
		return (Point)obj;	//��ȯŸ���� Object���� Point�� �ٲ�� ������ ����ȯ�� �ǽ��Ͽ���.
	}
}

class CloneEx1 {
	public static void main(String[] args) {
		Point original = new Point(3, 5);
		Point copy = original.clone();	//�������� original�� ����Ű�� ��ü�� clone()�޼��带 ȣ���Ͽ� ��ȯ�� ��ü�� �ּҰ��� �������� copy�� �����Ѵ�. �޼��忡�� ����ȯ�� �Ǿ��⿡ ���� ����ȯ�� �ʿ� ����.
		
		System.out.println(original);
		System.out.println(copy);
		//��ü���� �������̵� �� toString() �޼��带 ȣ���� ��ȯ�� ���
	}
}
