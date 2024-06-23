package BaekJoon;

import java.io.*;

//세제곱의 합
public class N29701 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            sum2 += Math.pow(i, 3);
        }

        bw.write(sum + "\n" + (int)Math.pow(sum, 2) + "\n" + sum2);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N29701().solution();
    }
}
