package BaekJoon;

import java.io.*;

//체스판 조각
public class N3004 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int sum = 2;
        for (int i = 2; i <= n; i++) {
            sum += (i / 2) + 1;
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N3004().solution();
    }
}
