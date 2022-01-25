package ch09;

class Card{
	String kind;
	int number;
	
	Card(){	//매개변수가 없는 생성자를 통해 객체 생성시 변수에 대한 내용을 초기화 하는데 기본값을 설정하였다.
		this("SPADE", 1);
	}
	
	Card(String kind, int number){	//매개변수가 없을때 이 생성자를 호출하여 인자값을 자기자신의 변수들에 설정해준다.
		this.kind = kind;
		this.number = number;
	}
}

class CardToString {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println("toString c1 : " + c1.toString());
		System.out.println("toString c2 : " + c2.toString());
		//객체 생성 후 Object 클래스의 toString() 메서드를 호출 한 결과로 패키지명.클래스명@해시코드가 반환된다.
		//해당 메서드는 아래와 같다 모든 객체의 조상이므로 public 접근제어자를 사용하였다.
		//public String toString() {
        //return getClass().getName() + "@" + Integer.toHexString(hashCode());
		//}
	}
}
