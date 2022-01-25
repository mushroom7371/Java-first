package JavaStudy;

public abstract class Bird {
		//추상 메서드를 만들기 위해서는 클래스 또한 추상 클래스로 만들어야 한다.
	public abstract void sing();
		//새의 종류별로 sing 메서드를 호출시 울음소리가 다를 것이므로 정확히 어떤것으로 구현부를 정할 수 없다.
		//그렇기 때문에 일단 상속을 받고나서 새의 종류마다 기능을 작성하기 위해 추상 메서드로 만들어 놓는다.
	
	public void fly() {
		//새의 공통적인 부분으로 fly라는 메서드를 가질수 있기에 구현부를 정할 수 있다.(날지 못하는 새도 있지만 예외로 둔다.)
		System.out.println("날아올라~");
	}
}
