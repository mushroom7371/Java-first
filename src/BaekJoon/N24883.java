package BaekJoon;

import java.io.*;

//자동완성
public class N24883 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String character = br.readLine();

        if (character.equals("N") || character.equals("n")) {
            bw.write("Naver D2");
        } else {
            bw.write("Naver Whale");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N24883().solution();
    }
}
