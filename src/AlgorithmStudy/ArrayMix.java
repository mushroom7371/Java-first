package AlgorithmStudy;

public class ArrayMix {

	public static void main(String[] args) {
		int [] arr = new int[45];	//길이가 45인 int타입의 값을 저장하는 배열을 생성하고 참조변수 arr에 주소값을 담는다.
		
		for(int i = 0; i < arr.length; i++) {	//arr 배열의 길이만큼 반복한다.
			arr[i] = i + 1;	//arr이 가리키는 배열의 첫번째 번지의 값을 1부터 1씩 증가하여 저장한다.
		
		}
		
		int temp = 0;	// 순서를 바꾸기위한 임시 변수 선언
		int j = 0;	//임의의 값을 저장하기 위한 변수
		
		for(int i = 0; i < 6; i++) {	//0~5까지 반복
			j = (int)(Math.random()*45) +1; //반복이 시작될때마다 int 타입의 변수 j에 난수 1~45까지의 값을 임의로 저장한다.
			
			temp = arr[i];	//기본변수 temp에 arr[i]번지의 수을 저장한다.
			arr[i] = arr[j];	//arr[i]의 값에 난수로 받은 j를 번지수로 가지는 arr[j]의 값을 저장한다. arr[j]는 j의 값을 가진다.
			arr[j] = temp;	//arr[j] 의 값을 temp에 저장하여 교환한다.
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}

	}

}
