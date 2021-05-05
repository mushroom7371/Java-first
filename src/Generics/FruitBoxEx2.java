package Generics;

import java.util.ArrayList;

class Fruit111 implements Eatable {	//Fruit111 클래스를 선언하되 Eatable 인터페이스를 구현하였다
	public String toString() { return "Fruit";}	//String 타입을 반환하는 toString()메서드를 오버라이딩 하여 "Fruit"을 반환하도록 하였다.
}
class Apple111 extends Fruit111 { public String toString() { return "Apple";}}	//Apple111 클래스를 선언하였고 Fruit111을 상속받았다. Fruit111 클래스는 Eatable인터페이스를 구현 하였기에 Apple111클래스 또한 이를 구현한다.
class Grape111 extends Fruit111 { public String toString() { return "Grape";}}
class Toy111		          { public String toString() { return "Toy"  ;}}	//위의 클래스와는 다르게 상속받지 않은 단독 클래스이다.

interface Eatable {}	//인터페이스 클래스, 선언만 되어 있고 내용은 없다.

class FruitBoxEx2 {
	public static void main(String[] args) {
		FruitBox11<Fruit111> fruitBox = new FruitBox11<Fruit111>();	//FruitBox11 타입의 fruitBox 참조변수에 FruitBox11객체를 생성하고 주소를 저장하였다. FuritBox11에는 Fruit111 타입만 저장가능하게 지네릭으로 설정하였다
		FruitBox11<Apple111> appleBox = new FruitBox11<Apple111>();
		FruitBox11<Grape111> grapeBox = new FruitBox11<Grape111>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // 에러. 타입 불일치
//		FruitBox<Toy>   toyBox    = new FruitBox<Toy>();   // 에러.

		fruitBox.add(new Fruit111());
		fruitBox.add(new Apple111());
		fruitBox.add(new Grape111());
		appleBox.add(new Apple111());
//		appleBox.add(new Grape());  // 에러. Grape는 Apple의 자손이 아님
		grapeBox.add(new Grape111());

		System.out.println("fruitBox-"+fruitBox);
		System.out.println("appleBox-"+appleBox);
		System.out.println("grapeBox-"+grapeBox);
	}  // main
}

class FruitBox11<T extends Fruit111 & Eatable> extends Box111<T> {}
//FruitBox11 클래스에는 T타입만 저장할수 있으나 T타입은 Fruit111 클래스와 Eatable클래스를 and연산자로 통하여 상속받으므로 두개를 동시에 만족하는 타입이 들어간다 또한 클래스자체는 Box111클래스를 상속받는다

class Box111<T> {	//T타입이 저장되는 Box111클래스
	ArrayList<T> list = new ArrayList<T>();	//ArrayList타입의 list 참조변수를 선언하고 ArrayList객체를 생성하여 주소값을 저장하되 ArrayList 객체는 T타입의 데이터만 저장 가능하다.
	void add(T item)  { list.add(item);      }
	T get(int i)      { return list.get(i); }
	int size()        { return list.size();  }
	public String toString() { return list.toString();}
}
