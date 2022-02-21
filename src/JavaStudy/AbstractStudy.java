package JavaStudy;

public class AbstractStudy {
	public static void main(String [] args) {
		attackSomething(new Knife());
		attackSomething(new Gun());
	}
	
	static void attackSomething(Weapon weapon) {
		//attackSomething 메서드의 매개변수로 Weapon 타입을 지정함으로써 Weapon 클래스로 부터
		//파생된 모든 클래스의 객체를 사용할 수 있게 됨. Weapon 클래스를 상속 받았다는 것은 인스턴스화 될시
		//Weapon의 인스턴스 또한 만들어져서 가지고 있다는 말이므로 가지고 있는 것을 참조하는 데에 문제가 없음.
		//또한 무기를 추가할 시 Weapon을 상속받게 하는 클래스만 만들어 주면 되기에 간편함.
		weapon.attack();
	}
}

abstract class Weapon{
	//공통으로 사용될 클래스이기 때문에 추상 클래스로 작성함.
	abstract void attack();
	//attack() 메서드는 무기에 따라 방법이 달라질 것이므로 추상메서드로 남겨둠 구현부는 각 상속받는 클래스에서 마저함
}

class Knife extends Weapon {	//칼은 무기의 종류이므로 Weapon 클래스를 상속받는다.
	void attack() {
		//상속받은 추상메서드의 구현부를 완성함. 칼이기 때문에 찌른다를 구현함.
		System.out.println("칼로 찌릅니다.");
	}
}

class Gun extends Weapon{	//총은 무기의 종류이므로 Weapon 클래스를 상속받는다.
	void attack() {
		//상속받은 추상메서드의 구현부를 완성함. 총이기 때문에 쏘는것을 구현함.
		System.out.println("총으로 쏩니다.");
	}
}
