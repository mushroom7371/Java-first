package IOStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx3 {
	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		//byte[] 타입의 참조변수를 선언하고 각각 {}, null, 크기4 의 배열을 선언하여 주소값을 저장함.
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		//yteArrayIn(Out)putStream 타입의 참조변수를 선언하고 null 값으로 초기화
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		//각각의 참조변수에 타입에 맞는 객체를 생성하여 주소값을 저장하였다.(input은 매개변수로 inSrc를 받아서 객체를 생성)
		
		
		System.out.println("input : " + Arrays.toString(inSrc));
		//input의 내용을 출력하되 inSrc가 가리키는 배열을 문자열로 바꿔 출력
		
		try {	//while문에서 예외가 발생할 수 있기에 try/catch 문장으로 감싸두었다.
			while(input.available() > 0) {	//available()메서드는 현재 읽을 수 있는 바이트를 반환하는데 조건식 안의 의미는 읽을수 있는 바이트가 있다면과 동일한 결과를 얻는다.
				input.read(temp);	//input에 저장된 배열의 내용을 temp에 순차적으로 저장한다.
				output.write(temp);	//temp에 저장된 배열의 내용을 output에 저장한다.
				//System.out.println("temp : " + Arrays.toString(temp));
				
				outSrc = output.toByteArray();	//null 값으로 설정한 outSrc에 output의 데이터를 배열로 바꾸어 주소값을 저장하였다.
				printArrays(temp, outSrc);	//하단에 정의한 메서드를 통하여 배열을 문자열로 출력한다.
				//temp의 길이가 4이므로 반복 시행시 0~9 까지의 10개의 숫자가 4씩 끊어져서 temp에 저장되고, 4씩 output에 추가가 된다.
				//하지만 마지막 temp의 출력 내용을 보면 8,9에서 끝나는 것이 아니라 8,9,6,7, 로 출력이 되는데
				//이는 temp의 내용을 반복마다 새로 쓰는것이 아니라 덮어씌우는 것이기에 기존의 4,5,6,7의 뒷자리가 남게 되는 것이다.
				
				//이를 해결하기 위해서는 input.read(temp); output.write(temp);의 내용을 
				//int len = input.read(temp); output.write(temp, 0, len); 으로 바꾸어 데이터가 있을때까지의 길이를 설정해 주어 write()에 매개변수로 넣어주면 된다.
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	static void printArrays(byte [] temp, byte [] outSrc) {	//static 메서드로 메모리에 클래스가 올라갈때 실행되어 객체의 생성 없이 사용이 가능하다.
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
	}
}
