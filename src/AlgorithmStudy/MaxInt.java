package AlgorithmStudy;

import java.util.Scanner; // 키보드로 부터 입력 받을 값을 사용하기 위한 Scanner 클래스를 불러온다.

public class MaxInt {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		// Scanner 타입의 참조변수 sc를 선언 하고 Scanner 클래스로부터 객체를 생성하여 그 주소값을 참조변수 sc에 저장한다.
		// System.in 은 키보드와 연결된 표준 입력 스트림(standard input stream)을 의미함.
		
		System.out.print("a 의 값은 : "); int a = sc.nextInt();
		// 생성된 인스턴스에 포함된 nextInt() 메서드를 호출하며 이는 키보드로 입력한 정수값을 얻어오는 역할을함.
		// 그리고 int 타입의 변수 a를 불러온 값으로 초기화 한다.
		System.out.print("b 의 값은 : "); int b = sc.nextInt();
		System.out.print("c 의 값은 : "); int c = sc.nextInt();
		
		int max = a;	//최대값을 담을 변수를 선언하고 a로 초기화 한다.
		
		if(max < b) {	//조건문을 통하여 max의 값(a에 저장된 값)이 b보다 작으면, 즉 b가 max 보다 크면
			max = b;	//b의 값을 max에 대입한다. 이로 인하여 두 값중 더 큰 수를 구할 수 있다.
		}
		
		if(max < c) {	//마찬가지 작업으로 3번째 숫자인 c 와 max 값을 비교하여 참이면 값을 대입한다.
			max = c;
		}
		
		System.out.println("입력 받은 정수의 최대값은 " + max + " 입니다."); //최종출력
	}
}
