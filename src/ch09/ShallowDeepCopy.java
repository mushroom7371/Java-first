package ch09;

class Circle implements Cloneable{	//복제를 위해 인터페이스 Cloneable를 구현
	Point1 p;	//Point1 타입의 참조변수 선언
	double r;
	
	Circle(Point1 p, double r){	//생성자를 통해 객체 생성시 인자값으로 받은 주소값, 데이터를 인스턴스변수로 설정
		this.p = p;
		this.r = r;
	}
	
	public Circle shallowCopy() {	//얕은 복사를 위한 메서드
		Object obj = null;
		
		try {
			obj = super.clone();	//조상 클래스의 clone() 메서드를 호출 예외처리가 필요하다.
		}catch(CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		return (Circle)obj;	//Object 타입의 객체를 복사하였기에 반환시 형변환을 통해 타입을 일치 시킨다.
	}
	
	public Circle deepCopy() {	//깊은 복사를 위한 메서드
		Object obj = null;
		
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		
		Circle c = (Circle)obj;	//Circle 타입의 새로운 참조변수를 선언하여 공간을 마련하고 여기에 복제된 객체의 주소값을 담는다.
		c.p = new Point1(this.p.x, this.p.y);	//복제된 객체가 가지고 있는 Point 객체의 변수값을 c가 가리키는 Point 객체의 변수로 설정한다.
		
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
		//c1의 객체를 c2가 가리키므로 둘은 같은 객체를 가리키나 c3는 정의한 데로 새로운 참조변수에 담겨 반환받은 주소값을 가리키게 되므로 다른 객체가 된다.
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
		c1.p.x = 9;
		c1.p.y = 9;
		//c1과 c2는 서로 같은 객체를 가리키게 되므로 c1을 변경하면 c2또한 변경된 객체의 데이터를 가리키게 된다.
		
		System.out.println("=== c1의 변경 후 ===");
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
	}
}
