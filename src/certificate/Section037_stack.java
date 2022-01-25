package certificate;

import java.util.Scanner;
//스택 구현 Overflow, Underflow 출력
	class Section037_stack {
		static final int MAX = 5;	//스택의 크기를 지정 static 상수로 선언(바뀌지 않음)하여 클래스가 메모리에 적재될때 최초한번 생성된다.
		static int Stack[] = new int[MAX];	//int 타입의 크기5인 배열을 선언하고 주소값을 참조변수 Stack에 담는다.
		static int Top = -1;	//배열의 0번지 부터 시작하기 위해 -1로 초기화
		
		static int push(int ii) {	//인자값으로 int 타입의 변수를 받는 push() 메서드 객체 생성없이 사용가능하다.
			Top++;
			if (Top >= MAX) {	//변수 Top의 값이 배열의 크기인 5 이상이라면
				System.out.printf("Overflow\n");	//Overflow를 출력
				Top--;	//Top은 감소하여 4가 된다.
				return -1;	//-1을 반환함
			}
			Stack[Top] = ii;	//아니라면, 즉 5미만이라면
			return 0;	//0을 반환함
		}
		
		static int pop() {	//매개변수가 없는 pop()메서드 선언
			int r;
			if (Top < 0) {	//Top의 값이 0보다 작다면, 즉 배열의 크기보다 작다면
				System.out.printf("Underflow\n");	//Underflow를 출력
				return -1;	//-1을 반환함
			}
			r = Stack[Top];	//r은 참조변수 Stack이 가리키는 배열의 Top번지의 값으로 설정
			Top--;	//Top을 1감소 시킴
			return r;	//r을 반환(0)을 반환
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while (true) {	//조건이 참이므로 break문이 나오기 전까지 반복을 실시한다.
				int i, j, k;
				//i = 입력할 값,제거한 값, Overflow, Underflow 확인용 변수, j = 입력, 삭제를 선택할 변수, k = 스택에 저장될 자료를 입력 받을 변수
				System.out.printf("작업을 선택하세요.:");
				j = sc.nextInt();	//키보드로 입력받은 정수를 j에 저장
				if (j == 1) {	//j가 1이면
					System.out.printf("삽입할 숫자를 입력하세요.:");
					k = sc.nextInt();	//키보드로 입력받은 정수를 k에 저장
					i = push(k);	// push()메서드를 호출하여 스택에 순차대로 k값을 저장/ 스택이 가득차면 -1을, 아니면 0을 i에 저장
					if (i == -1) break;	//i가 -1이라면 스택이 가득 찼기에 while문을 빠져나온다.
				}
				else if (j == 2) {	//j가 2면
					i = pop();	//스택에서 데이터를 제거한다.
					if (i == -1) break;	//제거할 데이터가 없다면 반복을 빠져나온다.
					else
						System.out.printf("제거한 자료는 %d입니다\n", i);
				}
				else break;	//j가 1,2가 아닌 경우 아무것도 안하고 반복을 빠져나온다.
			}
			if (Top < 0)
				System.out.printf("스택에 자료가 없습니다.\n");
			else {
				System.out.printf("스택의 자료는 다음과 같습니다.\n");
				for (int i = Top; i >= 0; i--)
					System.out.printf("%10d\n", Stack[i]);
				}
			sc.close();
	}
}
