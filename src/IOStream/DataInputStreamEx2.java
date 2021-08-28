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
		//InputStream을 이용하여 dat 파일의 내용을 읽어들일 사전준비
		
		try {
			fis = new FileInputStream("score.dat");
			dis = new DataInputStream(fis);
			//score.dat파일을 불러온다.
			
			while(true) {
				score = dis.readInt();
				System.out.println(score);
				sum = sum + score;
				//해당 파일의 배열 score이 가리키는 객체에서 정수값을 읽어온다.
			}
		}catch(EOFException e) {
			System.out.println("점수의 총합은 " + sum + " 입니다.");
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
