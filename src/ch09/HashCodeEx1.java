package ch09;

class HashCodeEx1 {
	public static void main(String[] args) {
		String str1 = new String("123");
		String str2 = new String("123");
		//기본적으로 String 타입의 객체는 같은 내용이면 같은 객체를 가리킨다.
		
		System.out.println(str1.equals(str2));
		//equals()메서드를 통하여 같은 객체임을 확인 할 수있다.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//hashCode()메서드는 해싱 기법에 사용되는 해시함수를 구현한 것으로
		//해시함수는 찾고자 하는 값을 입력하면 그 값이 저장된 위치를 알려주는 해시코드를 반환한다.
		//위의 경우 같은 객체를 가리키고 저장된 위치가 같으므로 출력값이 동일하다.
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		//System.identityHashCode() 메서드는 위의 hashCode() 메서드 처럼 객체의 주소값을 가지고 해시코드를 생성하기 때문에
		//모든 객체에 대해서 항상 다른 해시코드값을 반환하게 된다.
		//str1과 str2가 해시코드는 같지만, 이 둘은 서로 다른 객체이다.
	}
}
