package BaekJoon;

import java.io.*;

//Speed Limit
public class N4635 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }

            int[][] info = new int[n][2];
            for (int i = 0; i < n; i++) {
                String[] input = br.readLine().split(" ");
                info[i][0] = Integer.parseInt(input[0]);
                info[i][1] = Integer.parseInt(input[1]);
            }

            int sum = 0;
            int prev = 0;
            for (int i = 0; i < n; i++) {
                sum += info[i][0] * (info[i][1] - prev);
                prev = info[i][1];
            }

            bw.write(sum + " miles\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4635().solution();
    }
}
