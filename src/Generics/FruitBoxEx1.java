package Generics;

import java.util.ArrayList;

class Fruit				  { public String toString() { return "Fruit";}}
	//Fruit Ŭ������ �����Ͽ��� Box Ŭ������ �޼��� ������ �������̵� �Ͽ���. => ����� ��� Ŭ������ ������ ObjectŬ������ �޼����� toString()�޼��带 �������̵� �Ͽ���.
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
	//Apple�� Grape Ŭ������ ���� FruitŬ������ ��ӹ޾Ұ� Box Ŭ������ �޼��� ������ �������̵� �Ͽ���. ���� ��������, ObjectŬ������ toString()�޼��带 �������̵� ��
class Toy		          { public String toString() { return "Toy"  ;}}
	//Toy Ŭ������ ����

class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();	//Box Ÿ���� �������� fruitBox�� �����ϰ� �������� ���� ���׸����� Ÿ�Ժ����� �����Ͽ��� Ÿ�� ������ Fruit�� �ش� Box<Fruit>��ü���� FruitŸ���� ��ü�� ������ �� �ִ�.
		Box<Apple> appleBox = new Box<Apple>();	//������� ��������
		Box<Toy>   toyBox   = new Box<Toy>();
//		Box<Grape> grapeBox = new Box<Apple>(); // ����. Ÿ�� ����ġ

		fruitBox.add(new Fruit());	//�ϴ��� BoxŬ������ ���׸��� ���Ͽ� Ÿ�Ժ����� ����Ͽ��⿡ Box<Fruit>Ŭ������ �ν��Ͻ��� ����Ű�� �������� fruitBox�� add()�޼��� ȣ��� FruitŸ���� ��ü�� ������ �����ϴ�. 
		fruitBox.add(new Apple()); 	//���������� Apple �ν��Ͻ��� �������� list�� ����Ű�� ArrayList��ü�� �߰� �Ͽ���. AppleŬ������ Fruit Ŭ������ �ڼ��̹Ƿ� ���ʸ� Ÿ�Ժ����� ���� ���� �ʴ´�. ������ �ֱ� ����

		appleBox.add(new Apple());	//appleBox�� ����Ű�� ��ü ���� ���׸��� ���� AppleŸ���� ��ü�� ������ �� �ִ�.
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
	ArrayList<T> list = new ArrayList<T>();	//����� Ÿ���� ��ü�� ���� �� �ִ� ArrayList ��ü�� �����ϰ� �������� list�� ����Ű���� �Ͽ���.
	void add(T item)  { list.add(item); }	// �Ű������� ���� ��ü�� list�� ����Ű�� ArrayList��ü�� �����ϴ� �޼��带 �����Ͽ���. TŸ������ �޾ƾ߸� ����ȴ�.
	T get(int i)      { return list.get(i); }	//int ������ �Ű����� i�� �޾� list�� i������ ���� ��ȯ�ϴµ� T Ÿ������ ��ȯ�ȴ�.
	int size() { return list.size(); }	//list�� size�� ��ȯ�ϴ� �޼���
	public String toString() { return list.toString();}	//list�� ������ toString()�޼���� ��ȯ�Ѵ�.
}
