package Generics;

import java.util.ArrayList;

class Fruit1{	public String toString() {	return "Fruit";}	}
class Apple1 extends Fruit1{	public String toString() {	return "Apple";	}	}
class Grape1 extends Fruit1{	public String toString() {	return "Grape";	}	}
//Fruit1클래스와 이를 상속받는 Apple1, Grape1 클래스 정의

class Juice{
	String name;
	
	Juice(String name){	//생성자를 통하여 인자값으로 받은 데이터를 참고하여 객체 생성시 초기화 역할을 함
		this.name = name + "Juice";	//Juice 클래스의 멤버변수인 name에 인자값으로 받은 문자열 + Juice라고 저장한다.
	}
	
	public String toString() {	//Object 클래스의 toString()메서드를 오버라이딩 하였다.
		return name;
	}
}

class Juicer{
	static Juice makeJuice(FruitBox<? extends Fruit1> box) {	//static으로 정의 하였기에 클래스가 메모리에 올라 갈때 부터 사용가능하다.
		String tmp = "";
		
		for(Fruit1 f : box.getList())	//향상된 for문으로 Furit1 타입의 참조변수 f에 인자값으로 받은 인스턴스의 getList() 메서드의 반환값을 저장한다.
			tmp += f + " ";
		return new Juice(tmp);
	}
}

class FruitBoxEx3 {
	public static void main(String[] args) {
		FruitBox<Fruit1> fruitBox = new FruitBox<Fruit1>();	//FruitBox 객체를 생성하지만 여기에는 Fruit1 타입의 객체만을 담을 수있다.
		FruitBox<Apple1> appleBox = new FruitBox<Apple1>();	//FruitBox 객체를 생성하지만 여기에는 Apple1 타입의 객체만을 담을 수있다.
		
		fruitBox.add(new Apple1());	//fruitBox가 가리키는 객체에는 Fruit1클래스를 상속받은 Apple1, Grape1 객체 모두 담을 수 있다.
		fruitBox.add(new Grape1());
		appleBox.add(new Apple1());	//appleBox가 가리키는 객체에는 Apple1 객체만 담을 수 있다.
		appleBox.add(new Apple1());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
		//static 메서드를 호출하여 해당 box에 담긴 내용을 출력한다.
		//순차적으로 보면 for문으로 Fruit1 타입의 참조변수 f에 해당 인자값으로 전달 받은 box의 객체들이 ArrayList객체로 담기게 되고,
		//반복마다 String tmp에 toString의 결과로 문자열이 더해 진다. 끝으로 Juice(tmp)를 통하여 tmp에 저장된 문자열에 Juice문자열이 더해진 결과가 반환된다.
		
	}
}

class FruitBox<T extends Fruit1> extends Box1<T>{
	//과일 박스 클래스, Fruit1 클래스를 상속받는 타입변수 T를 지정하였고 Box1 클래스를 상속받는다.
}

class Box1<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item)	{	list.add(item);	}
	T get(int i)		{	return list.get(i);	}
	ArrayList<T> getList()	{	return list;	}
	int size()			{	return list.size();	}
	public String toString() {	return list.toString();	}
}
