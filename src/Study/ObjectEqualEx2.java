package Study;

public class ObjectEqualEx2 {
	public static void main(String[] args) {
		Person p1 = new Person(9111191111111L);
		Person p2 = new Person(9111191111111L);
		//두 참조변수가 가리키는 객체는 다르나 객체의 변수인 id의 값은 동일하다.

		if(p1 == p2) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		}else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		//p1과 p2는 다른 주소값을 가진 다른 객체이므로 다른 사람으로 판단.
		
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		}else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		//Object 클래스의 equals()메서드를 오버라이딩 하였고 이를 통해 객체가 가진 변수의 값이 동일한지 확인하도록 하였다.

	}
}

class Person{
	long id;
	
	public boolean equals(Object obj) {	//매개변수로 Object타입의 참조변수를 가지도록 오버라이딩함.(equals메서드는 최상의 클래스인 Object클래스가 가진 메서드임)
		if(obj instanceof Person) {
			//instanceof 연산자를 통하여 부모 객체, 자식 객체 관계를 확인 할 수 있다
			//위의 경우 매개변수로 들어온 Object 타입의 참조변수 obj가 Person 클래스와 관계가 있다면(Person 타입으로 형변환이 가능하면)
			return id == ((Person)obj).id;	//return this.id 와 같다
			//해당 객체는 id라는 변수를 가지고 있을것이고 이를 사용하기 위해 Person 타입으로 형변환 한후 자기자신의 id로 설정해서 반환한다.
		}else {
			return false;
		}
	}
	
	Person(long id){
		this.id = id;
	}
}