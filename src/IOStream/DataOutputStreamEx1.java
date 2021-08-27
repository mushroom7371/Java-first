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
			//�ش� ��ũ�����̽� ��ġ�� sample.dat ������ ����
			dos = new DataOutputStream(fos);
			//sample.dat ���Ͽ� data ������ �Է��ϱ� ���� �۾�
			dos.writeInt(10);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);
			//DataOutputStream Ŭ������ �޼��带 ����Ͽ� �ش� ���Ͽ� �����͸� �Է��Ѵ�.
			
			dos.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
