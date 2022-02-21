package CollectionsFramework;

import java.util.Enumeration;
import java.util.Properties;

class PropertiesEx1 {
	public static void main(String[] args) {
		Properties prop = new Properties();	//Properties는 HashMap의 구버전인 Hashtable을 상속받아 구현한 클래스
		
		//prop에 키와 값(key, value)을 저장한다.
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		//prop에 저장된 요소들을 Enumeration을 이용하여 출력한다.
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()) {	//e가 가리키는 객체의 요소가 더 있다면 반복을 실시한다.
			String element = (String)e.nextElement();	//해당 요소를 형변환 하여 String 타입의 참조변수 element가 가리키도록 한다.
			System.out.println(element + " = " + prop.getProperty(element));	//해당 내용을 출력
		}
		
		System.out.println();
		prop.setProperty("size", "20");	//setProperty()메서드를 통하여 key와 value를 저장한다.
		System.out.println("size = " + prop.getProperty("size"));	//getProperty()메서드를 통하여 해당 vlaue를 불러온다.
		System.out.println("capacity = " + prop.getProperty("capacity", "20"));
		System.out.println("loadfactor = " + prop.getProperty("loadfactor", "0.75"));
		
		System.out.println(prop);
		prop.list(System.out);
	}
}
