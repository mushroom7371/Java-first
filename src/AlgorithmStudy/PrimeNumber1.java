package AlgorithmStudy;

public class PrimeNumber1 {

	public static void main(String[] args) {
		int counter = 0;	//나눗셈 횟수를 저장하기 위하여 int 타입의 변수 counter를 선언하고 0으로 초기화
		
		for(int n = 2; n <= 1000; n++) {	//int 타입의 변수 n을 선언하고 2로 초기화 한후, 1000이하까지 1씩 증가시키며 반복
			int i; //int 타입 변수 i를 선언 초기값은 0
			for (i = 2; i < n; i++) {	//for 문으로 n이 2부터 반복할때 마다 실행하는 for문
				counter++;	//counter를 1증가 시킨다
				if(n % i == 0)	//n을 i로 나눌때 나머지값이 0이 된다면
					break;	//i를 반복하는 for문을 나가서 다시 n을 반복하는 for문으로 올라간다.
			}
			if(n == i)	//n이 i 와 같다면
				System.out.println(n);	//n을 출력한다
		}
		//소수를 구하는 알고리즘으로 for문안에 for문을 중첩하면서 n이 i가 되기 전까지 반복하며 만약 n이 i가 되기전에 i로 나누어 0이 된다면 소수가 아니므로 다시 반복한다
		//다시 반복을 하면서 n을 i=2부터 1씩 증가하는 수로 나눴을때 나머지가 0이 아니면서 후위 증감자로 i가 n과 같은 수가 되었을 때(즉 소수가 되면) 그 값을 출력하는 프로그램이다.
		
		System.out.println("나눗셈을 실행한 횟수 : " + counter);	//counter를 출력

	}

}
