package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Sum Kind of Problem
public class N11522 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tesCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < tesCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int caseNum = Integer.parseInt(st.nextToken());
            int targetNum = Integer.parseInt(st.nextToken());

            int sum = 0;
            for (int j = 1; j <= targetNum; j++) {
                sum += j;
            }
            int oddSum = 0;
            for (int j = 1; j <= targetNum; j++) {
                oddSum += j * 2 - 1;
            }
            int evenSum = 0;
            for (int j = 1; j <= targetNum; j++) {
                evenSum += j * 2;
            }

            bw.write(caseNum + " " + sum + " " + oddSum + " " + evenSum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11522().solution();
    }
}
