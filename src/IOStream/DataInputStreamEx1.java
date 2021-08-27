package IOStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("sample.dat");
			//�̹� ������� sample.dat ������ �����ϴ� ���������� ������.
			DataInputStream dis = new DataInputStream(fis);
			//�����͸� �ٷ�� ���� ��Ʈ�� ����
			
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			//�ش� ���Ͽ� ����� �������� �о���δ�.
			
			dis.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
