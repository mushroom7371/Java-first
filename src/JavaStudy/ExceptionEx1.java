package JavaStudy;

public class ExceptionEx1 {
	public static void main(String args[]) {
		int arr[] = new int[10];	//int 타입의 배열을 저장하는 참조변수 arr을 선언하고
									//길이 10의 새로운 배열을 생성하여 이 주소값을 저장한다.
		
		try {	//예외가 발생 할 수있는 부분을 감싼다.
			arr[20] = 10;	//길이가 10인 배열에 20번지의 값을 10으로 초기화 하려고 하기에 오류가 발생
		}catch(Exception e) {	//오류가 발생 하였을때 실행되는 부분 생성자안에는 정확히
								//IndexOutOfBoundsException이 들어가게 되나 Exception을 상속받는 클래스이므로 상관없다
			System.out.println("오류발생!!");
		}finally {
			System.out.println("여기는 오류 발생 여부와 상관없이 무조건 실행!");
			//finally 구문은 출력 내용대로 무조건 실행되나 생략해도 되는 구문이다
		}
	}
}
