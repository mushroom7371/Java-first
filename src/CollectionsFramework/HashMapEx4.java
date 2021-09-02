package CollectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class HashMapEx4 {
	public static void main(String[] args) {
		String [] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};
		//String 타입의 데이터를 저장하는 배열을 생성하고 참조변수에 주소값을 담았다.
		
		HashMap map = new HashMap();
		//HashMap 객체를 생성
		
		for(int i = 0; i < data.length; i++) {	//참조변수 data가 가리키는 배열의 길이만큼 반복
			if(map.containsKey(data[i])) {	//HashMap객체가 data가 가리키는 배열의 각번지수의 데이터를 가지고 있다면
				Integer value = (Integer)map.get(data[i]);	//HashMap객체가 가지고있는 해당 데이터를 얻어와서 형변환을 통해 타입을 일치 시킨 후, 변수 value에 그 값을 저장한다.
				map.put(data[i], new Integer(value.intValue() + 1));	//HashMap객체에 해당 데이터의 값의 value를 1증가 시킨 후 저장한다.
			}else {
				map.put(data[i], new Integer(1));	//가지고 있지 않다면 1로 지정한다.
			}
		}
		
		Iterator it = map.entrySet().iterator();	//HashMap의 데이터를 읽어오기위한 준비.
		
		while(it.hasNext()){	//하단의 메서드를 통하여 출력을 실시한다.
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
			
		}
	}
	
	public static String printBar(char ch, int value) {	//그래프 형식으로 출력하기 위한 메서드
		char[] bar = new char[value];
		
		for(int i = 0; i < bar.length; i++)
			bar[i] = ch;
		
		return new String(bar);
	}
}
