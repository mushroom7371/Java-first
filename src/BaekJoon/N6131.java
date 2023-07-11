package BaekJoon;

import java.io.*;

//완전 제곱수
public class N6131 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int target = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= 500; i++) {
            double tempA = Math.pow(i, 2);
            for (int j = 1; j <= 500; j++) {
                double tempB = Math.pow(j, 2);

                if (tempA == tempB + target) {
                    count++;
                }
            }
        }

        bw.write(String.valueOf(count));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N6131().solution();
    }
}
