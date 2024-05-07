package BaekJoon;

import java.io.*;

//10!
public class N28352 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        long week = result / 604800;

        bw.write(week + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N28352().solution();
    }
}
