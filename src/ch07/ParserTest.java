package ch07;

interface Parseable{
	//인터페이스 작성,,, 멤버변수는 public static final 상수로만, 메서드는 public abstract 로 선언해야됨
	//생략시 컴파일시 컴파일러가 자동으로 생성해줌
	public abstract void parse(String fileName);
	//void parse(...); 과 같이 선언도 가능
}

class ParserManager{
	public static Parseable getParser(String type) {
		//return 타입이 인터페이스 라는 것은 return 값으로 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것을 의미
		//접근제어자를 public으로 선언하였으므로 제한없이 어디서든 사용가능하며 static 메서드로 인스턴스 생성없이 사용가능하다.
		if(type.equals("XML")) {
			return new XMLParser();
		}else {
			Parseable p = new HTMLParser();
			return p;
		}
		//문자열로 받아온 값을 조건문으로 판단하여 어떤 인스턴스를 반환할지 선택함
	}
}

class XMLParser implements Parseable{
	//각각 인터페이스를 구현한 클래스로 미구현 메서드를 완성해야된다.
	//만일 해당 메서드로 일부 구현으로 완성하지 못한다면 class에 abstract를 붙혀 추상클래스로 만들어야된다.
	public void parse(String fileName) {
		System.out.println(fileName + " - XML parsing completed.");
	}
}

class HTMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName + " - HTML parsing completed.");
	}
}

class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		//Parseable 타입의 참조변수 parser엔 getParser() 메서드로 인한 return값이 저장되는데
		//그 리턴값은 Parseable 인터페이스를 구현한 클래스의 인스턴스를 가리키는 주소값이다.
		//parser는 Parseable 인터페이스 타입이지만 인터페이스 역시 이을 구현한 클래스의 조상이라 할 수 있기에 조상타입의 참조변수로
		//이를 구현한 자손 인스턴스를 참조할 수 있다.
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
}
