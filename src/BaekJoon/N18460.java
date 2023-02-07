package BaekJoon;

import java.io.*;

//럭키 스트레이트
public class N18460 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String score = br.readLine();
        int length = score.length()/2;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            int frontNumber = score.charAt(i) - '0';
            int backNumber = score.charAt(length + i) - '0';

            sum += frontNumber - backNumber;
        }

        if (sum == 0) {
           bw.write("LUCKY");
        } else {
            bw.write("READY");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N18460().solution();
    }
}
