package BaekJoon;

import java.io.*;

//접두사 배열
public class N13322 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder target = new StringBuilder(br.readLine());

        for (int i = 0; i < target.length(); i++) {
            bw.write(i + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N13322().solution();
    }
}
