package ch07;

class DrawShape {
	public static void main(String [] args) {
		Point1 [] p = {
						new Point1(100, 100),
						new Point1(140, 50),
						new Point1(200, 100)
						};
		
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point1(150,150), 50);
		
		t.draw();
		c.draw();
	}
}

class Shape{	//��ӹ��� Ŭ�������� ����� �θ� Ŭ���� �ۼ� ����ΰ� �ۼ��Ǿ��ִ�.
	String color = "black";
	void draw() {
		System.out.printf("[color=%s]%n", color);
	}
}

class Point1{	//���԰��踦 �����ϱ� ���� Ŭ����
	int x;
	int y;
	//�⺻ ��ǥ���� ����
	
	Point1(int x, int y){	//�����ڸ� ���Ͽ� �Ű������� ���� �ΰ��� ������ ��������� ������ �����ǵ��� ��.
		this.x = x;
		this.y = y;
	}
	
	Point1(){	//�Ű������� �ƹ��� ���� ���޵��� �ʴ´ٸ� x,y�� ���� 0���� ������.
		this(0, 0);
	}
	
	String getXY() {	//������ �о���̱� ���� �޼���. ����� ���� �����Ͽ���.
		return "(" + x +  "," + y + ")";
	}
}

class Circle extends Shape{	//Circle Ŭ������ ShapeŬ������ ��ӹ޾Ҵ� ������ ���ο��� ���� color�� draw()�޼��尡 �ִ�.
	Point1 center;	//Circle�� Point1�� ���� ���԰����̴� Circle�� Point1�� ������ �ֱ� ����
	int r;
	
	Circle(){
		//�����ڸ� ���Ͽ� �Ű������� ������ �������� center�� x=0, y=0 �̶�� ������ ������ �ִ� Point1Ÿ���� ��ü�� ����Ų��.
		//���� ���� r�� 100���� �ʱ�ȭ�Ѵ�.
		this(new Point1(0, 0), 100);
	}
	
	Circle(Point1 center, int r){
		//�Ű������� ���� �ִٸ� �����ڸ� ���Ͽ� �������� center�� �Ű������� ���� Point1Ÿ���� ���������� ����Ų��.
		this.center = center;
		this.r = r;
	}
	
	void draw() {	//Shape Ŭ������ ����� draw()�޼��带 ������(�������̵�)�Ͽ� ������ �ۼ��Ͽ���.
		System.out.printf("[center = (%d, %d), r = %d, color = %s]%n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape{
	Point1 [] p = new Point1[3];
	//Point1 Ÿ���� �迭�� ����Ű�� �������� p�� �����Ͽ��� �� �迭�� ũ��� 3���� �����Ͽ���. 
	
	Triangle(Point1 [] p) {	//�����ڸ� ���Ͽ� �Ű������� Point1 Ÿ���� �迭�� ����Ű�� ���������� ������ �װ��� ��������� �����Ѵ�.
		this.p = p;
	}
	
	void draw() {	//���������� ����Ŭ������ Shape�� draw()�޼��带 �������Ͽ���.
		System.out.printf("[p1 = %s, p2 = %s, p3 = %s, color = %s]%n",
							p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}

