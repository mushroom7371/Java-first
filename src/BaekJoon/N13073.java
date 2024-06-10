package BaekJoon;

import java.io.*;

//Sums
public class N13073 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int target = Integer.parseInt(br.readLine());
            int sum = 0;
            for (int j = 1; j <= target; j++) {
                sum += j;
            }
            int oddSum = 0;
            for (int j = 1; j <= target; j++) {
                oddSum += j * 2 - 1;
            }
            int evenSum = 0;
            for (int j = 1; j <= target; j++) {
                evenSum += j * 2;
            }

            bw.write(sum + " " + oddSum + " " + evenSum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N13073().solution();
    }
}
