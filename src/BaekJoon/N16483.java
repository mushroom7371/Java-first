package BaekJoon;

import java.io.*;

//접시 안의 원
public class N16483 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.valueOf(br.readLine());

        bw.write(String.valueOf(Math.round(Math.pow(T / 2.0, 2))));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N16483().solution();
    }
}
