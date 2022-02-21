package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit12	{	//과일 클래스
	String name;
	int weight;
	
	Fruit12(String name, int weight) {	//생성자를 통한 객체 생성시 과일 이름과 무게 설정
		this.name   = name;
		this.weight = weight;
	}

	public String toString() { return name+"("+weight+")";}	//출력 메서드 toString() 메서드 오버라이딩
	
}

class Apple12 extends Fruit12 {	//사과 클래스, 과일클래스를 상속받음
	Apple12(String name, int weight) {	//생성자를 통해 인자값으로 받은 데이터를
		super(name, weight);	//조상인 과일 클래스의 생성자로 넘겨 이름과 무게를 설정한다.
	}
}

class Grape12 extends Fruit12 {	//사과 클래스와 마찬가지
	Grape12(String name, int weight) {
		super(name, weight);
	}
}

class AppleComp implements Comparator<Apple12> {	//인터페이스 Comparator를 구현하였고 해당 인터페이스는 지네릭스로 인하여 Apple12객체만 저장가능하다.
	public int compare(Apple12 t1, Apple12 t2) {	//추상메서드를 구현하였다.
		return t2.weight - t1.weight;
	}
}

class GrapeComp implements Comparator<Grape12> {
	public int compare(Grape12 t1, Grape12 t2) {
		return t2.weight - t1.weight;
	}
}

class FruitComp implements Comparator<Fruit12> {
	public int compare(Fruit12 t1, Fruit12 t2) {
		return t1.weight - t2.weight;
	}
}

class FruitBoxEx4 {
	public static void main(String[] args) {
		FruitBox12<Apple12> appleBox = new FruitBox12<Apple12>();
		FruitBox12<Grape12> grapeBox = new FruitBox12<Grape12>();

		appleBox.add(new Apple12("GreenApple", 300));
		appleBox.add(new Apple12("GreenApple", 100));
		appleBox.add(new Apple12("GreenApple", 200));
		//해당 객체(appleBox가 가리키는)에 무게가 다른 사과 객체를 저장함

		grapeBox.add(new Grape12("GreenGrape", 400));
		grapeBox.add(new Grape12("GreenGrape", 300));
		grapeBox.add(new Grape12("GreenGrape", 200));
		//마찬가지

		Collections.sort(appleBox.getList(), new AppleComp());
		Collections.sort(grapeBox.getList(), new GrapeComp());	//Collections클래스의 sort()메서드를 통하여 상단의 *Comp()메서드를 기준으로 *Box안의 객체를 정렬한다.
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println();
		Collections.sort(appleBox.getList(), new FruitComp());
		Collections.sort(grapeBox.getList(), new FruitComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
	}  // main
}

class FruitBox12<T extends Fruit12> extends Box12<T> {}	//Fruit12 객체를 상속받는 타입T 객체만을 저장하는 클래스, Box12클래스를 상속받는다.

class Box12<T> {	//해당 내용은 FruitBoxEx3.java 참고
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	ArrayList<T> getList() { return list; }

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}