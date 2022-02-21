package AlgorithmStudy;

import java.util.Scanner;

public class ArrayEqual {
	
	static boolean equals(int [] a, int [] b){	//static 메서드로 클래스가 메모리에 적재될 때 생성된다. 따로 객체를 생성하지 않아도됨
		if(a.length != b.length)	//배열 a의 길이와 배열 b의 길이가 같지 않다면
			return false;	//반환값으로 false를 반환하고 종료된다. 같다면 밑으로 진행
		
		for(int i = 0; i<a.length; i++) {	//배열a의 길이만큼 반복한다.
			if(a[i] != b[i])	//배열a의 번지수의 값과 배열b의 번지수의 값이 같지 않다면
				return false;	//false를 반환하고 종료한다.
		}
		
		return true;	//배열a와 배열b가 같다면 true를 반환한다.
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Scanner 타입의 참조변수 sc를 선언 하고 Scanner 클래스로부터 객체를 생성하여 그 주소값을 참조변수 sc에 저장한다.
		// System.in 은 키보드와 연결된 표준 입력 스트림(standard input stream)을 의미함.
		
		System.out.println("a배열의 요솟수 : ");
		int ns = sc.nextInt();	//sc의 nextInt()메서드를 이용하여 입력받은 숫자값을 변수 ns에 저장
		
		int [] a = new int[ns];	//ns의 값만큼의 길이를 가진 int타입의 배열을 생성한 뒤 참조변수 a에 주소값을 저장한다.
		
		for(int i = 0; i < ns; i++) {	//ns의 값만큼 반복
			System.out.print("a[" + i +"] : ");
			a[i] = sc.nextInt();	//배열 a의 i번지에 키보드로 입력받은 수를 저장한다.
		}
		
		System.out.println("b배열의 요솟수 : ");
		int nb = sc.nextInt();
		
		int [] b = new int[nb];
		
		for(int i = 0; i < nb; i++) {
			System.out.print("b[" + i +"] : ");
			b[i] = sc.nextInt();
		}
		
		System.out.println("배열 a와 배열 b 는 " + (equals(a,b) ? "같습니다." : "같지 않습니다."));
		// 앞서 정의한 equals() 메서드를 통하여 배열 a와 배열b를 매개변수로 받고 이를 비교하여 같으면(true) "같습니다"를 출력 다르면(false)"다릅니다"를 출력
	}

}
