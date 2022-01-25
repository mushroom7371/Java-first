package AlgorithmStudy;
import java.util.Scanner;
//원하는 갯수의 데이터를 입력 받아 요솟수가 N인 배열에 마지막 N개를 저장

//링 버퍼 활용 클래스
class LastNElements {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		final int N = 10;			//저장할 갯수를 상수로 선언함.
		int [] a = new int[N];		//N의 크기만큼 배열 생성
		int cnt = 0;				//입력 받은 총 데이터 갯수
		int retry;					//재시도

		System.out.println("정수를 입력하세요.");

		do {	//do whlie 문을 이용하여 최소 한번의 실행을 보장한다.
			
			System.out.printf("%d번째 정수：", cnt + 1);	//cnt의 초기 설정은 0 이므로 첫번째 정수부터 시작됨.
			a[cnt++ % N] = stdIn.nextInt();				//나머지 연산자를 이용하여 10을 나눈 나머지에 대한 번지의 데이터를 키보드로 입력받은 숫자로 설정한다.
			//예를 들어 첫번째 시행의 경우 a[0 % 10] 즉, a[0]의 값을 입력받은 수로 저장하고 cnt의 값을 1 증가시킨다.
			// % 10 을 통하여 반복 시행시 마다 0~9번지에 대한 데이터를 설정한다.

			System.out.print("계속 할까요? (예.1／아니오.0）：");
			retry = stdIn.nextInt();
		} while (retry == 1);
		
		//출력용 로직
		int i = cnt - N;
		if (i < 0) i = 0;

		for ( ; i < cnt; i++)
			System.out.printf("%2d번째의 정수 ＝ %d\n", i + 1, a[i % N]);
	}
}
