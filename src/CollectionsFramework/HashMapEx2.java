package CollectionsFramework;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();	//HashMap 타입의 참조변수에 HashMap 클래스로부터 인스턴스를 생성하여 주소값을 저장한다.
		map.put("김자바", new Integer(100));	//map에 key 값과 value값을 저장한다.
		map.put("이자바", new Integer(100));
		map.put("박자바", new Integer(80));
		map.put("최자바", new Integer(90));
		
		Set set = map.entrySet();	//Set 타입의 참조변수 set을 선언하고 map의 데이터를 엔트리 형태(키와 값을 결합)로 저장한다.
		Iterator it = set.iterator();	//set의 iterator()메서드를 호출하여 리턴받은 값을 Iterator 타입의 참조변수 it에 저장한다.
										//Iterator를 사용하여 값을 읽어들일 준비를 한다.

		while(it.hasNext()) { //참조변수 it이 가리키는 인스턴스에 다음 값이 있을때까지 반복
			Map.Entry e = (Map.Entry)it.next();	//Map.Entry타입의 참조변수에 it.next()를 형변환 하여 저장한다.
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
			//entry 형태로 저장된 값을 출력
		}
		
		set = map.keySet();	//참조변수 set에 kdySet()메서드로 반환된 모든 키 값을 반환한다. 리턴 타입이 Set이기에 참조변수의 타입과 일치한다.
		System.out.println("참가자 명단 = " + set);
		
		Collection values = map.values();	//Collection 타입의 참조변수에 참조변수 map이 가리키는 HashMap 객체에 저장된 모든 값을 Collection 형태로 반환
		it = values.iterator();	//Iterator는 재활용이 안되므로 다시 값을 저장해 둔다.
		
		int total = 0;
		
		while(it.hasNext()) {	//it에 다음값이 있을때 까지 반복
			Integer i = (Integer)it.next();	//it의 다음 데이터를 Integer 타입으로 형변환 하여 변수i에 저장
			total = total + i.intValue();	//total 변수에 i의 값을 저장한다.
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
	}

}
