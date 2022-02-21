package Practice;

class BlockTest{
	static {
		System.out.println("static { } 클래스 초기화 블럭, 프로그램 시작시 한번 수행됨");
	}

	{
		System.out.println("{ } 인스턴스 초기화 블럭, 인스턴스 생성시 수행됨.");
	}
	
	public BlockTest() {
		System.out.println("생성자");
	}

	public static void main(String [] args) {
		// 클래스 초기화 블럭이 한번 실행된다.
		BlockTest bt1 = new BlockTest();	// 인스턴스가 생성되므로 인스턴스 초기화 블럭이 실행된다.
		BlockTest bt2 = new BlockTest();
	}
}
