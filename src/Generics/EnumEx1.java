package Generics;

enum Direction { EAST, SOUTH, WEST, NORTH }
//열거형 정의 Direction은 열거형의 이름이고 {}안의 내용은 상수이름이다.

class EnumEx1 {
	public static void main(String[] args) {
		Direction d1 = Direction.EAST;	//Direction 타입의 참조변수 d1을 선언하고 Direction안의 EAST를 저장한다. 객체화 됨.
		Direction d2 = Direction.valueOf("WEST");	//Direction열거형에서 "WEST"와 같은 값을 가진 데이터를 객체화 하여 저장한다.
		Direction d3 = Enum.valueOf(Direction.class, "EAST");	//Enum클래스로부터 valueOf()메서드를 호출하여 매개변수값으로 받은 내용을 리턴하여 참조변수에 저장한다.

		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);

		System.out.println("d1==d2 ? "+ (d1==d2));	//열거형 상수간에는 ==를 통한 비교가능하다 d1과 d2는 같지 않으므로 false가 출력된다.
		System.out.println("d1==d3 ? "+ (d1==d3));	//d1과 d3가 같은값으로 출력된다 이는 같은 인스턴스의 주소를 d1과 d3가 같이 가리킨다는 의미이다.
		System.out.println("d1.equals(d3) ? "+ d1.equals(d3));	//equals()메서드 또한 사용가능하나 == 연산자와 차이점은 속도이다. == 연산자가 더 빠르다.
//		System.out.println("d2 > d3 ? "+ (d1 > d3)); // 에러
		System.out.println("d1.compareTo(d3) ? "+ (d1.compareTo(d3)));	//<,> 과 같은 비교연산자는 사용이 불가능하나 compareTo()메서드를 통한 비교는 가능하다.
		System.out.println("d1.compareTo(d2) ? "+ (d1.compareTo(d2)));	//compareTo()는 비교대상이 같으면 0, 왼쪽이 더 크면 양수, 오른쪽이 더 크면 음수를 반환한다.

		switch(d1) {	//Enum은 상수이므로 switch로 반복이 가능하다.
			case EAST: // Direction.EAST라고 쓸 수 없다.
				System.out.println("The direction is EAST."); 
				break;
			case SOUTH:	//만약 d1이 가리키는 객체가 SOUTH라면 아래의 결과를 출력하고 반복을 끝낸다.
				System.out.println("The direction is SOUTH."); 
				break;
			case WEST:
				System.out.println("The direction is WEST."); 
				break;
			case NORTH:
				System.out.println("The direction is NORTH."); 
				break;
			default:	//일치하는 결과가 없다면 아래의 결과를 출력하고 반복을 끝낸다.
				System.out.println("Invalid direction."); 
//				break;
		}

		Direction[] dArr = Direction.values();	//Direction 타입의 배열을 선언하고 참조변수 dArr에 그 주소값을 담는다. 배열엔 Direction의 value()메서드를 통하여 반환받은 데이터를 저장한다.

		for(Direction d : dArr)  // for(Direction d : Direction.values()) 
			System.out.printf("%s=%d%n", d.name(), d.ordinal()); 
		//향상된 for문을 이용하여 Direction 타입의 참조변수 d에 dArr이 가기키는 배열의 데이터를 순차적으로 저장한다.
		//출력시 d의 name()메서드를 통하여 상수의 이름을 문자열로 반환하고 이 열거형상수가 정의된 순서를 같이 출력한다. 순서는 0 부터 시작한다(배열로 저장했으며 배열은 0번지부터 시작한다.)
	}
}
