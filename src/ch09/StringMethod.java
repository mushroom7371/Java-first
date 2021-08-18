package ch09;

class StringMethod {

	public static void main(String[] args) {
		char [] c = {'h', 'e', 'l', 'l', 'o'};
		String s = new String(c);
		System.out.println(c);
		//char 타입의 배열로 문자열 인스턴스를 만들 수 있다.
		
		char c1 = s.charAt(4);
		System.out.println(c1);
		//지정된 위치(번지수)에 있는 문자를 알려준다.
		
		String s1 = s.concat(" world");
		System.out.println(s1);
		//문자열을 뒤에 덧붙힌다.
		
		boolean b = s.equals("hello");
		System.out.println(b);
		//매개변수로 받은 문자열과 String인스턴스의 문자열을 비교한다. 참이면 true를 반환
		
		int idx = s.indexOf("e");
		int idx1 = s.indexOf("ell");
		System.out.println(idx);
		System.out.println(idx1);
		//주어진 문자가 문자열에 존재하는지 확인하여 위치를 알려준다. 없다면 -1을 반환
		
		int length = s.length();
		System.out.println(length);
		//문자열의 길이를 반환 배열에서 자주 사용함
		
		String ab = s.replaceAll("ll", "LL");
		System.out.println(ab);
		//문자열중에서 지정된 문자열과 일치하는 것을 새로운 문자열로 변경한다.
		
		String animals = "dog,cat,cow";
		String [] arr = animals.split(",");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//문자열중 지정된 분리자로 나눠 문자열에 담아 반환한다.
		
		String sub = "123.abc.ABC";
		String sub1 = sub.substring(8);
		String sub2 = sub.substring(0, 3);
		System.out.println(sub1);
		System.out.println(sub2);
		//주어진 시작 위치부터 끝 범위에 포함된 문자열을 얻는다. 이때 끝 위치의 문자는 포함되지 않는다.
		
		String lower = s.toLowerCase();
		String upper = s.toUpperCase();
		System.out.println(lower);
		System.out.println(upper);
		//해당 문자열을 모두 소문자 또는 대문자로 변환하여 반환한다.
		
		String trim = "   Trim   Ex     ";
		String trimResult = trim.trim();
		System.out.println(trimResult);
		//문자열의 가장 왼쪽, 오른쪽의 공백을 제거한다. 중간 공백은 제거하지 않는다.
		
	}

}
