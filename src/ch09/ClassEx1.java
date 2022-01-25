package ch09;

final class Card2{
	String kind;
	int num;
	
	Card2(){
		this("SPADE", 1);
	}
	
	Card2(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	public String toString() {
		return kind + " : " + num;
	}
}

class ClassEx1 {
	public static void main(String[] args) {
		Card2 c = new Card2("HEART", 1);
		Card2 c2 = null;
	
		try{	//Class 객체를 이용해서 객체를 생성하는데 newInstace()메서드는 요즘 잘 안쓰인다고 함
				//또한 try문장으로 묶지 않으면 사용이 불가능하여 문장안에 포함시킴
			Card2 c3 = Card2.class.newInstance();
			c2 = c3;	
		}catch(Exception ex) {
			ex.printStackTrace();
		}	
		
		Class cObj = c.getClass();
		//생성된 객체로 부터 클래스의 정보를 얻기위해 참조함
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
		
	}
}
