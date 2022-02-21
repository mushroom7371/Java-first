package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileCopy {

	public static void main(String[] args) {
		try {
			//input, output stream을 이용하여 파일 복사를 실시하는 작업. 범위오류가 뜸...
			FileInputStream fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);
			
			int data = 0;
			while((data=fis.read()) != -1) {
				//기본형 변수 data에 fis.read() 메서드를 통해 반환값을 저장하고, 그 값이 -1이 될때까지 아래 내용을 진행한다.
				fos.write(data);
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
