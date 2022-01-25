package JavaStudy;

public class ReferenceTypeExam {
	public static void main(String args[]) {
		ReferenceTypeExam rtx = new ReferenceTypeExam();
		//클래스로 부터 인스턴스를 생성하고 이를 ReferenceTypeExam 타입의 참조변수에 주소값을 저장한다.
		
		int value = 10;	// 정수형 변수 선언 및 초기화
		rtx.addOne(value);	//인스턴스의 메서드를 호출하고 매개변수에 value를 대입한다. 10이 대입됨.
		System.out.println("기본형 변수의 값을 다른 메서드에서 변경한 결과 :" + value);
		//addOne 메서드에 value 10이 대입되고 value++로 인해 11이 되는것 같지만, 해당 매서드는 리턴값이
		//없으며 이미 클래스로 부터 생성된 인스턴스의 value의 값이 변하는것이 아니기 때문에 10이 출력된다.
		
		int arr [] = {10}; // 정수형 값을 담는 배열을 생성하고 초기화 한 후 이 주소값을 참조형 변수 arr에 저장한다.
		rtx.addOne(arr);	//인스턴스의 메서드를 호출하고 매개변수에 주소값을 대입함.
        System.out.println("참조형 변수의 값을 다른 메서드에서 변경한 결과: " + arr[0]);
        //위의 결과와는 다르게 배열 arr은 인스턴스화 되어 만들어질때 10이라는 값이 담긴 배열의 주소값이 저장된것이므로
        //메서드의 실행 결과 주소값이 변하는게 아닌 주소가 가리키는 곳의 정수 10을 11로 변경한 것을 가리키기 때문에
        //결과적으로 값이 저장된 11이 출력되게 된다.
	}
	
	public void addOne(int value) {
		value++;
	}
	
	public void addOne(int [] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i]++;
		}
	}
}
