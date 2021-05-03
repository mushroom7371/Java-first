package Generics;

import java.util.ArrayList;

class Fruit				  { public String toString() { return "Fruit";}}
	//Fruit Ŭ������ �����Ͽ��� Box Ŭ������ �޼��� ������ �������̵� �Ͽ���.
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
	//Apple�� Grape Ŭ������ ���� FruitŬ������ ��ӹ޾Ұ� Box Ŭ������ �޼��� ������ �������̵� �Ͽ���.
class Toy		          { public String toString() { return "Toy"  ;}}
	//Toy Ŭ������ ����

class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();	//Box Ÿ���� �������� fruitBox�� �����ϰ� �ٷ� ��ü�� Ÿ���� ���׸��� ���� <Fruit>���� ����س��� BoxŬ������ ���� ��ü�� �����Ͽ� �ּҰ��� �����Ͽ���
		Box<Apple> appleBox = new Box<Apple>();	//������� ��������
		Box<Toy>   toyBox   = new Box<Toy>();
//		Box<Grape> grapeBox = new Box<Apple>(); // ����. Ÿ�� ����ġ

		fruitBox.add(new Fruit());	//���� Ŭ���� Box�� �޼����� add()�� ���Ͽ� fruitBox �ν��Ͻ��� list�� Fruit �ν��Ͻ��� �����Ͽ���.
		fruitBox.add(new Apple()); 	//���������� Apple �ν��Ͻ��� list�� ��Ҵ� AppleŬ������ Fruit Ŭ������ �ڼ��̹Ƿ� ������ �����ϴ�.

		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy()); // ����. Box<Apple>���� Apple�� ���� �� ����

		toyBox.add(new Toy());
//		toyBox.add(new Apple()); // ����. Box<Toy>���� Apple�� ���� �� ����

		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}  // main�� ��
}

class Box<T> {	//Box Ŭ������ �����ϵ� ���׸��� �̿��Ͽ� Ÿ���� ����� ����
	ArrayList<T> list = new ArrayList<T>();	//����� ���·θ� ArrayList Ÿ���� ��ü�� �����ϵ��� �Ǿ��ִ� list���� <T> �������θ� �����
	void add(T item)  { list.add(item); }	// �Ű������� list�� �����ϴ� �޼��带 �����Ͽ��� TŸ������ ����ȴ�.
	T get(int i)      { return list.get(i); }	//int ������ �Ű����� i�� �޾� list�� i������ ���� ��ȯ�ϴµ� T Ÿ������ ��ȯ�ȴ�.
	int size() { return list.size(); }	//list�� size�� ��ȯ�ϴ� �޼���
	public String toString() { return list.toString();}	//list�� ������ toString()�޼���� ��ȯ�Ѵ�.
}
