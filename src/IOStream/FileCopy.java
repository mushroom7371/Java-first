package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileCopy {

	public static void main(String[] args) {
		try {
			//input, output stream�� �̿��Ͽ� ���� ���縦 �ǽ��ϴ� �۾�. ���������� ��...
			FileInputStream fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);
			
			int data = 0;
			while((data=fis.read()) != -1) {
				//�⺻�� ���� data�� fis.read() �޼��带 ���� ��ȯ���� �����ϰ�, �� ���� -1�� �ɶ����� �Ʒ� ������ �����Ѵ�.
				fos.write(data);
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
