package AlgorithmStudy;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

	static int maxOf(int[]a) {	// 이전 MaxOfArray 클래스에서 대부분의 내용을 설명함
		int max = a[0];
		
		for(int i = 1; i < a.length; i++) 
			if(a[i] > max) 
				max = a[i];
				
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();	//Random 클래스를 사용하기 위해 인스턴스화 하여 참조변수에 주소를 담았다
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		System.out.print("인원 수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int [] height = new int[num];	//키보드로 입력받은 정수의 크기만큼의 길이를 가진 배열을 선언
		
		System.out.println("키 값은 아래와 같습니다.");
		
		for(int i = 0; i < height.length; i++) {
			height[i] = 100 +  rand.nextInt(90);	//Random클래스의 nextInt를 사용하여 0~89(0~n-1)까지의 난수를 구한다.
			System.out.println( i + "번째 사람의 키 : " + height[i]);
		}
		
		System.out.println("가장 큰 사람의 키는 : " + maxOf(height) + " 입니다.");
	}

}
