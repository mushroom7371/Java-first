package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//주식 투자
public class N13416 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (testCase --> 0) {
            int days = Integer.parseInt(br.readLine());
            int maxBenefit = 0;

            for (int i = 0; i < days; i++) {
                st = new StringTokenizer(br.readLine());
                int companyA = Integer.parseInt(st.nextToken());
                int companyB = Integer.parseInt(st.nextToken());
                int companyC = Integer.parseInt(st.nextToken());

                int max = Math.max(companyA, Math.max(companyB, companyC));

                if (max > 0) {
                    maxBenefit += max;
                }
            }

            bw.write(maxBenefit + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N13416().solution();
    }
}
