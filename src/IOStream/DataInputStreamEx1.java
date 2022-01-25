package IOStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("sample.dat");
			//이미 만들어진 sample.dat 파일을 참조하는 참조변수를 선언함.
			DataInputStream dis = new DataInputStream(fis);
			//데이터를 다루기 위한 스트림 생성
			
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			//해당 파일에 저장된 정보들을 읽어들인다.
			
			dis.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
