package Generics;

import java.util.ArrayList;

class Fruit1{	public String toString() {	return "Fruit";}	}
class Apple1 extends Fruit1{	public String toString() {	return "Apple";	}	}
class Grape1 extends Fruit1{	public String toString() {	return "Grape";	}	}
//Fruit1Ŭ������ �̸� ��ӹ޴� Apple1, Grape1 Ŭ���� ����

class Juice{
	String name;
	
	Juice(String name){	//�����ڸ� ���Ͽ� ���ڰ����� ���� �����͸� �����Ͽ� ��ü ������ �ʱ�ȭ ������ ��
		this.name = name + "Juice";	//Juice Ŭ������ ��������� name�� ���ڰ����� ���� ���ڿ� + Juice��� �����Ѵ�.
	}
	
	public String toString() {	//Object Ŭ������ toString()�޼��带 �������̵� �Ͽ���.
		return name;
	}
}

class Juicer{
	static Juice makeJuice(FruitBox<? extends Fruit1> box) {	//static���� ���� �Ͽ��⿡ Ŭ������ �޸𸮿� �ö� ���� ���� ��밡���ϴ�.
		String tmp = "";
		
		for(Fruit1 f : box.getList())	//���� for������ Furit1 Ÿ���� �������� f�� ���ڰ����� ���� �ν��Ͻ��� getList() �޼����� ��ȯ���� �����Ѵ�.
			tmp += f + " ";
		return new Juice(tmp);
	}
}

class FruitBoxEx3 {
	public static void main(String[] args) {
		FruitBox<Fruit1> fruitBox = new FruitBox<Fruit1>();	//FruitBox ��ü�� ���������� ���⿡�� Fruit1 Ÿ���� ��ü���� ���� ���ִ�.
		FruitBox<Apple1> appleBox = new FruitBox<Apple1>();	//FruitBox ��ü�� ���������� ���⿡�� Apple1 Ÿ���� ��ü���� ���� ���ִ�.
		
		fruitBox.add(new Apple1());	//fruitBox�� ����Ű�� ��ü���� Fruit1Ŭ������ ��ӹ��� Apple1, Grape1 ��ü ��� ���� �� �ִ�.
		fruitBox.add(new Grape1());
		appleBox.add(new Apple1());	//appleBox�� ����Ű�� ��ü���� Apple1 ��ü�� ���� �� �ִ�.
		appleBox.add(new Apple1());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
		//static �޼��带 ȣ���Ͽ� �ش� box�� ��� ������ ����Ѵ�.
		//���������� ���� for������ Fruit1 Ÿ���� �������� f�� �ش� ���ڰ����� ���� ���� box�� ��ü���� ArrayList��ü�� ���� �ǰ�,
		//�ݺ����� String tmp�� toString�� ����� ���ڿ��� ���� ����. ������ Juice(tmp)�� ���Ͽ� tmp�� ����� ���ڿ��� Juice���ڿ��� ������ ����� ��ȯ�ȴ�.
		
	}
}

class FruitBox<T extends Fruit1> extends Box1<T>{
	//���� �ڽ� Ŭ����, Fruit1 Ŭ������ ��ӹ޴� Ÿ�Ժ��� T�� �����Ͽ��� Box1 Ŭ������ ��ӹ޴´�.
}

class Box1<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item)	{	list.add(item);	}
	T get(int i)		{	return list.get(i);	}
	ArrayList<T> getList()	{	return list;	}
	int size()			{	return list.size();	}
	public String toString() {	return list.toString();	}
}
