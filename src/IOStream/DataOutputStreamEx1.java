package IOStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class DataOutputStreamEx1 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("sample.dat");
			//해당 워크스페이스 위치에 sample.dat 파일을 만듦
			dos = new DataOutputStream(fos);
			//sample.dat 파일에 data 정보를 입력하기 위한 작업
			dos.writeInt(10);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);
			//DataOutputStream 클래스의 메서드를 사용하여 해당 파일에 데이터를 입력한다.
			
			dos.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
