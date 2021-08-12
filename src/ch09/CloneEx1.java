package ch09;

class Point implements Cloneable{	//Cloneable 인터페이스를 구현한 클래스에서만 clone()메서드 호출이 가능하다.
	int x, y;
	
	Point(int x, int y){	//생성자를 통하여 객체 생성시 멤버변수를 인자값으로 초기화한다.
		this.x = x;
		this.y = y;
	}
	
	public String toString() {	//Object 클래스의 toString() 메서드를 오버라이딩함.
		return "x = " + x + ", y = " + y;
	}
	
	public Object clone() {	//마찬가지로 Object 타입을 반환하는 Object 클래스의 clone() 메서드를 오버라이딩 하였다. 다만 원본 클래스의 접근제어자인 protected 에서 public으로 변경한다.
		Object obj = null;
		
		//clone() 메서드를 정의 할때는 꼭 try-catch문장으로 예외처리를 해야된다. 
		try {
			obj = super.clone();	//위에서 선언한 참조변수 obj는 조상클래스의 clone()메서드를 호출하여 반환된 객체의 주소를 가리킨다.
		}catch(CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		
		return obj;
	}
}

class CloneEx1 {
	public static void main(String[] args) {
		Point original = new Point(3, 5);
		Point copy = (Point)original.clone();	//참조변수 original이 가리키는 객체의 clone()메서드를 호출하여 반환된 객체의 주소값을 참조변수 copy에 저장하되, Object 타입이므로 이를 다시 해당 클래스 타입에 맞게 형변환 하였다.
		
		System.out.println(original);
		System.out.println(copy);
		//객체내의 오버라이딩 된 toString() 메서드를 호출한 반환값 출력
	}
}
