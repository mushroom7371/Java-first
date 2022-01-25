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

class Shape{	//상속받을 클래스에서 사용할 부모 클래스 작성 공통부가 작성되어있다.
	String color = "black";
	void draw() {
		System.out.printf("[color=%s]%n", color);
	}
}

class Point1{	//포함관계를 설명하기 위한 클래스
	int x;
	int y;
	//기본 좌표값을 설정
	
	Point1(int x, int y){	//생성자를 통하여 매개변수로 받은 두개의 변수가 멤버변수의 값으로 설정되도록 함.
		this.x = x;
		this.y = y;
	}
	
	Point1(){	//매개변수로 아무런 값이 전달되지 않는다면 x,y의 값을 0으로 설정함.
		this(0, 0);
	}
	
	String getXY() {	//변수를 읽어들이기 위한 메서드. 출력을 위해 선언하였다.
		return "(" + x +  "," + y + ")";
	}
}

class Circle extends Shape{	//Circle 클래스는 Shape클래스를 상속받았다 때문에 내부에는 변수 color과 draw()메서드가 있다.
	Point1 center;	//Circle과 Point1은 서로 포함관계이다 Circle은 Point1을 가지고 있기 때문
	int r;
	
	Circle(){
		//생성자를 통하여 매개변수가 없을때 참조변수 center는 x=0, y=0 이라는 변수를 가지고 있는 Point1타입의 객체를 가리킨다.
		//또한 변수 r을 100으로 초기화한다.
		this(new Point1(0, 0), 100);
	}
	
	Circle(Point1 center, int r){
		//매개변수로 값이 있다면 생성자를 통하여 참조변수 center는 매개변수로 들어온 Point1타입의 참조변수를 가리킨다.
		this.center = center;
		this.r = r;
	}
	
	void draw() {	//Shape 클래스에 선언된 draw()메서드를 재정의(오버라이딩)하여 내용을 작성하였다.
		System.out.printf("[center = (%d, %d), r = %d, color = %s]%n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape{
	Point1 [] p = new Point1[3];
	//Point1 타입의 배열을 가리키는 참조변수 p를 선언하였고 그 배열의 크기는 3으로 정의하였다. 
	
	Triangle(Point1 [] p) {	//생성자를 통하여 매개변수로 Point1 타입의 배열을 가리키는 참조변수가 들어오면 그것을 멤버변수로 설정한다.
		this.p = p;
	}
	
	void draw() {	//마찬가지로 조상클래스인 Shape의 draw()메서드를 재정의하였다.
		System.out.printf("[p1 = %s, p2 = %s, p3 = %s, color = %s]%n",
							p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}

