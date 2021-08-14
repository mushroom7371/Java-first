package ch09;

class Circle implements Cloneable{	//������ ���� �������̽� Cloneable�� ����
	Point1 p;	//Point1 Ÿ���� �������� ����
	double r;
	
	Circle(Point1 p, double r){	//�����ڸ� ���� ��ü ������ ���ڰ����� ���� �ּҰ�, �����͸� �ν��Ͻ������� ����
		this.p = p;
		this.r = r;
	}
	
	public Circle shallowCopy() {	//���� ���縦 ���� �޼���
		Object obj = null;
		
		try {
			obj = super.clone();	//���� Ŭ������ clone() �޼��带 ȣ�� ����ó���� �ʿ��ϴ�.
		}catch(CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		return (Circle)obj;	//Object Ÿ���� ��ü�� �����Ͽ��⿡ ��ȯ�� ����ȯ�� ���� Ÿ���� ��ġ ��Ų��.
	}
	
	public Circle deepCopy() {	//���� ���縦 ���� �޼���
		Object obj = null;
		
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		
		Circle c = (Circle)obj;	//Circle Ÿ���� ���ο� ���������� �����Ͽ� ������ �����ϰ� ���⿡ ������ ��ü�� �ּҰ��� ��´�.
		c.p = new Point1(this.p.x, this.p.y);	//������ ��ü�� ������ �ִ� Point ��ü�� �������� c�� ����Ű�� Point ��ü�� ������ �����Ѵ�.
		
		return c;
	}
	
	public String toString() {
		return "[ p = " + p + ", " + " r = " + r + " ]";
	}
}

class Point1{
	int x, y;
	
	Point1(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return " ( " + x + ", " + y + " ) ";
	}
}

class ShallowDeepCopy {
	public static void main(String[] args) {
		Circle c1 = new Circle(new Point1(1, 1), 2.0);
		Circle c2 = c1.shallowCopy();
		Circle c3 = c1.deepCopy();
		//c1�� ��ü�� c2�� ����Ű�Ƿ� ���� ���� ��ü�� ����Ű�� c3�� ������ ���� ���ο� ���������� ��� ��ȯ���� �ּҰ��� ����Ű�� �ǹǷ� �ٸ� ��ü�� �ȴ�.
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
		c1.p.x = 9;
		c1.p.y = 9;
		//c1�� c2�� ���� ���� ��ü�� ����Ű�� �ǹǷ� c1�� �����ϸ� c2���� ����� ��ü�� �����͸� ����Ű�� �ȴ�.
		
		System.out.println("=== c1�� ���� �� ===");
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
	}
}
