package BaekJoon;

import java.io.*;

//팩토리얼 2
public class N27433 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N27433().solution();
    }
}
