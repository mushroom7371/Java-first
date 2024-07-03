package BaekJoon;

import java.io.*;

//카드 게임
public class N5522 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5522().solution();
    }
}
