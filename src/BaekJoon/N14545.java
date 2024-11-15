package BaekJoon;

import java.io.*;

//Square
public class N14545 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int n = Integer.parseInt(br.readLine());

            long result = 0;
            for (long i = 1; i <= n; i++) {
                result += i * i;
            }

            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14545().solution();
    }
}
