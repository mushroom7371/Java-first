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
		
		String s = "abcdefg";
        StringBuffer sb1 = new StringBuffer(s); // String -> StringBuffer
		
        System.out.println("처음 상태 : " + sb1); //처음상태 : abcdefg
        System.out.println("문자열 String 변환 : " + sb1.toString()); //String 변환하기
        System.out.println("문자열 추출 : " + sb1.substring(2,4)); //문자열 추출하기
        System.out.println("문자열 추가 : " + sb1.insert(2,"추가")); //문자열 추가하기
        System.out.println("문자열 삭제 : " + sb1.delete(2,4)); //문자열 삭제하기
        System.out.println("문자열 연결 : " + sb1.append("hijk")); //문자열 붙이기
        System.out.println("문자열의 길이 : " + sb1.length()); //문자열의 길이구하기
        System.out.println("용량의 크기 : " + sb1.capacity()); //용량의 크기 구하기
        System.out.println("문자열 역순 변경 : " + sb1.reverse()); //문자열 뒤집기
        System.out.println("마지막 상태 : " + sb1); //마지막상태 : kjihgfedcba
        
        String s2 = "abcdefg";
        StringBuilder sb2 = new StringBuilder(s2); // String -> StringBuilder
		
        System.out.println("처음 상태 : " + sb2); //처음상태 : abcdefg
        System.out.println("문자열 String 변환 : " + sb2.toString()); //String 변환하기
        System.out.println("문자열 추출 : " + sb2.substring(2,4)); //문자열 추출하기
        System.out.println("문자열 추가 : " + sb2.insert(2,"추가")); //문자열 추가하기
        System.out.println("문자열 삭제 : " + sb2.delete(2,4)); //문자열 삭제하기
        System.out.println("문자열 연결 : " + sb2.append("hijk")); //문자열 붙이기
        System.out.println("문자열의 길이 : " + sb2.length()); //문자열의 길이구하기
        System.out.println("용량의 크기 : " + sb2.capacity()); //용량의 크기 구하기
        System.out.println("문자열 역순 변경 : " + sb2.reverse()); //문자열 뒤집기
        System.out.println("마지막 상태 : " + sb2); //마지막상태 : kjihgfedcba
		
		
	}
}
