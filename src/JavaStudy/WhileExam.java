package JavaStudy;

public class WhileExam {
	public static void main(String args []) {
		int i = 1;	// 정수형 타입의 변수 i를 선언하고 초기값을 1로 설정한다.
		
		while( i <= 10) {	//반복으로 실행할 명령어인 while과 조건식을 작성한다 조건이 true일때만 실행
			System.out.println(i);	//출력
			i++;	//증감연산자로 출력한 i에 1을 더한다 마지막 i가 10일때는 11로 증가 되지만 조건을 빠져나오기때문에 출력은 되지 않는다
		}
	}
}
