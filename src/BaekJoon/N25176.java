package BaekJoon;

import java.io.*;

//청정수열 (Easy)
public class N25176 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int a = 1;

        for (int i = 1; i < n+1; i++) {
            a *= i;
        }

        bw.write(a + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25176().solution();
    }
}
