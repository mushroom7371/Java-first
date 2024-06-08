package BaekJoon;

import java.io.*;

//
public class N28224 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 0; i < testCase; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N28224().solution();
    }
}
