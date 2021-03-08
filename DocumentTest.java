package Practice;

class Document {
	static int count = 0;	// int 타입의 클래스 변수를 선언하고 0으로 초기화
	String name;	//	String 타입의 인스턴스 변수를 선언 초기화 null
	
	Document(){
		this("제목없음" + ++count);	// 인스턴스 생성시 클래스변수가 카운트 되어 저장됨
	}
	
	Document(String name){
		this.name = name;
		System.out.println("이 문서의 제목은 " + this.name + "입니다.");	//제목 입력시 그대로 출력
	}
}

class DocumentTest{
	public static void main(String [] args) {
		Document d1 = new Document();	// 0에서 증감 생성자로 인하여 1로 카운트되어 출력
		Document d2 = new Document("name");
		Document d3 = new Document();	// 1에서 2로
		Document d4 = new Document();	// 2에서 3으로
	}
}
