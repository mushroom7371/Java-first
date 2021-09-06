package Generics;

import java.util.ArrayList;

class Fruit111 implements Eatable {	//Eatable 인터페이스를 구현한 Fruit111클래스를 구현하였다.
	public String toString() { return "Fruit";}	//Object클래스의 toString()메서드를 오버라이딩 하여 "Fruit"을 반환하도록 하였다. (모든 클래스의 조상은 Object 클래스라 가능)
}
class Apple111 extends Fruit111 { public String toString() { return "Apple";}}	//Apple111 클래스를 선언하였고 Fruit111을 상속받았다. 위의 내용처럼 Fruit111 클래스는 Eatable 인터페이스를 구현하였기에 Apple111클래스 또한 이 인터페이스가 구현된 상태다(가지고 있다)
class Grape111 extends Fruit111 { public String toString() { return "Grape";}}
class Toy111		          { public String toString() { return "Toy"  ;}}	//위의 클래스와는 다르게 상속받은 내용이 없기에 toString() 메서드를 오버라이딩 하여 같은 클래스 처럼 보이나 사실은 아무 내용 없다.

interface Eatable {}	//인터페이스 클래스, 선언만 되어 있고 내용은 없다.

class FruitBoxEx2 {
	public static void main(String[] args) {
		FruitBox11<Fruit111> fruitBox = new FruitBox11<Fruit111>();	//FruitBox11 타입의 fruitBox 참조변수에 FruitBox11객체를 생성하고 주소를 저장하였다. FuritBox11에는 Fruit111 타입만 저장가능하게 지네릭으로 설정하였다
		FruitBox11<Apple111> appleBox = new FruitBox11<Apple111>();
		FruitBox11<Grape111> grapeBox = new FruitBox11<Grape111>();
//		FruitBox11<Grape> grapeBox = new FruitBox11<Apple>(); // 에러. 타입 불일치
//		FruitBox11<Toy>   toyBox    = new FruitBox11<Toy>();   // 에러. FruitBox11는 지네릭을 통해 저장될 객체의 타입을 지정하였기에 인터페이스 Eatable을 구현한 fruit111 클래스를 상속받은 타입만 사용가능하다. 해당 내용은 하단에 정의

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
//FruitBox11 클래스에는 T타입만 저장할수 있으나 T타입은 Fruit111 클래스와 Eatable 인터페이스를 and연산자로 통하여 상속받으므로 두개를 동시에 만족하는 타입이 들어간다.
//이때 Eatable은 인터페이스지만 implements를 사용한 것이 아닌게 특이점임. 또한 FruitBox11클래스 자체는 Box111클래스를 상속받는다 (타입 변수의 상속과 클래스의 상속은 다름. 복잡함)
//타입변수 T는 extends를 사용하였기에 특정 타입의 자손들만 대입할 수있게 되었으며 지네릭으로 제한된 타입을 다시 한번 제한 했다고 볼 수 있다.

class Box111<T> {	//T타입이 저장되는 Box111클래스
	ArrayList<T> list = new ArrayList<T>();	//ArrayList타입의 list 참조변수를 선언하고 ArrayList객체를 생성하여 주소값을 저장하되 ArrayList 객체는 T타입의 데이터만 저장 가능하다.
	void add(T item)  { list.add(item);      }
	T get(int i)      { return list.get(i); }
	int size()        { return list.size();  }
	public String toString() { return list.toString();}
}
