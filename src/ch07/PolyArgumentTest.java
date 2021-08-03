package ch07;

import java.util.Vector;

class Product{	//��ǰ�� ���� �κ��� ������ �ִ� �θ� Ŭ���� �ۼ�
	int price;	//����
	int bonusPoint;	//���ʽ�����Ʈ
	
	Product(int price){	//�����ڿ� �Ű������� �ִٸ� �ڱ��ڽ�(�θ�Ŭ����)�� ������ ���ݰ� ���ʽ� ����Ʈ�� ������.
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
	
	Product(){	//�����ڿ� �Ű������� ���ٸ� ��������� 0���� �ʱ�ȭ
		price = 0;
		bonusPoint = 0;
	}
}

class Tv2 extends Product{
	Tv2(){	//��ü ������ super() �����ڸ� �̿��Ͽ� �θ�Ŭ������ �����ڿ� �Ű������� 100�� �־� ���ݰ� ���ʽ�����Ʈ�� �����Ѵ�.
		super(100);
	}
	public String toString() {	//toString()�� Object Ŭ������ ���ǵ� �޼���� �������̵� �Ͽ��� �� �ش� ��ü�� �θ��� return���� ������ش�.
		return "Tv";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product{
	Audio(){
		super(50);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer{	//�� ������ ��� Ŭ����
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();	//VectorŬ������ ���� ��ü�� ������ �� �⺻ ������ �迭�� �����ǳ� ũ�Ⱑ 10���� �����ǰ� ũ�⸦ ������ ���������� ���Ѵ�. ��ü�迭��
	
	void buy(Product p) {	//buy() �޼��带 ȣ�� �� Product Ÿ���� ���������� �Ű������� �ް�
		if(money < p.price) {	//�� ���������� ����Ű�� ��ü�� ���ݺ��� �������� ���� �ݾ��� ���ٸ� �Ʒ��� ���� ���ڸ� ����ϰ� �ƹ��͵� ���Ѵ�.
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		//�������� ���� �ݾ��� ��ǰ�� ���ݺ��� ���ٸ� �ݾ��� ���ݸ�ŭ ����, ���ʽ� ����Ʈ�� ������Ų��
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		item.add(p);
		System.out.println(p + "��/�� �����߽��ϴ�.");
		//���� Vector Ÿ���� ��ü(item�� ����Ű��)�� ���������� ������(�ּҰ�)�� ���������� �����Ѵ�.
	}
	
	void refund(Product p) {	//ȯ���� ���� �޼���� ���� ��ü�� ��� �����͸� remove()�� �� �ִٸ�, �� ȯ���� ��ǰ�� �ִٸ�
		if(item.remove(p)) {
			money = money + p.price;
			bonusPoint = bonusPoint - p.bonusPoint;
			System.out.println(p + "��/�� ��ǰ �ϼ̽��ϴ�.");
			//�ݾװ� ���ʽ�����Ʈ�� �ǵ�����.
		}else {
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	
	void summary() {	//��ǰ�� �� �ݾ��� ���ϴ� �޼���
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {	//Vector ��ü�� �����ϴ� isEmpty()�޼��带 ���Ͽ� ����� ������(�ּҰ�)�� ���ٸ� ����� �ƹ��͵� ���� �ʴ´�.
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		
		for(int i = 0; i < item.size(); i++) {	//�����Ͱ� �ִٸ� ��ü�迭�� 0���� ���� ��� ũ�⸸ŭ 1�� �����ϸ� �ݺ��Ѵ�.
			Product p = (Product)item.get(i);	//Product Ÿ���� ���������� Vector��ü�� �� �������� ����Ű�� ��ü�� ����ȯ �Ͽ� �����Ѵ�.
			sum = sum + p.price;	//�ش� ��ü�� ������ �ѱݾ׿� ���ϰ�
			itemList += (i == 0) ? "" + p : ", " + p;	//3�� �����ڸ� ���Ͽ� String Ÿ���� ���������� toString���� ��ȯ�� ��ü�� ���ڿ��� ���Ѵ�.
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� : " + sum + " ���� �Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + " �Դϴ�.");
	}
}

class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv2 tv = new Tv2();
		Computer com = new Computer();
		Audio audio = new Audio();
		//������ Ŭ������ ���� ���� ��ü�� ������ ��
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		//Buyer ��ü�� buy()�޼��忡 �ش� ���������� �Ű������� �����Ͽ�
		//(�̶� �Ű������δ� Product Ÿ���� ���������� ������ �θ�/�ڽ� ����� ���Ͽ� �ڽ�Ÿ���� ���޵ȴ�) ����� �����Ѵ�.
		b.summary();
		System.out.println();
		
		b.refund(com);
		b.summary();
		//summary()�޼���� refund()�޼��带 ���Ͽ� ������ ����� �����Ѵ�. �ش� ����� ���� Ŭ�������� ������
	}
}
