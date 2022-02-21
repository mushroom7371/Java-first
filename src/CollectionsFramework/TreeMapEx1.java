package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TreeMapEx1 {
	public static void main(String[] args) {
		String [] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
		//String 타입의 데이터를 저장하는 배열을 생성하고 참조변수에 주소값을 담았다.
		
		TreeMap map = new TreeMap();
		//TreeMap 객체를 생성
		
		for(int i = 0; i < data.length; i++) {	//data가 가리키는 배열의 크기만큼 반복
			if(map.containsKey(data[i])) {	//해당 객체가 key값으로 반복중인 data[i]번지의 값을 가지고 있다면
				Integer value = (Integer)map.get(data[i]);	//변수 value에 해당 데이터 값을 읽어오고 형변환 하여 타입을 일치 시킨후 값을 저장한다.
				map.put(data[i], new Integer(value.intValue() + 1));	//map이 가리키는 객체(TreeMap)에 data[i]의 값을 key값으로 하고 value값으로 위의 변수에 +1 한 값을 저장한다.
			}else {	//key값으로 data[i] 번지의 데이터가 없다면
				map.put(data[i], new Integer(1));	//해당 값을 key값으로 하고 1을 value값으로 저장한다.
			}
		}
		
		Iterator it = map.entrySet().iterator();
		//해당 객체의 전체 데이터를 읽어들이기 위해 Iterator 참조변수를 선언하고 map의 iterator()메서드의 리턴결과인 객체를 참조하게 하였다.
		
		System.out.println("=== 기본 정렬 ===");
		
		while(it.hasNext()) {	//참조변수 it이 가리키는 객체에 데이터가 저장되어 있다면
			Map.Entry entry = (Map.Entry)it.next();	//그 데이터를 Map.Entry타입의 참조변수에 담고,
			int value = ((Integer)entry.getValue()).intValue();	//그 데이터를 형변환을 통하여 int 타입으로 변경후 기본형 변수 value에 담는다.
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);	//하단에 정의한 static 메서드의 내용대로 출력을 실시한다.
		}
		System.out.println();
		//여기 까지가 기존 HashMapEx4의 내용
		
		//map을 ArrayList로 변환한 다음에 Collections.sort()로 정렬
		
		Set set = map.entrySet();
		List list = new ArrayList(set);
		
		//static void sort(List list, Comparator c)
		Collections.sort(list, new ValueComparator());	//Collections클래스가 제공하는 정렬메서드를 이용하여 정렬 이때 ValueComparator클래스 객체를 이용하여 순차 정렬이 된다.
		
		it = list.iterator();
		
		System.out.println("=== 값의 크기가 큰 순서로 정렬 ===");
		while(it.hasNext()){	//위의 출력 내용과 동일
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
	}
	
	static class ValueComparator implements Comparator{	//Comparator 인터페이스를 구현한 클래스
		public int compare(Object o1, Object o2) {	//해당 인터페이스의 추상 메서드를 오버라이딩 하였다.
			if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {	//인자값으로 받은 객체가 Map.Entry 타입의 인스턴스라면,
				Map.Entry e1 = (Map.Entry)o1;
				Map.Entry e2 = (Map.Entry)o2;
				//Map.Entry 타입의 참조변수로 참조가 가능하도록 형변환하여 주소값을 저장한다.
				
				int v1 = ((Integer)e1.getValue()).intValue();
				int v2 = ((Integer)e2.getValue()).intValue();
				//해당 객체의 value값을 받아와 Integer타입으로 형변환 후 다시 int 타입으로 데이터를 저장한다.
				
				return v2 - v1;	//값의 차이를 반환한다.
			}
			
			return -1;
		}
	}	//static class ValueCoparator implements Comparator{
	
	public static String printBar(char ch, int value) {	//그래프 형식으로 출력하기 위한 메서드
		char[] bar = new char[value];
		
		for(int i = 0; i < bar.length; i++)
			bar[i] = ch;
		
		return new String(bar);
	}
}
