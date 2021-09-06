package Generics;

import java.util.ArrayList;

class Fruit				  { public String toString() { return "Fruit";}}
	//Fruit 클래스를 선언하였고 Box 클래스의 메서드 내용을 오버라이딩 하였다. => 사실은 모든 클래스의 조상인 Object클래스의 메서드인 toString()메서드를 오버라이딩 하였다.
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
	//Apple와 Grape 클래스는 각각 Fruit클래스를 상속받았고 Box 클래스의 메서드 내용을 오버라이딩 하였다. 위와 마찬가지, Object클래스의 toString()메서드를 오버라이딩 함
class Toy		          { public String toString() { return "Toy"  ;}}
	//Toy 클래스를 선언

class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();	//Box 타입의 참조변수 fruitBox를 선언하고 안정성을 위해 지네릭으로 타입변수를 정의하였다 타입 변수는 Fruit로 해당 Box<Fruit>객체에는 Fruit타입의 객체만 저장할 수 있다.
		Box<Apple> appleBox = new Box<Apple>();	//윗내용과 마찬가지
		Box<Toy>   toyBox   = new Box<Toy>();
//		Box<Grape> grapeBox = new Box<Apple>(); // 에러. 타입 불일치

		fruitBox.add(new Fruit());	//하단의 Box클래스에 지네릭을 통하여 타입변수를 명시하였기에 Box<Fruit>클래스의 인스턴스를 가리키는 참조변수 fruitBox의 add()메서드 호출시 Fruit타입의 객체만 저장이 가능하다. 
		fruitBox.add(new Apple()); 	//마찬가지로 Apple 인스턴스를 참조변수 list가 가리키는 ArrayList객체에 추가 하였다. Apple클래스는 Fruit 클래스의 자손이므로 제너릭 타입변수에 위배 되지 않는다. 가지고 있기 때문

		appleBox.add(new Apple());	//appleBox가 가리키는 객체 또한 지네릭을 통해 Apple타입의 객체만 저장할 수 있다.
		appleBox.add(new Apple());
//		appleBox.add(new Toy()); // 에러. Box<Apple>에는 Apple만 담을 수 있음

		toyBox.add(new Toy());
//		toyBox.add(new Apple()); // 에러. Box<Toy>에는 Apple을 담을 수 없음

		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}  // main의 끝
}

class Box<T> {	//Box 클래스를 선언하되 지네릭을 이용하여 타입을 명시해 놓음
	ArrayList<T> list = new ArrayList<T>();	//명시한 타입의 객체를 담을 수 있는 ArrayList 객체를 생성하고 참조변수 list가 가리키도록 하였다.
	void add(T item)  { list.add(item); }	// 매개변수로 받은 객체를 list가 가리키는 ArrayList객체에 저장하는 메서드를 선언하였다. T타입으로 받아야만 저장된다.
	T get(int i)      { return list.get(i); }	//int 형식의 매개변수 i를 받아 list의 i번지의 값을 반환하는데 T 타입으로 반환된다.
	int size() { return list.size(); }	//list의 size를 반환하는 메서드
	public String toString() { return list.toString();}	//list의 내용을 toString()메서드로 반환한다.
}
