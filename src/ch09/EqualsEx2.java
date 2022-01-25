package ch09;

class Person{
	long id;
	
	//Object클래스의 equals 메서드를 오버라이딩 하였다.
	public boolean equals(Object obj) {	//인자값으로 들어오는 참조변수는 Object 타입이고
		if(obj instanceof Person)	//참조변수가 가리키는 객체가 Person 타입의 객체로 만들어 진 것이라면
									//한마디로 Person 클래스로 부터 만들어진 객체이며 모든 클래스는 Object클래스를 상속받기에
									//조건이 참이라면 해당 객체는 Person 클래스로 부터 만들어진 객체이다.
			return id == ((Person)obj).id; //Person 클래스의 변수 id 값을(this) 참조변수가 가리키는 변수값으로 설정한다.
											//다만 해당 참조변수는 Person 클래스로 부터 만들어진 객체를 가리키지만 Object 타입이므로
											//내용물을 사용하기 위해서는 형변환 작업을 통하여 접근해야 사용가능하다.
		else
			return false;
	}
	
	Person(long id){	//객체를 생성할때 인자값으로 받는 숫자를 멤버변수 id 값으로 저장한다.
		this.id = id;
	}
}


public class EqualsEx2 {
	public static void main(String arg[]) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1==p2) //p1,p2의 변수 id의 값은 같으나 p1은 Person 클래스로 부터 생성된 인스턴스의 주소값을 저장하는 공간이고 p2또한 주소값을 저장하는 공간이여서 서로 다르다.
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");		
		
		if(p1.equals(p2))  //equals는 위의 예시와 다르게 문자열 값을 비교하기에(이 경우에는 참조변수가 가리키는 객체의 주소값이 된다.)
							//p1과 p2의 문자열 값이 같으므로(같은 객체를 가리키므로) 같은 사람이라고 출력된다
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");	
	}
}
