package CollectionsFramework;

import java.util.*;

public class HashSetEx3 {
	public static void main (String args []) {
		HashSet set = new HashSet();	//내용확인을 위해 HashSet인스턴스를 2번 생성함
		HashSet set2 = new HashSet();
		
		set.add("abc");	//HashSet인스턴스의 add()메서드를 통해 데이터를 저장
		set.add("abc");	//중복 저장
		set.add(new Person("David", 10));	//Person클래스로 부터 객체를 생성하고 생성자의 내용으로 필드값을 초기화 한다.
		set.add(new Person("David", 10));	//중복 저장
		
		System.out.println(set);	// 위의 "abc"는 같은 데이터로 인식하여 출력하지만 "David", 10는 그렇지 않다.
									// 문자열 "abc"가 담긴 인스턴스의 주소는 같은 곳으로 가리키지만 new로 새로 생성한 인스턴스는 다른 주소값을 가진 서로다른 각각의 객체이다
		System.out.println("----------------");
		
		set2.add(new Person2("David", 10));
		set2.add(new Person2("David", 10));
		System.out.println(set2); //Person2에서는 주소값이 다른 인스턴스지만 내용이 같도록 인식하게하는 메서드가 있다
		
	}
}

class Person{
	String name;
	int age;
	
	Person(String name, int age){	//매개변수로 String, int 값을 받는다.
		this.name = name;	//필드에서 선언한 변수에 매개변수의 값을 저장한다. this는 자기자신을 의미, 즉 필드에 있는 변수를 의미한다.
		this.age = age;
	}
	
	public String toString() {	//?? 이 메서드를 통해 name과 age의 출력시 형식을 지정한다.
		return name + ":" + age;
	}
}

class Person2{
	String name;
	int age;
	
	Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {	//반환타입이 논리형인 메서드를 선언하고 매개변수로 Object 타입의 참조변수를 받는다.
		if(obj instanceof Person2) {	//obj가 가리키는 인스턴스가 Person2의 인스턴스가 맞다면(Object는 모든 클래스의 조상이다 즉, 모든 클래스는 Object가 가진 것을 사용할수 있다.)
			Person2 tmp = (Person2)obj;	//Person2 타입의 참조변수 tmp를 선언하고 obj를 Person2 타입으로 형변환 한다.(다형성?)
			return name.equals(tmp.name) && age == tmp.age; //boolean 타입을 리턴해야되는데 잘 모르겠음 아마 저내용은 true, false를 나타내는듯
															//if문의 조건이 맞는 다면 여기의 리턴값을 반환하고 말것임
		}
		return false;	//if 조건이 아니라면 여기로 내려와서 false를 반환함
	}
	
	public int hashCode() { //자세히는 모르지만 hashCode는 같은 내용을 가진 서로다른 객체를 같은 객체로 인식하게 하는 메서드 같다. 여기서는 오버라이딩(내용을 바꾸는것)을 했음
		return (name+age).hashCode();
	}
	
	public String toString() {
		return name + ":" + age;
	}
}
