package ch09;

class StringEx1 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		//String 클래스로 문자열 리터럴을 지정하여 생성하는 방법
		
		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");
		//둘다 출력 내용은 abc로 같다.
		
		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		//문자열 리터럴로 생성하였을 경우 서로 다른 참조변수로 다른 객체를 가리키는 것 같지만,
		//실제로는 이미 생성된 리터럴을 가리키고 있다. 즉, 참조변수만 다를뿐 같은 주소값을 가리킨다.
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		//생성자를 통하여 new 연산자로 생성하는 방법
		
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");
		//마찬가지로 같은 내용을 출력한다.
		
		System.out.println("str3 == str4 ? " + (str3 == str4));
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
		//String 클래스의 equals()메서드로 통하여 비교하였을 시에는 두 문자열의 내용을 비교하기에 true 값을 반환하지만,
		//각 참조변수의 주소를 등가비교연산자 '==' 를 이용하여 비교하였을 시에는
		//new 연산자로 인하여 메모리 할당이 이루어 졌기 때문에 새로운 인스턴스가 생성된 것이고 다른 주소값을 가리키게 되어
		//주소값이 일치하지 않는다는 결과가 나오게 된다.
		
	}
}
