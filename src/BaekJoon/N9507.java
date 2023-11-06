package BaekJoon;

import java.io.*;

//Generations of Tribbles
public class N9507 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int n = Integer.parseInt(br.readLine());
            long[] dp = new long[68];
            dp[0] = 1;
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int i = 4; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3] + dp[i - 4];
            }

            bw.write(dp[n] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9507().solution();
    }
}
