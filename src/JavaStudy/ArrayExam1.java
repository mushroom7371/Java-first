package JavaStudy;

public class ArrayExam1 {
	public static void main(String [] args) {
		int [] array = new int[100];
		//정수 타입의 값을 저장하는 배열을 새로 만들고 크기를 100으로 정한다.
		//새로 만든 배열의 주소값을 참조변수 array에 저장한다
		int sum = 0;	//지역변수로 선언하면 반복당시의 값만 저장하고 마지막 결과반 저장되므로 멤버변수로 선언
		
		for(int i = 0; i < array.length; i++) {	//for 반복문
			array[i] = i + 1;	//배열의 첫 번지가 0으로 시작하므로 숫자를 맞추기 위해 1을 더해줌
			
			System.out.println(array[i]);	//단순 배열 번지마다 저장된 값을 출력
		}
		
		for(int i = 0; i <array.length; i++) {
			sum = sum + array[i];	//변수 sum에 배열의 번지마다의 값을 저장하지만 멤버변수이기에 값이 누적된다.
		}
		System.out.println(sum);
	}
}
