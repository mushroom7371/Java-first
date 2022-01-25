package ch09;

class Card1{
	String kind;
	int number;
	
	Card1(){	//매개변수가 없는 생성자를 통해 객체 생성시 변수에 대한 내용을 초기화 하는데 기본값을 설정하였다.
		this("SPADE", 1);
	}
	
	Card1(String kind, int number){	//매개변수가 없을때 이 생성자를 호출하여 인자값을 자기자신의 변수들에 설정해준다.
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return "kind : " + kind + " number : " + number;
	}
}

class CardToString2 {
	public static void main(String[] args) {
		
		Card1 c1 = new Card1();
		//매개변수로 넘길 인자값이 주어지지 않을 때 생성자를 통한 기본 객체를 생성
		Card1 c2 = new Card1("HEART", 9);
		//인자값이 주어지므로 객체의 멤버변수에 해당 데이터가 저장됨
		
		System.out.println("toString c1 : " + c1.toString());
		System.out.println("toString c2 : " + c2.toString());
		//커스텀 클래스에서 toString() 메서드를 오버라이딩 하여 해당 메서드 호출시 오버라이딩 한 내용이 출력된다.
	}
}
