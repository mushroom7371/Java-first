package Generics;

import java.util.ArrayList;

class Fruit111 implements Eatable {	//Eatable �������̽��� ������ Fruit111Ŭ������ �����Ͽ���.
	public String toString() { return "Fruit";}	//ObjectŬ������ toString()�޼��带 �������̵� �Ͽ� "Fruit"�� ��ȯ�ϵ��� �Ͽ���. (��� Ŭ������ ������ Object Ŭ������ ����)
}
class Apple111 extends Fruit111 { public String toString() { return "Apple";}}	//Apple111 Ŭ������ �����Ͽ��� Fruit111�� ��ӹ޾Ҵ�. ���� ����ó�� Fruit111 Ŭ������ Eatable �������̽��� �����Ͽ��⿡ Apple111Ŭ���� ���� �� �������̽��� ������ ���´�(������ �ִ�)
class Grape111 extends Fruit111 { public String toString() { return "Grape";}}
class Toy111		          { public String toString() { return "Toy"  ;}}	//���� Ŭ�����ʹ� �ٸ��� ��ӹ��� ������ ���⿡ toString() �޼��带 �������̵� �Ͽ� ���� Ŭ���� ó�� ���̳� ����� �ƹ� ���� ����.

interface Eatable {}	//�������̽� Ŭ����, ���� �Ǿ� �ְ� ������ ����.

class FruitBoxEx2 {
	public static void main(String[] args) {
		FruitBox11<Fruit111> fruitBox = new FruitBox11<Fruit111>();	//FruitBox11 Ÿ���� fruitBox ���������� FruitBox11��ü�� �����ϰ� �ּҸ� �����Ͽ���. FuritBox11���� Fruit111 Ÿ�Ը� ���尡���ϰ� ���׸����� �����Ͽ���
		FruitBox11<Apple111> appleBox = new FruitBox11<Apple111>();
		FruitBox11<Grape111> grapeBox = new FruitBox11<Grape111>();
//		FruitBox11<Grape> grapeBox = new FruitBox11<Apple>(); // ����. Ÿ�� ����ġ
//		FruitBox11<Toy>   toyBox    = new FruitBox11<Toy>();   // ����. FruitBox11�� ���׸��� ���� ����� ��ü�� Ÿ���� �����Ͽ��⿡ �������̽� Eatable�� ������ fruit111 Ŭ������ ��ӹ��� Ÿ�Ը� ��밡���ϴ�. �ش� ������ �ϴܿ� ����

		fruitBox.add(new Fruit111());
		fruitBox.add(new Apple111());
		fruitBox.add(new Grape111());
		appleBox.add(new Apple111());
//		appleBox.add(new Grape());  // ����. Grape�� Apple�� �ڼ��� �ƴ�
		grapeBox.add(new Grape111());

		System.out.println("fruitBox-"+fruitBox);
		System.out.println("appleBox-"+appleBox);
		System.out.println("grapeBox-"+grapeBox);
	}  // main
}

class FruitBox11<T extends Fruit111 & Eatable> extends Box111<T> {}
//FruitBox11 Ŭ�������� TŸ�Ը� �����Ҽ� ������ TŸ���� Fruit111 Ŭ������ Eatable �������̽��� and�����ڷ� ���Ͽ� ��ӹ����Ƿ� �ΰ��� ���ÿ� �����ϴ� Ÿ���� ����.
//�̶� Eatable�� �������̽����� implements�� ����� ���� �ƴѰ� Ư������. ���� FruitBox11Ŭ���� ��ü�� Box111Ŭ������ ��ӹ޴´� (Ÿ�� ������ ��Ӱ� Ŭ������ ����� �ٸ�. ������)
//Ÿ�Ժ��� T�� extends�� ����Ͽ��⿡ Ư�� Ÿ���� �ڼյ鸸 ������ ���ְ� �Ǿ����� ���׸����� ���ѵ� Ÿ���� �ٽ� �ѹ� ���� �ߴٰ� �� �� �ִ�.

class Box111<T> {	//TŸ���� ����Ǵ� Box111Ŭ����
	ArrayList<T> list = new ArrayList<T>();	//ArrayListŸ���� list ���������� �����ϰ� ArrayList��ü�� �����Ͽ� �ּҰ��� �����ϵ� ArrayList ��ü�� TŸ���� �����͸� ���� �����ϴ�.
	void add(T item)  { list.add(item);      }
	T get(int i)      { return list.get(i); }
	int size()        { return list.size();  }
	public String toString() { return list.toString();}
}
