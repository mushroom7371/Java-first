package AlgorithmStudy;

class Id {
	private static int counter = 0;		// 아이디를 몇 개 부여했는지 저장, static 변수로 클래스가 메모리에 적재될때 최초 한번 생성되며 인스턴스와 상관없이 호출 가능하다.
	private int id;						// 아이디

	// 생성자를 통해 증가된 클래스 변수를 인스턴스 변수에 저장한다.
	public Id(){
		id = ++counter;
	}

	// 아이디를 반환하는 인스턴트 메서드
	public int getId() {
		return id; 
	}

	// counter를 반환하는 클래스 메서드, 마찬가지로 객체의 생성없이 사용가능하다.
	public static int getCounter() {
		return counter;
	}
}

public class IdTester {
	public static void main(String[] args) {
		Id a = new Id();		// 아이디 1
		Id b = new Id();		// 아이디 2
		//참조변수 a, b에 각각 Id클래스로 부터 생성된 인스턴스의 주소를 담았지만, 아이디 갯수에 대한 정보는 초기화 되지 않고 늘어났다

		System.out.println("a의 아이디：" + a.getId());
		System.out.println("b의 아이디：" + b.getId());

		System.out.println("부여한 아이디의 개수 : " + Id.getCounter());
	}
}
