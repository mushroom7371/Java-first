package ch05;

import java.util.Arrays;

public class ArrayCopyEx1 {
	public static void main(String args []) {
		int [] arr = {1, 2, 3, 4, 5};
		//int 타입의 데이터를 저장하는 배열 선언과 동시에 초기화. 길이는 자동으로 초기화 데이터 갯수로 설정됨
		int [] temp = new int[arr.length*2];
		//배열의 복사를 위해 선언한 배열, 크기값을 배열 arr의 길이의 두배로 설정해 두었다 초기값은 0
		
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		//temp배열의 각 번지수에 arr배열의 번지수 데이터를 저장함.
		
		arr = temp;
		//이로 인해 참조변수 arr은 기존에 가리키는 주소값을 잃어버리고 배열temp의 주소값을 가진다.
		//잃어버린 주소는 GC 가비지 컬렉터에 의해 정리되어 사라진다.
		
		System.out.println(Arrays.toString(temp));
		//배열을 출력하기 위한 Arrays 클래스의 toString() 메서드를 사용
		
		
		//arraycopy를 이용한 배열 복사
		char [] abc = {'a', 'b', 'c', 'd'};
		char [] num = {'0', '1', '2', '3'};
		
		char [] result = new char[abc.length + num.length];
		//복사 대상인 배열을 선언하고 길이를 배열 abc, num의 크기를 더한 만큼 선언한다.
		
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		//System 클래스에서 제공하는 arraycopy() 메서드를 통하여 복사를 실시한다.
		System.out.println(Arrays.toString(result));
	}
}
