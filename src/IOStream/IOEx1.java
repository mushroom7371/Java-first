package IOStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx1 {
	public static void main(String[] args) {
		byte [] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte [] outSrc = null;
		//byte 배열 타입을 저장하는 참조변수를 선언하고 inSrc에는 {}; 안의 내용으로 초기화, output은 null 로 초기화한다.
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		//바이트배열의 데이터를 입/출력 하는데 사용되는 스트림 타입의 참조변수를 선언하고 null로 초기화 한다.
		
		input = new ByteArrayInputStream(inSrc);	//매개변수로 inScr를 받는 객체를 생성하여 주소를 참조변수에 저장한다.
		output = new ByteArrayOutputStream();	//클래스로 부터 매개변수가 없이 객체를 생성하여 주소를 참조변수에 저장한다.
		
		int data = 0;	//정수타입 변수를 선언 후 0으로 초기화
		
		while((data = input.read()) != -1) {	//반복을 시행하여 변수 data에 input에 read()메서드로 읽어올 값이 있다면( 읽어올 데이터가 없으면 -1을 반환한다.)
			output.write(data);	//그 데이터를 output의 write()메서드를 통하여 output이 가리키는 객체에 데이터를 저장한다.
		}
		
		outSrc = output.toByteArray();	//output에 저장된 객체를 Byte 배열로 반환하여 outSrc가 가리키는 배열에 저장
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("OutPut Source : " + Arrays.toString(outSrc));
		//위의 과정으로 복사된 내용을 출력한다.
	}
}
