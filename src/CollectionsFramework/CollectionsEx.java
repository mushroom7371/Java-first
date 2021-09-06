package CollectionsFramework;

import static java.util.Collections.*;	//컬렉션 클래스의 메서드를 사용하기 위해 static으로 import하였다.
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

class CollectionsEx {
	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);	//선언만 하였을 시 아무것도 담기지 않은 상태
		
		addAll(list, 1,2,3,4,5);	//앞서 import한 Collections 클래스의 메서드 이하 생략
		System.out.println(list);	//addAll() 메서드로 참조변수 list가 가리키는 ArrayList 객체에 내용이 더해 진다.
		
		rotate(list, 2);	//오른쪽으로 두칸씩 이동
		System.out.println(list);
		
		swap(list, 0, 2);	//0번지와 2번지의 값을 바꾼다.
		System.out.println(list);
		
		shuffle(list);	//해당 객체의 내용을 섞는다.
		System.out.println(list);
		
		sort(list);	//객체의 내용을 순차적으로 정렬한다.
		System.out.println(list);
		
		sort(list, reverseOrder());	//역순으로 정렬한다.
		System.out.println(list);
		
		int idx = binarySearch(list, 3);	//객체내의 해당 데이터의 번지수를 찾아 반환한다.
		System.out.println("index of 3 : " + idx);
		
		System.out.println("max = " + max(list));
		System.out.println("min = " + min(list));
		System.out.println("min = " + max(list, reverseOrder()));	//반대로 정렬한 상태로 max값을 찾게 되면 당연히 min값이 나온다.
		
		fill(list, 9);	//객체의 데이터를 9로 채운다. 기존 배열의 길이는 유지된다.
		System.out.println(list);
		
		List newList = nCopies(list.size(), 2);	//list와 같은 크기의 새로운 list를 생성하고 내용을 2로 채운다.
		System.out.println("newList = " + newList);
		
		System.out.println(disjoint(list, newList));	//두 참조변수가 가리키는 객체에 공통요소가 없으면 true를 반환함
		
		copy(list, newList);	//참조변수 list에 newList가 가리키는 객체를 복사함.
		System.out.println("newList = " + newList);
		System.out.println("list = " + list);
		
		replaceAll(list, 2, 1);	//list가 가리키는 객체의 데이터 2를 모두 1로 대체
		System.out.println("list = " + list);
		
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		
		System.out.println("list2 = " + list2);
		
	}
}
