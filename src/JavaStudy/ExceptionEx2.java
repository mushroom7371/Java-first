package JavaStudy;

public class ExceptionEx2 {
	public static void main(String [] args) {
		int x = 10;
		int y = 0;
		
		try {
			int k = divide(x, y);
			//divide 메서드를 호출 하고 리턴값을 저장하려 하는데 예외가 발생할 수 있는 지점
		}catch(ArithmeticException a) {
			System.out.println("오류 발생" + a.toString());
			//예외처리시 출력하되 a.toString을 이용하여 어떠한 예외가 나타났는지 명시해줄수있다.
		}
		
	}
	
	public static int divide(int x, int y) throws ArithmeticException {
		//예외처리를 위한 메서드 ArithmeticException을 예상하기 때문에 의도적으로 throws를 사용하였다.
		int k = x / y;	//정수 타입을 나눌때 0으로 나누게 되는 경우가 생길수 있음
		return k;
	}
}
