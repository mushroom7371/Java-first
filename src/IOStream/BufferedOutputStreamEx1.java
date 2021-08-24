package IOStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class BufferedOutputStreamEx1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			//123.txt ������ �����Ѵ�.
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			//�������� bos�� fos�� ����Ű�� ��ü�� ũ�⸦ 5�� ������ BufferdOutputStream ��ü�� ���� �����Ͽ� ����Ű���� �Ѵ�.
			
			for(int i = '1'; i <= '9'; i++) {
				bos.write(i);
				//1~9������ ������ �ۼ�
			}
			
			bos.close();
			//��Ʈ���� �ݾ��ش�.
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
