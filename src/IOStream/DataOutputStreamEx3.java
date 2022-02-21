package IOStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class DataOutputStreamEx3 {
	public static void main(String[] args) {
		int [] score = {100, 90, 95, 85, 50};
		//기본형 배열선언 및 초기화
		try {
			FileOutputStream fos = new FileOutputStream("score.dat");
			//FileOutputStream을 통한 score.dat 파일 생성
			DataOutputStream dos = new DataOutputStream(fos);
			
			for(int i = 0; i < score.length; i++) {
				dos.writeInt(score[i]);
			}
			//DataOutputStream을 이용하여 배열의 길이만큼 객체에 int값을 저장한다.
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
