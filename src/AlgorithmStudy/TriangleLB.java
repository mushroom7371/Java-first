package AlgorithmStudy;

import java.util.Scanner;

public class TriangleLB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //키보드로 값을 입력받기위해 Scanner 인스턴스를 생성하고  Scanner 타입의 참조변수 sc에 주소값을 저장한다.
		int n; //int 타입의 변수 n을 선언한다 초기화를 하지 않아 0으로 초기값이 설정됨
		
		System.out.println("왼쪽아래가 직각인 이등변 삼각형을 출력합니다.");
		
		do {	//do while 반복분 do{}안의 내용은 무조건 한번 반복된다.
			System.out.println("단 수를 입력해 주세요.");
			n = sc.nextInt();	//앞서 필드에서 선언한 변수 n에 키보드로 입력받은 값을 nextInt()메서드를 호출하여 int 값으로 변경한 후 저장한다.
		}while(n <= 0);	//while 문의 조건이 참이 되면, 즉 입력받은 숫자가 0이하 이면 다시 do{}로 올라가서 반복을 실시한다. 조건이 거짓이면 아래로 내려간다.
		
		for(int i = 1; i <= n; i++) {	//int 타입의 변수 i를 선언하고 1로 초기화 한후, 키보드로 입력받은 n 이하 까지 1씩 증가시켜 반복한다.
			for(int j = 1; j <= i; j++) {	//i가 반복할때마다 다시 반복을 시키는데  i이전까지 반복을 실시한다.
				System.out.print("*");	//만약 i가 2라고 가정하면, j는 1때 *을 한번 출력하고 줄띄기를 하지않은 상태에서 j가 2가되며 다시 한변 *을 찍는다 이러한 로직으로 j가 i가 될때까지 *을 출력한다.
			}
			System.out.println();	//i가 증가할때마다 줄띄기를 실행한다.
		}

	}

}
