package BaekJoon;

import java.io.*;

//아스키코드
public class N11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = (int)br.readLine().charAt(0);
        //readLine()메서드는 String타입을 반환하므로 아스키코드로 변환하기 위해 Character 타입으로 변환 후 다시 Int 타입으로 변환했다.
        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
