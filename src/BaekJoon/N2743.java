package BaekJoon;

import java.io.*;

//단어 길이 재기
public class N2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        bw.write(input.length() + "");
        br.close();
        bw.flush();
        bw.close();

    }
}
