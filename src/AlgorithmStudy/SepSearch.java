package AlgorithmStudy;

import java.util.Scanner;

public class SepSearch {

	static int sepSearch(int [] a, int n, int key) {
		//static 메서드로 클래스가 메모리에 적재될때 생성되어 따로 객체를 생성할 필요 없이 사용가능하다
		//int 타입을 리턴값으로 가지며 매개변수로 3개의 값을 받는다.
		int i = 0;
		//값을 찾기위한 정수형 변수를 선언하고 초기값을 1로 설정함.

		while(true) {	//while 반복문을 실행하는데 조건식이 true 이므로 항상 실행된다.
			if( i == n)
				return -1;
			//선언한 변수값이 n과 같다면 -1을 리턴한다.
			if( a[i] == key)
				return i;
			//매개변수로 받은 배열의 i번지가 key와 같다면 i의 값을 리턴한다.
			i++;
			//if 문장의 조건에 부합하는 경우가 없을 경우 i를 1 증가시켜 반복을 실행한다.
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		//키보드로 전달받은 숫자를 int 타입의 변수 num에 저장한다.
		int [] x = new int[num];
		//int 타입의 배열을 저장할 참조변수 x를 선언하고 여기에 num의 숫자만큼의 길이를 가지는 배열을 생성하고 주소값을 저장한다.
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		//배열 x의 0 번지에서 num-1 번지까지 키보드로 입력받은 정수를 저장한다.
		
		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();
		//검색할 값을 저장하기위한 int 타입 변수를 선언하고 키보드로 부터 받은 값을 저장한다.
		int idx = sepSearch(x, num, ky);
		//sepSearch()메서드를 호출하여 리턴받은 값을 변수 idx에 저장한다.
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "] 에 있습니다.");
		//깃 클론 확인용 수정
	}

}
