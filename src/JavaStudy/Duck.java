package JavaStudy;

public class Duck extends Bird {
	//Duck 클래스는 Bird 클래스로 부터 상속을 받는다. 상속을 받기에 부모클래스의 기능을 사용할 수있다.
	public void sing() {
		//하지만 부모클래스는 추상메서드를 가진 추상 클래스 이므로 추상메서드를 완성 시켜야 한다.
		System.out.println("오리는 꽥꽥");
	}
}
