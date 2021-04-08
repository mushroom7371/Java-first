package JavaStudy;

public class ArrayExam {
	public int[] makeArray() {	//정수값을 담는 배열을 return받는 메서드를 선언한다.
		int [] array = new int[] {1,2,3,4,5};
		//정수 값을 저장하는 배열 타입의 참조변수 array를 선언하고
		//정수 값을 저장하는 배열을 생성하고 값을 초기화 한 후 주소값을 참조변수 array에 저장한다.
		return array;	//참조변수 array를 반환한다.
	}
	
	public static void main(String [] args) {
		ArrayExam exam = new ArrayExam();
		//ArrayExam 타입의 참조변수 exam을 선언하고 new로 새로 생성한 ArrayExam 인스턴스의 주소값을 저장한다
		int [] array = exam.makeArray();
		//정수 값을 저장하는 배열 타입의 참조변수 array를 선언하고 참조변수 exam이 가리키는 곳의 인스턴스로 부터
		//makeArray메서드를 호출하여 리턴값을 저장한다
		
		for(int i = 0; i < array.length; i++) {	
			//반복문 안의 array.lenght는 배열의 길이를 의미한다
			System.out.println(array[i]);
		}
		
	}
}
