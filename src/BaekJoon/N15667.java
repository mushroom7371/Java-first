package BaekJoon;

import java.io.*;

//2018 연세대학교 프로그래밍 경진대회
public class N15667 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfFireworks = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 100; i++) {
            int temp = 1 + i + i * i;

            if (temp == numberOfFireworks) {
                bw.write(String.valueOf(i));
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15667().solution();
    }
}
