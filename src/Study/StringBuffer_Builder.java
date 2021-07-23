package Study;

public class StringBuffer_Builder {
	public static void main(String[] args) {
		String str = "hello";
		str = str + " world";
		System.out.println(str);
		//String 클래스의 참조변수 str이 가리키는 곳에 저장된 "hello"에 "world"가 더해진 것처럼 보이지만
		//사실은 str은 기존의 "hello"이 아닌 새로운 영역에 생성된 "hello world"을 가리키게 된다
		//또한 남겨진 "hello"는 가비지로 남아있다가 가비지컬렉터로 인해 사라지게 됨.
		//이는 String 클래스가 불변 속성을 가지고 있기 때문
		//이때문에 도입된것이 String_Buffer/Builder
		
		StringBuffer sb = new StringBuffer("hello");
		sb.append(" world");
		System.out.println(sb);
		//버퍼와 빌더는 가변성을 가졌기 때문에 append() delete() 등과 같은 메서드로 동일 객체내에서 문자열을 변경하는 것이 가능하다.
		
	}
}
