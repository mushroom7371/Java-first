package BaekJoon;

import java.io.*;

//별 찍기 -2(별찍기 우측 정렬)
public class N2439 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //BufferedReader,Writer 관련 내용은 N15552.java 파일 참고

        int num = Integer.parseInt(br.readLine());
        StringBuilder stars = new StringBuilder();
        //String 타입은 Character의 묶음이므로 초기에는 String 타입으로 정의하여 해당 번지수의 데이터를 변경하려 하였으나,
        //String 객체는 한번 생성하면 변경 할 수 없는 immutable 이므로 해당 인덱스에 접근 한다 하여도 값을 수정 할 수 없기에
        //StringBuilder를 통하여 입력받은 숫자만큼의 크기의 객체를 생성하고 해당 값을 빈 문자열로 초기화 하였다

        for(int i = 0; i < num; i++){
            stars.append(" ");
        }

        for(int i = stars.length() - 1; i >= 0; i--){   //우측 정렬이므로 뒷 번지 부터 공백을 *로 수정
            stars.setCharAt(i, '*');

            bw.write(stars.toString() + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
