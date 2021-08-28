package IOStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx3 {
	public static void main(String[] args) {
		int [] score = {100, 90, 95, 85, 50};
		//�⺻�� �迭���� �� �ʱ�ȭ
		try {
			FileOutputStream fos = new FileOutputStream("score.dat");
			//FileOutputStream�� ���� score.dat ���� ����
			DataOutputStream dos = new DataOutputStream(fos);
			
			for(int i = 0; i < score.length; i++) {
				dos.writeInt(score[i]);
			}
			//DataOutputStream�� �̿��Ͽ� �迭�� ���̸�ŭ ��ü�� int���� �����Ѵ�.
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
