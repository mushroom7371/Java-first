package ch09;

class Person{
	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id == ((Person)obj).id; //obj가 Object 타입이므로 이를 참조하기 위해 Person타입으로 형변환 함
		else
			return false;
	}
	
	Person(long id){
		this.id = id;
	}
}


public class EqualsEx2 {
	public static void main(String arg[]) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1==p2) //p1,p2의 id 값은 같으나 p1은 Person 클래스로 부터 생성된 인스턴스의 주소값을 저장하는 공간이고 p2또한 주소값을 저장하는 공간이여서 서로 다르다.
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");		
		
		if(p1.equals(p2))  //equals는 위의 예시와 다르게 문자열 값을 비교하기에 p1과 p2의 문자열 값이 같으므로 같은 사람이라고 출력된다
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");	
	}
}
