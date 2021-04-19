package CollectionsFramework;

import java.util.ArrayList;	//java.util 에 있는 클래스를 현 클래스에서 사용하겠다는 의미
import java.util.Iterator;	//마찬가지, 내용은 하단에 설명

public class ArrayListEx {
	public static void main(String [] args) {
		ArrayList<String> al = new ArrayList<>();
		//ArrayList 타입의 참조변수 al을 선언하는데, <String>으로 인하여 문자열 값만 받도록 하겠다는 의미. 컬렉션 객체를 생성할때 저장되는 데이터의 값을 미리 지정하는것.
		//new로 인하여 ArrayList를 생성하고 al에 그 주소값을 저장. ArrayList는 배열의 종류이다 순서가 있고, 반복을 허용함
		
		al.add("hello");	//ArrayList는 List 인터페이스를 상속받아서 구현한 것이고, List 인터페이스는 Collection 인터페이스를 상속받는다.
		al.add("java");		//Collection 인터페이스에는 여러가지 메서드가 있는데 Collection 인터페이스를 상속받은 List 인터페이스를 구현한 ArrayList에서 사용가능하다.
		al.add("world");	//add()라는 메서드로 ArrayList 인스턴스에 메서드 생성자 안의 매개변수를 추가하겠다는 의미

		
		//al.remove(2);	//마찬가지로 제거하는 기능인 remove() 메서드를 사용할수있다 매개변수에는 인덱스의 번호, 번지수가 들어간다.
		
		System.out.println(al.get(1));	//get() 메서드는 해당 번지수의 값을 불러오겠다는 의미.
		
		Iterator<String> it = al.iterator();
		//Iterator는 인터페이스 이며 컬렉션 프레임워크에서 저장된 요소들을 읽어오는 방법을 표준화 하기위한 역할을 한다.
		//iterator란 배열의 값을 순회하면서 반복하는 것
		//Iterator 인터페이스에는 hasNext(), next(), remove() 메서드가 구성되어있으며 List 또는 Set 인터페이스를
		//구현하는 컬랙션들은 iterator()가 각각의 특징에 맞게 설계가 되어있다.
		
		while(it.hasNext()) {	//hasNext()는 읽어올 요소가 남아있는지 확인하는 메서드 boolean 타입으로 true, false를 반환함
			System.out.println(it.next());	//next()는 다음 요소를 가져오는 역할을 한다.
		}
	}
}
