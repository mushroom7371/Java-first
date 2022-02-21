package IOStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx2 {
	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		byte[] temp = new byte[10];
		//byte 타입의 배열을 가리키는 참조변수를 각각 선언하고 {}, null, 길이10의 배열생성 등의 주소를 가리키게 한다.
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		//바이트 배열의 입출력을 하는데 사용하는 스트림 타입의 참조변수를 선언하고 null로 초기화
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		//각각 객체를 생성하고 하나는 매개변수로 inSrc를 넘겨준다.
		
		input.read(temp, 0, inSrc.length);	//input의 read()메서드로 temp가 가리키는 배열에 순서대로, 매개변수로 받은 inSrc의 0번지 데이터부터, inSrc배열의 길이만큼을 저장한다.
		output.write(temp, 5, 5);	//output의 write()메서드로 output이 가리키는 객체에 temp배열의, 5번째 데이터부터, 5의 길이만큼의 데이터를 저장한다.
		
		outSrc = output.toByteArray();
		//outSrc가 가리키는 byte 배열에 output 스트림의 내용을 배열로 저장한다.
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		//복사가 된 후의 결과를 출력
		
	}
}
