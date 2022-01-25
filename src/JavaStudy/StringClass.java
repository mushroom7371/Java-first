package JavaStudy;

public class StringClass {
	public static void main(String args []) {
		String str1 = "Hello";	//String 클래스로 부터 인스턴스를 생성할 때는 new 명령어가 필요없다.
		String str2 = "Hello";
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		if(str1 == str2) {
			System.out.println("str1 과 str2는 같습니다.");
			//Hello는 상수가 저장되는 영역? 에 생성되는 배열이고 str1으로 만들어진 배열이 있으므로
			//srt2는 이미 만들어진 배열의 주소값을 참조하게 되어 같은 주소값을 가지므로 조건문은 참이 된다.
		}
		
		if(str1 == str3) {
			System.out.println("str1 과 str3는 같습니다.");
			//상수영역? 에 만들어진 인스턴스와 str3로 인하여 새로 생성된 인스턴스는 비록 같은 문자열을 가지고 있지만
			//주소가 다르기 때문에 이 둘은 조건문에서 거짓이 된다.
		}
		
		if(str3 == str4) {
			System.out.println("str3 과 str4는 같습니다.");
			//마찬가지로 str3과 str4는 같은 클래스인 String에서 생성된 인스턴스지만
			//서로 다른 주소값을 가지는 인스턴스이므로 같지 않다.
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3 과 str4의 문자는 서로 같습니다.");
			//위의 예시와는 다르게 조건식 안의 내용은 String 클래스로 부터 만들어진 인스턴스의 기능중 하나인
			//equals 메서드를 호출하여 단순하게 저장된 문자의 값이 같은지를 확인하기에 참이 된다.
		}
	}
}
