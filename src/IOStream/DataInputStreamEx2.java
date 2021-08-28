package IOStream;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

class DataInputStreamEx2 {

	public static void main(String[] args) {
		int sum = 0;
		int score = 0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		//InputStream�� �̿��Ͽ� dat ������ ������ �о���� �����غ�
		
		try {
			fis = new FileInputStream("score.dat");
			dis = new DataInputStream(fis);
			//score.dat������ �ҷ��´�.
			
			while(true) {
				score = dis.readInt();
				System.out.println(score);
				sum = sum + score;
				//�ش� ������ �迭 score�� ����Ű�� ��ü���� �������� �о�´�.
			}
		}catch(EOFException e) {
			System.out.println("������ ������ " + sum + " �Դϴ�.");
		}catch(IOException ie) {
			ie.printStackTrace();
		}finally {
			try {
				if(dis != null)
					dis.close();
			}catch(IOException ie) {
				ie.printStackTrace();
			}
		}
		
	}

}
