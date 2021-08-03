package ch07;

import java.util.Vector;

class Product{	//제품의 공통 부분을 가지고 있는 부모 클래스 작성
	int price;	//가격
	int bonusPoint;	//보너스포인트
	
	Product(int price){	//생성자에 매개변수가 있다면 자기자신(부모클래스)의 변수인 가격과 보너스 포인트를 설정함.
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
	
	Product(){	//생성자에 매개변수가 없다면 멤버변수를 0으로 초기화
		price = 0;
		bonusPoint = 0;
	}
}

class Tv2 extends Product{
	Tv2(){	//객체 생성시 super() 생성자를 이용하여 부모클래스의 생성자에 매개변수로 100을 넣어 가격과 보너스포인트를 설정한다.
		super(100);
	}
	public String toString() {	//toString()은 Object 클래스에 정의된 메서드로 오버라이딩 하였을 시 해당 객체를 부를때 return값을 출력해준다.
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

class Buyer{	//고객 정보가 담긴 클래스
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();	//Vector클래스로 부터 객체를 생성할 시 기본 값으로 배열이 생성되나 크기가 10으로 설정되고 크기를 넘을시 가변적으로 변한다. 객체배열임
	
	void buy(Product p) {	//buy() 메서드를 호출 시 Product 타입의 참조변수를 매개변수로 받고
		if(money < p.price) {	//그 참조변수가 가리키는 객체의 가격보다 구매자의 보유 금액이 적다면 아래와 같은 문자를 출력하고 아무것도 안한다.
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		//구매자의 보유 금액이 물품의 가격보다 많다면 금액을 가격만큼 빼고, 보너스 포인트를 증가시킨다
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		item.add(p);
		System.out.println(p + "을/를 구입했습니다.");
		//또한 Vector 타입의 객체(item이 가리키는)에 참조변수의 데이터(주소값)를 순차적으로 저장한다.
	}
	
	void refund(Product p) {	//환불을 위한 메서드로 백터 객체에 담긴 데이터를 remove()할 수 있다면, 즉 환불할 제품이 있다면
		if(item.remove(p)) {
			money = money + p.price;
			bonusPoint = bonusPoint - p.bonusPoint;
			System.out.println(p + "을/를 반품 하셨습니다.");
			//금액과 보너스포인트를 되돌린다.
		}else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() {	//제품의 총 금액을 구하는 메서드
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {	//Vector 객체가 제공하는 isEmpty()메서드를 통하여 저장된 데이터(주소값)이 없다면 출력후 아무것도 하지 않는다.
			System.out.println("구입하신 물품이 없습니다.");
			return;
		}
		
		for(int i = 0; i < item.size(); i++) {	//데이터가 있다면 객체배열의 0번지 부터 담긴 크기만큼 1씩 증가하며 반복한다.
			Product p = (Product)item.get(i);	//Product 타입의 참조변수에 Vector객체의 각 번지수가 가리키는 객체를 형변환 하여 저장한다.
			sum = sum + p.price;	//해당 객체의 가격을 총금액에 더하고
			itemList += (i == 0) ? "" + p : ", " + p;	//3항 연산자를 통하여 String 타입의 참조변수에 toString으로 반환된 객체의 문자열을 더한다.
		}
		
		System.out.println("구입하신 물품의 총 금액은 : " + sum + " 만원 입니다.");
		System.out.println("구입하신 제품은 " + itemList + " 입니다.");
	}
}

class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv2 tv = new Tv2();
		Computer com = new Computer();
		Audio audio = new Audio();
		//각각의 클래스로 부터 새로 객체를 생성한 후
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		//Buyer 객체의 buy()메서드에 해당 참조변수를 매개변수로 전달하여
		//(이때 매개변수로는 Product 타입의 참조변수를 받으나 부모/자식 관계로 인하여 자식타입이 전달된다) 기능을 실행한다.
		b.summary();
		System.out.println();
		
		b.refund(com);
		b.summary();
		//summary()메서드와 refund()메서드를 통하여 각각의 기능을 실행한다. 해당 기능은 위의 클래스에서 설명함
	}
}
