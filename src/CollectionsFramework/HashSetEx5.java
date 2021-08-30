package CollectionsFramework;

import java.util.HashSet;
import java.util.Iterator;

class HashSetEx5 {
	public static void main(String[] args) {
		HashSet setA	= new HashSet();
		HashSet setB	= new HashSet();
		HashSet setHab	= new HashSet();
		HashSet setKyo	= new HashSet();
		HashSet setCha	= new HashSet();
		//HashSet의 특성을 이해하기 위한 집합 선언
		
//		setA.add("1");	setA.add("2");	setA.add("3");
//		setA.add("4");	setA.add("5");
		
		for(int i = 1; i < 6; i++) {	//어차피 반복이라 그냥 for문으로 데이터 입력함
			setA.add(i);
		}
		
		System.out.println("setA = " + setA);
		
//		setB.add("4");	setB.add("5");	setB.add("6");
//		setB.add("7");	setB.add("8");
		
		for(int i = 4; i < 9; i++) {
			setB.add(i);
		}
		
		System.out.println("setB = " + setB);
		
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp))	//교집합을 알기위해 setB와 setA를 통하여 tmp의 내용(setb)을 setA가 contain(포함)하고 있다면 그 값을 setKyo에 저장한다.
				setKyo.add(tmp);
		}
		
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))	//교집합과는 반대로 !연산자를 이용하여 없는 값이라면 그 값을 setCha에 저장하였다.
				setCha.add(tmp);
		}
		
		it = setA.iterator();
		while(it.hasNext()) {	//합집합은 중복 없이 두 집합의 내용을 모두 가지므로 HashSet을 이용하여 쉽게 데이터를 저장할 수 있다.
			setHab.add(it.next());
		}
		
		it = setB.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		
		System.out.println("A ∩ B = " + setKyo);
		System.out.println("A ∪ B = " + setHab);
		System.out.println("A - B = " + setCha);
		
	}
}
