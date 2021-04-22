package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {

	public static void main(String[] args) {
		ArrayList origin = new ArrayList(10);	//ArrayList 타입의 참조변수를 선언하고 참조변수에 새로운 ArrayList 인스턴스를 생성하여 그 주소값을 저장함.
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for(int i = 0; i < 10; i++) {
			origin.add(i + "");		//origin이 가리키는 곳의 인스턴스에 0에서 9까지의 수를 문자열로 저장함
		}
		
		Iterator it = origin.iterator();	//Iterator 타입의 참조변수를 선언하고 여기에 origin 의 iterator()를 호출하고 리턴받은 데이터를 저장함
		
		while(it.hasNext()) {
			copy1.add(it.next());	//다음값이 있을 경우 copy1의 인스턴스에 그 값을 순차적으로 저장
		}
		
		System.out.println("origin 에서 copy1 으로 데이터 복사");
		System.out.println("origin = " + origin);
		System.out.println("copy1 = " + copy1);
		
		it = origin.iterator();	//iterator는 재사용이 불가능하여 이미 만들어진 참조변수에 다시 한번 메서드를 호출하여 데이터를 저장한다.
		
		while(it.hasNext()) {
			copy2.add(it.next());
			it.remove();	//copy1과는 다르게 저장한 후 데이터를 제거한다.
		}
		
		System.out.println("origin 에서 copy2 으로 데이터 이동");
		System.out.println("origin = " + origin);
		System.out.println("copy2 = " + copy2);

	}

}
