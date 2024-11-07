package BaekJoon;

import java.io.*;

//사랑은 고려대입니다
public class N32384 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String s = "LoveisKoreaUniversity";

        for (int i = 0; i < n; i++) {
            if (i == n -1) {
                bw.write(s);
            } else {
                bw.write(s + " ");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N32384().solution();
    }
}
