package AlgorithmStudy;

import java.util.Scanner;

public class MaxOfArray {

	static int maxOf(int[] a) {	//static 제어자로 클래스가 메모리에 올라갈때 생성된다. 또한, 객체의 생성 없이 사용가능하다.
								//int 타입의 리턴값을 가지며 매개변수로 배열타입의 참조변수를 가진다.
		int max = a[0];	//int 타입의 변수를 선언하고 매개변수로 받은 배열의 0번지를 초기값으로 가진다.
		
		for(int i = 0; i < a.length; i++ )	//배열의 길이만큼 0부터 1씩 증가하며 반복한다.
			if(a[i] > max)	//a의 번지수의 값이 max의 값보다 크다면
				max = a[i];	//max에 a의 해당 번지수의 값으로 대입한다.
			return max;		//반복이 끝난 후 max를 반환한다.
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//키보드로 부터 입력받은 값을 사용하기 위해 Scanner 타입의 참조변수를 선언하고 Scanner객체를 생성한다.
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.println("사람 수 : ");
		int num = sc.nextInt();	//int형 변수 num을 선언하고 키보드로 입력받은 값을 nextInt()메서드를 통해 정수값으로 변환하여 저장한다.
		
		int [] height = new int[num];	//정수형 타입의 값을 저장하는 배열을 생성하고 길이를 입력받은 num의 값으로 설정하여 참조변수 height에 주소를 저장한다.
		
		for(int i = 0; i < num; i++) { //0번지에서 num의 길이 전까지 반복
			System.out.print("height[" + i + "] : ");
			height[i] = sc.nextInt();	//반복이 시행 될때 마다 키보드로 정보를 입력받아 저장한다. 즉 배열의 번지수 마다 값을 저장함.
		}

		System.out.println("최댓값은 " + maxOf(height) + " 입니다.");	//위의 static 메서드에서 최대값을 구하는 기능을 불러와 height 배열의 내용에서 최대값을 구한다.
	}

}
