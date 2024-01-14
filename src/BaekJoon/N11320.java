package BaekJoon;

import java.io.*;

//삼각 무늬 - 1
public class N11320 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.valueOf(br.readLine());

        while (testCase-- > 0) {
            String[] input = br.readLine().split(" ");
            int a = Integer.valueOf(input[0]);
            int b = Integer.valueOf(input[1]);

            bw.write(Math.round(Math.pow(a / b, 2)) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11320().solution();
    }
}
