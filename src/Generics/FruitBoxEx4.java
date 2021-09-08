package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit12	{
	String name;
	int weight;
	
	Fruit12(String name, int weight) {
		this.name   = name;
		this.weight = weight;
	}

	public String toString() { return name+"("+weight+")";}
	
}

class Apple12 extends Fruit12 {
	Apple12(String name, int weight) {
		super(name, weight);
	}
}

class Grape12 extends Fruit12 {
	Grape12(String name, int weight) {
		super(name, weight);
	}
}

class AppleComp implements Comparator<Apple12> {
	public int compare(Apple12 t1, Apple12 t2) {
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

		grapeBox.add(new Grape12("GreenGrape", 400));
		grapeBox.add(new Grape12("GreenGrape", 300));
		grapeBox.add(new Grape12("GreenGrape", 200));

		Collections.sort(appleBox.getList(), new AppleComp());
		Collections.sort(grapeBox.getList(), new GrapeComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println();
		Collections.sort(appleBox.getList(), new FruitComp());
		Collections.sort(grapeBox.getList(), new FruitComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
	}  // main
}

class FruitBox12<T extends Fruit12> extends Box12<T> {}

class Box12<T> {
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