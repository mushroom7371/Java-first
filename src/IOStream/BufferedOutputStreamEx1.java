package IOStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class BufferedOutputStreamEx1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			//123.txt 파일을 생성한다.
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			//참조변수 bos는 fos가 가리키는 객체의 크기를 5로 설정한 BufferdOutputStream 객체를 새로 생성하여 가리키도록 한다.
			
			for(int i = '1'; i <= '9'; i++) {
				bos.write(i);
				//1~9까지의 내용을 작성
			}
			
			bos.close();
			//스트림을 닫아준다.
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
